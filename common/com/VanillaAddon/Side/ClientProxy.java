package com.VanillaAddon.Side;

import net.minecraftforge.client.MinecraftForgeClient;

import com.VanillaAddon.core.Blocks;
import com.VanillaAddon.render.*;
import com.VanillaAddon.TileEntity.*;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy 
{	
	public void Registry()
	{	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChestSpruce.class, new TileEntityChestSpruceRender());
		MinecraftForgeClient.registerItemRenderer(Blocks.SpruceChest.blockID, new ItemChestSpruceRender());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChestBirch.class, new TileEntityChestBirchRender());
		MinecraftForgeClient.registerItemRenderer(Blocks.BirchChest.blockID, new ItemChestBirchRender());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChestJungle.class, new TileEntityChestJungleRender());
		MinecraftForgeClient.registerItemRenderer(Blocks.JungleChest.blockID, new ItemChestJungleRender());		
	}
}
