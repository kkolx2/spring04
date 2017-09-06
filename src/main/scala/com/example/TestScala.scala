package com.example

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory





object TestScala {
	
	var log = LogFactory.getLog(TestScala.getClass.getName)
	
	def main(args: Array[String]): Unit = {
		println("Scala Execution Test...");
		
		         log.info("############################")
                log.info("TestScala Commons logging...");
                log.info("############################")

	}
}