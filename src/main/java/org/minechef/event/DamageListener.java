package org.minechef.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Tameable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public final class DamageListener extends AbstractListener {
	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		Entity entity = event.getEntity();

		switch (event.getCause()) {
			case ENTITY_ATTACK:
			case ENTITY_EXPLOSION:
			case PROJECTILE:
				if (entity.getType() == EntityType.PLAYER) {
					event.setCancelled(true);
				} else if (entity instanceof Tameable) {
					if (((Tameable) entity).isTamed())
						event.setCancelled(true);
				} else if (entity instanceof Monster) {
					event.setDamage(event.getDamage() * 2.5);
				}

				break;
		}
	}

	@EventHandler
	public void onExplode(EntityExplodeEvent event) {
		if (event.getEntityType() == EntityType.CREEPER)
			event.setCancelled(true);
	}
}
