package com.home;

class A{
    static{
        System.out.println("static A");
    }

    {
        System.out.println("normal A");
    }
    public A(){
        System.out.println("constructor A");
    }
}

     class B extends A{
    static{
        System.out.println("static B");
    }

    {
        System.out.println("normal B");
    }
    public B(){
        System.out.println("constructor B");
    }

}



public class AB2 {


    public static void main(String[] ars) throws Exception {

        A a = new B();
        a = new B();

    }
}

