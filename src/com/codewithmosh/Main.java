package com.codewithmosh;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.GenericList;
import com.codewithmosh.generics.List;
import com.codewithmosh.generics.User;
import com.codewithmosh.generics.Utils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);
    }
}
