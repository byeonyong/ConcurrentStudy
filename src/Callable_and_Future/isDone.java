package Callable_and_Future;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Callable은 Runnable과 기능은 똑같지만 return이 가능하다는 차이점이 있음
        Callable<String> hello = () ->{
            Thread.sleep(2000L);
            return "Hello";
        };

//        Future는 Callable에서 return 받은것을 받을수 있는 함수
        Future<String> helloFuture = executorService.submit(hello);

//      isDone - 작업이 끝났으면 true return, 안끝났으면 false return
        System.out.println(helloFuture.isDone());
        System.out.println("Started!");

//      get을 사용해주면 값을 가져올때까지 기다림
        helloFuture.get();

        System.out.println(helloFuture.isDone());
        System.out.println("End!!");
        executorService.shutdown();
    }

}