package com.company.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 10:12
 * @Modified By：
 */
public class forplus {
    public static void main(String[] args) {
//        通过增强for遍历list集合
//        1.创建集合对象

            List list = new ArrayList();

//        2.创建元素对象

//        3.将元素对象添加到集合对象中
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

//        4.遍历集合
        for(Object obj : list){
//            obj是集合中的元素，其本身应该是Integer类型的数据
            Integer ii = (Integer)obj;
            System.out.println(obj);
        }
        System.out.println("-------");
        for (Object o : list) {
            Integer ii = (Integer)o;
            System.out.println(o);
        }
    }
}
