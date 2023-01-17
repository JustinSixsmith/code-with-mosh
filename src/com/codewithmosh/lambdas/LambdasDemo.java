package com.codewithmosh.lambdas;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon
                .andThen(addBraces)
                .apply("kay:value");

        result = addBraces.compose(replaceColon).apply("key:value");

        System.out.println(result);
    }
}
