/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

/**
 *
 * @author maiella.stefano
 */
public class Inc1000 implements Runnable{
    
    private static int cnt;

    public Inc1000() {
    }
    
    
    
    @Override
    public void run() {
        for(int i = 0; i<1000;i++){
         inc1(); 
         
        }
        
        
    }
    
    public synchronized void inc1(){
        
            cnt = cnt + 1;
        
    }
    
}
