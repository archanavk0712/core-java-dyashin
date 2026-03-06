package com.dyashin.log4jexample.Loggers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggersEx {

	private static final Logger logger= LogManager.getLogger(LoggersEx.class);
	
	public static void process() {
		//service
		logger.trace("FROM THE TRACE METHOD");
		logger.debug("FROM THE DEBUG METHOD");
		logger.info("FROM THE INFO METHOD");
		logger.fatal("FROM THE FATAL METHOD");
		logger.warn("FROM THE WARN METHOD");
		logger.error("FROM THE ERROR METHOD");
		
	}
	
	public static void main(String[] args) {
		process();
	}
}
