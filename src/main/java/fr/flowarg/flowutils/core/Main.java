package fr.flowarg.flowutils.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.flowarg.flowutils.UtilObjects;
import fr.flowarg.flowutils.commands.CommandExit;
import fr.flowarg.flowutils.commands.CommandGM;
import fr.flowarg.flowutils.commands.CommandGetLight;
import fr.flowarg.flowutils.commands.CommandID;
import fr.flowarg.flowutils.core.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author FlowArg
 * @since 0.1.0
 * @see net.minecraftforge.fml.common.Mod
 */
@Mod(modid = Main.MODID, canBeDeactivated = false, clientSideOnly = false, modLanguage = "java", name = Main.NAME, version = Main.VERSION, serverSideOnly = false, guiFactory = "fr.flowarg.flowutils.core.GUIFactory")
public class Main
{
	public static final String NAME = "Flow Utils";
	public static final String MODID = "flowutils";
	public static final String VERSION = "0.1.4";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Instance(MODID)
	public static Main main;
	
	@SidedProxy(modId = MODID, clientSide = "fr.flowarg.flowutils.core.proxy.ClientProxy", serverSide = "fr.flowarg.flowutils.core.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	public Main()
	{
		LOGGER.info("Main -> " + EnumStatus.LOADING);
		MinecraftForge.EVENT_BUS.register(Main.class);
		LOGGER.info("ListOfBlocks -> " + EnumStatus.INITIALIZING);
		UtilObjects.UtilBlocks.ListOfBlocks.init();
		LOGGER.info("ListOfBlocks -> " + EnumStatus.INITIALIZED);
		LOGGER.info("ListOfItems -> " + EnumStatus.INITIALIZING);
		UtilObjects.UtilItems.ListOfItems.init();
		LOGGER.info("ListOfItems -> " + EnumStatus.INITIALIZED);
		LOGGER.info("Main -> " + EnumStatus.OK);
	}
	
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        LOGGER.info("FMLPreInitializationEvent -> " + EnumStatus.LOADING);
        proxy.preInit();
		LOGGER.info("FlowUtilsConfiguration -> " + EnumStatus.REGISTERING);
		FlowUtilsConfiguration.registerConfig(event);
		LOGGER.info("FlowUtilsConfiguration -> " + EnumStatus.REGISTERED);
        LOGGER.info("FMLPreInitializationEvent -> " + EnumStatus.OK);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        LOGGER.info("FMLInitializationEvent -> " + EnumStatus.LOADING);
        proxy.init();
        LOGGER.info("FMLInitializationEvent -> " + EnumStatus.OK);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        LOGGER.info("FMLPostInitializationEvent -> " + EnumStatus.LOADING);
        proxy.postInit();
        LOGGER.info("FMLPostInitializationEvent -> " + EnumStatus.OK);
    }
    
    
	@EventHandler
	public static void onServerStarting(FMLServerStartingEvent event)
	{
		LOGGER.info("FMLServerStartingEvent -> " + EnumStatus.LOADING);
		
		if(FlowUtilsConfiguration.enableCommandExit)
		{
			LOGGER.info("CommandExit -> " + EnumStatus.REGISTERING);
			event.registerServerCommand(new CommandExit());
			LOGGER.info("CommandExit -> " + EnumStatus.REGISTERED);
		}
		
		if(FlowUtilsConfiguration.enableCommandGM)
		{
			LOGGER.info("CommandGM -> " + EnumStatus.REGISTERING);
			event.registerServerCommand(new CommandGM());
			LOGGER.info("CommandGM -> " + EnumStatus.REGISTERED);
		}
		
		if(FlowUtilsConfiguration.enableCommandID)
		{
			LOGGER.info("CommandID -> " + EnumStatus.REGISTERING);
			event.registerServerCommand(new CommandID());
			LOGGER.info("CommandID -> " + EnumStatus.REGISTERED);
		}
		
		if(FlowUtilsConfiguration.enableCommandGetLight)
		{
			LOGGER.info("CommandGetLight -> " + EnumStatus.REGISTERING);
			event.registerServerCommand(new CommandGetLight());
			LOGGER.info("CommandGetLight -> " + EnumStatus.REGISTERED);
		}

		LOGGER.info("FMLServerStartingEvent -> " + EnumStatus.OK);
	}

    @EventHandler
    public static void onServerStarted(FMLServerStartedEvent event)
    {
        LOGGER.info("FMLServerStartedEvent -> " + EnumStatus.LOADING);
        LOGGER.info("Server -> " + EnumStatus.STARTED);
        LOGGER.info("FMLServerStartedEvent -> " + EnumStatus.OK);
    }

    @EventHandler
    public static void onServerStopping(FMLServerStoppingEvent event)
    {
        LOGGER.info("FMLServerStoppingEvent -> " + EnumStatus.LOADING);
        LOGGER.info("Server -> " + EnumStatus.STOPPING);
        LOGGER.info("FMLServerStoppingEvent -> " + EnumStatus.OK);
    }

    @EventHandler
    public static void onServerStopped(FMLServerStoppedEvent event)
    {
        LOGGER.info("FMLServerStoppedEvent -> " + EnumStatus.LOADING);
        LOGGER.info("Server -> " + EnumStatus.STOPPED);
        LOGGER.info("FMLServerStoppedEvent -> " + EnumStatus.OK);
    }
    
    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equals(MODID))
        {
            if (FlowUtilsConfiguration.config.hasChanged())
            {
            	FlowUtilsConfiguration.config.save();
            }
        }
    }
}
