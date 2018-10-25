package com.eardwulf.wickedfrontier.blocks.activators;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomBlockButton extends BlockButton implements IHasModel
{
	public CustomBlockButton(String name, Material material, float light) 
	{
		super(false);
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
	
	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos)
	{
		worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
	}
	
	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) 
	{
		worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
	}

}
