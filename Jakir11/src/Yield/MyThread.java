/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yield;

/**
 *
 * @author J2EE-33
 */
public class MyThread extends Thread {
    @Override
    public void run(){
    while (true){
        System.out.println("Bangladesh");
        try {
           Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    
    }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
    
}
