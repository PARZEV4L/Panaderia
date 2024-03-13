
package panaderia;


import Logica.LTrabajadores;
import Menu.Menu;

import javax.swing.*;

public class Panaderia {

   
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.menu();
        LTrabajadores x = new LTrabajadores();
        x.CargarDatos();
        //JOptionPane.showMessageDialog(null,x.PromedioExp());
        if(x.Buscar(889900)){
            JOptionPane.showMessageDialog(null, "Esta");
        }else {
            JOptionPane.showMessageDialog(null, "NO");
        }
    }
    
}
