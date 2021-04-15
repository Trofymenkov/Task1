package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part8 {
    public static void main(String[] args) {
        int n;
        int[][] arr;
        String temp = "";
        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        arr = pascal(n);
        for(int i = 0 ;i < n;i++){
            for(int k = i+1 ; k < n;k++){
                temp = temp + " ";
            }
            for(int j = 0;i >= j;j++){
                temp = temp + arr[i][j];
                if(j!=i){
                    temp = temp +" ";
                }
            }
            temp = temp + "\n";
        }
        System.out.println(temp);
    }

    public static int[][] pascal(int n){
        int[][] arr = new int[n][n];
        boolean finish = false;
        for(int i = 0;i < n ;i++){
            arr[i][0] = 1;
            arr[i][i] = 1;

        }
        while (!finish){
            for(int i = 0;i < n;i++){
                for(int j = 0;j <i ;j++){
                    if(i>1 && arr[i][j+1]==0){
                        arr[i][j+1] = arr[i-1][j]+arr[i-1][j+1];
                    }
                }
            }
            if((n-1)%2!=0){
                if(arr[n-1][(n-2)/2]!=0){
                    finish = true;
                }
                else {
                    finish = false;
                }
            }
            else if((n-1)%2==0){
                if(arr[n-1][(n-1)/2]!=0){
                    finish = true;
                }
                else {
                    finish = false;
                }
            }
        }
        return arr;
    }
}
