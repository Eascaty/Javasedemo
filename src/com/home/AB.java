

class A{
    static{
        System.out.print("1");
    }
    public A(){
        System.out.print("2");
    }
}

class B extends A{
    static{
        System.out.print("a");
    }
    public B(){
        System.out.print("b");
    }
}
public class AB {
    public static void main(String[] ars){
        A ab = new A(); //执行到此处,结果: ？
        System.out.println("");
        ab = new B(); //执行到此处,结果: ？

    }
}