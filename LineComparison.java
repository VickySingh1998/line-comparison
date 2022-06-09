package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {

    public static void calculateLengthUC1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length = " +length);
    }
    public static void main(String[] args) {
        calculateLengthUC1();
    }
}
