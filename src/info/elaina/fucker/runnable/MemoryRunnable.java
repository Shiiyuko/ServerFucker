package info.elaina.fucker.runnable;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class MemoryRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            // 占用内存
            List<String> l = new LinkedList<>();
            for (int i = 0; i < 1000000; i++) {
                UUID uuid = UUID.randomUUID();
                l.add(uuid.toString());
            }
        }
    }
}
