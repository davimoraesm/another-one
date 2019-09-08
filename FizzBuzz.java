package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int valor = scanner.nextInt();

        if(valor % 5 == 0 && valor % 3 == 0)
            System.out.println("FizzBuzz");
        else if(valor%5 == 0)
            System.out.println("Fizz");
        else if (valor%3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(valor);
    }
}