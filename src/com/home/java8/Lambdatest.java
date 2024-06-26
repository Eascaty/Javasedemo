package com.home.java8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 *
 *（01,02） -> Integer.compare(o1,o2)
 *
 * 总结
 * -> 左边： lambda形参列表的参数类型可以省略（类型推断）；如果lambda形参列表只有一个参数，其一对（）可以省略
 * -> 右边： lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return 语句），可以省略这一对{}和return关键字
 *
 * lambda表达式的本质：函数式接口的实例
 *
 *如果一个接口中，只声明了一个抽象方法，则此接口称为函数式接口
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * @author: Zhaoxl
 * @date: 2024/4/26 7:12
 * @description:
 */
public class Lambdatest {

    //语法格式一： 无参，无返回值
    @Test
    public void test1() {
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
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么?");
        System.out.println("*********");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了，一个是说的人当真了");

    }

    //语法格式三：数据类型可以省略，因为可有编译器推断得出
    @Test
    public void test3() {
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了，一个是说的人当真了");
        System.out.println("*********");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("一个是听的人当真了，一个是说的人当真了");


    }

    //语法格式4： Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5() {
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了，一个是说的人当真了");
        System.out.println("*********");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("一个是听的人当真了，一个是说的人当真了");
        ;
    }

    // 可以多行输出
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println("************");
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
    }

    //语法格式六：当lambda体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test7() {
        Comparator<Integer> com1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com1.compare(12, 6));
        System.out.println("********");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 6));

    }

    @Test
    public void test8() {
        Consumer<String> con3 = (s) -> {
            System.out.println(s);
        };
        con3.accept("一个是听的人当真了，一个是说的人当真了");
        System.out.println("*********");

        Consumer<String> con4 = s ->   System.out.println(s);

       con4.accept("一个是听的人当真了，一个是说的人当真了");
        ;
    }

}




