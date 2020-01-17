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
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inc1000 t1 = new Inc1000();
        Inc1000 t2 = new Inc1000();
       
        
        Thread thrd1 = new Thread(t1); 
        Thread thrd2 = new Thread(t2); 
        
        
        
        thrd1.start();
        thrd2.start();
        
        System.out.println(cnt);
        
//        thrd1.join();
    }
    
}
