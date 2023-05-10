package com.home.Basicgrammar;

/**
 * @author: Zhaoxl
 * @date: 2023/5/10 22:31
 * @description:
 */
public class Methodtest3 {
    public static void main(String[] args) {
/*需求：定义要给方法CopyofRange(int[]arr, int from , int to)
* 功能：
*       将数组arr中从索引from开始
*       到索引to结束的元素复制到新数组中
*       将新数组返回
* */
//        1.定义原始数组
        int [] arr= {1,2,3,4,5,6,7,8,9};
//         2.调用方法拷贝数据
        int[] copy = copyOfRange(arr, 3, 7);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + "");
        }
    }

    public static int[] copyOfRange(int[] arr, int from,int to){
//        1.定义数组
//        动态： 不知道所有元素，要知道要存几个元素
        int [] newArr = new int [to - from];

//        2.把原始数组arr中的from到to上对应的元素，直接拷贝到newArr中
//        伪造索引的思想
        int index = 0 ;

        for (int i = from; i < to; i++) {
//            格式： 数组名[索引] =数据值;
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}