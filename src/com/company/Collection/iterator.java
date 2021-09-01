package com.company.Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 10:20
 * @Modified By：
 */
public class iterator {
    public static void main(String[] args) {
//        需求：通过迭代器遍历List集合
//        1.创建集合对象
        List list = new ArrayList();
//        2.创建元素对象

//        3.将元素对象添加到集合对象中
        list.add("a");
        list.add("b");
        list.add("c");
//        4.遍历集合
//        迭代器的用法
//        1.根据集合对象获取其对象的迭代器对象
        Iterator it = list.iterator();
//        2.判断迭代器中是否有元素
        while (it.hasNext()){
            //如果迭代器中有元素，就一直迭代。
//          3.如果有就获取元素
                Object obj = it.next();
//                这个if这样写，可以避免空指针异常，常量写前面
               /* if("b".equals(obj)){
//                    如果能走到这里，说明集合中有元素b
                    list.add("java");
//                    因为遍历集合的时候又对集合进行添加修改操作。
//                    这样会报ConcurrentModificationException并发修改异常

                }*/
            System.out.println(obj);

        }
            System.out.println("---------");
//        需求：判断集合中如果有字符串“b”,就在其后边添加一个新的字符串
Iterator it2 = list. iterator();
while(it2.hasNext()){
    Object obj = it2.next();
    System.out.println(obj);
}
        Iterator it3 = list.iterator();
while(it3.hasNext()){
    Object obj = it3.next();
    System.out.println(obj);
}



    }
}
