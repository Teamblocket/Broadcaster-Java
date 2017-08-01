
package broadcaster.tasks;

import cn.nukkit.utils.TextFormat;
import broadcaster.Main;
import cn.nukkit.scheduler.PluginTask;

import java.util.Random;

public class Broadcast extends PluginTask<Main> {

    public Broadcast(Main plugin) {
        super(plugin);
        
    }

    public void onRun(int currentTick) {
        String message = this.getRandom(this.getOwner().getConfiguration().messages);
        this.getOwner().broadcastMessage(message);
    }
    
    public static String getRandom(String[] array) {
        String rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
