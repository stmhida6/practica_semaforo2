package solutions.starvation;

public class StarvationDemo {

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new TareaAlaPrioridad());
        Thread hilo2 = new Thread(new TareaBajaPrioridad());

        hilo1.setPriority(Thread.MAX_PRIORITY);
        hilo2.setPriority(Thread.MIN_PRIORITY);

        hilo1.start();
        hilo2.start();
    }

    static class TareaAlaPrioridad implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("Hilo de alta prioridad ejecutandose");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class TareaBajaPrioridad implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("Hilo de baja prioridad ejecutandose");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
