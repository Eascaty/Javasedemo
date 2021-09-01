package com.company.Collection;

import java.util.TreeSet;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 10:29
 * @Modified By：
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("xishi",29);
        Student s2 = new Student("wangzhaojun",28);
        Student s3 = new Student("diaochan",30);
        Student s4 = new Student("yangyuhuan",33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student t : ts) {
            System.out.println(t.getName()+","+ t.getAge());

        }

    }
}
