package com.eardwulf.wickedfrontier.blocks;

import java.util.Random;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStone extends BlockBase
{

	public BlockStone(String name, Material material, float light)
	{
		super(name, material);
		setLightLevel(light);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setCreativeTab(Main.tabwickedfrontier);
		
	}	
}
