package com.home.java8;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * java内置的四大核心函数式接口
 *
 *
 * 消费型接口 Consumer<T>   void accept(T t)
 * 供给型接口 Supplier<T>   T get()
 * 函数型接口 Function<T,R>  R apply ( T t)
 * 断定型接口 Predicate<T>  boolean test(T t)
 *
 * @author: Zhaoxl
 * @date: 2024/4/27 14:07
 * @description:
 */
public class lambdatest2 {
    @Test
    public  void test1() {
        happyTime(500,new Consumer<Double>(){
            public  void accept(Double aDouble){
                System.out.println("学习太累了，去天上人间买了瓶矿泉水，价格为：" + aDouble);

            }
        });

            happyTime(400,money -> System.out.println("太累了"+ money));
    }
    public void happyTime(double money, Consumer<Double> con ){
        con.accept(money);
    }

            @Test
        public void test2()
        {
        List <String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
            List<String> filterString = filterString(list, new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return s.contains("京");
                }
            });
            System.out.println(filterString);

            List<String> filterStrs1 = filterString(list,s -> s.contains("京"));
             

        }
        public List<String>  filterString(List<String> list , Predicate<String> pre){
            ArrayList<String > filterList = new ArrayList<>();
            for(String s : list){
                if(pre.test(s)){
                    filterList.add(s);
                }

            }
            return filterList;
        }

}