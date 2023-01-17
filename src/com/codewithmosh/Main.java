package com.codewithmosh;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        System.out.println(list.get(0));
        for (var item : list) {
            System.out.println(item);
        }
    }
}
