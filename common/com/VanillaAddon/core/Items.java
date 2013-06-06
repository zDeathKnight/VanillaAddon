package com.VanillaAddon.core;

import net.minecraft.item.Item;

import com.VanillaAddon.item.ItemBaseDoor;
import com.VanillaAddon.item.ItemFoodBase;
import com.VanillaAddon.item.ItemStick;


public class Items 
{	
	public static void init()
	{
		doorWoodSpruceItem = new ItemBaseDoor(ItemIDs.SpruceDoorItemID).setUnlocalizedName("doorWoodenSpruce");
		doorWoodBirchItem= new ItemBaseDoor(ItemIDs.BirchDoorItemID).setUnlocalizedName("doorWoodenBirch");
		doorWoodJungleItem= new ItemBaseDoor(ItemIDs.JungleDoorItemID).setUnlocalizedName("doorWoodenJungle");
		GoldDoorItem= new ItemBaseDoor(ItemIDs.GoldDoorItemID).setUnlocalizedName("doorGold");
		NewStick = new ItemStick(ItemIDs.NewStickID).setUnlocalizedName("Sticks");
		CookedFlesh = new ItemFoodBase(ItemIDs.CookedFleshID, 6, 0.6F, true).setUnlocalizedName("cookedFlesh");	
	}

	public static Item doorWoodSpruceItem;
	public static Item doorWoodBirchItem;
	public static Item doorWoodJungleItem;
	public static Item GoldDoorItem;
	public static Item NewStick;
	public static Item CookedFlesh;

}
