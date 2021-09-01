package com.company.Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 11:04
 * @Modified By：
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num ==0?s1.getName().compareTo(s2.getName()):num;
                return  num2;
            }
        });
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
