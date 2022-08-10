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
public class Student {
    
    int rollno;  
    String name;  
    float fee;  
    
    public Student(int rollno, String name, float fee){  //hacer ejemplo con variables locales r, n y f
    this.rollno = rollno;  //usar this. para inicializar la variable
    this.name = name;  //usar this. para inicializar la variable
    this.fee = fee;  //usar this. para inicializar la variable
    }  

    void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

