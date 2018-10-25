/**
 * 
 */
package com.eardwulf.wickedfrontier.items.tools;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.interfaces.IExtendedReach;
import com.eardwulf.wickedfrontier.util.interfaces.IHasModel;

import net.minecraft.item.ItemSword;

/**
 * @author egs19
 *
 */
public class CustomLongsword extends ItemSword implements IExtendedReach, IHasModel
{
    public CustomLongsword(String name,ToolMaterial parMaterial)
    {
        super(parMaterial);
        setCreativeTab(Main.tabwickedfrontier);
        setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabwickedfrontier);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
        
    public float getReach()
    {
        return 30.0F;
    }
}
