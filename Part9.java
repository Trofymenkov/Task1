package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part9 {
    public static void main(String[] args) {
        int n;String temp = "";
        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = foo(n);
        for(int i = 0;i < arr.length;i++){
            temp+= arr[i] + " ";
        }
        System.out.println(temp.trim());
    }
    public static int[] foo(int n){
        boolean finish = false;
        int count = 0,i = 2;
        Checking c = new Checking();
        while (!finish) {
            if (c.isPrime(i) && i<=n) {
                count++;
                finish = false;
            }
            else if (i>n){
                finish = true;
            }
            i++;
        }
        i = 2;
        int[] arr = new int[count];
        int b = 0;
        while (finish){
            if(c.isPrime(i)){
                arr[b] = i;
                b++;
            }
            i++;
            if(arr[count-1]!=0){
                finish = false;
            }
        }
        return arr;
    }
}
