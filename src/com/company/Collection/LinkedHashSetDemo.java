package com.company.Collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 10:16
 * @Modified By：
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("java");


        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
