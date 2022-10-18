package BT2;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Cac so le tu 1-10 cac nhau 15ms la!");
            for (int i = 1; i < 11; i++) {
                if (i%2!=0){
                    System.out.print("\t"+i);
                    Thread.sleep(15);
                }
            }
            System.out.print("\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
