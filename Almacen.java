//Sedano Acosta Martha Elizabeth    N/C:19290949
public class Almacen extends Thread{

    public void run(int num){
      
      Hilo1 hilo1 = new Hilo1();
      Hilo2 hilo2 = new Hilo2();
      Hilo3 hilo3 = new Hilo3();
      int vec[] = new int[num];
      //Almacenado
        for(int i = 0; i < vec.length; i++){
            vec[i] = (int)(Math.random()*75+25);
            System.out.printf("Vector[%d] = %d\n", i, vec[i]);
        }
        hilo1.run(vec);
        hilo2.run(vec);
        hilo3.run(vec);
    }
}