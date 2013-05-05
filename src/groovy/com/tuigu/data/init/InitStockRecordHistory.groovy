package com.tuigu.data.init

import org.grails.plugins.csv.CSVReaderUtils

import com.tuigu.StockRecordHistory
import com.tuigu.util.Utils

class InitStockRecordHistory implements IInitData {


	@Override
	public void populateData() {

		File.metaClass.eachCsvLine = { closure ->
			CSVReaderUtils.eachLine((File) delegate, closure)
		}

		String pathName = "/home/admin/workspace/new";
		File f = new File(pathName);
		f.list().each{
			System.out.println(pathName+it);
			def fileName = it;
			fileName = fileName.substring(0,fileName.length()-4);
			int i = 0;
			new File(pathName+it).eachCsvLine { tokens ->
				if(i++>=2 && tokens.length==7){
					def stock = new StockRecordHistory(
							)
					stock.stockCode = fileName;
					stock.openDate = Utils.getDate(tokens[0]);
					stock.open = Double.parseDouble(tokens[1]);
					stock.high = Double.parseDouble(tokens[2]);
					stock.low = Double.parseDouble(tokens[3]);
					stock.close = Double.parseDouble(tokens[4]);
					stock.volume = Long.parseLong(tokens[5]);
					stock.volumePrice = Double.parseDouble(tokens[6]);
					if(!stock.save(true)){
						println "StockRecordHistory not saved, errors = ${stock.errors}"
					}
				} //ISO 3166 2 letter character code
			}
			// TODO Auto-generated method stub

		}
	}
}
