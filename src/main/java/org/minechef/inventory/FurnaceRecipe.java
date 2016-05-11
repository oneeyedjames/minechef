package org.minechef.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import org.minechef.material.MaterialVariant;

public class FurnaceRecipe extends org.bukkit.inventory.FurnaceRecipe {
	public FurnaceRecipe(ItemStack result, Material source) {
		super(result, source);
	}

	@SuppressWarnings("deprecation")
	public FurnaceRecipe(ItemStack result, MaterialVariant source) {
		super(result, source.material, source.variant);
	}

	public FurnaceRecipe(Material type, Material source) {
		this(type, 1, source);
	}

	public FurnaceRecipe(Material type, MaterialVariant source) {
		this(type, 1, source);
	}

	public FurnaceRecipe(Material type, int amount, Material source) {
		this(new ItemStack(type, amount), source);
	}

	public FurnaceRecipe(Material type, int amount, MaterialVariant source) {
		this(new ItemStack(type, amount), source);
	}

	public FurnaceRecipe(MaterialVariant type, Material source) {
		this(type, 1, source);
	}

	public FurnaceRecipe(MaterialVariant type, MaterialVariant source) {
		this(type, 1, source);
	}

	public FurnaceRecipe(MaterialVariant type, int amount, Material source) {
		this(new org.minechef.inventory.ItemStack(type, amount), source);
	}

	public FurnaceRecipe(MaterialVariant type, int amount, MaterialVariant source) {
		this(new org.minechef.inventory.ItemStack(type, amount), source);
	}
}
