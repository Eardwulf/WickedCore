package com.eardwulf.wickedfrontier.init;

import java.util.ArrayList;
import java.util.List;

import com.eardwulf.wickedfrontier.blocks.BlockOres;
import com.eardwulf.wickedfrontier.blocks.BlockStone;
import com.eardwulf.wickedfrontier.blocks.activators.CustomBlockButton;
import com.eardwulf.wickedfrontier.blocks.activators.CustomBlockPressurePlate;
import com.eardwulf.wickedfrontier.blocks.chest.ArcaneChest;
import com.eardwulf.wickedfrontier.blocks.chest.AshChest;
import com.eardwulf.wickedfrontier.blocks.fence.BlockFenceCustom;
import com.eardwulf.wickedfrontier.blocks.fence.BlockFenceGateCustom;
import com.eardwulf.wickedfrontier.blocks.slab.CustomBlockDoubleSlab;
import com.eardwulf.wickedfrontier.blocks.slab.CustomBlockHalfSlab;
import com.eardwulf.wickedfrontier.blocks.stairs.CustomBlockStairs;
import com.eardwulf.wickedfrontier.blocks.trees.BlockLeafArcane;
import com.eardwulf.wickedfrontier.blocks.trees.BlockLeafAsh;
import com.eardwulf.wickedfrontier.blocks.trees.BlockLogArcane;
import com.eardwulf.wickedfrontier.blocks.trees.BlockLogAsh;
import com.eardwulf.wickedfrontier.blocks.trees.BlockPlanksArcane;
import com.eardwulf.wickedfrontier.blocks.trees.BlockPlanksAsh;
import com.eardwulf.wickedfrontier.blocks.trees.BlockSaplingArcane;
import com.eardwulf.wickedfrontier.blocks.trees.BlockSaplingAsh;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ADOBE_BRICK = new BlockStone("adobe_brick", Material.ROCK, 0.0F);
	public static final Block ARCANE_STONE = new BlockStone("arcane_stone", Material.ROCK, 2.0F);
	
	//Ores
	public static final Block ORICHALCUM_ORE = new BlockOres("orichalcum_ore", Material.ROCK);
	public static final Block ALUMINUM_ORE = new BlockOres("aluminum_ore", Material.ROCK);
	public static final Block COPPER_ORE = new BlockOres("copper_ore", Material.ROCK);
	public static final Block FIRESTONE_ORE = new BlockOres("firestone_ore", Material.ROCK);
	public static final Block LEAD_ORE = new BlockOres("lead_ore", Material.ROCK);
	public static final Block NICKEL_ORE = new BlockOres("nickel_ore", Material.ROCK);
	public static final Block SILVER_ORE = new BlockOres("silver_ore", Material.ROCK);
	public static final Block MITHRIL_ORE = new BlockOres("mithril_ore", Material.ROCK);
	public static final Block ZINC_ORE = new BlockOres("zinc_ore", Material.ROCK);
	public static final Block PLATINUM_ORE = new BlockOres("platinum_ore", Material.ROCK);
	public static final Block ADAMANTINE_ORE = new BlockOres("adamantine_ore", Material.ROCK);
	
	//Crops
	
	
	//Trees
	public static final Block LOG_ARCANE = new BlockLogArcane("log_arcane", Material.WOOD, 5.0F);
	public static final Block LEAVES_ARCANE = new BlockLeafArcane("leaves_arcane", Material.LEAVES, 5.0F);
	public static final Block PLANKS_ARCANE = new BlockPlanksArcane("planks_arcane", Material.WOOD, 5.0F);
	public static final Block SAPLING_ARCANE = new BlockSaplingArcane("sapling_arcane");
	public static final Block LOG_ASH = new BlockLogAsh("log_ash", Material.WOOD);
	public static final Block LEAVES_ASH = new BlockLeafAsh("leaves_ash");
	public static final Block PLANKS_ASH = new BlockPlanksAsh("planks_ash", Material.WOOD);
	public static final Block SAPLING_ASH = new BlockSaplingAsh("sapling_ash");
	
	//Stairs
	public static final Block ARCANE_STAIRS = new CustomBlockStairs("arcane_stairs", ModBlocks.PLANKS_ARCANE.getDefaultState(), Material.WOOD, 5.0F);
	public static final Block ARCANE_STONE_STAIRS = new CustomBlockStairs("arcane_stone_stairs", ModBlocks.ARCANE_STONE.getDefaultState(), Material.ROCK, 2.0F);
	public static final Block ADOBE_STAIRS = new CustomBlockStairs("adobe_stairs", ModBlocks.PLANKS_ARCANE.getDefaultState(), Material.WOOD, 5.0F);
	
	//Slabs
	public static final Block ARCANE_SLAB_HALF = new CustomBlockHalfSlab("arcane_slab_half", Material.WOOD, 5.0F);
	public static final Block ARCANE_SLAB_DOUBLE = new CustomBlockDoubleSlab("arcane_slab_double", Material.WOOD, 5.0F);
	public static final Block ARCANE_STONE_SLAB_HALF = new CustomBlockHalfSlab("arcane_stone_slab_half", Material.ROCK, 2.0F);
	public static final Block ARCANE_STONE_SLAB_DOUBLE = new CustomBlockDoubleSlab("arcane_stone_slab_double", Material.ROCK, 2.0F);
	public static final Block ADOBE_SLAB_HALF = new CustomBlockHalfSlab("adobe_slab_half", Material.WOOD, 5.0F);
	public static final Block ADOBE_SLAB_DOUBLE = new CustomBlockDoubleSlab("adobe_slab_double", Material.WOOD, 5.0F);
		
	//Fences
	public static final Block ARCANE_FENCE = new BlockFenceCustom("arcane_fence", Material.WOOD, 5.0F);
	public static final Block ARCANE_FENCE_GATE = new BlockFenceGateCustom("arcane_fence_gate", Material.WOOD, 5.0F);
	
	//Walls
	
	
	//Button
	public static final Block ARCANE_BUTTON = new CustomBlockButton("arcane_button", Material.WOOD, 5.0F);

	//Pressure Plates
	public static final Block ARCANE_PRESSURE_PLATE = new CustomBlockPressurePlate("arcane_pressure_plate", Material.WOOD, 5.0F);
		
	//Lanterns
	
	//Chest
	public static final Block ARCANE_CHEST = new ArcaneChest("arcane_chest", 5.0F);
	public static final Block ASH_CHEST = new AshChest("ash_chest");
	
}
