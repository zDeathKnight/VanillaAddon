package com.VanillaAddon;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.VanillaAddon.Side.CommonProxy;
import com.VanillaAddon.core.BlockIDs;
import com.VanillaAddon.core.Blocks;
import com.VanillaAddon.core.ItemIDs;
import com.VanillaAddon.core.Items;
import com.VanillaAddon.core.VanillaAddonRecipes;
import com.VanillaAddon.lang.Localizations;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true,serverSideRequired=false, channels={Reference.MOD_ID})

public class VanillaAddon {
	
	@Instance
	public static VanillaAddon instance = new VanillaAddon();
	
	
	public static boolean checkwebversion = true;
	@SuppressWarnings("unused")
	private String latestVersionId =null;
	
	@SidedProxy(clientSide = Reference.clientSide, serverSide = Reference.serverSide)
	public static CommonProxy porxy;
	
	@PreInit
	public void PreLoad(FMLPreInitializationEvent event) 
    {
		int i =3000;
    	FMLLog.info("["+Reference.MOD_NAME +"] PreLoad");
    	
    	Configuration c = new Configuration(event.getSuggestedConfigurationFile());
    	try
    	{
    		c.load();
    		BlockIDs.pressurePlateobsidianID = c.get("Block IDs","Obsidian Pressure Plate ID", i++).getInt();
    		BlockIDs.SpruceFenceID=c.get("Block IDs", "SpruceFenceID", i++).getInt();
    		BlockIDs.BirchFenceID=c.get("Block IDs", "BirchFenceID", i++).getInt();
    		BlockIDs.JungleFenceID=c.get("Block IDs", "JungleFenceID", i++).getInt();
    		ItemIDs.doorWoodSpruceItemID = c.get("Item IDs","doorWoodSpruceItemID",i++).getInt();
    		BlockIDs.doorWoodSpruceID =c.get("Block IDs", "doorWoodSpruceID", i++).getInt();
    		ItemIDs.doorWoodBirchItemID= c.get("Item IDs","doorWoodBirchItemID",i++).getInt();
    		BlockIDs.doorWoodBirchID= c.get("Block IDs","doorWoodBirchID",i++).getInt();
    		ItemIDs.doorWoodJungleItemID = c.get("Item IDs", "doorWoodJungleItemID", i++).getInt();
    		BlockIDs.doorWoodJungleID= c.get("Block IDs","doorWoodJungleID",i++).getInt();

    		checkwebversion = c.get("Settings", "Check webVersion", true).isBooleanValue();
    	}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
		}	
		finally
		{
			c.save();
		}
    	
    	
    }
	
	@Init
	public void load(FMLInitializationEvent event) 
    {
		Blocks.init();
		new Items();
		new VanillaAddonRecipes();
		
		Localizations.load();
    }
	
    

}
