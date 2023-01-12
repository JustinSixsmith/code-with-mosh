package com.codewithmosh;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.GenericList;
import com.codewithmosh.generics.List;
import com.codewithmosh.generics.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");
    }
}
