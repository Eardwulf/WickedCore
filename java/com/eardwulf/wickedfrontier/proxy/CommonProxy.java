package com.eardwulf.wickedfrontier.proxy;

import com.eardwulf.wickedfrontier.blocks.trees.BlockLeafArcane;
import com.eardwulf.wickedfrontier.blocks.trees.BlockLeafAsh;

import net.minecraft.item.Item;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	/**
	 * @param itemFromBlock
	 * @param i
	 */
	public void registerModel(Item itemFromBlock, int i) {
		// TODO Auto-generated method stub
		
	}
	
	public void setGraphicsLevel(BlockLeafArcane blockLeafArcane, boolean parFancyEnabled)

    {

        blockLeafArcane.setGraphicsLevel(parFancyEnabled);

    }
	public void setGraphicsLevel(BlockLeafAsh blockLeafAsh, boolean parFancyEnabled)

    {

        blockLeafAsh.setGraphicsLevel(parFancyEnabled);

    }
}
