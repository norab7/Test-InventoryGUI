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

		Player player = e.getPlayer();

		if (!playerInvs.containsKey(player)) {
			InventoryGUI invGUI = new InventoryGUI(player, 54, "InvTestInv");
			playerInvs.put(e.getPlayer(), invGUI);

			InvTestItem item = new InvTestItem(player);
			// invGUI.forceItem(0, item);

			System.out.println(invGUI.getPlayer());
		}

	}
}
