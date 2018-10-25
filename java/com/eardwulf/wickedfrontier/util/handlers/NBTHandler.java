/**
 * 
 */
package com.eardwulf.wickedfrontier.util.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * @author egs19
 *
 */
public class NBTHandler 
{
	public static NBTTagCompound stackToNBT(ItemStack stack)
	{
		NBTTagCompound compound = new NBTTagCompound();
		compound.setInteger("count", stack.getCount());
		compound.setString("item", stack.getItem().getRegistryName().toString());
		return compound;
	}
	
	public static ItemStack stackFromNBT(NBTTagCompound compound)
	{
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
		int count = compound.getInteger("count");
		return new ItemStack(item, count);
	}
}