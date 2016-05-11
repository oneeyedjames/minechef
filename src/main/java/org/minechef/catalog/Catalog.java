package org.minechef.catalog;

import java.util.Iterator;

import org.bukkit.inventory.Recipe;

public interface Catalog {
	public Iterator<Recipe> recipeIterator();
}
