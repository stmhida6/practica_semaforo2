package threads;

public class Main   {
    public static void main(String[] args) {

        // Crear un hilo que implemente Runnable
        HiloRunnable hiloRunnable = new HiloRunnable();
        Thread hilo2 = new Thread(hiloRunnable);
        hilo2.start();



    }
}
