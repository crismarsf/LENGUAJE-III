/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author crist
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol tree = new Arbol();
        
        tree.insert(3, "Nintendo");
        tree.insert(5, "Sony");
        tree.insert(10, "Microsoft");  
        tree.insert(8, "Sega");
        tree.insert(4, "Atari");
      
        tree.run(tree.root);//Recorre el arbol - Si quiero un lado uso .left o .right
    }
    
}
