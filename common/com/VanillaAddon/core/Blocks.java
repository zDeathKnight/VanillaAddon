package com.VanillaAddon.core;

import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;

import com.VanillaAddon.block.BaseBlockFence;
import com.VanillaAddon.block.BaseBlockTrapDoor;
import com.VanillaAddon.block.BlockBaseDoor;
import com.VanillaAddon.block.BlockPressurePlate;

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
	public static Block IrontrapDoor;
	
	
}