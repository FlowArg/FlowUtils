package fr.flowarg.flowutils.commands;

import fr.flowarg.flowutils.UtilObjects;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class CommandGetLight extends CommandBase
{
	private final String name = "getLight";
	
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
			UtilObjects.sendMessageToPlayer(player, UtilObjects.getLightLevel() + "");
		}
		else UtilObjects.sendYouMustToBeAPlayerToUseThisCommandToSender(sender);
	}

}
