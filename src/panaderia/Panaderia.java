
package panaderia;


public class Panaderia {

   
    public static void main(String[] args) {
        Panadero panader = new Panadero();
       panader.cargarArrayList("D:\\Users\\Usuario\\Documents\\NetBeansProjects\\Panaderia\\Archivos\\trabajadores.txt");
        panader.mostrarPanaderos();
    }
    
}
