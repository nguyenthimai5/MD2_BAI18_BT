package BT3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println(" so nguyen to tu 1-100 bang phuong phap chua toi uu!");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumer(i)) {
                System.out.printf("\t %d", i);
            }
        }
    }
    public static boolean isPrimeNumer(int number){
        if (number<2){
            return false;
        }else {
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}