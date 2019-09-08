package com.company;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble()/100;

        System.out.print("Period(Years): ");
        int period = scanner.nextInt();

        /*int principal = 100000;
        double rate = 3.92/100;
        int period = 30;
        // n = period*/
        double numerador = ((rate/12)*Math.pow((1+rate/12), (period*12)));
        double dividendo = Math.pow((1+rate/12), (period*12)) -1;
        double total = principal*(numerador/dividendo);
        //double mortgage = principal * (((rate/12)*Math.pow((1+rate/12), (period*12))) / Math.pow((1+rate/12), (period*12)) -1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(total);
        System.out.println("Seu rendimento mensal é de " + result);
    }
}

