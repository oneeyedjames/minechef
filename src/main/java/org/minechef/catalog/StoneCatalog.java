package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class StoneCatalog extends AbstractCatalog {
	public StoneCatalog() {
		super();

		addBlockRecipes();
		addStairRecipes();
		addMetalRecipes();
		addToolRecipes();
	}

	private void addBlockRecipes() {
		addRecipe(new ShapedRecipe(Material.STONE, 4)
		.shape("SS", "SS").setIngredient('S', Material.COBBLESTONE));

		addRecipe(new ShapelessRecipe(Material.CLAY_BRICK, 4)
		.addIngredient(Material.BRICK));

		addRecipe(new ShapedRecipe(Material.COBBLESTONE)
		.shape("S", "S").setIngredient('S', MaterialVariant.COBBLESTONE_SLAB));

		addRecipe(new ShapedRecipe(Material.STONE)
		.shape("S", "S").setIngredient('S', Material.STEP));

		addRecipe(new ShapedRecipe(Material.BRICK)
		.shape("S", "S").setIngredient('S', MaterialVariant.BRICK_SLAB));

		addRecipe(new ShapedRecipe(Material.NETHER_BRICK)
		.shape("S", "S").setIngredient('S', MaterialVariant.NETHER_BRICK_SLAB));

		// Sandstone, Stone Brick, and Quartz slabs produce Chiseled blocks
	}

	private void addStairRecipes() {
		addRecipe(new ShapedRecipe(Material.COBBLESTONE_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.COBBLESTONE));

		addRecipe(new ShapedRecipe(Material.SMOOTH_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.SMOOTH_BRICK));

		addRecipe(new ShapedRecipe(Material.BRICK_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.BRICK));

		addRecipe(new ShapedRecipe(Material.SANDSTONE_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.SANDSTONE));

		addRecipe(new ShapedRecipe(Material.RED_SANDSTONE_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.RED_SANDSTONE));

		addRecipe(new ShapedRecipe(Material.NETHER_BRICK_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.NETHER_BRICK));

		addRecipe(new ShapedRecipe(Material.QUARTZ_STAIRS, 8)
		.shape("S  ", "SS ", "SSS").setIngredient('S', Material.QUARTZ_BLOCK));
	}

	private void addMetalRecipes() {
		addRecipe(new ShapedRecipe(Material.GOLD_ORE)
		.shape("SSS", "SSS", "SSS")
		.setIngredient('S', MaterialVariant.GRANITE));

		addRecipe(new ShapedRecipe(Material.DIAMOND_ORE)
		.shape("SSS", "SSS", "SSS")
		.setIngredient('S', MaterialVariant.DIORITE));

		addRecipe(new ShapedRecipe(Material.EMERALD_ORE)
		.shape("SSS", "SSS", "SSS")
		.setIngredient('S', MaterialVariant.ANDESITE));
	}

	private void addToolRecipes() {
		MaterialVariant[] stones = {
			MaterialVariant.GRANITE,
			MaterialVariant.DIORITE,
			MaterialVariant.ANDESITE
		};

		for (int i = 0, n = stones.length; i < n; i++) {
			addRecipe(new ShapedRecipe(Material.STONE_AXE)
			.shape(" SS", " sS", " s ")
			.setIngredient('S', stones[i])
			.setIngredient('s', Material.STICK));

			addRecipe(new ShapedRecipe(Material.STONE_HOE)
			.shape(" SS", " s ", " s ")
			.setIngredient('S', stones[i])
			.setIngredient('s', Material.STICK));

			addRecipe(new ShapedRecipe(Material.STONE_PICKAXE)
			.shape("SSS", " s ", " s ")
			.setIngredient('S', stones[i])
			.setIngredient('s', Material.STICK));

			addRecipe(new ShapedRecipe(Material.STONE_SPADE)
			.shape(" S ", " s ", " s ")
			.setIngredient('S', stones[i])
			.setIngredient('s', Material.STICK));

			addRecipe(new ShapedRecipe(Material.STONE_SWORD)
			.shape(" S ", " S ", " s ")
			.setIngredient('S', stones[i])
			.setIngredient('s', Material.STICK));
		}
	}
}
