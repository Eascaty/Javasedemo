package com.company.Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 11:16
 * @Modified By：
 */
public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num ==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("林青霞", 98, 100);
        Student s2 = new Student("张曼玉", 95, 95);
        Student s3 = new Student("王祖贤", 100, 93);
        Student s4 = new Student("柳岩", 100, 97);
        Student s5 = new Student("风清扬", 98, 98);

        Student s6=new Student("左冷禅",97,99);

        ts.add(s1);
        ts.add(s4);
        ts.add(s3);
        ts.add(s5);
        ts.add(s2);
        ts.add(s6);

        for (Student t : ts) {
            System.out.println(t.getName() + t.getChinese() + t.getMath()+t.getSum());

        }


    }
}
