package fr.flowarg.flowutils.core.proxy;

import org.lwjgl.input.Keyboard;

import fr.flowarg.flowutils.UtilClient;
import fr.flowarg.flowutils.UtilObjects;
import fr.flowarg.flowutils.core.EnumStatus;
import fr.flowarg.flowutils.core.Main;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author FlowArg
 * @since 0.1.4
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{	
    private String cdc = null;
    private final KeyBinding keyBindModVersion;
    private final KeyBinding keyBindLight;
    
    @Override
    public void preInit()
    {
    	Main.LOGGER.info("FMLPreInitializationEvent Client -> " + EnumStatus.LOADING.toString());
    	super.preInit();
    	UtilClient.addOBJCompatibility(Main.MODID);
    	Main.LOGGER.info("FMLPreInitializationEvent Client -> " + EnumStatus.OK.toString());
    }
    
    @Override
    public void init()
    {
        Main.LOGGER.info("FMLInitializationEvent Client -> " + EnumStatus.LOADING.toString());
        super.init();
        Main.LOGGER.info("FMLInitializationEvent Client -> " + EnumStatus.OK.toString());
    }
    
    @Override
    public void postInit()
    {
        Main.LOGGER.info("FMLPostInitializationEvent Client -> " + EnumStatus.LOADING.toString());
        super.postInit();
        Main.LOGGER.info("FMLPostInitializationEvent Client -> " + EnumStatus.OK.toString());
    }

    public ClientProxy()
    {
    	MinecraftForge.EVENT_BUS.register(this);
        keyBindModVersion = new KeyBinding("modversion.key", Keyboard.KEY_M, "key.categories.flowutils");
        keyBindLight = new KeyBinding("keylight.key", Keyboard.KEY_L, "key.categories.flowutils");

        registerKey(keyBindModVersion);
        registerKey(keyBindLight);
    }

    @SubscribeEvent
    public void renderGameOverlayText(RenderGameOverlayEvent.Text event)
    {
        if (keyBindModVersion.isKeyDown())
        {
            cdc = Main.NAME + " : " + Main.VERSION;
            event.getLeft().add(cdc);
        }
        if(keyBindLight.isKeyDown())
        {
        	cdc = UtilObjects.getLightLevel() + "";
        	event.getLeft().add(cdc);
        }
        else
        {
            cdc = null;
        }
    }

    private void registerKey(KeyBinding key)
    {
        ClientRegistry.registerKeyBinding(key);
    }
}
