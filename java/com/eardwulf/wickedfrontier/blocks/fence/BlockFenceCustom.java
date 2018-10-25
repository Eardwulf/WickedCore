/**
 * 
 */
package com.eardwulf.wickedfrontier.blocks.fence;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * @author egs19
 *
 */
public class BlockFenceCustom extends BlockFence implements IHasModel
{
	public BlockFenceCustom(String name, Material material, float light) 
	{
		super(material, material.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(light);
		setResistance(1.0F);
		setHardness(1.0F);
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
}