package org.minechef.material;

import org.bukkit.Material;

public enum MaterialVariant {
	COARSE_DIRT (Material.DIRT, 1),
	PODZOL      (Material.DIRT, 2),

	RED_SAND (Material.SAND, 1),

	SPRUCE   (Material.WOOD, 1),
	BIRCH    (Material.WOOD, 2),
	JUNGLE   (Material.WOOD, 3),
	ACACIA   (Material.WOOD, 4),
	DARK_OAK (Material.WOOD, 5),

	GRANITE  (Material.STONE, 1),
	DIORITE  (Material.STONE, 3),
	ANDESITE (Material.STONE, 5),

	COBBLESTONE_SLAB  (Material.STEP, 3),
	BRICK_SLAB        (Material.STEP, 4),
	NETHER_BRICK_SLAB (Material.STEP, 6),

	SPRUCE_SLAB   (Material.WOOD_STEP, 1),
	BIRCH_SLAB    (Material.WOOD_STEP, 2),
	JUNGLE_SLAB   (Material.WOOD_STEP, 3),
	ACACIA_SLAB   (Material.WOOD_STEP, 4),
	DARK_OAK_SLAB (Material.WOOD_STEP, 5),

	ROSE_RED         (Material.INK_SACK, 1),
	CACTUS_GREEN     (Material.INK_SACK, 2),
	COCOA_BEANS      (Material.INK_SACK, 3),
	LAPIS_LAZULI     (Material.INK_SACK, 4),
	PURPLE_DYE       (Material.INK_SACK, 5),
	CYAN_DYE         (Material.INK_SACK, 6),
	LIGHT_GRAY_DYE   (Material.INK_SACK, 7),
	GRAY_DYE         (Material.INK_SACK, 8),
	PINK_DYE         (Material.INK_SACK, 9),
	LIME_DYE         (Material.INK_SACK, 10),
	DANDELION_YELLOW (Material.INK_SACK, 11),
	LIGHT_BLUE_DYE   (Material.INK_SACK, 12),
	MAGENTA_DYE      (Material.INK_SACK, 13),
	ORANGE_DYE       (Material.INK_SACK, 14),
	BONE_MEAL        (Material.INK_SACK, 15),

	BLUE_ORCHID  (Material.RED_ROSE, 1),
	ALLIUM       (Material.RED_ROSE, 2),
	AZURE_BLUET  (Material.RED_ROSE, 3),
	RED_TULIP    (Material.RED_ROSE, 4),
	ORANGE_TULIP (Material.RED_ROSE, 5),
	WHITE_TULIP  (Material.RED_ROSE, 6),
	PINK_TULIP   (Material.RED_ROSE, 7),
	OXEYE_DAISY  (Material.RED_ROSE, 8),

	SUNFLOWER (Material.DOUBLE_PLANT, 0),
	LILAC     (Material.DOUBLE_PLANT, 1),
	ROSE_BUSH (Material.DOUBLE_PLANT, 4),
	PEONY     (Material.DOUBLE_PLANT, 5),

	CREEPER_EGG       (Material.MONSTER_EGG, 50),
	SKELETON_EGG      (Material.MONSTER_EGG, 51),
	SPIDER_EGG        (Material.MONSTER_EGG, 52),
	// ID: 53, Giant (unused)
	ZOMBIE_EGG        (Material.MONSTER_EGG, 54),
	SLIME_EGG         (Material.MONSTER_EGG, 55),
	GHAST_EGG         (Material.MONSTER_EGG, 56),
	ZOMBIE_PIGMAN_EGG (Material.MONSTER_EGG, 57),
	ENDERMAN_EGG      (Material.MONSTER_EGG, 58),
	CAVE_SPIDER_EGG   (Material.MONSTER_EGG, 59),
	SILVERFISH_EGG    (Material.MONSTER_EGG, 60),
	BLAZE_EGG         (Material.MONSTER_EGG, 61),
	MAGMA_EGG         (Material.MONSTER_EGG, 62),
	// ID: 63, Ender Dragon (no egg)
	// ID: 64, Wither (no egg)
	// ID: 65, unknown
	WITCH_EGG         (Material.MONSTER_EGG, 66),
	ENDERMITE_EGG     (Material.MONSTER_EGG, 67),
	GUARDIAN_EGG      (Material.MONSTER_EGG, 68),
	SHULKER_EGG       (Material.MONSTER_EGG, 69),

	PIG_EGG        (Material.MONSTER_EGG, 90),
	SHEEP_EGG      (Material.MONSTER_EGG, 91),
	COW_EGG        (Material.MONSTER_EGG, 92),
	CHICKEN_EGG    (Material.MONSTER_EGG, 93),
	SQUID_EGG      (Material.MONSTER_EGG, 94),
	WOLF_EGG       (Material.MONSTER_EGG, 95),
	MOOSHROOM_EGG  (Material.MONSTER_EGG, 96),
	SNOW_GOLEM_EGG (Material.MONSTER_EGG, 97),
	OCELOT_EGG     (Material.MONSTER_EGG, 98),
	IRON_GOLEM_EGG (Material.MONSTER_EGG, 99),
	HORSE_EGG      (Material.MONSTER_EGG, 100),
	RABBIT_EGG     (Material.MONSTER_EGG, 101),

	VILLAGER_EGG (Material.MONSTER_EGG, 120);

	public final Material material;
	public final byte variant;

	MaterialVariant(Material type, int data) {
		this.material = type;
		this.variant = (byte) data;
	}

	public static MaterialVariant match(Material type, byte data) {
		for (MaterialVariant mv: values()) {
			if (mv.material == type && mv.variant == data) {
				return mv;
			}
		}

		return null;
	}
}
