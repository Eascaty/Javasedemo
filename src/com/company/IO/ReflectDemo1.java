package com.company.IO;

import com.company.Collection.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/19 11:31
 * @Modified By：
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//      1.通过反射获取studet类的字节码对象
        Class clazz = Class.forName("com.company.Collection.Student");
//      2.通过反射获取Student类的构造方法，并创建类的对象。
        Constructor con = clazz.getConstructor();

       Student stu= (Student) con.newInstance();
//      3.获取到指定的setName()方法，给Student对象设置值
        Method method1=clazz.getMethod("setName", String.class);
//      调用此方法
        method1.invoke(stu,"张无忌");




        System.out.println(stu);
/*
       Method method1= clazz.getMethod("show1");

        System.out.println(method1);

        System.out.println(method1.getName());

        method1.invoke(stu);*/


    }
}
