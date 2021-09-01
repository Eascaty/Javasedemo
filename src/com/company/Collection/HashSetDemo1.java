package com.company.Collection;

import java.util.HashSet;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 9:28
 * @Modified By：
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");

        hs.add("java");
        for (String h : hs) {
            System.out.println(h);

        }

    }
}
