/**
 * 
 */
package com.eardwulf.wickedfrontier.util.handlers;


import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityArcaneChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityAshChest;
import com.eardwulf.wickedfrontier.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;


/**
 * @author egs19
 *
 */
public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityArcaneChest.class, new ResourceLocation(Reference.MOD_ID + ":arcane_chest"));
		GameRegistry.registerTileEntity(TileEntityAshChest.class, new ResourceLocation(Reference.MOD_ID + ":ash_chest"));
	}
}