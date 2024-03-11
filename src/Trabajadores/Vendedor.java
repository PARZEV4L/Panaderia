package Trabajadores;

import java.time.Year;
import java.util.ArrayList;

public class Vendedor extends Trabajador{

    private int YearExp;
    private String Eps;


    public Vendedor() {
        super();
    }

    public int getYearsExp() {
        return YearExp;
    }

    public void setYearsExp(int yearExp) {
        YearExp = yearExp;
    }

    public String getEps() {
        return Eps;
    }

    public void setEps(String eps) {
        Eps = eps;
    }
}
