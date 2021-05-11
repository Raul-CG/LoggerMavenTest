package com.raul;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		System.out.println("Hello World ?");

		Main.logger.trace("Logger: trace");
		Main.logger.debug("Logger: debug");
		Main.logger.info("Logger: info");
		Main.logger.warn("Logger: warning");
		Main.logger.error("Logger: normal error");
		Main.logger.fatal("Logger: fatal error");

	}

}
