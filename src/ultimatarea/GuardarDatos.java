/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatarea;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcela Florez
 */
public class GuardarDatos {
    Stack<String> cola = new Stack();
    LinkedList pila = new LinkedList();
        String temp, resp = "no";

 public void Agregar() {
      
            temp = "";
            temp = JOptionPane.showInputDialog("Digite los valores a ingresar: ");
            cola.push(temp);
           
    }
    public void MostrarCola(){
    JOptionPane.showMessageDialog(null, cola);
    }
    public void eliminar(){
                    MostrarCola();
                    int index;
                    temp=JOptionPane.showInputDialog("Digite el dato a eliminar");
                    index=cola.indexOf(temp);
                    pila.add(temp);
                    cola.removeElementAt(index);
    }
    
     public void Mostrar() {
        JOptionPane.showMessageDialog(null, pila);
    }

    
}
