package com.company.test.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Forhashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "abb");
        map.put(3, "acc");
        //  System.out.println(map.get(1));
        //方式1 键找值   Set<K> keySet()

        //1.集合 {1=aaa, 2=abb, 3=acc}
        System.out.println(map);

        //2.通过values 获取所有值,不能获取到key对象
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }

        // 第一种方式: 使用keySet
        // 需要分别获取key和value，没有面向对象的思想
        Set<Integer> ks = map.keySet();

        for (Integer key : ks) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println();
//推荐使用
        // 方式2 键值对对象找键和值  Map.Entry对象
        //Set<Map.Entry<K,V>> entrySet()

        // 返回的是封装了key和value对象的Map.Entry对象
        for (Map.Entry<Integer, String> me : map.entrySet()){
            // 获取Map.Entry对象中封装的key和value对象
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);

        }
    }


}

