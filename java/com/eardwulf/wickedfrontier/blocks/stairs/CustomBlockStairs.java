package com.eardwulf.wickedfrontier.blocks.stairs;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CustomBlockStairs extends BlockStairs implements IHasModel
{
	private static final IBlockState modelState = ModBlocks.PLANKS_ARCANE.getDefaultState();
	private static final Block modelBlock = ModBlocks.PLANKS_ARCANE;

	public CustomBlockStairs(String name, IBlockState modelState, Material material, float light) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(1.0F);
		setHardness(1.0F);
		setLightLevel(light);
		this.useNeighborBrightness = true;
		setCreativeTab(Main.tabwickedfrontier);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return this.modelBlock.getMapColor(this.modelState, worldIn, pos);
    }
}
