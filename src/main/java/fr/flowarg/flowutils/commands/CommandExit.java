package fr.flowarg.flowutils.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandStop;
import net.minecraft.server.MinecraftServer;

public class CommandExit extends CommandStop
{
	@Override
	public String getName()
	{
		return "exit";
	}
	
	@Override
	public String getUsage(ICommandSender sender)
	{
		return "exit";
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		super.execute(server, sender, args);
	}
}
