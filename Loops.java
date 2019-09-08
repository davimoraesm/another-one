package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.println("Digite: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
