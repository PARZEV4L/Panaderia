package Logica;

import Trabajadores.Mensajero;
import Trabajadores.Panadero;
import Trabajadores.Vendedor;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LTrabajadores {

    private ArrayList<Vendedor> arrayVendedor;
    private ArrayList<Panadero> arrayPanadero;
    private ArrayList<Mensajero> arrayMensajero;

    private String sfichero = "src/Archivos/trabajadores.txt";

    public LTrabajadores() {

        this.arrayVendedor = new ArrayList<>();
        this.arrayPanadero = new ArrayList<>();
        this.arrayMensajero = new ArrayList<>();
    }

    public void CargarDatos() {
        File fichero = new File(sfichero);
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);
            int op = 0;
            // Obtengo los datos de los partidos de fútbol del fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine();    // Obtengo una linea del fichero con los numeros
                String[] cortarString = linea.split(";");        // Obtengo los numeros de la linea en un array

                op = Integer.parseInt(cortarString[0]);

                switch (op) {
                    case 1:
                        Panadero pan = new Panadero();
                        pan.setCC(Integer.parseInt(cortarString[1]));
                        pan.setNombre(cortarString[2]);
                        pan.setApellidos(cortarString[3]);
                        pan.setYearsExp(Integer.parseInt(cortarString[4]));
                        pan.setEdad(Integer.parseInt(cortarString[5]));
                        arrayPanadero.add(pan);
                        break;

                    case 2:
                        Vendedor vend = new Vendedor();
                        vend.setCC(Integer.parseInt(cortarString[1]));
                        vend.setNombre(cortarString[2]);
                        vend.setApellidos(cortarString[3]);
                        vend.setYearsExp(Integer.parseInt(cortarString[4]));
                        vend.setEdad(Integer.parseInt(cortarString[5]));
                        vend.setEps(cortarString[6]);
                        arrayVendedor.add(vend);


                        break;

                    case 3:

                        break;
                }


            }
            String p = "";
            Iterator<Panadero> itrPanaderos = arrayPanadero.iterator();
            while (itrPanaderos.hasNext()) {
                Panadero panader = itrPanaderos.next();
                p += panader.getCC() + ", "
                        + panader.getNombre() + " ,"
                        + panader.getApellidos() + " ,"
                        + panader.getYearsExp() + ", "
                        + panader.getEdad()+"."
                        + "\n";
            }
            JTextArea textArea = new JTextArea(p);
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new Dimension(500, 500));
            JOptionPane.showMessageDialog(null, scrollPane, "Panaderos", 1);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null)
                    s.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public ArrayList<Vendedor> getArrayVendedor() {
        return arrayVendedor;
    }

    public void setArrayVendedor(ArrayList<Vendedor> arrayVendedor) {
        this.arrayVendedor = arrayVendedor;
    }

    public ArrayList<Panadero> getArrayPanadero() {
        return arrayPanadero;
    }

    public void setArrayPanadero(ArrayList<Panadero> arrayPanadero) {
        this.arrayPanadero = arrayPanadero;
    }

    public ArrayList<Mensajero> getArrayMensajero() {
        return arrayMensajero;
    }

    public void setArrayMensajero(ArrayList<Mensajero> arrayMensajero) {
        this.arrayMensajero = arrayMensajero;
    }
}
