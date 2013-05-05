package com.tuigu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	private static final SimpleDateFormat SHORT_DATE_FORMATTER = new SimpleDateFormat(
			"yyyyMMdd");
	
	public synchronized static Date getDate(String date){
		try {
			return SHORT_DATE_FORMATTER.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
