
package broadcaster;

import broadcaster.config.BroadcastConfig;
import broadcaster.tasks.Broadcast;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase{
    
    private BroadcastConfig config;
    
    public void onEnable(){
        this.getLogger().notice("Broadcaster sucessfully loaded by Angel.");
        this.getServer().getScheduler().scheduleRepeatingTask(new Broadcast(this),this.getConfiguration().time * 20);
        this.initConfig();
    }
    
    private void initConfig() {
        this.config = new BroadcastConfig(this);
        this.config.load();
        this.config.save();
    }
    
    public BroadcastConfig getConfiguration() {
        return this.config;
    }
}
