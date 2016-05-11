package org.minechef.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import org.minechef.material.MaterialVariant;

public class ShapedRecipe extends org.bukkit.inventory.ShapedRecipe {
	public ShapedRecipe(ItemStack result) {
		super(result);
	}

	public ShapedRecipe(Material type) {
		this(type, 1);
	}

	public ShapedRecipe(Material type, int amount) {
		this(new ItemStack(type, amount));
	}

	public ShapedRecipe(MaterialVariant type) {
		this(type, 1);
	}

	public ShapedRecipe(MaterialVariant type, int amount) {
		this(new org.minechef.inventory.ItemStack(type, amount));
	}

	@Override
	public ShapedRecipe shape(String... rows) {
		return (ShapedRecipe) super.shape(rows);
	}

	@Override
	public ShapedRecipe setIngredient(char key, Material type) {
		return (ShapedRecipe) super.setIngredient(key, type);
	}

	@SuppressWarnings("deprecation")
	public ShapedRecipe setIngredient(char key, MaterialVariant type) {
		return (ShapedRecipe) super.setIngredient(key, type.material, type.variant);
	}
}
