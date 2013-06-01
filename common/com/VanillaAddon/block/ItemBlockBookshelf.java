package com.VanillaAddon.block;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBookshelf extends ItemBlock {

	public ItemBlockBookshelf(int par1) {
		super(par1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubItems(int par1, CreativeTabs tab, List list) 
	{
		list.add(new ItemStack(par1, 1, 0));
		list.add(new ItemStack(par1, 1, 1));
		list.add(new ItemStack(par1, 1, 2));	
		list.add(new ItemStack(par1, 1, 3));	
	}
	
	/*public String getUnlocalizedName(ItemStack is)
	{

		 return getUnlocalizedName() + "." + is.getItemDamage();
	}*/
	
	public int getMetadata(int damage)
    {
        return damage;
    }


}
