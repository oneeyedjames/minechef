package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;

public class MiscCatalog extends AbstractCatalog {
	public MiscCatalog() {
		super();

		addRecipe(new ShapedRecipe(Material.MELON_BLOCK)
		.shape("MM", "MM").setIngredient('M', Material.MELON));

		addRecipe(new ShapelessRecipe(Material.MELON_SEEDS, 4)
		.addIngredient(Material.MELON_BLOCK));

		addRecipe(new ShapedRecipe(Material.SLIME_BALL)
		.shape("SSS", "SCS", "SSS")
		.setIngredient('S', Material.SUGAR)
		.setIngredient('C', Material.CACTUS));

		addRecipe(new ShapedRecipe(Material.SULPHUR, 4)
		.shape("CGC", "GCG", "CGC")
		.setIngredient('C', Material.COAL)
		.setIngredient('G', Material.GRAVEL));

		addRecipe(new ShapelessRecipe(Material.STRING, 4)
		.addIngredient(Material.WOOL));

		addRecipe(new ShapelessRecipe(Material.NAME_TAG)
		.addIngredient(Material.STRING)
		.addIngredient(Material.PAPER));

		addRecipe(new ShapelessRecipe(Material.EXP_BOTTLE)
		.addIngredient(Material.GLASS_BOTTLE)
		.addIngredient(Material.EMERALD));
	}
}
