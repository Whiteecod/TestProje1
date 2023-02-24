package Utility;

public class MyFunc {

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
