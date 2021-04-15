package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        String[] arr =  temp.split(" ");
        String result = "";
        for(int i = arr.length-1;i>=0;i--){
            result+= arr[i] + " ";
        }
        System.out.println(result.trim());
    }
}
