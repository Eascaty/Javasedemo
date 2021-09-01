package com.company.xunhuan;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/8 8:36
 * @Modified By：
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //需求 ：模拟逢七必过的小游戏
        //1.通过for循环获取1-100的数据
for(int  i=1;i<=100;i++){



        //2.判断当前数字是否是合法数据
        //包含7或是7的倍数，这些数据都不合法

            if(i%10 ==7  || i/10%10==7 || i % 7 ==0){
                System.out.println("...");
                continue;

            }

        //3.如果数据不合法，直接跳过本次循环，直接进行下次循环


        //4.如果数据合法，直接打印
    System.out.println(i);

}
    }
}
