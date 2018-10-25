package com.eardwulf.wickedfrontier.items;

import java.util.Random;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlockBase extends Item implements IHasModel {

	public ItemBlockBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabwickedfrontier);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
