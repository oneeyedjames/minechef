package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;

public class ArmorCatalog extends AbstractCatalog {
	public ArmorCatalog() {
		super();

		addRecipe(new ShapedRecipe(Material.CHAINMAIL_HELMET)
		.shape("ILI", "L L")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.CHAINMAIL_CHESTPLATE)
		.shape("I I", "LIL", "ILI")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.CHAINMAIL_LEGGINGS)
		.shape("ILI", "L L", "I I")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.CHAINMAIL_BOOTS)
		.shape("L L", "I I")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.ELYTRA)
		.shape("I I", "ILI", "ILI")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.SADDLE)
		.shape("L L", "LLL").setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.IRON_BARDING)
		.shape("ILI", "III")
		.setIngredient('I', Material.IRON_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.GOLD_BARDING)
		.shape("GLG", "GGG")
		.setIngredient('G', Material.GOLD_INGOT)
		.setIngredient('L', Material.LEATHER));

		addRecipe(new ShapedRecipe(Material.DIAMOND_BARDING)
		.shape("DLD", "DDD")
		.setIngredient('D', Material.DIAMOND)
		.setIngredient('L', Material.LEATHER));
	}
}
