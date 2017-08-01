package broadcaster.config;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.SimpleConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BroadcastConfig extends SimpleConfig {

    public BroadcastConfig(PluginBase plugin) {
        super(plugin);
    }

    @Path (value = "time")
    public int time = 60;

    @Path (value = "messages")
    public List<String> messages = new ArrayList<>(Arrays.asList("Hello", "This is a test", "Vortex 4 life", "Follow me at @VortexZMCPe"));
}
