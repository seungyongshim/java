package com.sample;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    Function<Integer, Function<Integer, Integer>> add()
    {
        return x -> y -> x + y;
    }
}
