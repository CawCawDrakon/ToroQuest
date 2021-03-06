package net.torocraft.toroquest.material;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterials {
	
	/*
	 * vanilla material properties:
	 * 
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
	 * 
	 * STONE(1, 131, 4.0F, 1.0F, 5),
	 * 
	 * IRON(2, 250, 6.0F, 2.0F, 14),
	 * 
	 * DIAMOND(3, 1561, 8.0F, 3.0F, 10),
	 * 
	 * GOLD(0, 32, 12.0F, 0.0F, 22);
	 */

	public static ToolMaterial OBSIDIAN_MATERIAL;
	public static ToolMaterial FIRE_MATERIAL;

	public static void init() {
		obsidianMaterial();
		fireMaterial();
	}

	protected static void obsidianMaterial() {
		int harvestLevel = 3;
		int durability = 10;
		float miningSpeed = 10f;
		float damageVsEntities = 20f;
		int enchantability = 12;
		OBSIDIAN_MATERIAL = EnumHelper.addToolMaterial("OBSIDIAN", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
		OBSIDIAN_MATERIAL.setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	}

	protected static void fireMaterial() {
		int harvestLevel = 3;
		int durability = 1000;
		float miningSpeed = 8f;
		float damageVsEntities = 9f;
		int enchantability = 20;
		FIRE_MATERIAL = EnumHelper.addToolMaterial("FIRE", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
		FIRE_MATERIAL.setRepairItem(new ItemStack(Blocks.MAGMA));
	}
}
