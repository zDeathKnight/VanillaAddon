
package com.VanillaAddon.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFenceModtest extends ItemBlock
{
	public ItemFenceModtest(int id)
	{
		super(id);
		 setMaxDamage(0);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack is)
	{
		
		return getUnlocalizedName() + "." + is.getItemDamage();
	}

	    public int getMetadata(int damage)
	    {
	        return damage;
	    }
}
