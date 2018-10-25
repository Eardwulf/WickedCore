/**
 * 
 */
package com.eardwulf.wickedfrontier.util;

import com.eardwulf.wickedfrontier.util.interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * @author egs19
 *
 */
public class ItemBlockVariants extends ItemBlock
{
	public ItemBlockVariants(Block block) 
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}	
}