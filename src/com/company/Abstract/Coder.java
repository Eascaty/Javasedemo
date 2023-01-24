package com.company.Abstract;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/9 10:50
 * @Modified By：
 */
//子类
public class Coder extends Employee{
    public Coder(String name, double salary, String id) {
        super(name, salary, id);
    }
/*注释哈哈*/
    public Coder() {
    }

    @Override
    public void work(){
    System.out.println("程序员要敲代码");
}

}
