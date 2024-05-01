package com.home.String;

import java.util.Scanner;

/**
 * @author: Zhaoxl
 * @date: 2023/6/4 22:22
 * @description:
 */
public class StarString7 {
    public static void main(String[] args) {

        //    2135   换成二一三五
//    查表法

//    1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
//        定义一个变量用来表示钱的大写
        String moneyStr = "";
//       2.得到money里面的每一位数字
        while (true) {  //123
//            从右往左获取数据,因为右侧是数据的个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
//          把转换后的大写拼接到moneyStr当中

//            moneyStr = moneyStr +  capitalNumber;
//            "" + "五" = "五"   第一次循环结束之后:moneyStr "五"
//            "五"  + "三" = "五三"  第二次循环结束之后:moneyStr "五三"
//            实际上是反的
            moneyStr = capitalNumber + moneyStr;


//            去掉刚刚获取的数据
            money = money / 10; //0

//           如果数字上的每一位全部获取到了,那么Money记录的就是0,此时循环结束
            if (money == 0) {
                break;
            }
        }
//        3.在前面补0,补齐7位
        int count = 7 - moneyStr.length();//2135

        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

//        4.插入单位
//        查表法
//        定义一个数组来表示单位
        String[] arr = {"百", "十", "万", "千", "百", "十", "元"};
//        零零零二一三五

//        遍历moneyStr,依次得到 零零零零
//        然后把arr的单位插入进去

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
     /*       System.out.print(c);
//          打印一下单位
            System.out.print(arr[i]);*/

//            把大写数字和单位拼接到result当中
            result = result + c + arr[i];
        }

//        5.打印最终结果
        System.out.println(result);


    }


    //    定义一个方法把数字变成大写的中文
//    1 -- 壹
    public static String getCapitalNumber(int number) {
//        定义数组,让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
//        返回结果
        return arr[number];
    }


}