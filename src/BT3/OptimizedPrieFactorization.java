package BT3;

import java.util.Scanner;

public class OptimizedPrieFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println("Tim so nguyen to bang phuong phap toi uu!");
        if (isPrime(11)){
            System.out.print("Đây la so nguyen to\n");
        }else {
            System.out.println("Đây không phải là số nguyên tố");
        }

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
