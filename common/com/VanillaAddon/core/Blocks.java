package com.VanillaAddon.core;

import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;

import com.VanillaAddon.TileEntity.TileEntityChestSpruce;
import com.VanillaAddon.block.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks 
{	
	public static void init()
	{
		SpruceDoor = new BlockBaseDoor(BlockIDs.SpruceDoorID, Material.wood).setUnlocalizedName("doorWoodSpruce").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(SpruceDoor);
		BirchDoor = new BlockBaseDoor(BlockIDs.BirchDoorID,  Material.wood).setUnlocalizedName("doorWoodBirch").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(BirchDoor);
		JungleDoor = new BlockBaseDoor(BlockIDs.JungleDoorID, Material.wood).setUnlocalizedName("doorWoodJungle").setHardness(3.0F).setStepSound(Block.soundWoodFootstep);
		registerBlock(JungleDoor);
		pressurePlateobsidian = new BlockPressurePlate(BlockIDs.ObsidianPressurePlateID, "obsidian", Material.rock, EnumMobType.players).setUnlocalizedName("ObsidianPressurePlate").setHardness(0.5F).setStepSound(Block.soundStoneFootstep);
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
		
		SpruceFenceGate = (new BlockFenceGatebase(BlockIDs.SpruceFenceGateID,"wood_spruce")).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("SpruceFenceGate");
		registerBlock(SpruceFenceGate);
		BirchFenceGate = (new BlockFenceGatebase(BlockIDs.BirchFenceGateID,"wood_birch")).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("BirchFenceGate");
		registerBlock(BirchFenceGate);
		JungleFenceGate = (new BlockFenceGatebase(BlockIDs.JungleFenceGateID,"wood_jungle")).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("JungleFenceGate");
		registerBlock(JungleFenceGate);
		SpruceTrapDoor= new BaseBlockTrapDoor(BlockIDs.SpruceTrapDoorID).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("spruceTrapDoor");
		registerBlock(SpruceTrapDoor);
		BirchTrapDoor= new BaseBlockTrapDoor(BlockIDs.BirchTrapDoorID).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("birchTrapDoor");
		registerBlock(BirchTrapDoor);
		JungleTrapDoor= new BaseBlockTrapDoor(BlockIDs.JungleTrapDoorID).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("jungleTrapDoor");
		registerBlock(JungleTrapDoor);
		GoldDoor = new BlockBaseDoor(BlockIDs.GoldDoorID,Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("doorGold");
		registerBlock(GoldDoor);

		SpruceChest = new BlockChestSpruce(BlockIDs.SpruceChestID,0).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("SpruceChest");
		Registry.registerBlock(SpruceChest);
		GameRegistry.registerTileEntity(TileEntityChestSpruce.class, "TileEntityChestSpruce");
		
		if(Setting.FenceFixMod)
		{
			Block.blocksList[85] = null;
			Block.blocksList[85] = new BaseBlockFence(85, "wood").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("fence");
			Block.blocksList[113] = null;
			Block.blocksList[113] = new BaseBlockFence(113,Material.rock,"netherBrick").setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("netherFence");

		}
		if(Setting.LogTreeFix)
		{
			Block.blocksList[17]=null;
			log = new BlockLogOR(17).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log");
			Block.blocksList[17]=log;
		}
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
	public static Block SpruceDoor;
	public static Block BirchDoor;
	public static Block JungleDoor;
	public static Block GoldDoor;
	public static Block SpruceTrapDoor;
	public static Block BirchTrapDoor;
	public static Block JungleTrapDoor;
	public static Block SpruceButton;
	public static Block BirchButton;
	public static Block JungleButton;
	public static Block SprucePressurePlate;
	public static Block BirchPressurePlate;
	public static Block JunglePressurePlate;
	public static Block SpruceFenceGate;
	public static Block BirchFenceGate;
	public static Block JungleFenceGate;
	public static Block Fence;
	public static Block NewbookShelf;
	public static Block IrontrapDoor;
	public static Block SpruceChest;
	public static Block BirchChest;
	public static Block JungleChest;

	public static Block workbench;
	public static Block log;
	
	
}