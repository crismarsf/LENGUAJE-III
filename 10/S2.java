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
public class S2 {
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    
    void p(){
        m(this);
    }
    
}
