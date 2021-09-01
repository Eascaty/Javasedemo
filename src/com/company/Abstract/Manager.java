package com.company.Abstract;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/9 10:51
 * @Modified By：
 */
//子类，经理类
public class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public  void work(){
        System.out.println("经理喝着茶翘着二郎腿看着程序员写代码");
    }


}
