package com.VanillaAddon.item;

import com.VanillaAddon.core.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class newItemBase extends Item {

	String iconfile;
	public newItemBase(int id) 
	{
		super(id-256);
	}
	public newItemBase(int id,String icon) 
	{
		super(id-256);
		iconfile =icon;
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		if(iconfile!=null){
	         itemIcon = iconRegister.registerIcon(iconfile);
		}else
	         itemIcon = iconRegister.registerIcon(Reference.MOD_NAME+":"+ getUnlocalizedName2());
	}

/**
 * Returns the unlocalized name of this item.
 */
	public String getUnlocalizedName2()
	{
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1);
    }
	
	
}
