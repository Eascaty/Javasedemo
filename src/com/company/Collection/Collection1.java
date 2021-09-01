package com.company.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 11:00
 * @Modified By：
 */

public class Collection1 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);

        System.out.println("没有操作以前，集合中的数据是："+ list);
        System.out.println("-----------");

//        获取集合中最大元素
        Integer max = Collections.max(list);

        System.out.println("集合中的最大元素为：" + max);
        System.out.println("-----------");

//        对集合进行升序排列
        /*Collections.sort(list);
        System.out.println("升序排列后的结果为：" +list );*/

/*//        对集合中的数据进行反转
        Collections.reverse(list);
                Collections.reverse(list);
                System.out.println("反转以后集合中的数据为:"+list);*/

//        需求：对集合中的数据进行降序排序
//        先对集合中的数据进行：升序排序
        Collections.sort(list);
//        然后反转集合中的数据
        Collections.reverse(list);
        System.out.println("降序后的结果为："+list);
        System.out.println("----------");

//        随机置换，相当于洗牌
        Collections.shuffle(list);
        System.out.println("随机置换后的结果为:"+list);

    }
}





