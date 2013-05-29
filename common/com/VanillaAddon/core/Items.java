package com.VanillaAddon.core;

import com.VanillaAddon.item.ItemBaseDoor;
import com.VanillaAddon.item.ItemStick;

import net.minecraft.item.Item;


public class Items 
{	
	public static Item doorWoodSpruceItem = new ItemBaseDoor(getItemID(ItemIDs.doorWoodSpruceItemID)).setUnlocalizedName("doorWoodenSpruce");
	public static Item doorWoodBirchItem= new ItemBaseDoor(getItemID(ItemIDs.doorWoodBirchItemID)).setUnlocalizedName("doorWoodenBirch");
	public static Item doorWoodJungleItem= new ItemBaseDoor(getItemID(ItemIDs.doorWoodJungleItemID)).setUnlocalizedName("doorWoodenJungle");
	
	public static Item NewStick = new ItemStick(getItemID(ItemIDs.NewStickID)).setUnlocalizedName("Sticks");
	public static int getItemID(int id)
	{
		int itemid = id -256;
		return itemid;
		
	}
}
