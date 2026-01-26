public class RestaurantMultiThreadImplementsRunnable implements Runnable {
    private String task;

    RestaurantMultiThreadImplementsRunnable(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
    }

}

class Restaurant {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RestaurantMultiThreadImplementsRunnable("Pizza"));
        Thread t2 = new Thread(new RestaurantMultiThreadImplementsRunnable("Roti"));
        Thread t3 = new Thread(new RestaurantMultiThreadImplementsRunnable("Chiken"));
        Thread t4 = new Thread(new RestaurantMultiThreadImplementsRunnable("Chats"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
