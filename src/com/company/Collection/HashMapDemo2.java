package com.company.Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/15 13:43
 * @Modified By：
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
//      键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

//        创建HashMap集合，键是Character,值是Integer
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

//        遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = hm.get(key);
//        拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            if (value == null) {
//                如果返回值是null,说明该字符在hashmap集合中不存在，就把该字符作为键，1作为值存储
                hm.put(key, 1);
            } else {
//                如果返回值不是null,说明该字符在hashmap集合中存在，把该值加1，然后重新存储该字符和对应的值
                value++;
                hm.put(key, value);
            }
        }
//        遍历hashmap集合，得到键和值
        StringBuilder sb = new StringBuilder();
        Set<Character> KeySet = hm.keySet();
        for (Character key : KeySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }



        System.out.println(sb);

    }
}
