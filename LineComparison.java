package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {

    public static void equalTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line = " + length);

        System.out.print("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y3: ");
        int y3 = scanner.nextInt();
        System.out.print("Enter x4: ");
        int x4 = scanner.nextInt();
        System.out.print("Enter y4: ");
        int y4 = scanner.nextInt();
        double length1 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of second line= " + length1);

        if (length == length1) {
            System.out.println("Both the lines are equal");
        } else {
            System.out.println("Both the lines are not equal");
        }
    }

    public static void compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line = " + length);

        System.out.print("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y3: ");
        int y3 = scanner.nextInt();
        System.out.print("Enter x4: ");
        int x4 = scanner.nextInt();
        System.out.print("Enter y4: ");
        int y4 = scanner.nextInt();
        double length1 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of second line= " + length1);

        if (length == length1) {
            System.out.println("Both the lines are equal");
        }
            else if (length > length1){
                System.out.println("First line is greater than second line");
            }
        else {
            System.out.println("Second line is greater than first line");
        }
    }

    public static void main(String[] args) {
        equalTo();
        compareTo();
    }
}

