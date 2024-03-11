package Trabajadores;

public class Mensajero extends Trabajador{
    private String eps;
    private String arl;
    private String pension;

    public Mensajero() {
        super();
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }
    
}
