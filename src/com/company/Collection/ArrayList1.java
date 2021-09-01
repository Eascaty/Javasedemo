package com.company.Collection;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 15:12
 * @Modified By：
 */
public class ArrayList1<S> {
    public static void main(String[] args) {
        java.util.ArrayList<String> array = new java.util.ArrayList<>();

       array.add("hello");
       array.add("world");
       array.add("java");

////          增加元素
//       array.add(3,"javaee");
////       删除指定元素
//        System.out.println(array.remove("world"));

////        删除指定索引处的元素，返回被删除的元素
//        System.out.println(array.remove(2));

////        修改指定索引处的元素，返回被修改
//        System.out.println(array.set(1,"javaee"));

//        返回执行索引处的元素
        System.out.println(array.get(0));


//        输出集合
        System.out.println("array:" + array);


    }

    public void add(S 赵云) {
    }
}
