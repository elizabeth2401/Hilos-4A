//Sedano Acosta Martha Elizabeth    N/C:19290949
public class Hilo3 extends Thread{

    public void run(int vec[]){
        int suma=0;
        float media=0;
        for(int i = 0; i < vec.length; i++){
            suma+=vec[i];
        }
        media = (float)suma / vec.length;
        System.out.println("\n*Hilo 3*");
        System.out.printf("%.2f\n\n",media);
    }
}