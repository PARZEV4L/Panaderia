package Menu;

import javax.swing.JOptionPane;

public class Menu {
    public void menu() {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "----------Menu Panaderia----------\n"
                    + "1.Cargar de un archivo plano 10 de cada tipo de trabajador.\n"
                    + "2.Ingresar un trabajador.\n"
                    + "3.Buscar un trabajador.\n"
                    + "4.Promedio de trabajadores que tienen como años de experiencia entre 2 y 5.\n"
                    + "5.Promedio de trabajadores que tienen como años de experiencia entre 2 y 5.\n"
                    + "6.Nombres de los trabajadores donde la pensión es \"Porvenir\".\n"
                    + "0.Salir\n"));
            switch (op) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

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
}
