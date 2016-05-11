package org.minechef.catalog;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.bukkit.inventory.Recipe;

public class AbstractCatalog implements Catalog {
	private List<Recipe> mRecipeList;
	private Properties mConfig;

	public AbstractCatalog() {
		this(new Properties());
	}

	public AbstractCatalog(Properties config) {
		mRecipeList = new Vector<Recipe>();
		mConfig = config;
	}

	protected boolean getBool(String key, boolean def) {
		String val = getString(key, "");

		if (val.equalsIgnoreCase("true"))
			return true;
		else if (val.equalsIgnoreCase("false"))
			return false;
		else
			return def;
	}

	protected String getString(String key, String def) {
		return mConfig.getProperty(key, def);
	}

	public void addRecipe(Recipe recipe) {
		mRecipeList.add(recipe);
	}

	public void removeRecipe(Recipe recipe) {
		mRecipeList.remove(recipe);
	}

	public Iterator<Recipe> recipeIterator() {
		return mRecipeList.iterator();
	}
}
