package ua.nure.Trofymenkov.task1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        int first, second, NOD, NOK;
        boolean checkNok;
        checkNok = true;
        System.out.println("Firt number");
        Scanner s = new Scanner(System.in);
        first = s.nextInt();
        System.out.println("Second number");
        second = s.nextInt();
        int temp = 0;
        int temp2 = 0;
        if (first > second) {
            temp = second;
            temp2 = first;
        } else if (second > first) {
            temp = first;
            temp2 = second;
        } else {
            temp = first;
            temp2 = first;
        }
        NOD = 0;
        for (int i = temp; i >= 0; i--) {
            if (first % i == 0 && second % i == 0) {
                NOD = i;
                break;
            }
        }
        NOK = temp;
        while (checkNok) {
            if (NOK % first == 0 && NOK % second == 0) {
                checkNok = false;
            }
            else if(NOK % first!=0 || NOK % second != 0){
                NOK+= temp;
            }
        }
        System.out.println(NOD+" "+NOK);
    }
}
