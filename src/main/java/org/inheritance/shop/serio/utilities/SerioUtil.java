package org.inheritance.shop.serio.utilities;

public class SerioUtil {

	public static short getRandomShort() {
		short max = (short) 32767;	
		short min = (short) 00000;
		return (short) ((Math.random()* (max - min + 1)) + min);
	}
	
	public static long getRandomLong() {
		long max = 999999999;
		long min = 000000000;
		return (long) ((Math.random()* (max - min + 1)) + min);
	}
	
	public static String format05Left(int code) {
		return String.format("%05d",code);
	}
	public static String format05Left(short code) {
		return String.format("%05d",code);
	}

	public static String format09Left(int code) {
		return String.format("%09d",code);
	}
	public static String format09Left(short code) {
		return String.format("%09d",code);
	}
	public static String format09Left(long code) {
		return String.format("%09d",code);
	}

	
	
	
	
}
