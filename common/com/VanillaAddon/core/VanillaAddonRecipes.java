package com.VanillaAddon.core;

import com.VanillaAddon.api.RecipeHandler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class VanillaAddonRecipes {
	
	public VanillaAddonRecipes()
	{
		RecipeHandler.addID(Item.doorWood.itemID);
		RecipeHandler.removeRecipes();
		GameRegistry.addRecipe(new ItemStack(Item.doorWood), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,0)});
		GameRegistry.addRecipe(new ItemStack(Items.doorWoodSpruceItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,1)});
		GameRegistry.addRecipe(new ItemStack(Items.doorWoodBirchItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,2)});
		GameRegistry.addRecipe(new ItemStack(Items.doorWoodJungleItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,3)});

		GameRegistry.addRecipe(new ItemStack(Blocks.pressurePlateobsidian), new Object[] {
			"##",'#',Block.obsidian
			});
	}

}
