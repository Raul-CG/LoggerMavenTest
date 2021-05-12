package com.raul;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		Main.logger.setLevel(Level.TRACE);
		Main.logger.trace("Trace Message!");
		Main.logger.debug("Debug Message!");
		Main.logger.info("Info Message!");
		Main.logger.warn("Warn Message!");
		Main.logger.error("Error Message!");
		Main.logger.fatal("Fatal Message!");

		Main.logger.setLevel(Level.INFO);
		Main.logger.trace("Trace Message!");
		Main.logger.debug("Debug Message!");
		Main.logger.info("Info Message!");
		Main.logger.warn("Warn Message!");
		Main.logger.error("Error Message!");
		Main.logger.fatal("Fatal Message!");

		Main.logger.setLevel(Level.FATAL);
		Main.logger.trace("Trace Message!");
		Main.logger.debug("Debug Message!");
		Main.logger.info("Info Message!");
		Main.logger.warn("Warn Message!");
		Main.logger.error("Error Message!");
		Main.logger.fatal("Fatal Message!");
	}

}
