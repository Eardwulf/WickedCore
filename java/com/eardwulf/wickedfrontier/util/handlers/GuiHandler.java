/**
 * 
 */
package com.eardwulf.wickedfrontier.util.handlers;

import com.eardwulf.wickedfrontier.blocks.container.ContainerArcaneChest;
import com.eardwulf.wickedfrontier.blocks.container.ContainerAshChest;
import com.eardwulf.wickedfrontier.blocks.gui.GuiArcaneChest;
import com.eardwulf.wickedfrontier.blocks.gui.GuiAshChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityArcaneChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityAshChest;
import com.eardwulf.wickedfrontier.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * @author egs19
 *
 */
public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ARCANE_CHEST) return new ContainerArcaneChest(player.inventory, (TileEntityArcaneChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == Reference.GUI_ASH_CHEST) return new ContainerAshChest(player.inventory, (TileEntityAshChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ARCANE_CHEST) return new GuiArcaneChest(player.inventory, (TileEntityArcaneChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == Reference.GUI_ASH_CHEST) return new GuiAshChest(player.inventory, (TileEntityAshChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
}