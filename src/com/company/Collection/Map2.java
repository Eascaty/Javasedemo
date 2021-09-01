package com.company.Collection;

import java.util.*;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 17:08
 * @Modified By：
 */
public class Map2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

//        map.clear();
//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭sb"));
//        System.out.println(map.isEmpty());

//        获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
//        获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

//        System.out.println(map.size());
//
//        System.out.println(map);


    }
}
