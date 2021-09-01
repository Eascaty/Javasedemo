package com.company.Collection;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 16:43
 * @Modified By：
 */
public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeFirst());
    }
}
