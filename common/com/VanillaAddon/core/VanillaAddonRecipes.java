package com.VanillaAddon.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.VanillaAddon.api.RecipeHandler;


public class VanillaAddonRecipes {
	
	public static void  init()
	{
		RecipeHandler.addID(Item.doorWood.itemID);
		RecipeHandler.addID(Item.stick.itemID);
		RecipeHandler.addID(Block.woodenButton.blockID);
		RecipeHandler.addID(Block.pressurePlatePlanks.blockID);
		RecipeHandler.addID(Block.bookShelf.blockID);
		RecipeHandler.addID(Block.workbench.blockID);
		RecipeHandler.addID(Block.fenceGate.blockID);
		RecipeHandler.addID(Block.trapdoor.blockID);
		RecipeHandler.removeRecipes();
		
		Registry.oreRegistry("sticks", new ItemStack(Items.NewStick,1,Registry.WILDCARD_VALUE));
	//	OreDictionary.registerOre("newstick", new ItemStack(Items.NewStick.itemID,1,1));
		//OreDictionary.registerOre("newstick", new ItemStack(Items.NewStick.itemID,1,2));

		
		Registry.addRecipe(new ItemStack(Item.stick,4), new Object[] {"#","#",'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Items.NewStick,4,0), new Object[] {"#","#",'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Items.NewStick,4,1), new Object[] {"#","#",'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Items.NewStick,4,2), new Object[] {"#","#",'#', new ItemStack(Block.planks,1,3)});

		Registry.addOreRecipes(new ItemStack(Block.torchWood,4),new Object[]{"c","#",'#',"sticks",'c',new ItemStack(Item.coal,1,Registry.WILDCARD_VALUE)});
		Registry.addRecipe(new ItemStack(Blocks.SpruceFence,4), new Object[] {"###","###",'#', new ItemStack(Items.NewStick,1,0)});
		Registry.addRecipe(new ItemStack(Blocks.BirchFence,4), new Object[] {"###","###",'#', new ItemStack(Items.NewStick,1,1)});
		Registry.addRecipe(new ItemStack(Blocks.JungleFence,4), new Object[] {"###","###",'#', new ItemStack(Items.NewStick,1,2)});
		Registry.addRecipe(new ItemStack(Item.doorWood), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Items.doorWoodSpruceItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Items.doorWoodBirchItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Items.doorWoodJungleItem), new Object[] {"##","##","##",'#', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.woodenButton), new Object[] {"#",'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Blocks.SpruceButton), new Object[] {"#",'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Blocks.BirchButton), new Object[] {"#",'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Blocks.JungleButton), new Object[] {"#",'#', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[] {"##",'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Blocks.SprucePressurePlate), new Object[] {"##",'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Blocks.BirchPressurePlate), new Object[] {"##",'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Blocks.JunglePressurePlate), new Object[] {"##",'#', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.bookShelf,1,0), new Object[] {"###","bbb","###",'b',Item.book,'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Block.bookShelf,1,1), new Object[] {"###","bbb","###",'b',Item.book,'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Block.bookShelf,1,2), new Object[] {"###","bbb","###",'b',Item.book,'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Block.bookShelf,1,3), new Object[] {"###","bbb","###",'b',Item.book,'#', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.workbench,1,0), new Object[] {"##","##",'#', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Block.workbench,1,1), new Object[] {"##","##",'#', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Block.workbench,1,2), new Object[] {"##","##",'#', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Block.workbench,1,3), new Object[] {"##","##",'#', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.fenceGate,1), new Object[]{"#W#", "#W#", '#', new ItemStack(Item.stick,1), 'W', new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Blocks.SpruceFenceGate,1), new Object[]{"#W#", "#W#", '#', new ItemStack(Items.NewStick,1,0), 'W', new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Blocks.BirchFenceGate,1), new Object[]{"#W#", "#W#", '#', new ItemStack(Items.NewStick,1,1), 'W', new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Blocks.JungleFenceGate,1), new Object[]{"#W#", "#W#", '#', new ItemStack(Items.NewStick,1,2), 'W', new ItemStack(Block.planks,1,3)});
		Registry.addRecipe(new ItemStack(Block.trapdoor,2), new Object[]{"###", "###", '#',new ItemStack(Block.planks,1,0)});
		Registry.addRecipe(new ItemStack(Blocks.SpruceTrapDoor,2), new Object[]{"###", "###", '#',new ItemStack(Block.planks,1,1)});
		Registry.addRecipe(new ItemStack(Blocks.BirchTrapDoor,2), new Object[]{"###", "###", '#',new ItemStack(Block.planks,1,2)});
		Registry.addRecipe(new ItemStack(Blocks.JungleTrapDoor,2), new Object[]{"###", "###", '#',new ItemStack(Block.planks,1,3)});

		Registry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Items.CookedFlesh), 0.15F);
		
		Registry.addRecipe(new ItemStack(Blocks.pressurePlateobsidian), new Object[] {
			"##",'#',Block.obsidian
			});
		
		RecipesWeapons();
		RecipesTools();
	}
	
	private static void RecipesTools()
	{
		
		 String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
	     Object[][] recipeItems = new Object[][] {{Block.planks, Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold}, {Item.pickaxeWood, Item.pickaxeStone, Item.pickaxeIron, Item.pickaxeDiamond, Item.pickaxeGold}, {Item.shovelWood, Item.shovelStone, Item.shovelIron, Item.shovelDiamond, Item.shovelGold}, {Item.axeWood, Item.axeStone, Item.axeIron, Item.axeDiamond, Item.axeGold}, {Item.hoeWood, Item.hoeStone, Item.hoeIron, Item.hoeDiamond, Item.hoeGold}};;
	     for (int i = 0; i < recipeItems[0].length; ++i)
	        {
	            Object object = recipeItems[0][i];

	            for (int j = 0; j < recipeItems.length - 1; ++j)
	            {
	                Item item = (Item)recipeItems[j + 1][i];
	                Registry.addOreRecipes(new ItemStack(item), new Object[] {recipePatterns[j], '#', "sticks", 'X', object});
	            }
	        } 
	}
	
	private static void RecipesWeapons()
	{
		
		String[][] recipePatterns = new String[][] {{"X", "X", "#"}};
	    Object[][] recipeItems= new Object[][] {{Block.planks, Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold}, {Item.swordWood, Item.swordStone, Item.swordIron, Item.swordDiamond, Item.swordGold}};

	    for (int i = 0; i < recipeItems[0].length; ++i)
        {
            Object object = recipeItems[0][i];

            for (int j = 0; j < recipeItems.length - 1; ++j)
            {
                Item item = (Item)recipeItems[j + 1][i];
                //Registry.addRecipe(new ItemStack(item), new Object[] {recipePatterns[j], '#', new ItemStack(Items.NewStick,1,0), 'X', object});
                //Registry.addRecipe(new ItemStack(item), new Object[] {recipePatterns[j], '#', new ItemStack(Items.NewStick,1,1), 'X', object});
                //Registry.addRecipe(new ItemStack(item), new Object[] {recipePatterns[j], '#', new ItemStack(Items.NewStick,1,2), 'X', object});
                Registry.addOreRecipes(new ItemStack(item), new Object[] {recipePatterns[j], '#', "sticks", 'X', object});
            }
        } 
	    
		
	}

}
