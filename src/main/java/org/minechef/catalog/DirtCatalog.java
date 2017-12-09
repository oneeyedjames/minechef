package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.FurnaceRecipe;
import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class DirtCatalog extends AbstractCatalog {
	public DirtCatalog() {
		super();

		addRecipe(new FurnaceRecipe(Material.SAND, Material.DIRT));
		addRecipe(new FurnaceRecipe(Material.GRAVEL, MaterialVariant.COARSE_DIRT));

		addRecipe(new ShapedRecipe(MaterialVariant.RED_SAND, 8)
		.shape("SSS", "SRS", "SSS")
		.setIngredient('S', Material.SAND)
		.setIngredient('R', MaterialVariant.ROSE_RED));

		addRecipe(new ShapedRecipe(Material.CLAY, 8)
		.shape("DDD", "DBD", "DDD")
		.setIngredient('D', Material.DIRT)
		.setIngredient('B', Material.WATER_BUCKET));

		addRecipe(new ShapedRecipe(Material.GRASS, 4)
		.shape("DS", "SD")
		.setIngredient('D', Material.DIRT)
		.setIngredient('S', Material.SEEDS));

		addRecipe(new ShapedRecipe(MaterialVariant.PODZOL, 4)
		.shape("DS", "SD")
		.setIngredient('D', MaterialVariant.COARSE_DIRT)
		.setIngredient('S', Material.SEEDS));

		addRecipe(new ShapedRecipe(Material.MYCEL, 4)
		.shape("DR", "RD")
		.setIngredient('D', Material.DIRT)
		.setIngredient('R', Material.REDSTONE));

		addRecipe(new ShapedRecipe(Material.GRAVEL, 4)
		.shape("DC", "CD")
		.setIngredient('D', Material.DIRT)
		.setIngredient('C', Material.COBBLESTONE));

		addRecipe(new ShapelessRecipe(Material.SAND, 4)
		.addIngredient(Material.SANDSTONE));

		addRecipe(new ShapelessRecipe(Material.CLAY_BALL, 4)
		.addIngredient(Material.CLAY));

		addRecipe(new ShapelessRecipe(Material.CLAY_BRICK, 4)
		.addIngredient(Material.BRICK));

		addRecipe(new ShapedRecipe(Material.BRICK, 4)
		.shape("CC", "CC").setIngredient('C', Material.HARD_CLAY));

		addRecipe(new ShapelessRecipe(Material.CLAY_BRICK, 4)
		.addIngredient(Material.HARD_CLAY));
	}
}
