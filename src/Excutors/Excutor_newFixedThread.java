package Excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor_singleThread {

//    executor 서비스는 작업을 끝내고 다음 작업이 들어올때까지 기다리기 때문에 종료를 시키고 싶다면 명시적으로 종료를 시켜줘야함(shutdown)
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(()->{
//            System.out.println("Thread "+Thread.currentThread().getName());
//        });
        executorService.submit(()->{
              System.out.println("Thread "+Thread.currentThread().getName());
        });

        executorService.shutdown();
    }

}