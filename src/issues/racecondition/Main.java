package issues.racecondition;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();
        HiloContador hilo1 = new HiloContador(contador);
        HiloContador hilo2 = new HiloContador(contador);
        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilo2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El contador es: " + contador.getContador());
    }
}