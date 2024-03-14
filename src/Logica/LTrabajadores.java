package Logica;

import Trabajadores.Mensajero;
import Trabajadores.Panadero;
import Trabajadores.Vendedor;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LTrabajadores {

    private ArrayList<Vendedor> arrayVendedor;
    private ArrayList<Panadero> arrayPanadero;
    private ArrayList<Mensajero> arrayMensajero;

    private String sfichero = "src/Archivos/trabajadores.txt";

    public LTrabajadores() {
    }

    public void CargarDatos() {
        this.arrayVendedor = new ArrayList<>();
        this.arrayPanadero = new ArrayList<>();
        this.arrayMensajero = new ArrayList<>();
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
            JOptionPane.showMessageDialog(null, "Se han cargado los datos");
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
        int p = 500, t = 300;// tamaño del JOP
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
                p = 600; // agrando el JOP

                while (itrMensajero.hasNext()) {
                    Mensajero menso = itrMensajero.next();
                    s += "Cc: " + menso.getCC() + ", "
                            + "Nombre: " + menso.getNombre()
                            + " " + menso.getApellidos()
                            + ", Edad: " + menso.getEdad()
                            + ", EPS: " + menso.getEps()
                            + ", ARL: " + menso.getArl()
                            + ", Pension: " + menso.getPension()
                            + "\n";
                }

                break;
            case 4:
                p = 700;
                t = 500;
                while (itrPanaderos.hasNext() || itrVendedor.hasNext() || itrMensajero.hasNext()) {

                    if (itrPanaderos.hasNext()) {
                        Panadero panader = itrPanaderos.next();
                        s += "Cargo: Panadero, "
                                + "Cc: " + panader.getCC() + ", " +
                                "Nombre: " + panader.getNombre()
                                + " " + panader.getApellidos()
                                + ", Experiencia: " + panader.getYearsExp()
                                + ", Edad: " + panader.getEdad() + "."
                                + "\n";

                    } else if (itrVendedor.hasNext()) {
                        Vendedor vender = itrVendedor.next();
                        s += "Cargo: Vendedor, " +
                                "Cc: " + vender.getCC() + ", " +
                                "Nombre: " + vender.getNombre()
                                + " " + vender.getApellidos()
                                + ", Experiencia: " + vender.getYearsExp()
                                + ", Edad: " + vender.getEdad()
                                + ", EPS: " + vender.getEps()
                                + "\n";
                    } else {
                        Mensajero menso = itrMensajero.next();
                        s += "Cargo: Mensajero, "+
                                "Cc: " + menso.getCC() + ", "
                                + "Nombre: " + menso.getNombre()
                                + " " + menso.getApellidos()
                                + ", Edad: " + menso.getEdad()
                                + ", EPS: " + menso.getEps()
                                + ", ARL: " + menso.getArl()
                                + ", Pension: " + menso.getPension()
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
        return ((Math.floor(Math.log10(Math.abs(Cc))) / Math.log10(6)) >= 6)
                || (Math.floor(Math.log10(Math.abs(Cc))) == 10) ? true : false;
    }

    private boolean verificarEdad(int edad) {
        return edad >= 18 ? true : false;
    }

    public String PromedioExp() {

        Iterator<Panadero> p = arrayPanadero.iterator();
        Iterator<Vendedor> v = arrayVendedor.iterator();
        float sum = 0;
        while (p.hasNext() || v.hasNext()) {
            if (p.hasNext()) {
                Panadero pan = p.next();
                if (pan.getYearsExp() >= 2 && pan.getYearsExp() <= 5) {
                    sum += 1;
                }
            }
            if (v.hasNext()) {
                Vendedor ven = v.next();
                if (ven.getYearsExp() >= 2 && ven.getYearsExp() <= 5) {
                    sum += 1;
                }
            }
        }
        float prom = sum / (arrayVendedor.size() + arrayMensajero.size() + arrayPanadero.size());

        return "Promedio de los trabajadores con años de experiencia entre 2 y 5 son: " + prom;
    }

    public Boolean Buscar(int CC) {

        Iterator<Panadero> p = arrayPanadero.iterator();
        Iterator<Vendedor> v = arrayVendedor.iterator();
        Iterator<Mensajero> m = arrayMensajero.iterator();

        while (p.hasNext() || v.hasNext() || m.hasNext()) {
            if (p.hasNext()) {
                Panadero pan = p.next();
                if (pan.getCC() == CC) {
                    return true;
                }
            }
            if (v.hasNext()) {
                Vendedor ven = v.next();
                if (ven.getCC() == CC) {
                    return true;
                }
            }
            if (m.hasNext()) {
                Mensajero men = m.next();
                if (men.getCC() == CC) {
                    return true;
                }
            }
        }

        return false;
    }

    public void agregarLTrabajador(int op) {
        int Cc, edad;
        Cc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cedula: "));
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad: "));
        while (!verificarCc(Cc) || !verificarEdad(edad)) {
            if (!verificarCc(Cc)) {
                Cc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cedula de 6 a 10 digitos: "));
            }
            if (!verificarEdad(edad)) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad, mayor de 18: "));
            }

        }

        if (!Buscar(Cc)) {
            switch (op) {
                case 1:
                    Panadero pan = new Panadero();
                    pan.setCC(Cc);
                    pan.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre: "));
                    pan.setApellidos(JOptionPane.showInputDialog(null, "Ingrese apellido: "));
                    pan.setYearsExp(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Experiencia: ")));
                    pan.setEdad(edad);
                    arrayPanadero.add(pan);
                    break;

                case 2:
                    Vendedor vend = new Vendedor();
                    vend.setCC(Cc);
                    vend.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre: "));
                    vend.setApellidos(JOptionPane.showInputDialog(null, "Ingrese apellido: "));
                    vend.setYearsExp(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Experiencia: ")));
                    vend.setEdad(edad);
                    vend.setEps(menuEPS());
                    arrayVendedor.add(vend);

                    break;

                case 3:
                    Mensajero menso = new Mensajero();
                    menso.setCC(Cc);
                    menso.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre: "));
                    menso.setApellidos(JOptionPane.showInputDialog(null, "Ingrese apellido: "));
                    menso.setEdad(edad);
                    menso.setEps(menuEPS());
                    menso.setArl(menuARL());
                    menso.setPension(menuPension());
                    arrayMensajero.add(menso);
                    break;
            }
            this.crearArchivo();
        } else {
            JOptionPane.showMessageDialog(null, " La cedula ingresada ya existe");
        }

    }

    public void crearArchivo() {
        File fichero = new File("src\\Archivos\\Trabajadores2.txt");
        String escribo = "";

        try {
            FileWriter escritura = new FileWriter(fichero);

            for (Panadero pana : arrayPanadero) {
                escribo = "1;" + pana.getCC() + ";" + pana.getNombre() + ";" + pana.getApellidos() + ";"
                        + pana.getYearsExp()
                        + ";" + pana.getEdad() + "\n";
                escritura.write(escribo);
            }

            for (Vendedor vender : arrayVendedor) {
                escribo = "2;" + vender.getCC() + ";" + vender.getNombre() + ";" + vender.getApellidos() + ";"
                        + vender.getYearsExp()
                        + ";" + vender.getEdad() + ";" + vender.getEps() + "\n";
                escritura.write(escribo);
            }
            for (Mensajero menso : arrayMensajero) {
                escribo = "3;" + menso.getCC() + ";" + menso.getNombre() + ";" + menso.getApellidos() + ";"
                       + menso.getEdad() + ";" + menso.getEps() + ";" + menso.getArl() + ";" + menso.getPension()
                        + "\n";
                escritura.write(escribo);
            }
            escritura.close();

        } catch (IOException Exception) {
            Exception.printStackTrace(System.out);

        }
    }

    public String menuEPS() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "----------Seleccion EPS----------"
                    + "\n1.Sura\n"
                    + "2.Savia Salud\n"
                    + "3.SANITAS S.A."));
            switch (op) {
                case 1:
                    return "Sura";

                case 2:
                    return "Savia Salud";

                case 3:
                    return "SANITAS S.A.";

                default:
                    JOptionPane.showMessageDialog(null, "Por favor digire un numero correcto");
                    break;
            }

        } while (op != 1 && op != 2 && op != 3);

        return null;

    }

    private String menuARL() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "----------Seleccion arl----------\n"
                    + "1.Sura\n"
                    + "2.Positiva\n"
                    + "3.Colmena"));
            switch (op) {
                case 1:
                    return "Sura";

                case 2:
                    return "Positiva";

                case 3:
                    return "Colmena";

                default:
                    JOptionPane.showMessageDialog(null, "Por favor digire un numero correcto");
                    break;
            }

        } while (op != 1 && op != 2 && op != 3);

        return null;

    }

    private String menuPension() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "----------Seleccion Pension----------\n"
                    + "1.Colpensiones\n"
                    + "2.Colfondos\n"
                    + "3.Porvenir"));
            switch (op) {
                case 1:
                    return "Colpensiones";

                case 2:
                    return "Colfondos";

                case 3:
                    return "Porvenir";

                default:
                    JOptionPane.showMessageDialog(null, "Por favor digire un numero correcto");
                    break;
            }

        } while (op != 1 && op != 2 && op != 3);

        return null;

    }

    public void NombrePension(int op) {
        String[] vect = { "Colpensiones", "Colfondos", "Porvenir" };
        String s = "-----Nombres de los trabajadores con la pension " + vect[op - 1] + "-----\n\n";
        Iterator<Mensajero> itrM = arrayMensajero.iterator();
        while (itrM.hasNext()) {
            Mensajero menso = itrM.next();
            if (menso.getPension().equals(vect[op - 1])) {
                s += menso.getNombre() + " " + menso.getApellidos() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, s);

    }

    public String Porcentaje(String eps) {

        Iterator<Mensajero> m = arrayMensajero.iterator();
        Iterator<Vendedor> v = arrayVendedor.iterator();
        float sum = 0;
        while (m.hasNext() || v.hasNext()) {
            if (m.hasNext()) {
                Mensajero men = m.next();
                if (men.getEps().equals(eps)) {
                    sum += 1;
                }
            }
            if (v.hasNext()) {
                Vendedor ven = v.next();
                if (ven.getEps().equals(eps)) {
                    sum += 1;
                }
            }
        }
        float prom = (sum * 100) / (arrayVendedor.size() + arrayMensajero.size() + arrayPanadero.size());
        if (sum == 0) {
            return "No hay trabajadores con la eps " + eps;
        } else {
            return "El " + prom + "% de los trabajadores tiene eps " + eps;
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
