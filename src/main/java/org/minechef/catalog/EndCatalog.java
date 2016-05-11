package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;

public class EndCatalog extends AbstractCatalog {
	public EndCatalog() {
		super();

		addRecipe(new ShapedRecipe(Material.ENDER_PEARL)
		.shape("GGG", "GEG", "GGG")
		.setIngredient('G', Material.GOLD_NUGGET)
		.setIngredient('E', Material.EMERALD));

		addRecipe(new ShapedRecipe(Material.ENDER_PORTAL_FRAME, 3)
		.shape(" D ", "OOO", "SSS")
		.setIngredient('D', Material.DIAMOND)
		.setIngredient('O', Material.OBSIDIAN)
		.setIngredient('S', Material.SANDSTONE));
	}
}
