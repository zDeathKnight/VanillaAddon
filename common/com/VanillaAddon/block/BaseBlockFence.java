package com.VanillaAddon.block;

import com.VanillaAddon.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaseBlockFence extends BlockFence {

	public BaseBlockFence(int id, Material material) {
		super(id, null, material);
	}
	
	public BaseBlockFence(int id){
		super(id, null, Material.wood);
		GameRegistry.registerBlock(this, this.getUnlocalizedName2());
	}
	@Override
	public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_NAME+":"+this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
	
	 public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	        int l = par1IBlockAccess.getBlockId(par2, par3, par4);
	        if(Block.blocksList[l] instanceof BlockFence) return true;
	        	
	        if (l != this.blockID && l != Block.fenceGate.blockID)
	        {
	            Block block = Block.blocksList[l];
	            
	            
	            return block != null && block.blockMaterial.isOpaque() && block.renderAsNormalBlock() ? block.blockMaterial != Material.pumpkin : false;
	        }
	        else
	        {
	            return true;
	        }
	    }
	

}
