package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class EndCatalog extends AbstractCatalog {
	public EndCatalog() {
		super();

		addRecipe(new ShapelessRecipe(Material.ENDER_STONE, 2)
		.addIngredient(MaterialVariant.GRANITE)
		.addIngredient(MaterialVariant.DIORITE)
		.addIngredient(MaterialVariant.ANDESITE));

		addRecipe(new ShapedRecipe(Material.ENDER_PEARL)
		.shape("GGG", "GEG", "GGG")
		.setIngredient('G', Material.GOLD_NUGGET)
		.setIngredient('E', Material.EMERALD));

		addRecipe(new ShapedRecipe(Material.ENDER_PORTAL_FRAME, 3)
		.shape(" D ", "OOO", "SSS")
		.setIngredient('D', Material.DIAMOND)
		.setIngredient('O', Material.OBSIDIAN)
		.setIngredient('S', Material.ENDER_STONE));
	}
}
