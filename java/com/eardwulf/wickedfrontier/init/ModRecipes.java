package com.eardwulf.wickedfrontier.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.ORICHALCUM_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 5.0F);
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.FIRESTONE_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.NICKEL_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.ADAMANTINE_ORE, new ItemStack(ModItems.ADAMANTINE_INGOT, 1),5.0F);
		GameRegistry.addSmelting(ModBlocks.MITHRIL_ORE, new ItemStack(ModItems.MITHRIL_INGOT, 1), 5.0F);
		GameRegistry.addSmelting(ModBlocks.ZINC_ORE, new ItemStack(ModItems.ZINC_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 3.0F);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 1.0F);
		GameRegistry.addSmelting(Items.REDSTONE, new ItemStack(ModItems.REDSTONE_INGOT, 1), 3.5F);
		GameRegistry.addSmelting(Items.QUARTZ, new ItemStack(ModItems.QUARTZ_INGOT, 1), 2.5F);
		
	}
}
