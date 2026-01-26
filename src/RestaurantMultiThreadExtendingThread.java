public class RestaurantMultiThreadExtendingThread extends Thread {
    private String task;

    RestaurantMultiThreadExtendingThread(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
    }

}

class RestaurantTask {
    public static void main(String[] args) {
        Thread t1 = new RestaurantMultiThreadExtendingThread("Pizza");
        Thread t2 = new RestaurantMultiThreadExtendingThread("Roti");
        Thread t3 = new RestaurantMultiThreadExtendingThread("Chiken");
        Thread t4 = new RestaurantMultiThreadExtendingThread("Chats");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
