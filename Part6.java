package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        System.out.println(nextPrime(x));
        System.out.println(foo(x).trim());
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
    public static int nextPrime(int x){
        int check = 0,temp = x;
        while(check == 0){
            temp++;
            if(isPrime(temp)){
                check =1;
            }
        }
        return temp;
    }
    public static String foo(int x){
        String result = "";
        int count1 = 0,count2 = 0,count3 = 0;
        int check = 0;
        while (check == 0){
            if(x%2==0){
                x = x/2;
                count1++;
            }
            else if(x%3==0){
                x = x/3;
                count2++;
            }
            else if(x%5==0){
                x = x/5;
                count3++;
            }
            else{
                check = 1 ;
            }
        }
        if(count1!=0){
            result += " 2^"+count1;
        }
        if(count2!=0){
            result += " * 3^"+count2;
        }
        if(count3!=0){
            result += " * 5^"+count3;
        }
        return result;
    }
}
