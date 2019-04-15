package com.kishore;

import java.util.HashMap;
import java.util.Map;

public class Example {
public static void main(String[] args) {
	Map<String,Integer> map= new HashMap<>();
	map.put("kishore",1);
	map.put("reddy", 2);
	System.out.println(map.keySet());
	System.out.println(map);
}
}
