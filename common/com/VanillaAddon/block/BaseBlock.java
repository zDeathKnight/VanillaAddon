package com.VanillaAddon.block;

import com.VanillaAddon.core.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BaseBlock extends Block {

	public BaseBlock(int id, Material material) {
		super(id, material);
	}
	String i;
	Icon c;
	public BaseBlock(int id, Material material ,String icon) {
		super(id, material);
		i= icon;
	}
	
	public BaseBlock(int id){
		super(id, Material.rock);
		GameRegistry.registerBlock(this, this.getUnlocalizedName2());
	}
	@Override
	public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_NAME+":"+this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
	

}
