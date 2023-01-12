package com.codewithmosh;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.GenericList;
import com.codewithmosh.generics.List;
import com.codewithmosh.generics.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);
    }
}
