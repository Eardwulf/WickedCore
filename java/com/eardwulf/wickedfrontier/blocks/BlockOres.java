package com.eardwulf.wickedfrontier.blocks;

import java.util.Random;

import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockOres extends BlockBase
{

	public BlockOres(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
