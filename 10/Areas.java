/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author crist
 */
public class Areas {
      
        double base;//
        double altura;
        double ancho;
        
        public Areas(){
            base = 0;
            altura = 0;
            ancho = 0;
        }
        
        public Areas(double base, double altura, double ancho){
            this.base = base;
            this.altura = altura;
            this. ancho = ancho;
        }
        
        public double areaTriangulo(double calculoArea){
        calculoArea = (base * altura) / 2;
        return calculoArea;
        }    
}
