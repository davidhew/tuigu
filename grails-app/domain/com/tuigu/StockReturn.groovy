package com.tuigu

class StockReturn {
	String stockCode;
	Date openDate;
	BigDecimal predictReturn;
	BigDecimal realReturn;
	static mapping = {
		openDate column: "open_date", sqlType: "Date"
		predictReturn sqlType: "decimal(9,6)"
		realReturn sqlType:"decimal(9,6)"
	}
}
