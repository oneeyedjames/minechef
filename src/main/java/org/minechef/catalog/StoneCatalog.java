package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class StoneCatalog extends AbstractCatalog {
	private static Material[] blocks = {
		Material.COBBLESTONE,
		Material.SMOOTH_BRICK,
		Material.BRICK,
		Material.SANDSTONE,
		Material.RED_SANDSTONE,
		Material.NETHER_BRICK,
		Material.QUARTZ_BLOCK,
		Material.PURPUR_BLOCK
	};

	private static Material[] stairs = {
		Material.COBBLESTONE_STAIRS,
		Material.SMOOTH_STAIRS,
		Material.BRICK_STAIRS,
		Material.SANDSTONE_STAIRS,
		Material.RED_SANDSTONE_STAIRS,
		Material.NETHER_BRICK_STAIRS,
		Material.QUARTZ_STAIRS,
		Material.PURPUR_STAIRS
	};

	public StoneCatalog() {
		super();

		addBlockRecipes();
		addStairRecipes();
		addMetalRecipes();
		addToolRecipes();
	}

	private void addBlockRecipes() {
		/* addRecipe(new ShapelessRecipe(Material.SAND, 4)
		.addIngredient(Material.SANDSTONE)); */

		/* addRecipe(new ShapelessRecipe(Material.CLAY_BRICK, 4)
		.addIngredient(Material.BRICK)); */

		addRecipe(new ShapedRecipe(Material.STONE, 4)
		.shape("SS", "SS").setIngredient('S', Material.COBBLESTONE));

		addRecipe(new ShapedRecipe(Material.STONE)
		.shape("S", "S").setIngredient('S', Material.STEP));

		addRecipe(new ShapedRecipe(Material.COBBLESTONE)
		.shape("S", "S").setIngredient('S', MaterialVariant.COBBLESTONE_SLAB));

		addRecipe(new ShapedRecipe(Material.BRICK)
		.shape("S", "S").setIngredient('S', MaterialVariant.BRICK_SLAB));

		addRecipe(new ShapedRecipe(Material.NETHER_BRICK)
		.shape("S", "S").setIngredient('S', MaterialVariant.NETHER_BRICK_SLAB));

		// Sandstone, Stone Brick, Quartz, and Purpur slabs produce Chiseled blocks
	}

	private void addStairRecipes() {
		for (int i = 0, n = blocks.length; i < n; i++) {
			addRecipe(new ShapedRecipe(stairs[i], 4)
			.shape("S ", "SS").setIngredient('S', blocks[i]));

			addRecipe(new ShapedRecipe(stairs[i], 8)
			.shape("S  ", "SS ", "SSS").setIngredient('S', blocks[i]));
		}
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
