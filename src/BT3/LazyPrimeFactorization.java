package BT3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("Tim so nguyen to bang phuong phap chua toi uu!");
        if (isPrimeNumer(11)){
            System.out.println("Đây la so nguyen to");
        }else {
            System.out.println("Đây không phải là số nguyên tố");
        }
    }
    public static boolean isPrimeNumer(int number){
        if (number<2){
            return false;
        }else if (number==2){
            return true;
        }else {
            for (int i = 3; i < number; i++) {
                if (number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}