package com.codewithmosh.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//
//        stream
//            .flatMap(list -> list.stream())
//            .forEach(n -> System.out.println(n));


        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);

//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);

//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m -> System.out.println(m.getTitle()));

//        movies.stream()
//                .dropWhile(movie -> movie.getLikes() < 30)
//                .forEach(movie -> System.out.println(movie.getTitle()));

//        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
//
//        movies.stream()
//                .filter(isPopular)
//                .forEach(movie -> System.out.println(movie.getTitle()));

//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));

//        // Imperative Programming
//        int count = 0;
//        for (var movie : movies) {
//            if (movie.getLikes() > 10)
//                count++;
//        }
//
//        // Declarative (Functional) Programming
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//        System.out.println(count);
//        System.out.println(count2);
    }
}
