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
                String linea = s.nextLine(); // Obtengo una linea del fichero con los numeros
                String[] cortarString = linea.split(";"); // Obtengo los numeros de la linea en un array

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
                        Mensajero menso = new Mensajero();
                        menso.setCC(Integer.parseInt(cortarString[1]));
                        menso.setNombre(cortarString[2]);
                        menso.setApellidos(cortarString[3]);
                        menso.setEdad(Integer.parseInt(cortarString[4]));
                        menso.setEps(cortarString[5]);
                        menso.setArl(cortarString[6]);
                        menso.setPension(cortarString[7]);
                        arrayMensajero.add(menso);
                        break;
                }

            }
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

    public void mostrarTrabajadores(int op) {
        String s = "";
        int p = 500, t = 300;//tamaño del JOP
        Iterator<Mensajero> itrMensajero = arrayMensajero.iterator();
        Iterator<Panadero> itrPanaderos = arrayPanadero.iterator();
        Iterator<Vendedor> itrVendedor = arrayVendedor.iterator();
        switch (op) {
             case 1:
             p = 400; // acorto el JOP
                
                while (itrPanaderos.hasNext()) {
                    Panadero panader = itrPanaderos.next();
                    s += "Cc: " + panader.getCC() + ", " +
                            "Nombre: " + panader.getNombre()
                            + " " + panader.getApellidos()
                            + ", Experiencia: " + panader.getYearsExp()
                            + ", Edad: " + panader.getEdad() + "."
                            + "\n";
                }
                break;
             case 2:
              
                while (itrVendedor.hasNext()) {
                    Vendedor vender = itrVendedor.next();
                    s += "Cc: " + vender.getCC() + ", " +
                            "Nombre: " + vender.getNombre()
                            + " " + vender.getApellidos()
                            + ", Experiencia: " + vender.getYearsExp()
                            + ", Edad: " + vender.getEdad()
                            + ", EPS: " + vender.getEps()
                            + "\n";
                 
                }
                break;
             case 3:
             p = 600; //agrando el JOP
                
                 while (itrMensajero.hasNext()) {
                    Mensajero menso = itrMensajero.next();
                    s += "Cc: " + menso.getCC() + ", "
                            + "Nombre: " + menso.getNombre()
                            + " " + menso.getApellidos()
                            + ", Edad: " + menso.getEdad()
                            + ", EPS: " + menso.getEps()
                            + ", Pension: " + menso.getArl()
                            + "\n";
                 }

                 break;
                 case 4:
                 p = 650;
                 t = 500;
                 while (itrPanaderos.hasNext()||itrVendedor.hasNext()||itrMensajero.hasNext()) {
                  
                    if(itrPanaderos.hasNext()){
                    Panadero panader = itrPanaderos.next();
                    s +=    "Cargo: Panadero, " 
                            +"Cc: " + panader.getCC() + ", " +
                            "Nombre: " + panader.getNombre()
                            + " " + panader.getApellidos()
                            + ", Experiencia: " + panader.getYearsExp()
                            + ", Edad: " + panader.getEdad() + "."
                            + "\n";
                    
                   }
                 else if(itrVendedor.hasNext()){
                    Vendedor vender = itrVendedor.next();
                    s += "Cargo: Vendedor, " +
                    "Cc: " + vender.getCC() + ", " +
                            "Nombre: " + vender.getNombre()
                            + " " + vender.getApellidos()
                            + ", Experiencia: " + vender.getYearsExp()
                            + ", Edad: " + vender.getEdad()
                            + ", EPS: " + vender.getEps()
                            + "\n";
                 } else{
                    Mensajero menso = itrMensajero.next();
                    s += "Cargo: Mensajero, "+ 
                    "Cc: " + menso.getCC() + ", "
                            + "Nombre: " + menso.getNombre()
                            + " " + menso.getApellidos()
                            + ", Edad: " + menso.getEdad()
                            + ", EPS: " + menso.getEps()
                            + ", Pension: " + menso.getArl()
                            + "\n";
                   }
                }     
                break;
        
            }
        JTextArea textArea = new JTextArea(s);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(p, t));
        JOptionPane.showMessageDialog(null, scrollPane, "Trabajadores Panaderia", 1);

    }

    private boolean verificarCc(float Cc) {
        return ((Math.floor(Math.log10(Math.abs(Cc))) / Math.log10(6)) >= 6) || (Math.floor(Math.log10(Math.abs(Cc))) == 10) ? true : false;
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
