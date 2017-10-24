/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yield;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author J2EE-33
 */
public class SirMyThread extends Thread {
    int i = 0;
    @Override
    
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SirMyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread started running..");
    while (true){
            
      
           System.out.println("Result of i: " + i++);
        if(i == 10){
            break;
        
        }
    
    }
    }
    public static void main(String[] args) {
        Thread t = new SirMyThread();
        t.start();
    }
    
    
}
