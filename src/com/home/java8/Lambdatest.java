package com.home.java8;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author: Zhaoxl
 * @date: 2024/4/26 7:12
 * @description:
 */
public class Lambdatest {

    //语法格式一： 无参，无返回值
    @Test
    public  void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("*******");

        Runnable r2 = () -> {
            System.out.println("我爱北京故宫");
        };
        r2.run();

    }

    //语法格式二：Lambda 需要一个参数，但是没有返回值
    @Test
    public  void test2(){
        Consumer<String > con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么?");
        System.out.println("*********");

        Consumer<String> con1 = (String s) ->{System.out.println(s);};
        con1.accept("一个是听的人当真了，一个是说的人当真了");

    }
        //语法格式三：数据类型可以省略，因为可有编译器推断得出
    @Test
    public  void test3(){
        Consumer<String> con1 = (String s) ->{System.out.println(s);};
        con1.accept("一个是听的人当真了，一个是说的人当真了");
        System.out.println("*********");

        Consumer<String> con2 = ( s) ->{System.out.println(s);};
        con2.accept("一个是听的人当真了，一个是说的人当真了");


    }




}