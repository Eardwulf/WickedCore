/**
 * 
 */
package com.eardwulf.wickedfrontier.blocks.gui;

import com.eardwulf.wickedfrontier.blocks.container.ContainerAshChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityAshChest;
import com.eardwulf.wickedfrontier.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * @author egs19
 *
 */
public class GuiAshChest extends GuiContainer
{
	private static final ResourceLocation GUI_CHEST = new ResourceLocation(Reference.MOD_ID + ":textures/gui/ash_chest.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityAshChest te;
	
	public GuiAshChest(InventoryPlayer playerInventory, TileEntityAshChest chestInventory, EntityPlayer player) 
	{
		super(new ContainerAshChest(playerInventory, chestInventory, player));
		this.playerInventory = playerInventory;
		this.te = chestInventory;
		
		this.xSize = 179;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 16086784);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 16086784);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}