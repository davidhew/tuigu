package com.tuigui.data.init

import grails.test.mixin.*

import org.junit.Test

import com.tuigu.data.init.InitStockRecordHistory

class InitStockRecordHistoryTests {

	@Test
	public void testInit(){
		InitStockRecordHistory initStock = new InitStockRecordHistory();
		initStock.populateData();
		Thread.sleep(10000000);
	}
}
