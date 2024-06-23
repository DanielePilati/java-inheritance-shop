package org.inheritance.shop.utilities;

import java.text.DecimalFormat;

public class UtilsGenerator {

	public static short generateRandomShort() {
		short max = (short) 32767;	
		short min = (short) 00000;
		return (short) ((Math.random()* (max - min + 1)) + min);
	}
	
	public static long generateRandomLong() {
		long max = 9999999999L;
		long min = 00000000000;
		return (long) ((Math.random()* (max - min + 1)) + min);
	}
	public static String format05Left(short code) {
		return String.format("%05d",code);
	}

	public static String format09Left(long code) {
		return String.format("%09d",code);
	}
	
	public static String generateIMEICode() {
		return format09Left(generateRandomLong())+format05Left(generateRandomShort());
	}
	
	public static String generateRandomCode () {
		return format05Left(generateRandomShort());
	}
	
	public static String toDecimalFormat(double number) {
		final DecimalFormat decfor = new DecimalFormat("0.00");  
		return decfor.format(number);
	}

	
	
	
	
}
