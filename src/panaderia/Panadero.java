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

    public  void mostrarPanaderos() {
        String s = "";
        Iterator<Panadero>

            s += panader.getCC() + ", "
                + panader.getNombre() + " ,"
                + panader.getApellidos() + " ,"
                + panader.getYearsExp() + ", "
                + panader.getEdad()+"."
                + "\n";
        }
        JTextArea textArea = new JTextArea(s);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Partidos", 1);
    }






}
