package concurrency.deadlock;

/**
 * Author:      oav <br>
 * Date:        04.02.16, 11:48 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class DeadLock {

    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend gogi = new Friend("Gogi");
        final Friend ashot = new Friend("Ashot");

        new Thread(new Runnable() {
            @Override
            public void run() {
                gogi.bow(ashot);
            }
        }, "Gogi").start();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                ashot.bow(gogi);
            }
        },"Ashot").start();
    }

}
