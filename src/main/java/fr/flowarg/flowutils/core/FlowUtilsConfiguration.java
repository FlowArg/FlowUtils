package fr.flowarg.flowutils.core;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class FlowUtilsConfiguration
{
	 public static File configFile;
	 public static Configuration config;
	 
	 public static boolean enableCommandExit;
	 public static boolean enableCommandGM;
	 public static boolean enableCommandID;
	 public static boolean enableCommandGetLight;
	 
	 public static void registerConfig(FMLPreInitializationEvent event)
	 {
		 configFile = new File(event.getModConfigurationDirectory() + "/" + Main.MODID);
		 configFile.mkdirs();
		 initConfig(new File(configFile.getPath(), Main.MODID + ".cfg"));
	 }
	 
	 public static void initConfig(File file)
	 {
		 config = new Configuration(file);
		 config.load();
		 
		 String category;
		 
		 category = "Commands";
		 config.addCustomCategoryComment(category, "Enable/Disable commands.");
		 enableCommandExit = config.getBoolean("Exit Command", category, true, "Enable or disable the exit command.");
		 enableCommandGM = config.getBoolean("GM Command", category, true, "Enable or disable the gm (shortcut of gamemode command) command.");
		 enableCommandID = config.getBoolean("ID Command", category, true, "Enable or disable the id command.");
		 enableCommandGetLight = config.getBoolean("Get Light Command", category, true, "Enable or disable the get light command.");
		 
		 if(config.hasChanged()) config.save();
	 }
}
