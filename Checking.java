package ua.nure.Trofymenkov.task1;

import java.lang.reflect.Array;

public class Checking {
    private int x;

    public  boolean isPrime(int n) {
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
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
