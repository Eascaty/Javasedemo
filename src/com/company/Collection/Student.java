package com.company.Collection;

import java.util.Objects;

/**
 * @Description:
 * @Author: xuchen
 * @Date: 2021/7/13 8:35
 * @Modified By：
 */
public class Student implements Comparable<Student> {
    private  String name;
    private  int age;
    private int Chinese;
    private int Math;

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        Chinese = chinese;
        Math = math;
    }

    public Student() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getSum(){
        return  this.Chinese+this.Math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student s) {
//        return 1;升序
//        return -1;降序
//        升序this放前面，降序this放后面
       int num = this.age - s.age;
      int num2 = num==0?this.name.compareTo(s.name):num;
       return num2;
    }
}
