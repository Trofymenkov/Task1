package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        String ourStr;
        int temp = 0;
        System.out.println("Enter string:");
        Scanner s = new Scanner(System.in);
        ourStr = s.nextLine();
        for (int i = 0; i < ourStr.length(); i++) {
            if(Character.isDigit(ourStr.charAt(i))){
                temp += Character.getNumericValue(ourStr.charAt(i));
            }
        }
        System.out.println(temp);
    }
}
