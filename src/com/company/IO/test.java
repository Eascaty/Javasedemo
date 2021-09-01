package com.company.IO;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/19 8:50
 * @Modified By：
 */
class A {
    static {
        System.out.println(1);
    }
    public A(){
        System.out.println(2);
    }
}
class B extends  A{
    static {
        System.out.println("a");
    }
    public  B(){
        System.out.println("b");
    }
}












public class test {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}
