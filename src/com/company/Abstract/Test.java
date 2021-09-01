package com.company.Abstract;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/9 10:46
 * @Modified By：
 */
public class Test {
    public static void main(String[] args) {

        Employee em =new Coder() ;
        em.work();


        Employee em2 = new Manager();
        em2.work();
        System.out.println("----------");

        /*Coder c =new Coder();
        c.setName("张三");
        c.setSalary(30000);
        c.setId("研发部007");*/
        Coder c =  new Coder("张三",30000,"研发部07");
        System.out.println("姓名："+c.getName());
        System.out.println("工资："+c.getSalary());
        System.out.println("工号："+c.getId());

    }
}
