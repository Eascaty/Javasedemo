package com.company.Collection;

import java.util.TreeSet;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 10:24
 * @Modified By：
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        for (Integer t : ts) {
            System.out.println(t);

        }


    }

}
