package com.company.xunhuan;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/8 9:34
 * @Modified By：
 */
public class RandomDemo {
    public static void main(String[] args) {

        java.util.Random r =new java.util.Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("请录入您要猜的数字（1-100）：");
        int guessNum = sc.nextInt();



        if(guessNum>num){
            System.out.println("您猜大了");
        }else if (guessNum<num){
            System.out.println("你猜小了");
        }else{
            System.out.println("恭喜您，对了");
            break;
        }


}

    }

}
