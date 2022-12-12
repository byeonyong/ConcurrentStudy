package CompletableFuture_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completableFutureAsync {

//   비동기로 작업하기 위한 거라고 그러네 Future가 또 모든 값을 return 받을 수 없는 그런 한계를 극복하기 위해 만들어졋다고 하기도 하고
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        return 값이 없을때 사용하는 방법 (runAsync)
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
        });
        future.get();

        
    }

}