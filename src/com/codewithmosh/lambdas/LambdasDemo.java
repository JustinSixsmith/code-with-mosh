package com.codewithmosh.lambdas;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("sky");
        System.out.println(length);
    }
}
