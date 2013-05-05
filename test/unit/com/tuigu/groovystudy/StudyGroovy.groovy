package com.tuigu.groovystudy

import org.junit.Test

class StudyGroovy {

	@Test
	public void testClosure(){
		def answer = [1, 2].collect
		 {
			p->p+1 }
		assert answer ==[2, 3]
	}
	
	class Class1 {
		def closure = {
		  println this.class.name
		  println delegate.class.name
		  def nestedClos = {
			println owner.class.name
		  }
		  nestedClos()
		}
	  }
	  
	@Test
	public void testThisOwnerDelegate(){
	  def clos = new Class1().closure
//	  clos.delegate = this
	  
	  clos()
	}
}