package com;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

public class Test10 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		int age = 10;
		double score = 10.0;
		if(age == score) {
			System.out.println("age == score is " + (age == score));
		}else {
			System.out.println("age == score is " + (age == score));
		}
		
		String name = "xing,hong";
		//System.out.println("-----------" + URLEncoder.encode(name, "utf-8"));
		
		System.out.println("-----------" + URLDecoder.decode(name, "utf-8"));

	}
}
