package com.VanillaAddon.unuse;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemChestRender implements IItemRenderer {

	@SuppressWarnings("unused")
	private ModelChest chestModel;
	
	public ItemChestRender(){
		
		chestModel = new ModelChest();
		
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityChest(), 0.0D, 0.0D, 0.0D, 0.0F);

	}

}
