package com.VanillaAddon.block;

import net.minecraft.block.BlockButton;
import net.minecraft.client.renderer.texture.IconRegister;

import com.VanillaAddon.core.Reference;

public class BlockButtonBase extends BlockButton
{
    public  BlockButtonBase(int par1)
    {
        super(par1, true);
    }
    String i;
    public BlockButtonBase(int par1, String icon)
    {
        super(par1, true);
        i = icon;
    }
    
    @Override
	public void registerIcons(IconRegister iconRegister)
    {
    	if(i!=null)
    	{
    		this.blockIcon = iconRegister.registerIcon(i);

    	}else
    	{
    		this.blockIcon = iconRegister.registerIcon(Reference.MOD_NAME+":"+this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    	}
    }
   
}
