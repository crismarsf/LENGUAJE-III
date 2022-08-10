/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasethis;

/**
 *
 * @author crist
 */
public class A {
    
    void m(){
        System.out.println("hello m");}  
    void n(){  
        System.out.println("hello n");  
    //m();//es igual a this.m()  
    
    this.m();  
    }     
}
