package baron.rol.InvTest;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import baron.rol.InventoryGUI.InventoryGUI;

public class InvTestListener implements Listener {
	private HashMap<Player, InventoryGUI> playerInvs = new HashMap<>();

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {

		System.out.println("PLAYER JOINED");

		Player player = e.getPlayer();

		if (!playerInvs.containsKey(player)) {
			InventoryGUI invG = new InventoryGUI(e.getPlayer(), 54, e.getPlayer().getName());
		}

	}
}
