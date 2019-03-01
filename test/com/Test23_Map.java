package com;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test23_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "good");
		map.put("2", "good");
		map.put("3", "study");		
		
		//Map的遍历方法
		
		//for each 分别遍历key/value
		for(String num : map.values()) {
			System.out.println("----------name = " + num);
		}

		//借助entry遍历key/value
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("--------key=" + entry.getKey() + ", value=" + entry.getValue());
		}
		
		//借助Itetator遍历
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("---------key=" + entry.getKey() + ", value=" + entry.getValue());
		} //遍历时调用iterator.remove()来删除entries
		
		
		//借助key查找value
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("------------key=" + key + ", value=" + value);
		}
		

		ConcurrentHashMap<String, Hunter> hunters = new ConcurrentHashMap<String, Hunter>();
		//hunters.put("1", new Hunter(1, "beijing", 1000));
		
	}
	
	class Hunter{
		
		public Hunter(long hunterId, String city, double balance) {
			super();
			this.hunterId = hunterId;
			this.city = city;
			this.balance = balance;
		}
		long hunterId = -1;
		String city = null;
		double balance = 0;
	}
}
