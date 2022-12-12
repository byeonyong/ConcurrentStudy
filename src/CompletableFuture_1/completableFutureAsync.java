package CompletableFuture_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completableFuture {

//   비동기로 작업하기 위한 거라고 그러네 Future가 또 모든 값을 return 받을 수 없는 그런 한계를 극복하기 위해 만들어졋다고 하기도 하고
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        completableFuture값을 사용하는 방법들
        CompletableFuture<String> future1 = new CompletableFuture<>();
        CompletableFuture<String> future2 = CompletableFuture.completedFuture("bby");
        future1.complete("by");

        System.out.println(future1.get());
        System.out.println(future2.get());
    }

}