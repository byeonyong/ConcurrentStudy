package Callable_and_Future;

import java.util.concurrent.*;

public class cancel {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Callable은 Runnable과 기능은 똑같지만 return이 가능하다는 차이점이 있음
        Callable<String> hello = () ->{
            Thread.sleep(2000L);
            return "Hello";
        };

//        Future는 Callable에서 return 받은것을 받을수 있는 함수
        Future<String> helloFuture = executorService.submit(hello);

//      cancel은 진행중인 작업을 interrupt하고 종료시킴 false는값을 기다리는것 / cancel일때는 값을 가져갈수 없음(get)
        helloFuture.cancel(true);
        System.out.println("Started!");

//      get을 사용해주면 값을 가져올때까지 기다림
        helloFuture.get();

//      cancel을 사용하고 나면 isDone은 무조건 true가 됨. but "값을 가져갈수 있다"의 의미가 아님
        System.out.println(helloFuture.isDone());
        System.out.println("End!!");
        executorService.shutdown();
    }

}