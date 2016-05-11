package org.minechef.inventory;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import org.minechef.material.MaterialVariant;

public class ItemStack extends org.bukkit.inventory.ItemStack {
	public ItemStack(org.bukkit.inventory.ItemStack stack) {
		super(stack);
	}

	public ItemStack(Material type) {
		super(type);
	}

	public ItemStack(Material type, int amount) {
		super(type, amount);
	}

	public ItemStack(MaterialVariant type) {
		this(type, 1);
	}

	@SuppressWarnings("deprecation")
	public ItemStack(MaterialVariant type, int amount) {
		super(new MaterialData(type.material, type.variant).toItemStack(amount));
	}

	@SuppressWarnings("deprecation")
	public MaterialVariant getVariant() {
		for (MaterialVariant mv: MaterialVariant.values()) {
			if (getType() == mv.material && getData().getData() == mv.variant) {
				return mv;
			}
		}

		return null;
	}
}
