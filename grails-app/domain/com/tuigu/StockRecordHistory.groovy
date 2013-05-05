package com.tuigu

/**
 * 每只股票的每日记录，每天一条
 * @author david
 *
 */
class StockRecordHistory {
	String stockCode;
	//开盘日期
	Date openDate;
	//开盘价
	double open;
	//当日最高价
	double high;
	//当日最低价
	double low;
	//收盘价
	double close;
	//成交量
	long volume;
	//成交额
	Double volumePrice;
	
	static constraints = {
		stockCode blank:false,maxSize:32
	}
	
	static mapping = {
		openDate column: "open_date", sqlType: "Date"
	}

}
