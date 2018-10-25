package com.eardwulf.wickedfrontier.blocks.slab;

import net.minecraft.block.material.Material;

public class CustomBlockHalfSlab extends CustomBlockSlab
{
	public CustomBlockHalfSlab(String name, Material material, float light)
	{
		super(name, material, light);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
