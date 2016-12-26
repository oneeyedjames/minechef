package org.minechef.catalog;

import org.bukkit.Material;

import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class ColorCatalog extends AbstractCatalog {
	public ColorCatalog() {
		super();

		addRecipe(new ShapelessRecipe(MaterialVariant.BONE_MEAL)
		.addIngredient(MaterialVariant.WHITE_TULIP));

		addRecipe(new ShapelessRecipe(MaterialVariant.BONE_MEAL)
		.addIngredient(MaterialVariant.OXEYE_DAISY));

		addRecipe(new ShapelessRecipe(MaterialVariant.LIGHT_BLUE_DYE)
		.addIngredient(MaterialVariant.AZURE_BLUET));

		addRecipe(new ShapelessRecipe(MaterialVariant.CACTUS_GREEN, 2)
		.addIngredient(MaterialVariant.DANDELION_YELLOW)
		.addIngredient(MaterialVariant.LAPIS_LAZULI));

		addRecipe(new ShapelessRecipe(MaterialVariant.COCOA_BEANS, 2)
		.addIngredient(MaterialVariant.ORANGE_DYE)
		.addIngredient(Material.INK_SACK));

		addRecipe(new ShapelessRecipe(MaterialVariant.COCOA_BEANS, 3)
		.addIngredient(MaterialVariant.DANDELION_YELLOW)
		.addIngredient(MaterialVariant.ROSE_RED)
		.addIngredient(Material.INK_SACK));

		addRecipe(new ShapelessRecipe(MaterialVariant.SILVER_DYE, 2)
		.addIngredient(MaterialVariant.BONE_MEAL)
		.addIngredient(MaterialVariant.GRAY_DYE));

		addRecipe(new ShapelessRecipe(MaterialVariant.SILVER_DYE, 3)
		.addIngredient(2, MaterialVariant.BONE_MEAL)
		.addIngredient(Material.INK_SACK));

		for (int i = 0; i < 16; i++) {
			MaterialVariant outClay = MaterialVariant.match(Material.STAINED_CLAY, (byte) i);
			MaterialVariant outWool = MaterialVariant.match(Material.WOOL, (byte) i);
			MaterialVariant dye     = MaterialVariant.match(Material.INK_SACK, (byte) (15 - i));

			for (int j = 0; j < 16; j++) {
				MaterialVariant inClay = MaterialVariant.match(Material.STAINED_CLAY, (byte) j);
				MaterialVariant inWool = MaterialVariant.match(Material.WOOL, (byte) j);
			}
		}
	}
}
