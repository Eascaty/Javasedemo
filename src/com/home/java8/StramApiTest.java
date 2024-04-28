package com.home.java8;

import com.company.Abstract.Employee;
import com.company.Thread.Customer;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * 1.Stream 关注的是对数据的运算，与CPU打交道
 *      集合关注的是数据的存储，与内存打交道
 *
 * 2.
 * Stream 自己不会存储元素
 * Stream 不会改变源对象。 相反，他们会返回一个持有结果的新stream
 * Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
 *
 *
 * 3.Stream 执行流程
 *  ①stream的实例化
 *  ②一系列的中间操作（过滤、映射、...)
 *  ③终止操作
 *
 *  4.说明：
 *  ①一个中间操作链，对数据源的数据进行处理
 *  ②一旦执行终止操作，就执行中间操作链，并产生结果，之后不会再被使用
 *
 * @author: Zhaoxl
 * @date: 2024/4/27 19:30
 * @description:
 */
public class StramApiTest {
    //创建Stream方式一：通过集合
    @Test
    public void test1(){

//         default Stream<E> stream() ： 返回一个顺序流
//         default Stream<E> parallelStream() ： 返回一个并行流


    }

    //創建stream方式二：通過數組
    @Test
    public void test2(){
        int[] arr = new int [] {1,2,3,4,5};
        //調用arrays类的static <T> Stream<T> stream(T[] array) :返回一个流
        IntStream stream = Arrays.stream(arr);
    }

//    创建Stream方式三：通过stream的of()
    @Test
    public  void test3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
    }

//    创建Stream方式四： 创建无限流
    @Test
    public  void test4(){
//        迭代
//        public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
          Stream.iterate(0,t -> t + 2).limit(10).forEach(System.out::println);
//        生成
//        public static<T> Stream<T> generate(Supplier<T> s)
          Stream.generate(Math::random).limit(10).forEach(System.out::println);
//  返回第一个元素
        Optional<Employee> employee =enployees.stream().findfirst();

        //count --返回流中元素的总个数
        long count = employees.stream().filter(e-> e.getSalary() > 5000).count();

//        返回最高的工资
        Stream<Double> salaryStream = employees.stream().map(e -> e.getSalary());
        Optional<Double> maxSalary = salartStream.max(Double :: compare);


//        reduce(T identity, BinaryOperator ) ——可以将流中元素反复结合起来，得到一个值
//                计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9,8);
            Integer sum = list.stream().reduce(0,Integer::sum);
            System.out.println(sum);

//            计算公司所有员工工资的总和
        List<Employee> employees =  EmployeeData.getEmployee();

        Stream<Double> salaryStream = employees.stream().map(Employee ::getSalary);

        Optional<Double> sumMoney = salaryStream.reduce(Double::sum);
        System.out.println(sumMoney);



    }


    @Test
    public  void test4(){
//        收集
//        collect(collector c) 将流转换为其他形式。 接受一个collector接口的实现，用于给Stream中元素做汇总的方法
//        查找工资大于6000的员工，结果返回一个list或set
       List<Employee> employees =  EmployeeData.getEmployees();
        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

        Set<Employee> employeeSet = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);
    }
}
