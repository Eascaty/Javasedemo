package com.company.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public  void run() {
        //相同的票出现了多次
        while (true) {
            //tickets = 100;
            //t1
            try {
                lock.lock();
                if (tickets > 0) {
                    //通过sleep()方法来模拟出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally{
                lock.unlock();
            }
                }
        
        }

    }

