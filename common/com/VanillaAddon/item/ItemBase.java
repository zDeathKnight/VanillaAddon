package com.VanillaAddon.item;

import com.VanillaAddon.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	String iconfile;
	public ItemBase(int par1) {
		super(par1);
		//this.setCreativeTab(MoreOreChanger.MOCtab);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon(Reference.MOD_NAME+":"+ this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
