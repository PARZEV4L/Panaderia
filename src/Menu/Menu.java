package Menu;

import javax.swing.JOptionPane;

import Logica.LTrabajadores;

public class Menu {
    public void menu() {
        int op = 0;
        LTrabajadores x = new LTrabajadores();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "----------Menu Panaderia----------\n"
                    + "1.Cargar de un archivo plano 10 de cada tipo de trabajador.\n"
                    + "2.Ingresar un trabajador.\n"
                    + "3.Buscar un trabajador.\n"
                    + "4.Promedio de trabajadores que tienen como años de experiencia entre 2 y 5.\n"
                    + "5.Porcentaje de trabajadores de una eps.\n"
                    + "6.Nombres de los trabajadores donde la pensión es \"Porvenir\".\n"
                    + "0.Salir\n"));
            switch (op) {
                case 1:
                    x.CargarDatos();
                    break;
                case 2:
                int tTra = menuT();
                x.agregarLTrabajador(tTra);

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,x.Porcentaje("Sura"));
                    break;
                case 6:
                   
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por confiar en nosotros...\n");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite correctamente la opcion\n");
                    break;
            }

        } while (op != 0);

    }

    private static int menuT(){
            int op;
    
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null,"----------Seleccione el tipo de trabajador a agregar----------\n"
                + "1.Panadero\n"
                + "2.Vendedor\n"
                + "3.Mensajero\n"));
                switch (op) {
                    case 1:
                        return 1;
    
                    case 2:
                        return 2;
    
                    case 3:
                        return 2;
    
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digire un numero correcto");
                        break;
                }
    
            } while (op != 1 && op != 2 && op != 3);
    
            return 0;
    
        }
}
