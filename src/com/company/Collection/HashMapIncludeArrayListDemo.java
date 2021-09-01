package com.company.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/15 11:22
 * @Modified By：
 */
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();

        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");

        hm.put("三国演义",sgyy);


        ArrayList<String> xyj = new ArrayList<String>();
        sgyy.add("唐僧");
        sgyy.add("孙悟空");

        hm.put("西游记",xyj);

        ArrayList<String> shz = new ArrayList<String>();
        sgyy.add("武松");
        sgyy.add("鲁智深");

        hm.put("水浒传",shz);

        Set<String>keySet = hm.keySet();
        for (String key : keySet) {
            ArrayList<String> value = hm.get(key);
            System.out.println(key);
            for (String s : value) {
                System.out.println("\t"+s);
            }
        }

    }
}
