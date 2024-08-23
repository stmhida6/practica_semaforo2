package threads;

public class HiloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hola desde el hilo creado");
    }
}
