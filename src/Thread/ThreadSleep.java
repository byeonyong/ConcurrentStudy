public class ThreadSleep {

//   sleep을 사용했기 때문에 이제 항상 main Thread가 getName 출력이 먼저 될거임
    public static void main(String[] args) {
        Thread thread = new Thread(()->{

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
        System.out.println("Thread :" + Thread.currentThread().getName());
    }
}
