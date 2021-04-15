package ua.nure.Trofymenkov.task1;

import jdk.jshell.SourceCodeAnalysis;

import javax.swing.*;
import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {
        int temp;
        String str = "";
        int[] ourArray;
        int[] second;
        System.out.println("Enter length of array:");
        Scanner s = new Scanner(System.in);
        temp = s.nextInt();
        ourArray = getArr(temp);
        /*for (int i = 0; i < ourArray.length; i++) {
            str += " " + ourArray[i];
        }
        System.out.println(str.trim());*/
        second = maxNum(ourArray);
        System.out.println(second[0] +" "+second[1]);

    }

    public static int[] getArr(int x) {
        int[] arr = new int[x];
        int check = 0, i = 2, count = 0;
        Checking temp = new Checking();
        while (check == 0) {
            if (temp.isPrime(i)) {
                arr[count] = i;
                count++;
            }
            i++;
            if (arr[x - 1] != 0) {
                check = 1;
            }
        }
        return arr;
    }

    public static int[] maxNum(int[] arr) {
        int[] ourArr = new int[2];
        String temp, charac;
        int l,count = 1;
        for (int i = 0; i < arr.length; i++) {
            temp = String.valueOf(arr[i]);
            l = temp.length();
            arr[i] = 0;
            for (int j = 0; j < l; j++) {
                charac = Character.toString(temp.charAt(j));
                arr[i] += Integer.parseInt(charac);
            }
        }
        bubleSort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else {
                break;
            }
        }
        ourArr[0] = arr[0];
        ourArr[1] = count;
        return ourArr;
    }

    public static int[] bubleSort(int[] arr) {
        boolean check = false;
        int temp;
        while (!check) {
            check = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    check = false;
                }
            }
        }
        return arr;
    }
}
