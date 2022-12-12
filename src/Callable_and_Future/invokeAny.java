package Callable_and_Future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class invokeAll {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () ->{
            return "Hello";
        };

        Callable<String> java = () ->{
            return "java";
        };

        Callable<String> im = () ->{
            return "im";
        };

        Callable<String> by = () ->{
            return "by";
        };

        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello,java,im,by));

        for(Future<String> f : futures){
            System.out.println(f.get());
        }

//        futures.stream().forEach(f -> {
//            f.get()
//        });

        executorService.shutdown();
    }

}