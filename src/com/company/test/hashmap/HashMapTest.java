package com.company.test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //F7 下一步
        HashMap<String, Double> map = new HashMap<>();
        map.put("k1", 0.1);
        map.put("k2", 0.2);
        map.put("k3", 0.3);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
