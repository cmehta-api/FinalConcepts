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
public class FinalyConcepts {
    
    
    
    
    public static void main(String[]args){
        
        arithmeticException();
        
        nullPointerException();
        
        
    }
    
    
    
    
    public static void arithmeticException(){
        int j = 10;
        
        try{
            System.out.println("inside the try block");
            int k = j/0;
        }
        
        catch(ArithmeticException e){
            
            System.out.println("inside the catch block");
            System.out.println("Divide by zero erorr ");
            
        }
        
        
        finally{
            
            System.out.println("Inside the finally");
        }
    }
    
    
    
    
    public static void nullPointerException(){
        
        String s = null;
        
        try{
            
            System.out.println("inside the try block");
            if(s.equals("abc")){
                
                System.out.println("string is same ");
            }else{
                
                System.out.println(" not same");
            }
            
        }
       
        catch(NullPointerException e){
            
            System.out.println("inside the catch block");
            System.out.println("String value is null ");
        }
        
        
        finally{
            System.out.println("inside the finally");
        }
        
    }
    
}
