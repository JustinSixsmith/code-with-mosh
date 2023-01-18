package com.codewithmosh.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {}
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();


//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(status.getTotalBytes());


        // Confinement
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        int totalTasks = tasks.stream()
//                .map(t -> t.getStatus().getTotalBytes())
//                .reduce(0, Integer::sum);
//
//        System.out.println(totalTasks);

//    Thread thread = new Thread(new DownloadFileTask());
//      thread.start();
//
//    try {
//      Thread.sleep(1000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//
//    thread.interrupt();

//      try {
//        thread.join();
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//
//      System.out.println("File is ready to be scanned.");

    }
}
