package com.company.Collection;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 9:20
 * @Modified By：
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",30);

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("-------------");

        Student s2 = new Student("林青霞",30);
        System.out.println(s2.hashCode());


    }
}
