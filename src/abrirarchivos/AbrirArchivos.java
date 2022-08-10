/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarchivos;
    import java.awt.Desktop;
    import java.io.IOException;
    import java.io.File;

/**
 *
 * @author crist
 */
public class AbrirArchivos {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
            try {
                  Desktop.getDesktop().open(new File("C:\\Users\\crist\\Documents\\NetBeansProjects\\abrirArchivos\\src\\Amaterasu.jpg"));
                } catch (IOException e) {
                }
        }
}


    
