package fr.flowarg.flowutils;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class UtilObjects
{
    public static boolean isStackEqualToAnotherStack(ItemStack stack1, ItemStack stack2)
    {
        return stack1 == stack2;
    }
    public static boolean isStackEqualToItem(ItemStack stack, Item item)
    {
        return stack.equals(new ItemStack(item));
    }
    public static boolean isStackEqualToBlock(ItemStack stack, Block block)
    {
        return stack.equals(new ItemStack(block));
    }

    public static ItemStack getItemStackFromItem(Item item)
    {
        return new ItemStack(item);
    }
    public static ItemStack getItemStackFromBlock(Block block)
    {
        return new ItemStack(block);
    }
    public static Item getItemFromItemStack(ItemStack item)
    {
        return item.getItem();
    }

    public static boolean isEntityEqualToAnotherEntity(Entity entity1, Entity entity2)
    {
        return entity1 == entity2;
    }

    public static IBlockState getStateFromBlock(Block block)
    {
        return block.getDefaultState();
    }

    public static void registerBlock(List<Block> listBlocks, List<Item> listItems, Block block)
    {
        listBlocks.add(block);
        listItems.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    
    public static void registerItem(List<Item> listItems, Item item)
    {
        listItems.add(item);
    }

    public static void sendMessageToPlayer(EntityPlayer player, String msg)
    {
        player.sendMessage(new TextComponentString(msg));
    }
    public static void sendMessageToSender(ICommandSender sender, String msg)
    {
        sender.sendMessage(new TextComponentString(msg));
    }
    public static void sendYouMustToBeAPlayerToUseThisCommandToSender(ICommandSender sender)
    {
        sender.sendMessage(new TextComponentString(TextFormatting.DARK_RED + "You must to be a player to use this command."));
    }

    public static void setEntityCustomNameTag(Entity entity, String name)
    {
        entity.setCustomNameTag(name);
    }
    public static void setPlayerCustomNameTag(EntityPlayer player, String name)
    {
        player.setCustomNameTag(name);
    }
    public static void setEntityLivingBaseCustomNameTag(EntityLivingBase livingBase, String name)
    {
        livingBase.setCustomNameTag(name);
    }
}
