package baron.rol.InvTest;

import org.bukkit.plugin.java.JavaPlugin;

public class InvTest extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new InvTestListener(), this);

	}

	@Override
	public void onDisable() {

	}

}
