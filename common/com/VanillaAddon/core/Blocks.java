package com.VanillaAddon.core;

import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;

import com.VanillaAddon.block.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks 
{	
	public static void init()
	{
		doorWoodSpruce = new BlockBaseDoor(BlockIDs.doorWoodSpruceID, Material.wood).setUnlocalizedName("doorWoodSpruce").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(doorWoodSpruce);
		doorWoodBirch = new BlockBaseDoor(BlockIDs.doorWoodBirchID,  Material.wood).setUnlocalizedName("doorWoodBirch").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(doorWoodBirch);
		doorWoodJungle = new BlockBaseDoor(BlockIDs.doorWoodJungleID, Material.wood).setUnlocalizedName("doorWoodJungle").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(doorWoodJungle);
		pressurePlateobsidian = new BlockPressurePlate(BlockIDs.pressurePlateobsidianID, "obsidian", Material.rock, EnumMobType.players).setUnlocalizedName("ObsidianPressurePlate").setHardness(0.5F).setStepSound(Block.soundStoneFootstep);
		registerBlock(pressurePlateobsidian);
		IrontrapDoor = new BaseBlockTrapDoor(BlockIDs.IrontrapDoorID, Material.iron).setHardness(3F).setResistance(0.7F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("trapdoor_iron");
		registerBlock(IrontrapDoor);
		SpruceFence = new BaseBlockFence(BlockIDs.SpruceFenceID, Material.wood,"wood_spruce").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("SpruceFence");
		registerBlock(SpruceFence);
		BirchFence = new BaseBlockFence(BlockIDs.BirchFenceID,Material.wood,"wood_birch").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("BirchFence");
		registerBlock(BirchFence);
		JungleFence = new BaseBlockFence(BlockIDs.JungleFenceID,Material.wood,"wood_jungle").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("JungleFence");
		registerBlock(JungleFence);
		SpruceButton= new BlockButtonBase(BlockIDs.ButtonWoodSpruceID, "wood_spruce").setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("buttonSpruce");
		registerBlock(SpruceButton);
		BirchButton= new BlockButtonBase(BlockIDs.ButtonWoodBirchID, "wood_birch").setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("buttonBirch");
		registerBlock(BirchButton);
		JungleButton= new BlockButtonBase(BlockIDs.ButtonWoodJungleID, "wood_jungle").setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("buttonJungle");
		registerBlock(JungleButton);
		SprucePressurePlate = new BlockPressurePlate(BlockIDs.SprucePressurePlateID, "wood_spruce", Material.wood, EnumMobType.everything).setUnlocalizedName("SprucePressurePlate").setHardness(0.5F).setStepSound(Block.soundStoneFootstep);
		registerBlock(SprucePressurePlate);
		BirchPressurePlate= new BlockPressurePlate(BlockIDs.BirchPressurePlateID, "wood_birch", Material.wood, EnumMobType.everything).setUnlocalizedName("BirchPressurePlate").setHardness(0.5F).setStepSound(Block.soundStoneFootstep);
		registerBlock(BirchPressurePlate);
		JunglePressurePlate= new BlockPressurePlate(BlockIDs.JunglePressurePlateID, "wood_jungle", Material.wood, EnumMobType.everything).setUnlocalizedName("JunglePressurePlate").setHardness(0.5F).setStepSound(Block.soundStoneFootstep);
		registerBlock(JunglePressurePlate);
		
		Block.blocksList[47]= null;
		NewbookShelf = new BlockBookshelf(47).setHardness(1.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bookshelf");
		GameRegistry.registerBlock(NewbookShelf, ItemBlockBookshelf.class, NewbookShelf.getUnlocalizedName2());
		Block.blocksList[47]=NewbookShelf;
		Block.blocksList[58]=null;
	    workbench = new BlockWorkbenchOR(58).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("workbench");
		GameRegistry.registerBlock(workbench, ItemBlockBookshelf.class, workbench.getUnlocalizedName2());
		Block.blocksList[58]=workbench;
	
		//Block.blocksList[72]=null;
	   // pressurePlatePlanks = (new BlockPressurePlateOR(72, Material.wood, EnumMobType.everything)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("pressurePlate");
	    //GameRegistry.registerBlock(pressurePlatePlanks, ItemBlockBookshelf.class, pressurePlatePlanks.getUnlocalizedName2());
		//Block.blocksList[72]=pressurePlatePlanks;
		
	}
	
	
	public static void registerBlock(Block block)
	{
		 GameRegistry.registerBlock(block, block.getUnlocalizedName2());
	}
		
	
	public static Block pressurePlateobsidian;
	public static Block SpruceFence;
	public static Block BirchFence;
	public static Block JungleFence;
	public static Block doorWoodSpruce;
	public static Block doorWoodBirch;
	public static Block doorWoodJungle;
	public static Block SpruceButton;
	public static Block BirchButton;
	public static Block JungleButton;
	public static Block SprucePressurePlate;
	public static Block BirchPressurePlate;
	public static Block JunglePressurePlate;
	public static Block NewFence;
	public static Block NewbookShelf;
	public static Block IrontrapDoor;
	public static Block workbench;
	public static Block pressurePlatePlanks;
	
	
}