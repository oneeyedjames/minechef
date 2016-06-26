package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapedRecipe;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class SpawnCatalog extends AbstractCatalog {
	public SpawnCatalog() {
		super();

		addRecipe(new ShapedRecipe(Material.MOB_SPAWNER)
		.shape("FFF", "FRF", "FFF")
		.setIngredient('F', Material.IRON_FENCE)
		.setIngredient('R', Material.REDSTONE));

		addRecipe(new ShapelessRecipe(MaterialVariant.CREEPER_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.SULPHUR));

		addRecipe(new ShapelessRecipe(MaterialVariant.SKELETON_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.BONE));

		addRecipe(new ShapelessRecipe(MaterialVariant.SPIDER_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.STRING));

		addRecipe(new ShapelessRecipe(MaterialVariant.ZOMBIE_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.ROTTEN_FLESH));

		addRecipe(new ShapelessRecipe(MaterialVariant.SLIME_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.SLIME_BALL));

		addRecipe(new ShapelessRecipe(MaterialVariant.MAGMA_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.MAGMA_CREAM));

		addRecipe(new ShapelessRecipe(MaterialVariant.PIG_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.APPLE));

		addRecipe(new ShapelessRecipe(MaterialVariant.SHEEP_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.WOOL));

		addRecipe(new ShapelessRecipe(MaterialVariant.COW_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.LEATHER));

		addRecipe(new ShapelessRecipe(MaterialVariant.CHICKEN_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.FEATHER));

		addRecipe(new ShapelessRecipe(MaterialVariant.RABBIT_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.RABBIT_HIDE));

		addRecipe(new ShapelessRecipe(MaterialVariant.POLAR_BEAR_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.SNOW_BALL));

		addRecipe(new ShapelessRecipe(MaterialVariant.WOLF_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.STICK));

		addRecipe(new ShapelessRecipe(MaterialVariant.OCELOT_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.RAW_FISH));

		addRecipe(new ShapelessRecipe(MaterialVariant.HORSE_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.SADDLE));

		addRecipe(new ShapelessRecipe(MaterialVariant.VILLAGER_EGG)
		.addIngredient(Material.EGG).addIngredient(Material.EMERALD));
	}
}
