package src.main.java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // This task will be executed asynchronously
            return "Hello, world!";
        });

        // The main thread will continue executing without waiting for the task to complete
        System.out.println("Doing something else...");

        // The main thread will wait for the task to complete and then print the result
        System.out.println(future.get());
    }
}