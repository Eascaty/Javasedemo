package com.company.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 8:33
 * @Modified By：
 */
public class List1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);


        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list);

//        获取索引为2的元素
        Object obj=list.get(2);
        System.out.println("索引为2的元素是"+obj);
        System.out.println("集合的长度为："+list.size());
        System.out.println("-------------");

        for(int i =0;i < list.size();i++){
            Object obj2=list.get(i);
            System.out.println("索引为"+i+"的元素是"+obj2);
        }
    }
}
