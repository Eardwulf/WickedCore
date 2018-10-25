package com.eardwulf.wickedfrontier;

import com.eardwulf.wickedfrontier.blocks.chest.ArcaneChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityArcaneChest;
import com.eardwulf.wickedfrontier.blocks.tileentity.TileEntityAshChest;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.init.ModRecipes;
import com.eardwulf.wickedfrontier.proxy.CommonProxy;
import com.eardwulf.wickedfrontier.util.Reference;
import com.eardwulf.wickedfrontier.world.gen.WorldGenOre;
import com.eardwulf.wickedfrontier.world.gen.WorldGenTrees;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 3);
		GameRegistry.registerWorldGenerator(new WorldGenTrees(true), 1);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabwickedfrontier = new CreativeTabs("tab_wicked_frontier")
	{

		@Override
		public ItemStack getTabIconItem() 
		{
			return new ItemStack(ModItems.NATURE_STONE);
		}
		
	};

}
