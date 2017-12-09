package org.minechef.plugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.Recipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

import org.minechef.catalog.*;
import org.minechef.event.CraftListener;
import org.minechef.event.DamageListener;
import org.minechef.event.DropListener;
import org.minechef.inventory.ItemStack;
import org.minechef.inventory.ShapelessRecipe;
import org.minechef.material.MaterialVariant;

public class MainPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		super.onEnable();

		File configFile = new File(getServer().getWorldContainer(), "minechef.properties");

		Properties config = new Properties();

		if (configFile.exists()) {
			try {
				config.load(new FileInputStream(configFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		resetRecipes();

		addCatalog(new DirtCatalog());
		addCatalog(new WoodCatalog());
		addCatalog(new StoneCatalog());
		addCatalog(new ArmorCatalog());
		addCatalog(new ColorCatalog());
		addCatalog(new SpawnCatalog());
		addCatalog(new FlowerCatalog());
		addCatalog(new NetherCatalog());
		addCatalog(new EndCatalog());
		addCatalog(new MiscCatalog());

		addListener(new DamageListener());
		addListener(new DropListener());
	}

	public void addRecipe(Recipe recipe) {
		getServer().addRecipe(recipe);
	}

	public void addCatalog(Catalog catalog) {
		Iterator<Recipe> iterator = catalog.recipeIterator();
		while (iterator.hasNext())
			addRecipe(iterator.next());
	}

	public void addListener(Listener listener) {
		getServer().getPluginManager().registerEvents(listener, this);
	}

	private void resetRecipes() {
		Server server = getServer();

		List<Recipe> preserver = new LinkedList<Recipe>();
		Iterator<Recipe> iterator = server.recipeIterator();

		while (iterator.hasNext()) {
			Recipe recipe = iterator.next();
			ItemStack result = new ItemStack(recipe.getResult());

			// preserver.add(recipe);

			switch (result.getType()) {
				case FENCE:
				case FENCE_GATE:
				case WOOD_STAIRS:
				case SPRUCE_FENCE:
				case SPRUCE_FENCE_GATE:
				case SPRUCE_WOOD_STAIRS:
				case BIRCH_FENCE:
				case BIRCH_FENCE_GATE:
				case BIRCH_WOOD_STAIRS:
				case JUNGLE_FENCE:
				case JUNGLE_FENCE_GATE:
				case JUNGLE_WOOD_STAIRS:
				case ACACIA_FENCE:
				case ACACIA_FENCE_GATE:
				case ACACIA_STAIRS:
				case DARK_OAK_FENCE:
				case DARK_OAK_FENCE_GATE:
				case DARK_OAK_STAIRS:
					// preserver.remove(recipe);
					recipe.getResult().setAmount(5);
					break;
				case COBBLESTONE_STAIRS:
				case SMOOTH_STAIRS:
				case BRICK_STAIRS:
				case SANDSTONE_STAIRS:
				case RED_SANDSTONE_STAIRS:
				case NETHER_BRICK_STAIRS:
				case QUARTZ_STAIRS:
					// preserver.remove(recipe);
					break;
				case INK_SACK:
					// if (result.getVariant() == MaterialVariant.SILVER_DYE)
					// 	preserver.remove(recipe);
					break;
				default:
					break;
			}
		}

		// server.clearRecipes();
		//
		// for (Recipe recipe : preserver)
		// 	server.addRecipe(recipe);
	}
}
