package com.codewithmosh.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        var result = hasLeftBrace.negate().test("key:value}");
        System.out.println(result);
    }
}
