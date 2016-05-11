package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.material.MaterialVariant;

public class FlowerCatalog extends AbstractCatalog {
	public FlowerCatalog() {
		super();

		addRecipe(new ShapedRecipe(Material.YELLOW_FLOWER, 8)
		.shape("SSS", "SFS", "SSS")
		.setIngredient('F', Material.YELLOW_FLOWER)
		.setIngredient('S', Material.SEEDS));

		addRecipe(new ShapedRecipe(Material.RED_ROSE, 8)
		.shape("SSS", "SFS", "SSS")
		.setIngredient('F', Material.RED_ROSE)
		.setIngredient('S', Material.SEEDS));

		MaterialVariant[] flowers = {
			MaterialVariant.BLUE_ORCHID,
			MaterialVariant.ALLIUM,
			MaterialVariant.AZURE_BLUET,
			MaterialVariant.RED_TULIP,
			MaterialVariant.ORANGE_TULIP,
			MaterialVariant.WHITE_TULIP,
			MaterialVariant.PINK_TULIP,
			MaterialVariant.OXEYE_DAISY,
			MaterialVariant.SUNFLOWER,
			MaterialVariant.LILAC,
			MaterialVariant.ROSE_BUSH,
			MaterialVariant.PEONY
		};

		for (int i = 0, n = flowers.length; i < n; i++) {
			addRecipe(new ShapedRecipe(flowers[i], 8)
			.shape("SSS", "SFS", "SSS")
			.setIngredient('F', flowers[i])
			.setIngredient('S', Material.SEEDS));
		}
	}
}
