package com.company.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 10:37
 * @Modified By：
 */
public class iterator2 {
    public static void main(String[] args) {
//        需求：测试列表迭代器
//        需求：通过迭代器遍历List集合
//        1.创建集合对象
        List list = new ArrayList();
//        2.创建元素对象

//        3.将元素对象添加到集合对象中
        list.add("a");
        list.add("b");
        list.add("c");
//        需求：判断集合中如果有字符串"b“，就在其后边添加一个新字符串
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String s = (String)lit.next();
            if("b".equals(s)){
                lit.add("java");
            }
            System.out.println(s);
        }
        System.out.println("----------");
        System.out.println(list);

        System.out.println("----------");
//        演示泛型
//        泛型一般只和集合嘞相结合使用
//        1.创建集合对象
        List <String> list2 = new ArrayList<String>();
        list2.add("abc");
        list2.add("bcd");
        list2.add("cde");

        for (String  s : list2){
            System.out.println(s);
        }
    }
}
