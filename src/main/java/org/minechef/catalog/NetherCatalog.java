package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.FurnaceRecipe;
import org.minechef.inventory.ShapedRecipe;
import org.minechef.material.MaterialVariant;

public class NetherCatalog extends AbstractCatalog {
	public NetherCatalog() {
		super();

		addRecipe(new FurnaceRecipe(Material.GLOWSTONE, MaterialVariant.GRANITE));
		addRecipe(new FurnaceRecipe(Material.QUARTZ_ORE, MaterialVariant.DIORITE));
		addRecipe(new FurnaceRecipe(Material.SOUL_SAND, MaterialVariant.ANDESITE));

		addRecipe(new ShapedRecipe(Material.BLAZE_ROD)
		.shape("B", "B").setIngredient('B', Material.BLAZE_POWDER));

		addRecipe(new ShapedRecipe(Material.BLAZE_POWDER, 8)
		.shape("SSS", "SBS", "SSS")
		.setIngredient('S', Material.SAND)
		.setIngredient('B', Material.LAVA_BUCKET));

		addRecipe(new ShapedRecipe(Material.NETHER_STALK, 8)
		.shape("MMM", "MRM", "MMM")
		.setIngredient('R', Material.REDSTONE)
		.setIngredient('M', Material.RED_MUSHROOM));

		addRecipe(new ShapedRecipe(Material.NETHER_STALK, 8)
		.shape("MMM", "MRM", "MMM")
		.setIngredient('R', Material.REDSTONE)
		.setIngredient('M', Material.BROWN_MUSHROOM));

		addRecipe(new ShapedRecipe(Material.NETHER_STAR)
		.shape("QQQ", "QDQ", "QQQ")
		.setIngredient('Q', Material.QUARTZ)
		.setIngredient('D', Material.DIAMOND));
	}
}
