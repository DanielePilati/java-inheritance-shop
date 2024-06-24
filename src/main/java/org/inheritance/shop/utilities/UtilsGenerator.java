package org.inheritance.shop.utilities;

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
	
}
