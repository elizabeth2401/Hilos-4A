//Sedano Acosta Martha Elizabeth    N/C:19290949
public class ClasePrincipal {

    public static void main(String[] args) {
      int num=5;

        Almacen almacen = new Almacen(); 
        almacen.run(num);
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        
        almacen.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
}