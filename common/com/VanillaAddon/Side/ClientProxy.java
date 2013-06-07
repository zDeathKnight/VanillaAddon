package com.VanillaAddon.Side;

import net.minecraftforge.client.MinecraftForgeClient;

import com.VanillaAddon.TileEntity.TileEntityChestSpruce;
import com.VanillaAddon.core.Blocks;
import com.VanillaAddon.render.ItemChestSpruceRender;
import com.VanillaAddon.render.TileEntityChestSpruceRender;

import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy 
{
	
	public void Registry()
	{	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChestSpruce.class, new TileEntityChestSpruceRender());
		MinecraftForgeClient.registerItemRenderer(Blocks.SpruceChest.blockID, new ItemChestSpruceRender());
		
	}

}
