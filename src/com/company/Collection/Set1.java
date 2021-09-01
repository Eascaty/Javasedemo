package com.company.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 16:49
 * @Modified By：
 */
//无序和唯一
public class Set1 {
    public static void main(String[] args) {
//        往set集合中添加5个对象，然后遍历

//        1.创建集合对象
        Set<Student> set = new HashSet<>();
//        2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);

        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("虚竹",38);
        Student s5 = new Student("段誉",26);

//          3.将集合对象添加到元素对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

//        4.遍历集合
        System.out.println(set);
        System.out.println("---------");

//        通过迭代器遍历set集合
//        A.通过集合对象获取对应的迭代器对象
        Iterator<Student> it  = set.iterator();
//        B.判断迭代器中是否有元素
        while (it.hasNext()){
            Student s  =it.next();
            System.out.println(s);
        }
        System.out.println("---------");

//        通过增强for遍历Set集合
        System.out.println("通过增强for遍历Set集合");
        for (Student student : set) {
            System.out.println(student);

        }
    }
}
