package com.VanillaAddon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.VanillaAddon.Side.CommonProxy;
import com.VanillaAddon.Side.ConnectionHandler;
import com.VanillaAddon.api.VersionCompare;
import com.VanillaAddon.core.BlockIDs;
import com.VanillaAddon.core.Blocks;
import com.VanillaAddon.core.ItemIDs;
import com.VanillaAddon.core.Items;
import com.VanillaAddon.core.Reference;
import com.VanillaAddon.core.Setting;
import com.VanillaAddon.core.VanillaAddonRecipes;
import com.VanillaAddon.lang.Localizations;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true,serverSideRequired=false, channels={Reference.MOD_ID},connectionHandler=ConnectionHandler.class)

public class VanillaAddon {
	
	@Instance
	public static VanillaAddon instance = new VanillaAddon();

	public static boolean hasLatestVersion = true;
	private String latestVersionId;
	
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
    		BlockIDs.ObsidianPressurePlateID = c.get("Block IDs","Obsidian Pressure Plate ID", i++).getInt();
    		BlockIDs.SpruceFenceID=c.get("Block IDs", "SpruceFenceID", i++).getInt();
    		BlockIDs.BirchFenceID=c.get("Block IDs", "BirchFenceID", i++).getInt();
    		BlockIDs.JungleFenceID=c.get("Block IDs", "JungleFenceID", i++).getInt();
    		ItemIDs.SpruceDoorItemID = c.get("Item IDs","SpruceDoorItemID",i++).getInt();
    		BlockIDs.SpruceDoorID =c.get("Block IDs", "SpruceDoorID", i++).getInt();
    		ItemIDs.BirchDoorItemID= c.get("Item IDs","BirchDoorItemID",i++).getInt();
    		BlockIDs.BirchDoorID= c.get("Block IDs","BirchDoorID",i++).getInt();
    		ItemIDs.JungleDoorItemID = c.get("Item IDs", "JungleDoorItemID", i++).getInt();
    		BlockIDs.JungleDoorID= c.get("Block IDs","JungleDoorID",i++).getInt();
    		BlockIDs.ButtonWoodSpruceID= c.get("Block IDs","SpruceButtonID",i++).getInt();
    		BlockIDs.ButtonWoodBirchID = c.get("Block IDs","BirchButtonID",i++).getInt();
    		BlockIDs.ButtonWoodJungleID = c.get("Block IDs","JungleButtonID",i++).getInt();
    		BlockIDs.SprucePressurePlateID= c.get("Block IDs","SprucePressurePlateID",i++).getInt();
    		BlockIDs.BirchPressurePlateID = c.get("Block IDs","BirchPressurePlateID",i++).getInt();
    		BlockIDs.JunglePressurePlateID = c.get("Block IDs","JunglePressurePlateID",i++).getInt();
    		BlockIDs.IrontrapDoorID=c.get("Block IDs", "IronTrapDoorID", i++).getInt();
    		ItemIDs.NewStickID =  c.get("Item IDs", "Sticks", i++).getInt();
    		ItemIDs.CookedFleshID =  c.get("Item IDs", "CookedFleshID", i++).getInt();
    		BlockIDs.SpruceFenceGateID=c.get("Block IDs", "SpruceFenceGateID", i++).getInt();
    		BlockIDs.BirchFenceGateID=c.get("Block IDs", "BirchFenceGateID", i++).getInt();
    		BlockIDs.JungleFenceGateID=c.get("Block IDs", "JungleFenceGateID", i++).getInt();
    		BlockIDs.SpruceTrapDoorID=c.get("Block IDs", "SpruceTrapDoorID", i++).getInt();
    		BlockIDs.BirchTrapDoorID=c.get("Block IDs", "BirchTrapDoorID", i++).getInt();
    		BlockIDs.JungleTrapDoorID=c.get("Block IDs", "JungleTrapDoorID", i++).getInt();
    		BlockIDs.GoldDoorID = c.get("Block IDs", "GoldDoorID", i++).getInt();
    		ItemIDs.GoldDoorItemID = c.get("Item IDs", "GoldDoorItemID", i++).getInt();
    		
    		Setting.UpdateVersionCheck = c.get("Settings", "UpdateVersionCheck", true).isBooleanValue();
    		Setting.FenceFixMod= c.get("Settings", "FenceFixMod", true).isBooleanValue();
    		Setting.LogTreeFix= c.get("Settings", "LogTreeFix", true).isBooleanValue();
    		
    	}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
		}	
		finally
		{
			c.save();
		}
    	
    	try {
			latestVersionId = VersionCompare.getLatestVersionFromWeb();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(VersionCompare.compare( latestVersionId, Reference.VERSION ) > 0){	
			hasLatestVersion = false;
		}
    	
    }
	
	@Init
	public void load(FMLInitializationEvent event) 
    {
		Blocks.init();
		Items.init();
		VanillaAddonRecipes.init();
		Localizations.load();
    }
	
	protected void extractLang(String[] languages)
	{
		String langResourceBase = "/" + getConfigBaseFolder() + "/" + Reference.MOD_NAME + "/lang/";
		for(String lang : languages)
		{
			InputStream is = this.getClass().getResourceAsStream(langResourceBase + lang + ".lang");
			try
			{
				OutputStream os = new FileOutputStream(_configFolder.getAbsolutePath() + "/" + lang + ".lang");
				byte[] buffer = new byte[1024];
				int read = 0;
				while((read = is.read(buffer)) != -1)
				{
					os.write(buffer, 0, read);
				}
				is.close();
				os.flush();
				os.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) 
	{
		FMLLog.info("["+Reference.MOD_NAME+"] postInit");
	}
	
	protected void loadLang()
	{
		for(File langFile : _configFolder.listFiles(new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".lang");
			}
		}))
		{
			try
			{
				Properties langPack = new Properties();
				langPack.load(new FileInputStream(langFile));
				String lang = langFile.getName().replace(".lang", "");
				LanguageRegistry.instance().addStringLocalization(langPack, lang);
			}
			catch(FileNotFoundException x)
			{
				x.printStackTrace();
			}
			catch(IOException x)
			{
				x.printStackTrace();
			}
		}
	}
	
	protected String getConfigBaseFolder()
	{
		return "powercrystals";
	}
	
	protected void setConfigFolderBase(File folder)
	{
		_configFolder = new File(folder.getAbsolutePath() + "/" + getConfigBaseFolder() + "/" + Reference.MOD_NAME + "/");
	}
	protected File _configFolder;
	
    

}
