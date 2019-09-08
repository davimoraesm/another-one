package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float rate;
        int period;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Principal ($1K - $1M): ");
            principal=scanner.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000 )
                break;
            System.out.println("You must type a valid number");
        }

        while(true){
            System.out.println("Annual Interest Rate (between 1 and 30; use comma to separate decimals)");
            rate = scanner.nextFloat();
            if (rate > 0 && rate <= 30){
                rate = rate / PERCENT;
                break;
            }
            System.out.println("You must type a valid number");
        }

        while(true){
            System.out.println("Period (years) between 1 and 30");
            period = scanner.nextInt();
            if(period > 0 && period < 31){
                break;
            }
            System.out.println("You must type a valid number");
        }

        double numerador = ((rate/MONTHS_IN_YEAR)*Math.pow((1+rate/MONTHS_IN_YEAR), (period*MONTHS_IN_YEAR)));
        double dividendo = Math.pow((1+rate/MONTHS_IN_YEAR), (period*MONTHS_IN_YEAR)) -1;
        double total = principal*(numerador/dividendo);
        //double mortgage = principal * (((rate/12)*Math.pow((1+rate/12), (period*12))) / Math.pow((1+rate/12), (period*12)) -1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(total);
        System.out.println("Seu rendimento mensal é de " + result);
    }
}