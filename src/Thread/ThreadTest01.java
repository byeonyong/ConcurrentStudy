public class ThreadTest01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread : "+Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println("Thread :"+Thread.currentThread().getName());
    }
}
