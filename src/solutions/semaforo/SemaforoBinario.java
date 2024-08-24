package solutions.semaforo;
import java.util.concurrent.Semaphore;

public class SemaforoBinario {

 /*   private boolean control = true;

    public synchronized void acquire() throws InterruptedException {
        while (!control) {

            wait();

        }
        control = false;
    }

    public synchronized void release() {
        control = true;
        notify();
    }*/

    private final Semaphore semaphore;

    public SemaforoBinario() {
        this.semaphore = new Semaphore(1);
    }

    public void acquire() throws InterruptedException {
        semaphore.acquire();
    }

    public void release() {
        semaphore.release();
    }
}
