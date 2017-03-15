package com.future;

public class Test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("ABC").append(",").append("CDE").append(",");
		System.out.println(sb.toString());
		System.out.println(sb.toString().substring(0, sb.length()-1));
	}
}
