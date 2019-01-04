package baron.rol.InvTest;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import baron.rol.InventoryGUI.InventoryItem;

public class InvTestItem extends InventoryItem {
	private Player player;

	public InvTestItem(Player p) {
		this.player = p;
	}

	@Override
	public void action(ClickType arg0) {

		if (arg0.equals(ClickType.LEFT)) {
			this.player.sendMessage("THIS IS A TEST MESSAGE");
		}
	}
}
