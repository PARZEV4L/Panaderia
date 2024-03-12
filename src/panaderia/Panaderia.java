
package panaderia;


import Logica.LTrabajadores;
import Menu.Menu;

public class Panaderia {

   public static void main(String[] args) {
    
        //        Menu menu = new Menu();
        //        menu.menu();
                LTrabajadores x = new LTrabajadores();
                x.CargarDatos();
                x.mostrarTrabajadores(4);
            
   }
    
    
}
