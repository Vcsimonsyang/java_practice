package com.github.practice.DeciamlToBinary;


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Decimal number");
        int dm = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (dm > 0) {
            sb.append(dm % 2);
            dm = dm / 2;
        }
        System.out.println(sb.reverse());
    }
}