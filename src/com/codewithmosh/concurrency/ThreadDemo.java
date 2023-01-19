package com.codewithmosh.concurrency;

import java.awt.font.GlyphMetrics;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ThreadDemo {
    public static void show() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);


        // Synchronized collection
//        Collection<Integer> collection =
//                Collections.synchronizedCollection(new ArrayList<>());
//
//        var thread1 = new Thread(() -> {
//            collection.addAll(Arrays.asList(1, 2, 3));
//        });
//
//        var thread2 = new Thread(() -> {
//            collection.addAll(Arrays.asList(4, 5, 6));
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(collection);


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


        // Uses wait and notify
//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//            while (!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();

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
