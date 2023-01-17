package com.codewithmosh.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("sky");
        System.out.println(result);
    }
}
