package baron.rol.InvTest;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import baron.rol.Inventory.InventoryBuilder;

public class InvTestListener implements Listener {
	private HashMap<Player, InventoryBuilder> playerInvs = new HashMap<>();

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {

		System.out.println("PLAYER JOINED");

		Player player = e.getPlayer();

		if (!playerInvs.containsKey(player)) {
			playerInvs.put(e.getPlayer(), new InventoryBuilder(e.getPlayer(), 54, e.getPlayer().getName()));
			
			
			playerInvs.get(e.getPlayer()).addItem(new ItemClickTypeMessage());
		}

	}
}
