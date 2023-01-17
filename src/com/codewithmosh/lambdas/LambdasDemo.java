package com.codewithmosh.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}
