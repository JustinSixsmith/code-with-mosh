package com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    public static void show() {
        var service = new FlightService();
        service.getQuote("site1")
                .thenAccept(System.out::println);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


//        var future = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 1;
//        });
//
//        try {
//            var result = future
//                    .completeOnTimeout(1, 1, TimeUnit.SECONDS)
//                    .get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }


//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 20);
//
//        CompletableFuture
//            .anyOf(first, second)
//            .thenAccept(System.out::println);


//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//
//        var all = CompletableFuture.allOf(first, second, third);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("All tasks completed successfully");
//        });


//        var first = CompletableFuture.supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                    var price = str.replace("USD", "");
//                    return Integer.parseInt(price);
//                });
//
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//                .thenAccept(System.out::println);
//    public static CompletableFuture<String> getUserEmailAsync() {
//        return CompletableFuture.supplyAsync(() -> "email");
//    }
//
//    public static CompletableFuture<String> getPlaylistAsync(String email) {
//        return CompletableFuture.supplyAsync(() -> "playlist");
//    }


// id -> email
// email -> playlist
//        getUserEmailAsync()
//            .thenCompose(CompletableFutureDemo::getPlaylistAsync)
//            .thenAccept(System.out::println);

//    public static int toFahrenheit(int celsius) {
//        return (int) (celsius * 1.8) + 32;
//    }
//
//    public static void show() {
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        future
//            .thenApply(CompletableFutureDemo::toFahrenheit)
//            .thenAccept(System.out::println);

//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature = future.exceptionally(ex -> 1).get();
//            System.out.println(temperature);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//            var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }

