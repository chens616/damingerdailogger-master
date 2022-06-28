package com.github.damingerdai;
import	org.slf4j.Logger;
import	org.slf4j.LoggerFactory;
public class Log {
	/**
	 * 获得Logger
	 * @param clazz ⽇志发出的类
	 * @return Logger
		*/
	public Logger get(Class<?> clazz) {
		return	LoggerFactory.getLogger(clazz);
	}
	/**
	 * 获得Logger
	 * @param name ⾃定义的⽇志发出者名称
	 * @return Logger
	 */
	public static Logger get(String name) {
		return	LoggerFactory.getLogger(name);
	}
	/**
	 * @return 获得⽇志，⾃动判定⽇志发出者
	 */
	public static Logger get() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		return	LoggerFactory.getLogger(stackTrace[2].getClassName());
	}
	//----------------------------------------------------------- Logger method start
	//------------------------ Trace
	/**
	 * Trace等级⽇志，⼩于debug<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void trace(String format, Object... arguments) {
		trace(innerGet(), format, arguments);
	}
	/**
	 * Trace等级⽇志，⼩于Debug
	 * @param log ⽇志对象
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void trace(Logger log, String format, Object... arguments) {
		log.trace(format, arguments);
	}

	//------------------------ debug
	/**
	 * Debug等级⽇志，⼩于Info<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	debug(String format, Object... arguments) {
		debug(innerGet(), format, arguments);
	}
	/**
	 * Debug等级⽇志，⼩于Info
	 * @param log ⽇志对象
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	debug(Logger log, String format, Object... arguments) {
		log.debug(format, arguments);
	}
	//------------------------ info
	/**
	 * Info等级⽇志，⼩于Warn<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	info(String format, Object... arguments) {
		info(innerGet(), format, arguments);
	}

	 /**
	 * Info等级⽇志，⼩于Warn
	 * @param log ⽇志对象
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	info(Logger log, String format, Object... arguments) {
		log.info(format, arguments);
	}
	//------------------------ warn
	/**
	 * Warn等级⽇志，⼩于Error<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	warn(String format, Object... arguments) {
		warn(innerGet(), format, arguments);
	}
	/**
	 * Warn等级⽇志，⼩于Error
	 * @param log ⽇志对象
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	warn(Logger log, String format, Object... arguments) {
		log.warn(format, arguments);
	}
	/**
	 * Warn等级⽇志，⼩于Error<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param e 需在⽇志中堆栈打印的异常
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	warn(Throwable e, String format, Object... arguments) {
		warn(innerGet(), e, format(format, arguments));
	}
	/**
	 * Warn等级⽇志，⼩于Error
	 * @param log ⽇志对象
	 * @param e 需在⽇志中堆栈打印的异常
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void warn(Logger log, Throwable e, String format, Object... arguments) {
		log.warn(format(format, arguments), e);
	}
	//------------------------ error
	/**
	 * Error等级⽇志<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	error(String format, Object... arguments) {
		error(innerGet(), format, arguments);
	}
	/**
	 * Error等级⽇志<br>
	 * @param log ⽇志对象
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void error(Logger log, String format, Object... arguments) {
		log.error(format, arguments);
	}
	/**
	 * Error等级⽇志<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param e 需在⽇志中堆栈打印的异常
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void error(Throwable e, String format, Object... arguments) {
		error(innerGet(), e, format(format, arguments));
	}
	/**
	 * Error等级⽇志<br>
	 * 由于动态获取Logger，效率较低，建议在⾮频繁调⽤的情况下使⽤！！
	 * @param log ⽇志对象
	 * @param e 需在⽇志中堆栈打印的异常
	 * @param format 格式⽂本，{} 代表变量
	 * @param arguments 变量对应的参数
	 */
	public static void	error(Logger log, Throwable e, String format, Object... arguments) {
		log.error(format(format, arguments), e);
	}
	//----------------------------------------------------------- Logger method end
	//----------------------------------------------------------- Private method start
	/**
	 * 格式化⽂本
	 * @param template ⽂本模板，被替换的部分⽤ {} 表⽰
	Demo：
	 * @param template ⽂本模板，被替换的部分⽤ {} 表⽰
	 * @param values 参数值
	 * @return 格式化后的⽂本
	 */
	private static String format(String template, Object... values) {
		return	String.format(template.replace("{}","%s"), values);
	}
	/**
	 * @return 获得⽇志，⾃动判定⽇志发出者
	 */
	private static Logger innerGet() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		return	LoggerFactory.getLogger(stackTrace[3].getClassName());
	}
	//----------------------------------------------------------- Private method end
}
