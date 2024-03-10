package panaderia;

import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panadero extends Trabajador{

    private int YearsExp;


    public Panadero() {
        super();
    }

    public int getYearsExp() {
        return YearsExp;
    }

    public void setYearsExp(int yearsExp) {
        YearsExp = yearsExp;
    }
    
    // public  void cargarArrayList(String t) {
    //     String nombreFichero = t;
    //     File fichero = new File(nombreFichero);
    //     Scanner s = new Scanner(System.in);
    //     try {
    //         // Leemos el contenido del fichero
    //         s = new Scanner(fichero);
    //         // Obtengo los datos de los partidos de fútbol del fichero
    //         while (s.hasNextLine()) {
    //             String linea = s.nextLine();
                
    //             String[] cortarString = linea.split(";");
    //             Panadero panadero = new Panadero();
    //             if (linea.charAt(0) == '1') {
    //                 panadero.setCc(Integer.parseInt(cortarString[1]));
    //                 panadero.setNombres(cortarString[2]);
    //                 panadero.setApellidos(cortarString[3]);
    //                 panadero.setAñosExp(Integer.parseInt(cortarString[4]));
    //                 panadero.setEdad(Integer.parseInt(cortarString[5]));
    //                 ArrayPanadero.add(panadero);
    //             } else if (linea.charAt(0) == '2') {
    //                 ArrayVendedor.add(panadero);
    //             } else {
    //                 ArrayMensajero.add(panadero);
    //             }

    //         }

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     } finally {
    //         try {
    //             if (s != null)
    //                 s.close();
    //         } catch (Exception e2) {
    //             e2.printStackTrace();
    //         }
    //     }
    // }

    // public  void mostrarPanaderos() {
    //     String s = "";
    //     Iterator<Panadero>

    //         s += panader.getCC() + ", "
    //             + panader.getNombre() + " ,"
    //             + panader.getApellidos() + " ,"
    //             + panader.getYearsExp() + ", "
    //             + panader.getEdad()+"."
    //             + "\n";
    //     }
    //     JTextArea textArea = new JTextArea(s);
    //     JScrollPane scrollPane = new JScrollPane(textArea);
    //     textArea.setLineWrap(true);
    //     textArea.setWrapStyleWord(true);
    //     scrollPane.setPreferredSize(new Dimension(500, 500));
    //     JOptionPane.showMessageDialog(null, scrollPane, "Partidos", 1);
    // }






}
