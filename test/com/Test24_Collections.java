package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class Test24_Collections {

	public static void main(String[] args) {
	
		//处理channel不存在情况
		ArrayList<String> channels = new ArrayList<String>();
		for(int i = 0; i < 60000; i++) {
			channels.add("" + i);
		}
		long startTime = System.currentTimeMillis();
		if(channels.contains("60000")) {
			System.out.println("--------Success----------");
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("----------------ArrayList的时间差：" + (stopTime - startTime));
		
		HashSet<String> channels2 = new HashSet<String>();
		for(int i = 0; i < 60000; i++) {
			channels2.add("" + i);
		}
		long startTime2 = System.currentTimeMillis();
		if(channels.contains("60000")) {
			System.out.println("--------Success2----------");
		}
		long stopTime2 = System.currentTimeMillis();
		System.out.println("----------------HashSet的时间差：" + (stopTime2 - startTime2));
		
		
		String [] array = {"中国", "美国"};
		List<String> list = new ArrayList<String>();
		for(String l : array) {
			list.add(l);
		}
		ListIterator<String> lis = list.listIterator();
		while(lis.hasNext()) {
			System.out.println(lis.next());
			lis.add("分割线");
			System.out.println(list.size());
		}
		while(lis.hasPrevious()) {
			System.out.println(lis.previous());
		}
	}

}