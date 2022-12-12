public class ThreadTest02 {

//   ThreadTest01 과는 다르게 new Runnable을 lambda 식으로 사용
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
        System.out.println("Thread :" + Thread.currentThread().getName());
    }
}
