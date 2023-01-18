package com.codewithmosh.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int totalTasks = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(0, Integer::sum);

        System.out.println(totalTasks);


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
