//Sedano Acosta Martha Elizabeth    N/C:19290949
public class Hilo2 extends Thread{

    public void run(int vec[]){
        int cuad = 0, sum = 0;
        for(int i = 0; i < vec.length; i++){
            cuad = (int)Math.pow(vec[i],2);
            sum += cuad;
        }
        System.out.println("*Hilo 2*");
        System.out.printf("%d\n\n",sum);
    }
}