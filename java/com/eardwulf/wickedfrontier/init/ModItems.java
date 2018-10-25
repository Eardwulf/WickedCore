package com.eardwulf.wickedfrontier.init;

import java.util.ArrayList;
import java.util.List;

import com.eardwulf.wickedfrontier.blocks.BlockOres;
import com.eardwulf.wickedfrontier.blocks.activators.CustomBlockButton;
import com.eardwulf.wickedfrontier.blocks.activators.CustomBlockPressurePlate;
import com.eardwulf.wickedfrontier.blocks.chest.ArcaneChest;
import com.eardwulf.wickedfrontier.blocks.chest.AshChest;
import com.eardwulf.wickedfrontier.blocks.fence.BlockFenceCustom;
import com.eardwulf.wickedfrontier.blocks.fence.BlockFenceGateCustom;
import com.eardwulf.wickedfrontier.blocks.slab.CustomBlockDoubleSlab;
import com.eardwulf.wickedfrontier.blocks.slab.CustomBlockHalfSlab;
import com.eardwulf.wickedfrontier.blocks.stairs.CustomBlockStairs;
import com.eardwulf.wickedfrontier.items.CustomItemBlock;
import com.eardwulf.wickedfrontier.items.ItemBase;
import com.eardwulf.wickedfrontier.items.armor.ArmorBase;
import com.eardwulf.wickedfrontier.items.tools.ToolAxe;
import com.eardwulf.wickedfrontier.items.tools.ToolHoe;
import com.eardwulf.wickedfrontier.items.tools.ToolPickaxe;
import com.eardwulf.wickedfrontier.items.tools.ToolSpade;
import com.eardwulf.wickedfrontier.items.tools.ToolSword;
import com.eardwulf.wickedfrontier.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 1800, 8.0F, 3.5F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian", 35, 
			new int[] {4, 5, 7, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial MATERIAL_ORICHALCUM = EnumHelper.addToolMaterial("material_orichalcum", 4, 2000, 10.0F, 5.0F, 30);
	public static final ArmorMaterial ARMOR_MATERIAL_ORICHALCUM = EnumHelper.addArmorMaterial("armor_material_redstone", Reference.MOD_ID + ":orichalcum", 40, 
			new int[] {5, 8, 8, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 1600, 8.0F, 3.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_redstone", Reference.MOD_ID + ":emerald", 30, 
			new int[] {3, 7, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ToolMaterial MATERIAL_REDSTONE = EnumHelper.addToolMaterial("material_redstone", 3, 1000, 6.0F, 4.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_REDSTONE = EnumHelper.addArmorMaterial("armor_material_redstone", Reference.MOD_ID + ":redstone", 22, 
			new int[] {2, 5, 7, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ClOTH = EnumHelper.addArmorMaterial("armor_material_cloth", Reference.MOD_ID + ":cloth", 2, 
			new int[] {1, 1, 2, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_redstone", 3, 800, 6.0F, 2.8F, 8);
	public static final ArmorMaterial ARMOR_MATERIAL_QUARTZ = EnumHelper.addArmorMaterial("armor_material_redstone", Reference.MOD_ID + ":redstone", 22, 
			new int[] {2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ToolMaterial MATERIAL_ARCANE_WOOD = EnumHelper.addToolMaterial("material_arcane_wood", 1, 150, 3.0F, 2.0F, 100);
	public static final ToolMaterial MATERIAL_ARCANE = EnumHelper.addToolMaterial("material_arcane", 2, 300, 4.0F, 4.0F, 100);
	
	//Food
	
	//Items
	public static final Item NATURE_STONE = new ItemBase("nature_stone");
	public static final Item LEATHER_STRIPS = new ItemBase("leather_strips");
	public static final Item ARCANE_STICK = new ItemBase("arcane_stick");	
	public static final Item MAGIC_DUST = new ItemBase("magic_dust");
	
	//Ingot
	public static final Item REDSTONE_INGOT = new ItemBase("redstone_ingot");
	public static final Item ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item QUARTZ_INGOT = new ItemBase("quartz_ingot");
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item NICKEL_INGOT = new ItemBase("nickel_ingot");	
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");	
	public static final Item MITHRIL_INGOT = new ItemBase("mithril_ingot");
	public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item ADAMANTINE_INGOT = new ItemBase("adamantine_ingot");
	
	//Tools
	public static final ItemSword AZTEC_SWORD = new ToolSword("aztec_sword", MATERIAL_OBSIDIAN);
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolSpade("obsidian_spade", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	public static final ItemSword ORICHALCUM_SWORD = new ToolSword("orichalcum_sword", MATERIAL_ORICHALCUM);
	public static final ItemSpade ORICHALCUM_SPADE = new ToolSpade("orichalcum_spade", MATERIAL_ORICHALCUM);
	public static final ItemPickaxe ORICHALCUM_PICKAXE = new ToolPickaxe("orichalcum_pickaxe", MATERIAL_ORICHALCUM);
	public static final ItemAxe ORICHALCUM_AXE = new ToolAxe("orichalcum_axe", MATERIAL_ORICHALCUM);
	public static final ItemHoe ORICHALCUM_HOE = new ToolHoe("orichalcum_hoe", MATERIAL_ORICHALCUM);
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SPADE = new ToolSpade("emerald_spade", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	public static final ItemSword REDSTONE_SWORD = new ToolSword("redstone_sword", MATERIAL_REDSTONE);
	public static final ItemSpade REDSTONE_SPADE = new ToolSpade("redstone_spade", MATERIAL_REDSTONE);
	public static final ItemPickaxe REDSTONE_PICKAXE = new ToolPickaxe("redstone_pickaxe", MATERIAL_REDSTONE);
	public static final ItemAxe REDSTONE_AXE = new ToolAxe("redstone_axe", MATERIAL_REDSTONE);
	public static final ItemHoe REDSTONE_HOE = new ToolHoe("redstone_hoe", MATERIAL_REDSTONE);
	public static final ItemSword QUARTZ_SWORD = new ToolSword("quartz_sword", MATERIAL_QUARTZ);
	public static final ItemSpade QUARTZ_SPADE = new ToolSpade("quartz_spade", MATERIAL_QUARTZ);
	public static final ItemPickaxe QUARTZ_PICKAXE = new ToolPickaxe("quartz_pickaxe", MATERIAL_QUARTZ);
	public static final ItemAxe QUARTZ_AXE = new ToolAxe("quartz_axe", MATERIAL_QUARTZ);
	public static final ItemHoe QUARTZ_HOE = new ToolHoe("quartz_hoe", MATERIAL_QUARTZ);
	public static final ItemSword ARCANE_WOODEN_SWORD = new ToolSword("arcane_wooden_sword", MATERIAL_ARCANE_WOOD);
	public static final ItemSpade ARCANE_WOODEN_SPADE = new ToolSpade("arcane_wooden_spade", MATERIAL_ARCANE_WOOD);
	public static final ItemPickaxe ARCANE_WOODEN_PICKAXE = new ToolPickaxe("arcane_wooden_pickaxe", MATERIAL_ARCANE_WOOD);
	public static final ItemAxe ARCANE_WOODEN_AXE = new ToolAxe("arcane_wooden_axe", MATERIAL_ARCANE_WOOD);
	public static final ItemHoe ARCANE_WOODEN_HOE = new ToolHoe("arcane_wooden_hoe", MATERIAL_ARCANE_WOOD);
	public static final ItemSword ARCANE_SWORD = new ToolSword("arcane_sword", MATERIAL_ARCANE);
	public static final ItemSpade ARCANE_SPADE = new ToolSpade("arcane_spade", MATERIAL_ARCANE);
	public static final ItemPickaxe ARCANE_PICKAXE = new ToolPickaxe("arcane_pickaxe", MATERIAL_ARCANE);
	public static final ItemAxe ARCANE_AXE = new ToolAxe("arcane_axe", MATERIAL_ARCANE);
	public static final ItemHoe ARCANE_HOE = new ToolHoe("arcane_hoe", MATERIAL_ARCANE);
	
	//Swords
	
	
	//GreatSwords
	
	
	//LongSwords
	
	//Armor
	public static final Item REDSTONE_HELMET = new ArmorBase("redstone_helmet", ARMOR_MATERIAL_REDSTONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item REDSTONE_CHESTPLATE = new ArmorBase("redstone_chestplate", ARMOR_MATERIAL_REDSTONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item REDSTONE_LEGGINGS = new ArmorBase("redstone_leggings", ARMOR_MATERIAL_REDSTONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item REDSTONE_BOOTS = new ArmorBase("redstone_boots", ARMOR_MATERIAL_REDSTONE, 1, EntityEquipmentSlot.FEET);
	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	public static final Item ORICHALCUM_HELMET = new ArmorBase("orichalcum_helmet", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ORICHALCUM_CHESTPLATE = new ArmorBase("orichalcum_chestplate", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ORICHALCUM_LEGGINGS = new ArmorBase("orichalcum_leggings", ARMOR_MATERIAL_ORICHALCUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ORICHALCUM_BOOTS = new ArmorBase("orichalcum_boots", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.FEET);
	public static final Item QUARTZ_HELMET = new ArmorBase("quartz_helmet", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item QUARTZ_CHESTPLATE = new ArmorBase("quartz_chestplate", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item QUARTZ_LEGGINGS = new ArmorBase("quartz_leggings", ARMOR_MATERIAL_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item QUARTZ_BOOTS = new ArmorBase("quartz_boots", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.FEET);
}
