package BT3;

import java.util.Scanner;

public class OptimizedPrieFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println("Tim so nguyen to tu 1-100 bang phuong phap toi uu!");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.printf("\t %d",i);
            }
        }
        System.out.print("\n");


    }
    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        int square=(int) Math.sqrt(number);
        for (int i = 2; i <= square; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
