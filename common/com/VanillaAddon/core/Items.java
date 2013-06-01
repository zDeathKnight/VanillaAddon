package com.VanillaAddon.core;

import net.minecraft.item.Item;

import com.VanillaAddon.item.ItemBaseDoor;
import com.VanillaAddon.item.ItemFoodBase;
import com.VanillaAddon.item.ItemStick;


public class Items 
{	
	public static Item doorWoodSpruceItem = new ItemBaseDoor(getItemID(ItemIDs.doorWoodSpruceItemID)).setUnlocalizedName("doorWoodenSpruce");
	public static Item doorWoodBirchItem= new ItemBaseDoor(getItemID(ItemIDs.doorWoodBirchItemID)).setUnlocalizedName("doorWoodenBirch");
	public static Item doorWoodJungleItem= new ItemBaseDoor(getItemID(ItemIDs.doorWoodJungleItemID)).setUnlocalizedName("doorWoodenJungle");
	
	public static Item NewStick = new ItemStick(getItemID(ItemIDs.NewStickID)).setUnlocalizedName("Sticks");
	
	public static Item CookedFlesh = (new ItemFoodBase(64, 6, 0.6F, true)).setUnlocalizedName("cookedFlesh");
	public static int getItemID(int id)
	{
		int itemid = id -256;
		return itemid;
		
	}
}
