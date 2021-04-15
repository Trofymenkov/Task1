package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        int first,second,result;
        System.out.println("Enter first number:");
        Scanner a = new Scanner(System.in);
        first = a.nextInt();
        System.out.println("Enter second number:");
        Scanner b = new Scanner(System.in);
        second = b.nextInt();
        System.out.println("Result:");
        result = first+second;
        System.out.println(result);

    }
}
