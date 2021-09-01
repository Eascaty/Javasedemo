package com.company.xunhuan;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/8 9:18
 * @Modified By：
 */
public class sendorangeDemo {

    public static void main(String[] args) {

        int count=0;
        A: for(int i =1; i<4;i++){
            for (int j=1;j<36;j++){
                if(j%5 ==0){
                    continue ;
                }
                System.out.println("正在给第"+i+"个班级的第"+j+"个同学发橙子");

                count++ ;
                if(count >=100){
                    break A;
                }

            }
        }
        System.out.println("总共"+count);
    }
}
