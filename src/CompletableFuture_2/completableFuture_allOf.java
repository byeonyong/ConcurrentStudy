package CompletableFuture_2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completableFuture_thencombine {

//   비동기로 작업하기 위한 거라고 그러네 Future가 또 모든 값을 return 받을 수 없는 그런 한계를 극복하기 위해 만들어졋다고 하기도 하고
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World" + Thread.currentThread().getName());
            return "World";
        });

//        두 작업을 독립적으로 실행하고 둘 다 종료 했을 때 콜백 실행
        CompletableFuture<String> future = hello.thenCombine(world, (h,w)->h+" "+w);
        System.out.println(future.get());

    }

}