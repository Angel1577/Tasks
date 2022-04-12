package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task2 {
    public static void Stream() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int number;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number = random.nextInt() % 100;
            arrayList.add(number);
        }
        System.out.println("Array:");
        System.out.println(arrayList);

        Stream<Integer> stream = arrayList.stream();
        long count = stream
                .filter((n) -> (n % 2) == 0)
                .count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        Stream();
    }
}