package com.VanillaAddon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.VanillaAddon.core.Reference;

public class BlockWorkbenchOR extends Block
{
    private static Icon[] workbenchIconTop = new Icon[4];
    private static Icon[] workbenchIconFront = new Icon[4];
    private Icon[] workbenchIconSide = new Icon[4];
    private static Icon[] workbenchIconBottom = new Icon[4];

    public BlockWorkbenchOR(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }


    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if(side == 1) return workbenchIconTop[meta];
    	
    	if(side==0) return workbenchIconBottom[meta];
    	if(side != 2 &&  side != 4) return this.workbenchIconSide[meta] ;
    	
   
    	return workbenchIconFront[meta];
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        //this.blockIcon = par1IconRegister.registerIcon("workbench_side");
    	
    	workbenchIconBottom[0] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_bottom");
    	workbenchIconSide[0] = par1IconRegister.registerIcon("workbench_side");
        workbenchIconTop[0] = par1IconRegister.registerIcon("workbench_top");
        workbenchIconFront[0] = par1IconRegister.registerIcon("workbench_front");
        
        workbenchIconBottom[1] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_bottom_spruce");
    	workbenchIconSide[1] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_side_spruce");
        workbenchIconTop[1] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_top_spruce");
        workbenchIconFront[1] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_front_spruce");
        
        workbenchIconBottom[2] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_bottom_birch");
    	workbenchIconSide[2] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_side_birch");
        workbenchIconTop[2] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_top_birch");
        workbenchIconFront[2] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_front_birch");
        
        workbenchIconBottom[3] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_bottom_jungle");
    	workbenchIconSide[3] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_side_jungle");
        workbenchIconTop[3] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_top_jungle");
        workbenchIconFront[3] = par1IconRegister.registerIcon(Reference.MOD_NAME+":"+"workbench_front_jungle");
        
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
            return true;
        }
    }
}
