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
//***********************************IMP***************************************//

//Final = is keyword
//Finally = is block
//Finalize = is method


public class FinalConcepts {
    
    public static void main(String[]args){
        
        int i =10;
        i=20;
        i=30;
        System.out.println(i);
        
        final int j = 10;
        //j=20;   // Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - cannot assign a value to final variable j
        System.out.println(j);
        
        
        
    }
    
}
