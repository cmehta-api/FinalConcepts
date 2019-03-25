/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalConcepts;

/**
 *
 * @author cmehta
 */
public class FinalizeConcepts {
    
    
    
      public void finalize(){
        
        System.out.println("finalize method");
        
    }
    
    
    public static void main(String[]args){
        
        FinalizeConcepts f1 = new FinalizeConcepts();
        FinalizeConcepts f2 = new FinalizeConcepts();
        
        f1= null;
        f2=null;
        
        
       System.gc();
        
    }
    
   
   
    
}
