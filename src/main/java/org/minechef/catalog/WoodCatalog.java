package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.material.MaterialVariant;

public class WoodCatalog extends AbstractCatalog {
	public WoodCatalog() {
		addRecipe(new ShapedRecipe(Material.FENCE, 5)
		.shape("WSW", "WSW")
		.setIngredient('W', Material.WOOD)
		.setIngredient('S', Material.STICK));

		addRecipe(new ShapedRecipe(Material.FENCE_GATE, 2)
		.shape("SWS", "SWS")
		.setIngredient('W', Material.WOOD)
		.setIngredient('S', Material.STICK));

		addRecipe(new ShapedRecipe(Material.WOOD_STAIRS, 8)
		.shape("W  ", "WW ", "WWW").setIngredient('W', Material.WOOD));

		addRecipe(new ShapedRecipe(Material.WOOD)
		.shape("S", "S").setIngredient('S', Material.WOOD_STEP));

		Material[] fences = {
			Material.SPRUCE_FENCE,
			Material.BIRCH_FENCE,
			Material.JUNGLE_FENCE,
			Material.ACACIA_FENCE,
			Material.DARK_OAK_FENCE
		};

		Material[] gates = {
			Material.SPRUCE_FENCE_GATE,
			Material.BIRCH_FENCE_GATE,
			Material.JUNGLE_FENCE_GATE,
			Material.ACACIA_FENCE_GATE,
			Material.DARK_OAK_FENCE_GATE
		};

		Material[] stairs = {
			Material.SPRUCE_WOOD_STAIRS,
			Material.BIRCH_WOOD_STAIRS,
			Material.JUNGLE_WOOD_STAIRS,
			Material.ACACIA_STAIRS,
			Material.DARK_OAK_STAIRS
		};

		MaterialVariant[] slabs = {
			MaterialVariant.SPRUCE_SLAB,
			MaterialVariant.BIRCH_SLAB,
			MaterialVariant.JUNGLE_SLAB,
			MaterialVariant.ACACIA_SLAB,
			MaterialVariant.DARK_OAK_SLAB
		};

		MaterialVariant[] types = {
			MaterialVariant.SPRUCE,
			MaterialVariant.BIRCH,
			MaterialVariant.JUNGLE,
			MaterialVariant.ACACIA,
			MaterialVariant.DARK_OAK
		};

		for (int i = 0, n = types.length; i < n; i++) {
			addRecipe(new ShapedRecipe(fences[i], 5)
			.shape("WSW", "WSW")
			.setIngredient('W', types[i])
			.setIngredient('S', Material.STICK));

			addRecipe(new ShapedRecipe(gates[i], 2)
			.shape("SWS", "SWS")
			.setIngredient('W', types[i])
			.setIngredient('S', Material.STICK));

			addRecipe(new ShapedRecipe(stairs[i], 8)
			.shape("W  ", "WW ", "WWW").setIngredient('W', types[i]));

			addRecipe(new ShapedRecipe(types[i])
			.shape("S", "S").setIngredient('S', slabs[i]));
		}
	}
}
