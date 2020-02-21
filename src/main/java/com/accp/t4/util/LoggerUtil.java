package com.accp.t4.util;

import org.apache.log4j.Logger;

public class LoggerUtil {

	private static final Logger logger = Logger.getRootLogger();

	public static void debug(String msg) {
		logger.debug(msg);
	}

	public static void info(String msg) {
		logger.info(msg);
	}

	public static void error(String msg, Throwable e) {
		logger.error(msg, e);
	}

}
