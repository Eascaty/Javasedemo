package com.company.Collection;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 15:32
 * @Modified By：
 */
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String>array = new ArrayList<String>();
        array.add("刘正风");
        array.add("左冷禅");
        array.add("风清扬");

//        遍历集合，获取到集合中的每一个元素
        System.out.println(array.size());
        for (String s : array) {
            System.out.println(s);
        }
    }
}
