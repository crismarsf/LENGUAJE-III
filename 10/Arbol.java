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
public class Arbol {
    
    Node root;//Variable global
    public Arbol(){//Contructor del Arbol
        root = null;
    }
    
    public void insert(int i, Object fruit){//Método de contenido de frutas
        Node n = new Node(i);//Parámetro ingresado
        n.content = fruit;//Contenido
        
        if(root == null){//Condicional
            root = n;
        }else{//Alternativa
            Node aux = root;//Nodo auxiliar
            while(aux != null){
                n.parent = aux;//Nodo padre será igual al aux
                if(n.key >= aux.key){//Si el indice es igual o mayor a la llave del aux
                    aux = aux.right;            
                }else{
                    aux = aux.left;
                }
            }
            
            if(n.key < n.parent.key){//Nodo indice
                n.parent.left = n;
            }else{
                n.parent.right = n;
            }        
        }
    }
    
    public void run (Node n){//Método recorrido
        if(n != null){
            run(n.left);//Recorre a la izquierda
            System.out.println("El Indice " + n.key + " Compañía " + n.content);
            run(n.right);//Recorre a la derecha
        }
        
    }

    public class Node{
        public Node parent; //Nodo de raíz
        public Node right; //Nodo izquierda
        public Node left; //Nodo derecha
        public int key; //Identificador de Nodo
        public Object content;//Contenido o atributos dentro del Nodo
        
        public Node(int index){//Constructor
            key = index;
            right = null;
            left = null;
            parent = null;
            content = null;
        }
    }
    
}
