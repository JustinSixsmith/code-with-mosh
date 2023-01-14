package com.codewithmosh;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        var iterator = list.iterator();
        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
