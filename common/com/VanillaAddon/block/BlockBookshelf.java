package com.VanillaAddon.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import com.VanillaAddon.core.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

@SuppressWarnings("unused")
public class BlockBookshelf extends Block
{
    public BlockBookshelf(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
     Icon Side[] = new Icon[4];
     Icon Top[] = new Icon[4];


    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int meta)
    {
    	if(side !=1 && side != 0){
    		return Side[meta];
    	}
    	else
    	{
        return Top[meta];
    	}
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 3;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.book.itemID;
    }
    
    @Override
	public void registerIcons(IconRegister iconRegister)
    {
       Side[0] = iconRegister.registerIcon("bookshelf");
       Side[1] = iconRegister.registerIcon(Reference.MOD_NAME+":"+"bookshelf_spruce");
       Side[2] = iconRegister.registerIcon(Reference.MOD_NAME+":"+"bookshelf_birch");
       Side[3] = iconRegister.registerIcon(Reference.MOD_NAME+":"+"bookshelf_jungle");
       Top[0] = iconRegister.registerIcon("wood");
       Top[1] = iconRegister.registerIcon("wood_spruce");
       Top[2] = iconRegister.registerIcon("wood_birch");
       Top[3] = iconRegister.registerIcon("wood_jungle");

    }
}
