package com.company.IO;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/15 15:33
 * @Modified By：
 */
public class trycatch1 {
    public static void main(String[] args) {




        try {
            int a = 10 / 0;
            System.out.println("a"+a);
        }catch (Exception e){
            System.out.println("被除数不能为0");
            return;
        }finally {
//            即使try,catch中有returne,finally里边的代码也会执行
            System.out.println("看看我执行了吗？");
        }

        System.out.println("看看我执行了吗？");
    }
}
