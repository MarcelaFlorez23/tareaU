/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatarea;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcela Florez
 */
public class UltimaTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GuardarDatos dato = new GuardarDatos();
        String temp = "";
        int opc = 6;
        do
        {
            temp = JOptionPane.showInputDialog("Seleccione una opcion: \n "
                        + "1- Ingresar datos a la Cola \n"
                        + "2- Mostrar datos de la Cola \n"
                        + "3- Eliminar dato de la Cola \n"
                        + "4- Ver datos eliminados en la Pila \n"
                        + "5- Salir");
            opc = Integer.parseInt(temp);
            switch(opc)
            {
                case 1:
                    dato.Agregar();
                   break;
                case 2:
                    dato.MostrarCola();
                    break;
                case 3:
                    dato.eliminar();
                    break;
                case 4:
                    dato.Mostrar();
                    break;
                case 5:
                
                    JOptionPane.showMessageDialog(null, "La aplicacion ha finalizado");
                    break;
                
                default:
                
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                
            }
        }
        while(opc != 5);
    }
    
}
