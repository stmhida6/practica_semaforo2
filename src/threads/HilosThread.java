package threads;

public class HilosThread  extends  Thread{

    @Override
    public void run() {
      System.out.println("Hola desde el hilo creado");
    }
}
