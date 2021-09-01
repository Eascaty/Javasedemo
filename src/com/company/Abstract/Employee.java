package com.company.Abstract;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/9 10:47
 * @Modified By：
 */
//父类，员工类
public abstract class Employee {
    private  String name;
    private  double salary;
    private  String  id;


//    构造方法


    public Employee(String name, double salary, String id) {

        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void work();


}
