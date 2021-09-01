package com.company.String;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/12 15:09
 * @Modified By：
 */
public class Stringbuffer {
    public static void main(String[] args) {
//        StringBuilde append 将任意数据添加到StringBuilder容器中，返回自身
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");
        System.out.println("sb："+sb);
        System.out.println("sb2:"+sb2);
        System.out.println("---------");
//        将string 的"abc” 转换成stringbuilder   类型的对象
        StringBuilder sb3 = new StringBuilder("abc");
        System.out.println("sb3:"+sb3);

//        将三个字符串拼接成一个新的字符串
        StringBuilder sb4 = new StringBuilder();
        sb4.append("学java");
        sb4.append("到传智播客");
        sb4.append("找小黑！");
        System.out.println("sb4；："+sb4);
        System.out.println("------------");
        String s  = sb4.toString();
        System.out.println("字符串s："+s);


    }
}
