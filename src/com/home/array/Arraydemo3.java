package com.home.array;

import com.sun.xml.internal.ws.api.model.ExceptionType;

/**
 * @author: Zhaoxl
 * @date: 2023/1/26 22:08
 * @description:
 */
public class Arraydemo3 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {1, 2, 3, 4, 5};
//        获取数组里的所有元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        try {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    System.out.println("程序开始");
                }
                System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println("异常");
        }

//        自动便利
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}