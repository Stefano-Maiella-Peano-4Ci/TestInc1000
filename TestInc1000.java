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
       
        
        Thread thrd1 = new Thread(t1); 
        
        
        thrd1.start();
        
        
        
//        thrd1.join();
    }
    
}
