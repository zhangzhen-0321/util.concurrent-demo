package com.sansuo.lock;

import javafx.concurrent.Worker;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zz on 2019/1/25.
 */
public class Demo {
    public static void main(String[] args) {
        MyLock myLock = new MyLock(2);
        ReentrantLock reentrantLock = new ReentrantLock();
    class Wor extends Thread{
        @Override
        public void run() {
           //for(;;){
            reentrantLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"...............");
                    Thread.sleep(5000);
                }catch (Exception e){

                }finally {
                    reentrantLock.unlock();
                }

            //}
        }
    }
        for (int i = 0; i<2; i++) {
            Wor w = new Wor();
            w.start();
        }
    }


}
