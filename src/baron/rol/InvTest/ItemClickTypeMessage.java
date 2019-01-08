package baron.rol.InvTest;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import baron.rol.InventoryGUI.InventoryItem;

public class ItemClickTypeMessage extends InventoryItem {

	public ItemClickTypeMessage() {

	}

	@Override
	public void action(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player)) {
			System.out.println("Non-player click event");
			return;
		}

		Player p = (Player) e.getWhoClicked();

		String outputMessage = "You have clicked ";

		switch (e.getClick()) {
		case LEFT:
			outputMessage += "Left.";
			break;
		case RIGHT:
			outputMessage += "Right.";
			break;
		case MIDDLE:
			outputMessage += "Middle.";
			break;
		default:
			break;
		}

		p.sendMessage(outputMessage);

	}
}
