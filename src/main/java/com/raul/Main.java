package com.raul;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		System.out.println("Hello World ?");

		Main.logger.trace("We've just greeted the user!");
		Main.logger.debug("We've just greeted the user!");
		Main.logger.info("We've just greeted the user!");
		Main.logger.warn("We've just greeted the user!");
		Main.logger.error("We've just greeted the user!");
		Main.logger.fatal("We've just greeted the user!");
	}

}
