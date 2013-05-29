// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 24/05/2013 05:45:05 PM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   modBlockTrapDoor.java

package com.VanillaAddon.block;

import com.VanillaAddon.core.Reference;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;


public class BaseBlockTrapDoor extends BlockTrapDoor
{

    
public BaseBlockTrapDoor(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(CreativeTabs.tabRedstone);
		GameRegistry.registerBlock(this, this.getUnlocalizedName2());
	}

    public void registerIcons(IconRegister par1IconRegister)
    {
        blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+ this.getUnlocalizedName2());
    }

    public void setBlockBoundsForItemRender()
    {
        float f = 0.1875F;
        setBlockBounds(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
    }
}