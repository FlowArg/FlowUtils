package fr.flowarg.flowutils.commands;

import fr.flowarg.flowutils.UtilObjects;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextFormatting;

public class CommandID extends CommandBase
{
	private final String name = "id";
	
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getUsage(ICommandSender sender)
    {
        return this.name;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if(sender instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)sender;

            if (player.inventory.hasItemStack(player.inventory.getCurrentItem()))
            {
                Item item = UtilObjects.UtilItems.getItemFromItemStack(player.inventory.getCurrentItem());
                int itemID = Item.getIdFromItem(item);
                UtilObjects.sendMessageToPlayer(player, TextFormatting.DARK_GREEN + "Id of " + item.getItemStackDisplayName(new ItemStack(item)) + " is : " + itemID);
            }
            else
            {
                UtilObjects.sendMessageToPlayer(player, TextFormatting.DARK_GREEN + "Id of Air is : 0 !");
            }
        }
        else
        {
            UtilObjects.sendYouMustToBeAPlayerToUseThisCommandToSender(sender);
        }
    }
}
