package org.minechef.event;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public final class DropListener extends AbstractListener {
	@EventHandler
	public void onDeath(EntityDeathEvent event) {
		if (event.getEntityType() == EntityType.PIG)
			event.getDrops().add(new ItemStack(Material.LEATHER));
	}

	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		if (event.getBlock().getType() == Material.MOB_SPAWNER)
			event.getBlock().getDrops().add(new ItemStack(Material.MOB_SPAWNER));
	}
}
