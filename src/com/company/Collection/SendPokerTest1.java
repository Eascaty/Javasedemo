package com.company.Collection;

import java.util.*;
import java.util.ArrayList;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/14 15:37
 * @Modified By：
 */
public class SendPokerTest1 {
    public static void main(String[] args) {
//        1.买牌
//        1.1定义一个双列集合，键：表示牌的编号，值:表示具体的牌 规则：编号越小，牌越小
        Map<Integer, String> pokers = new HashMap<>();
//        1.2定义一个单列集合，用来存储所有牌的编号
        List<Integer> list = new ArrayList<>();

//        1.3具体的买牌动作
//        普通牌，52
        String[] colors = {"♠", "❥", "♣", "◇"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "A", "2"};
        int num = 0;
//         通过循环嵌套，造普通牌
        for (String number : numbers) {     //外循环，获取所有的点数
            for (String color : colors) {  //内循环，获取所有的花色
                String poker = color + number;
//                得到的编号，具体的牌放到双列集合中
                pokers.put(num, poker);
//                将牌的编号放到单列集合中
                list.add(num);
//                每添加一张牌，编号要自增1
                num++;

            }
        }
//        大小王
//        添加小王
        pokers.put(num, "小王");
        list.add(num++);

        pokers.put(num, "大王");
        list.add(num);


//        打印牌
        System.out.println("所有的牌:" + pokers);
        System.out.println("牌的编号:" + list);
//        2.洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后,编号为：" + list);

//        3.发牌
//        3.1定义4个集合，分别表示3个玩家，底牌
        List<Integer> liuyifei = new ArrayList<>();
        List<Integer> zhaoliying = new ArrayList<>();
        List<Integer> xiaohei = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();


//        3.2具体的发牌动作，将索引和3取模，决定发给谁
        for (int i = 0; i < list.size(); i++) {
            Integer pokerNum = list.get(i);
            if (i >= list.size() - 3) {
//               底牌
                dipai.add(pokerNum);
            } else if (i % 3 == 0) {
                liuyifei.add(pokerNum);
            } else if (i % 3 == 1) {
                zhaoliying.add(pokerNum);
            } else if (i % 3 == 2) {
                xiaohei.add(pokerNum);
            }

        }

/*//        3.3查看玩家，底牌的编号
        System.out.println("liuyifei:" + liuyifei);
        System.out.println("zhaoliying:" + zhaoliying);
        System.out.println("xiaohei:" + xiaohei);
        System.out.println("dipai:" + dipai);*/

//        4.查看具体的牌
        System.out.println("--------");
        System.out.println("liuyifei:"+printPoker(liuyifei,pokers));
        System.out.println("zhaoliying:"+printPoker(zhaoliying,pokers));
        System.out.println("xiaohei："+printPoker(xiaohei,pokers));
        System.out.println("dipai："+printPoker(dipai,pokers));


//        4.定义一个方法，用来看牌
//          方法名：printPoker



    }


    private static String printPoker(List<Integer> nums, Map<Integer, String> pokers) {
        Collections.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            String poker = pokers.get(num);
            sb.append(poker + " ");
        }
        String str = sb.toString();
        return str.trim();
    }
}
