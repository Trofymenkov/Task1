package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        int n;
        String temp = "";
        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(isPrime(n));
        int[] arr = getPrimeNumbers(n);
        for(int i = 0;i < arr.length; i++){
            temp += arr[i] + " ";
        }
        System.out.println(temp.trim());
    }

    public static boolean isPrime(int n) {
        if(n <=1){
            return  false;
        }
        else if(n == 3 || n == 2 || n == 5 ){
            return true;
        }
        else if(n%2 == 0 || n%3 == 0 || n%5 == 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static int[] getPrimeNumbers(int n){
        int check = 0,i = 2,temp = 0;
        int[] arr = new int[n];
        while (check == 0){
            if(isPrime(i)){
                arr[temp] = i;
                temp++;
            }
            else {

            }
            if(arr[n-1]!=0){
                check =1;
            }
            i++;
        }
        return arr;
    }

}
