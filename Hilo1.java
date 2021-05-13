//Sedano Acosta Martha Elizabeth    N/C:19290949
public class Hilo1 extends Thread{

    public void run(int vec[]){
        int suma=0;
        for(int i = 0; i < vec.length; i++){
            suma+=vec[i];
        }
        System.out.println("\n*Hilo 1*");
        System.out.printf("%d\n\n",suma);
    }
}