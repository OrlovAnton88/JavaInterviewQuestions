package concurrency.example1;

/**
 * Author:      oav <br>
 * Date:        03.02.16, 18:37 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class MyRunnable implements Runnable {

    private volatile boolean execute;

    @Override
    public void run() {
        this.execute = true;
        while (this.execute){
            try {
                System.out.println("I'm working name[" + Thread.currentThread().getName() + "]");
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                this.execute = false;
                System.out.println("Thread was interrupted");
            }
        }
    }

    public void stopExecuting() {
        this.execute = false;
    }

}
