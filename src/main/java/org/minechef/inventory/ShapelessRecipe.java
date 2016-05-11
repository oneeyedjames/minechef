package org.minechef.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import org.minechef.material.MaterialVariant;

public class ShapelessRecipe extends org.bukkit.inventory.ShapelessRecipe {
	public ShapelessRecipe(ItemStack result) {
		super(result);
	}

	public ShapelessRecipe(Material type) {
		this(type, 1);
	}

	public ShapelessRecipe(Material type, int amount) {
		this(new ItemStack(type, amount));
	}

	public ShapelessRecipe(MaterialVariant type) {
		this(type, 1);
	}

	public ShapelessRecipe(MaterialVariant type, int amount) {
		this(new org.minechef.inventory.ItemStack(type, amount));
	}

	@SuppressWarnings("deprecation")
	public ShapelessRecipe addIngredient(MaterialVariant type) {
		return (ShapelessRecipe) super.addIngredient(type.material, type.variant);
	}

	@SuppressWarnings("deprecation")
	public ShapelessRecipe addIngredient(int count, MaterialVariant type) {
		return (ShapelessRecipe) super.addIngredient(count, type.material, type.variant);
	}
}
