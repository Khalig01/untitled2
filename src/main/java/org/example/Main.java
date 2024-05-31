package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String [] strings= {"Mercedes", "BMW", "Mercedes", "Fiat","BMW"};
        String result= Arrays.stream(strings)
                .distinct()
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}