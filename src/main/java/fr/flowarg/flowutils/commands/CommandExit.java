package fr.flowarg.flowutils.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandStop;
import net.minecraft.server.MinecraftServer;

public class CommandExit extends CommandStop
{
	private final String name = "exit";
	
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
	public int getRequiredPermissionLevel()
	{
		return super.getRequiredPermissionLevel();
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		super.execute(server, sender, args);
	}
}
