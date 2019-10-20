package fr.flowarg.flowutils;

import fr.flowarg.flowutils.commands.CommandExit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * @author FlowArg
 * @since 0.1.0
 * @see net.minecraftforge.fml.common.Mod
 */
@Mod(modid = Main.MODID, canBeDeactivated = false, clientSideOnly = false, modLanguage = "java", name = Main.NAME, version = Main.VERSION, serverSideOnly = false)
public class Main
{
	public static final String NAME = "Flow Utils";
	public static final String MODID = "flowutils";
	public static final String VERSION = "0.1.0";
	
	@Instance(MODID)
	public static Main main;
	
	@EventHandler
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandExit());
	}
}