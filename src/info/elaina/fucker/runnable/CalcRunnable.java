package info.elaina.fucker.runnable;

import java.math.BigInteger;
import java.util.Random;

public class CalcRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            // 占用cpu
            Random rand = new Random();
            int randomNum = rand.nextInt((10000 - 1000) + 1) + 1000;
            BigInteger result = BigInteger.valueOf(randomNum).pow(randomNum);
        }
    }
}
