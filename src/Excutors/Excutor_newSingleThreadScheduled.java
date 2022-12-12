package Excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor_newFixedThread {

//    executor 서비스는 작업을 끝내고 다음 작업이 들어올때까지 기다리기 때문에 종료를 시키고 싶다면 명시적으로 종료를 시켜줘야함(shutdown)
    public static void main(String[] args) {
        
//      아까는 singleThread를 사용했는데 thread를 여러개 사용할 수도 있음, executorService는 thread pool을 가짐
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.execute(()->{
//            System.out.println("Thread "+Thread.currentThread().getName());
//        });

        executorService.submit(getRunnable("hello"));
        executorService.submit(getRunnable("hello"));
        executorService.submit(getRunnable("hello"));
        executorService.submit(getRunnable("hello"));

        executorService.shutdown();
    }

    private static Runnable getRunnable(String message){
        return ()-> System.out.println(message + Thread.currentThread().getName());
    }

}