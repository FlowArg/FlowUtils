package fr.flowarg.flowutils;

import fr.flowarg.flowutils.core.EnumStatus;
import fr.flowarg.flowutils.core.Main;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class UtilClient
{
    @SideOnly(Side.CLIENT)
    public static void addOBJCompatibility(String modid)
    {
    	Main.LOGGER.info(".obj compatibility for '" + modid + "' -> " + EnumStatus.ADDING);
    	OBJLoader.INSTANCE.addDomain(modid);
    	Main.LOGGER.info(".obj compatibility for '" + modid + "' -> " + EnumStatus.ADDED);
    }
}
