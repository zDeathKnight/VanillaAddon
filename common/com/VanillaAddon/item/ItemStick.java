package com.VanillaAddon.item;

import java.util.List;

import com.VanillaAddon.core.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStick extends ItemBase 
{

	public Icon[] ic = new Icon[3];
	public String[] i = new String[]{"spruceStick","birchStick","jungleStick"};
	public ItemStick(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(int par1, CreativeTabs tab, List list) 
	{
		list.add(new ItemStack(par1, 1, 0));
		list.add(new ItemStack(par1, 1, 1));
		list.add(new ItemStack(par1, 1, 2));	
	}
	
	public String getUnlocalizedName(ItemStack is)
	{
		 String name = ""; 
		 switch(is.getItemDamage())
		{
			case 0:{name = "0";break;}
			case 1:{name = "1";break;}
			case 2:{name = "2";break;}
		}
		 return getUnlocalizedName() + "." + name;
	}
	
	@Override
	public Icon getIconFromDamage(int par1) 
	{
		return ic[par1];
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         ic[0] = iconRegister.registerIcon(Reference.MOD_NAME+":"+i[0]);
	         ic[1] = iconRegister.registerIcon(Reference.MOD_NAME+":"+i[1]);
	         ic[2] = iconRegister.registerIcon(Reference.MOD_NAME+":"+i[2]);         
	}

}
