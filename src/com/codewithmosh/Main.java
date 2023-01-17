package com.codewithmosh;

import com.codewithmosh.collections.CollectionsDemo;
import com.codewithmosh.collections.Customer;
import com.codewithmosh.collections.EmailComparator;
import com.codewithmosh.collections.ListDemo;
import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
