package baron.rol.InvTest;

import org.bukkit.plugin.java.JavaPlugin;

public class InvTest extends JavaPlugin {
	public static JavaPlugin INSTANCE;

	public InvTest() {
		INSTANCE = this;
	}

	@Override
	public void onEnable() {
		INSTANCE.getServer().getPluginManager().registerEvents(new InvTestListener(), INSTANCE);

	}

	@Override
	public void onDisable() {

	}

}
