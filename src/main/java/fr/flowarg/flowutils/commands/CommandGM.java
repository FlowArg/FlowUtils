package fr.flowarg.flowutils.commands;

import java.util.Collections;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.CommandGameMode;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.GameType;

public class CommandGM extends CommandGameMode
{
	private final String name = "gm";
	
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return super.getRequiredPermissionLevel();
    }

    @Override
    public String getUsage(ICommandSender sender)
    {
        return this.name;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if (args.length <= 0)
        {
            throw new WrongUsageException("/gm <mode> [player]", new Object[0]);
        }
        else
        {
            GameType gametype = this.getGameModeFromCommand(sender, args[0]);
            EntityPlayer entityplayer = args.length >= 2 ? getPlayer(server, sender, args[1]) : getCommandSenderAsPlayer(sender);
            entityplayer.setGameType(gametype);
            ITextComponent itextcomponent = new TextComponentTranslation("gameMode." + gametype.getName(), new Object[0]);

            if (sender.getEntityWorld().getGameRules().getBoolean("sendCommandFeedback"))
            {
                entityplayer.sendMessage(new TextComponentTranslation("gameMode.changed", new Object[] {itextcomponent}));
            }

            if (entityplayer == sender)
            {
                notifyCommandListener(sender, this, 1, "commands.gamemode.success.self", new Object[] {itextcomponent});
            }
            else
            {
                notifyCommandListener(sender, this, 1, "commands.gamemode.success.other", new Object[] {entityplayer.getName(), itextcomponent});
            }
        }
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos)
    {
        if (args.length == 1)
        {
            return getListOfStringsMatchingLastWord(args, new String[] {"survival", "creative", "adventure", "spectator"});
        }
        else
        {
            return args.length == 2 ? getListOfStringsMatchingLastWord(args, server.getOnlinePlayerNames()) : Collections.emptyList();
        }
    }
}
