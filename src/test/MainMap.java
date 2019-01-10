package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap();
		map.put("1", "good");
		map.put("2", "good");
		map.put("3", "study");
		
		String [] names = {"ming", "hao", "qiang"};
		
		
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
	}

}
