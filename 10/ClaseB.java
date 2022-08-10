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
public class ClaseB {
    A4 obj;
    ClaseB(A4 obj){
        this.obj = obj;
    }
    
    void display(){  
    System.out.println(obj.data);//usa informacion de los datos de la clase A4   
    }  
}
