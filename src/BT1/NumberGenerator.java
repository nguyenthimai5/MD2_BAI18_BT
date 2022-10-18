package BT1;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        System.out.println("10 So tu nhien dau la:");

            try {
                System.out.println("Start printing......");
                for (int i = 0; i < 10; i++) {
                System.out.print("\t"+(i+1));
                Thread.sleep(500);
            }
                System.out.print("\n");
                System.out.println("The print job has been stopped!!!!!!!");
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
