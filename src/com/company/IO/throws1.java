package com.company.IO;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/15 15:42
 * @Modified By：
 */
public class throws1 {
    public static void main(String[] args)throws Exception {
//            需求:调用show()
//             因为show()方法以及抛出了一个异常，作为调用者main函数必须处理这个异常
//
//                show();
                try{
                    show();
                }catch (Exception e){
                    System.out.println("代码出问题了");
                }
        System.out.println("看看我执行了吗");

    }

    public static void show()throws Exception {
        int a = 10 /0;
        System.out.println("a:"+a);
    }






}
