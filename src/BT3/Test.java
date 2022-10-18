package BT3;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization lpft=new LazyPrimeFactorization();
        OptimizedPrieFactorization opft=new OptimizedPrieFactorization();
        Thread th1=new Thread(opft);
        Thread th2=new Thread(lpft);
        th1.start();
        th1.join();
        th2.start();
        th2.join();

    }
}
