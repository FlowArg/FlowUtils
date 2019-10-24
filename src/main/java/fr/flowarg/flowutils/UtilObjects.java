package fr.flowarg.flowutils;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * @author FlowArg
 * @since 0.1.0
 */
public class UtilObjects
{
    public static boolean isStackEqualToAnotherStack(ItemStack stack1, ItemStack stack2)
    {
        return stack1 == stack2;
    }

    public static boolean isEntityEqualToAnotherEntity(Entity entity1, Entity entity2)
    {
        return entity1 == entity2;
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
    public static IntegratedServer getIntegratedServer()
    {
    	return Minecraft.getMinecraft().getIntegratedServer();
    }
    public static MinecraftServer getMinecraftServer()
    {
    	return Minecraft.getMinecraft().world.getMinecraftServer();
    }
    
    /**
     * @author FlowArg
     * @since 0.1.3
     */
    public static class UtilBlocks
    {
        public static boolean isStackEqualToBlock(ItemStack stack, Block block)
        {
            return stack.equals(new ItemStack(block));
        }
        public static ItemStack getItemStackFromBlock(Block block)
        {
            return new ItemStack(block);
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
        
        /**
         * @author FlowArg
         * @since 0.1.3
         */
        public static class ListOfBlocks
        {
        	public static final List<Block> BLOCKS = new ArrayList<Block>();
        	
        	public static void init()
        	{
        		addToTheList(Blocks.ACACIA_DOOR);
        		addToTheList(Blocks.ACACIA_FENCE);
        		addToTheList(Blocks.ACACIA_FENCE_GATE);
        		addToTheList(Blocks.ACACIA_STAIRS);
        		addToTheList(Blocks.ACTIVATOR_RAIL);
        		addToTheList(Blocks.AIR);
        		addToTheList(Blocks.ANVIL);
        		addToTheList(Blocks.BARRIER);
        		addToTheList(Blocks.BEACON);
        		addToTheList(Blocks.BED);
        		addToTheList(Blocks.BEDROCK);
        		addToTheList(Blocks.BEETROOTS);
        		addToTheList(Blocks.BIRCH_DOOR);
        		addToTheList(Blocks.BIRCH_FENCE);
        		addToTheList(Blocks.BIRCH_FENCE_GATE);
        		addToTheList(Blocks.BIRCH_STAIRS);
        		addToTheList(Blocks.BLACK_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.BLACK_SHULKER_BOX);
        		addToTheList(Blocks.BLUE_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.BLUE_SHULKER_BOX);
        		addToTheList(Blocks.BONE_BLOCK);
        		addToTheList(Blocks.BOOKSHELF);
        		addToTheList(Blocks.BREWING_STAND);
        		addToTheList(Blocks.BRICK_BLOCK);
        		addToTheList(Blocks.BRICK_STAIRS);
        		addToTheList(Blocks.BROWN_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.BROWN_MUSHROOM);
        		addToTheList(Blocks.BROWN_MUSHROOM_BLOCK);
        		addToTheList(Blocks.BROWN_SHULKER_BOX);
        		addToTheList(Blocks.CACTUS);
        		addToTheList(Blocks.CAKE);
        		addToTheList(Blocks.CARPET);
        		addToTheList(Blocks.CARROTS);
        		addToTheList(Blocks.CAULDRON);
        		addToTheList(Blocks.CHAIN_COMMAND_BLOCK);
        		addToTheList(Blocks.CHEST);
        		addToTheList(Blocks.CHORUS_FLOWER);
        		addToTheList(Blocks.CHORUS_PLANT);
        		addToTheList(Blocks.CLAY);
        		addToTheList(Blocks.COAL_BLOCK);
        		addToTheList(Blocks.COAL_ORE);
        		addToTheList(Blocks.COBBLESTONE);
        		addToTheList(Blocks.COBBLESTONE_WALL);
        		addToTheList(Blocks.COCOA);
        		addToTheList(Blocks.COMMAND_BLOCK);
        		addToTheList(Blocks.CONCRETE);
        		addToTheList(Blocks.CONCRETE_POWDER);
        		addToTheList(Blocks.CRAFTING_TABLE);
        		addToTheList(Blocks.CYAN_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.CYAN_SHULKER_BOX);
        		addToTheList(Blocks.DARK_OAK_DOOR);
        		addToTheList(Blocks.DARK_OAK_FENCE);
        		addToTheList(Blocks.DARK_OAK_FENCE_GATE);
        		addToTheList(Blocks.DARK_OAK_STAIRS);
        		addToTheList(Blocks.DAYLIGHT_DETECTOR);
        		addToTheList(Blocks.DAYLIGHT_DETECTOR_INVERTED);
        		addToTheList(Blocks.DEADBUSH);
        		addToTheList(Blocks.DETECTOR_RAIL);
        		addToTheList(Blocks.DIAMOND_BLOCK);
        		addToTheList(Blocks.DIAMOND_ORE);
        		addToTheList(Blocks.DIRT);
        		addToTheList(Blocks.DISPENSER);
        		addToTheList(Blocks.DOUBLE_PLANT);
        		addToTheList(Blocks.DOUBLE_STONE_SLAB);
        		addToTheList(Blocks.DOUBLE_STONE_SLAB2);
        		addToTheList(Blocks.DOUBLE_WOODEN_SLAB);
        		addToTheList(Blocks.DRAGON_EGG);
        		addToTheList(Blocks.DROPPER);
        		addToTheList(Blocks.EMERALD_BLOCK);
        		addToTheList(Blocks.EMERALD_ORE);
        		addToTheList(Blocks.ENCHANTING_TABLE);
        		addToTheList(Blocks.END_BRICKS);
        		addToTheList(Blocks.END_GATEWAY);
        		addToTheList(Blocks.END_PORTAL);
        		addToTheList(Blocks.END_PORTAL_FRAME);
        		addToTheList(Blocks.END_ROD);
        		addToTheList(Blocks.END_STONE);
        		addToTheList(Blocks.ENDER_CHEST);
        		addToTheList(Blocks.FARMLAND);
        		addToTheList(Blocks.FIRE);
        		addToTheList(Blocks.FLOWER_POT);
        		addToTheList(Blocks.FLOWING_LAVA);
        		addToTheList(Blocks.FLOWING_WATER);
        		addToTheList(Blocks.FROSTED_ICE);
        		addToTheList(Blocks.FURNACE);
        		addToTheList(Blocks.GLASS);
        		addToTheList(Blocks.GLASS_PANE);
        		addToTheList(Blocks.GLOWSTONE);
        		addToTheList(Blocks.GOLD_BLOCK);
        		addToTheList(Blocks.GOLD_ORE);
        		addToTheList(Blocks.GOLDEN_RAIL);
        		addToTheList(Blocks.GRASS);
        		addToTheList(Blocks.GRASS_PATH);
        		addToTheList(Blocks.GRAVEL);
        		addToTheList(Blocks.GRAY_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.GRAY_SHULKER_BOX);
        		addToTheList(Blocks.GREEN_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.GREEN_SHULKER_BOX);
        		addToTheList(Blocks.HARDENED_CLAY);
        		addToTheList(Blocks.HAY_BLOCK);
        		addToTheList(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
        		addToTheList(Blocks.HOPPER);
        		addToTheList(Blocks.ICE);
        		addToTheList(Blocks.IRON_BARS);
        		addToTheList(Blocks.IRON_BLOCK);
        		addToTheList(Blocks.IRON_DOOR);
        		addToTheList(Blocks.IRON_ORE);
        		addToTheList(Blocks.IRON_TRAPDOOR);
        		addToTheList(Blocks.JUKEBOX);
        		addToTheList(Blocks.JUNGLE_DOOR);
        		addToTheList(Blocks.JUNGLE_FENCE);
        		addToTheList(Blocks.JUNGLE_FENCE_GATE);
        		addToTheList(Blocks.JUNGLE_STAIRS);
        		addToTheList(Blocks.LADDER);
        		addToTheList(Blocks.LAPIS_BLOCK);
        		addToTheList(Blocks.LAPIS_ORE);
        		addToTheList(Blocks.LAVA);
        		addToTheList(Blocks.LEAVES);
        		addToTheList(Blocks.LEAVES2);
        		addToTheList(Blocks.LEVER);
        		addToTheList(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.LIGHT_BLUE_SHULKER_BOX);
        		addToTheList(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
        		addToTheList(Blocks.LIME_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.LIME_SHULKER_BOX);
        		addToTheList(Blocks.LIT_FURNACE);
        		addToTheList(Blocks.LIT_PUMPKIN);
        		addToTheList(Blocks.LIT_REDSTONE_LAMP);
        		addToTheList(Blocks.LIT_REDSTONE_ORE);
        		addToTheList(Blocks.LOG);
        		addToTheList(Blocks.LOG2);
        		addToTheList(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.MAGENTA_SHULKER_BOX);
        		addToTheList(Blocks.MAGMA);
        		addToTheList(Blocks.MELON_BLOCK);
        		addToTheList(Blocks.MELON_STEM);
        		addToTheList(Blocks.MOB_SPAWNER);
        		addToTheList(Blocks.MONSTER_EGG);
        		addToTheList(Blocks.MOSSY_COBBLESTONE);
        		addToTheList(Blocks.MYCELIUM);
        		addToTheList(Blocks.NETHER_BRICK);
        		addToTheList(Blocks.NETHER_BRICK_FENCE);
        		addToTheList(Blocks.NETHER_BRICK_STAIRS);
        		addToTheList(Blocks.NETHER_WART);
        		addToTheList(Blocks.NETHER_WART_BLOCK);
        		addToTheList(Blocks.NETHERRACK);
        		addToTheList(Blocks.NOTEBLOCK);
        		addToTheList(Blocks.OAK_DOOR);
        		addToTheList(Blocks.OAK_FENCE);
        		addToTheList(Blocks.OAK_FENCE_GATE);
        		addToTheList(Blocks.OAK_STAIRS);
        		addToTheList(Blocks.OBSERVER);
        		addToTheList(Blocks.OBSIDIAN);
        		addToTheList(Blocks.ORANGE_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.ORANGE_SHULKER_BOX);
        		addToTheList(Blocks.PACKED_ICE);
        		addToTheList(Blocks.PINK_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.PINK_SHULKER_BOX);
        		addToTheList(Blocks.PISTON);
        		addToTheList(Blocks.PISTON_EXTENSION);
        		addToTheList(Blocks.PISTON_HEAD);
        		addToTheList(Blocks.PLANKS);
        		addToTheList(Blocks.PORTAL);
        		addToTheList(Blocks.POTATOES);
        		addToTheList(Blocks.POWERED_COMPARATOR);
        		addToTheList(Blocks.POWERED_REPEATER);
        		addToTheList(Blocks.PRISMARINE);
        		addToTheList(Blocks.PUMPKIN);
        		addToTheList(Blocks.PUMPKIN_STEM);
        		addToTheList(Blocks.PURPLE_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.PURPLE_SHULKER_BOX);
        		addToTheList(Blocks.PURPUR_BLOCK);
        		addToTheList(Blocks.PURPUR_DOUBLE_SLAB);
        		addToTheList(Blocks.PURPUR_PILLAR);
        		addToTheList(Blocks.PURPUR_SLAB);
        		addToTheList(Blocks.PURPUR_STAIRS);
        		addToTheList(Blocks.QUARTZ_BLOCK);
        		addToTheList(Blocks.QUARTZ_ORE);
        		addToTheList(Blocks.QUARTZ_STAIRS);
        		addToTheList(Blocks.RAIL);
        		addToTheList(Blocks.RED_FLOWER);
        		addToTheList(Blocks.RED_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.RED_MUSHROOM);
        		addToTheList(Blocks.RED_MUSHROOM_BLOCK);
        		addToTheList(Blocks.RED_NETHER_BRICK);
        		addToTheList(Blocks.RED_SANDSTONE);
        		addToTheList(Blocks.RED_SANDSTONE_STAIRS);
        		addToTheList(Blocks.RED_SHULKER_BOX);
        		addToTheList(Blocks.REDSTONE_BLOCK);
        		addToTheList(Blocks.REDSTONE_LAMP);
        		addToTheList(Blocks.REDSTONE_ORE);
        		addToTheList(Blocks.REDSTONE_TORCH);
        		addToTheList(Blocks.REDSTONE_WIRE);
        		addToTheList(Blocks.REEDS);
        		addToTheList(Blocks.REPEATING_COMMAND_BLOCK);
        		addToTheList(Blocks.SAND);
        		addToTheList(Blocks.SANDSTONE);
        		addToTheList(Blocks.SANDSTONE_STAIRS);
        		addToTheList(Blocks.SAPLING);
        		addToTheList(Blocks.SEA_LANTERN);
        		addToTheList(Blocks.SILVER_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.SILVER_SHULKER_BOX);
        		addToTheList(Blocks.SKULL);
        		addToTheList(Blocks.SLIME_BLOCK);
        		addToTheList(Blocks.SNOW);
        		addToTheList(Blocks.SNOW_LAYER);
        		addToTheList(Blocks.SOUL_SAND);
        		addToTheList(Blocks.SPONGE);
        		addToTheList(Blocks.SPRUCE_DOOR);
        		addToTheList(Blocks.SPRUCE_FENCE);
        		addToTheList(Blocks.SPRUCE_FENCE_GATE);
        		addToTheList(Blocks.SPRUCE_STAIRS);
        		addToTheList(Blocks.STAINED_GLASS);
        		addToTheList(Blocks.STAINED_GLASS_PANE);
        		addToTheList(Blocks.STAINED_HARDENED_CLAY);
        		addToTheList(Blocks.STANDING_BANNER);
        		addToTheList(Blocks.STANDING_SIGN);
        		addToTheList(Blocks.STICKY_PISTON);
        		addToTheList(Blocks.STONE);
        		addToTheList(Blocks.STONE_BRICK_STAIRS);
        		addToTheList(Blocks.STONE_BUTTON);
        		addToTheList(Blocks.STONE_PRESSURE_PLATE);
        		addToTheList(Blocks.STONE_SLAB);
        		addToTheList(Blocks.STONE_SLAB2);
        		addToTheList(Blocks.STONE_STAIRS);
        		addToTheList(Blocks.STONEBRICK);
        		addToTheList(Blocks.STRUCTURE_BLOCK);
        		addToTheList(Blocks.STRUCTURE_VOID);
        		addToTheList(Blocks.TALLGRASS);
        		addToTheList(Blocks.TNT);
        		addToTheList(Blocks.TORCH);
        		addToTheList(Blocks.TRAPDOOR);
        		addToTheList(Blocks.TRAPPED_CHEST);
        		addToTheList(Blocks.TRIPWIRE);
        		addToTheList(Blocks.TRIPWIRE_HOOK);
        		addToTheList(Blocks.UNLIT_REDSTONE_TORCH);
        		addToTheList(Blocks.UNPOWERED_COMPARATOR);
        		addToTheList(Blocks.UNPOWERED_REPEATER);
        		addToTheList(Blocks.VINE);
        		addToTheList(Blocks.WALL_BANNER);
        		addToTheList(Blocks.WALL_SIGN);
        		addToTheList(Blocks.WATER);
        		addToTheList(Blocks.WATERLILY);
        		addToTheList(Blocks.WEB);
        		addToTheList(Blocks.WHEAT);
        		addToTheList(Blocks.WHITE_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.WHITE_SHULKER_BOX);
        		addToTheList(Blocks.WOODEN_BUTTON);
        		addToTheList(Blocks.WOODEN_PRESSURE_PLATE);
        		addToTheList(Blocks.WOODEN_SLAB);
        		addToTheList(Blocks.WOOL);
        		addToTheList(Blocks.YELLOW_FLOWER);
        		addToTheList(Blocks.YELLOW_GLAZED_TERRACOTTA);
        		addToTheList(Blocks.YELLOW_SHULKER_BOX);
        	}
        	
        	private static void addToTheList(Block block)
        	{
        		BLOCKS.add(block);
        	}
        }
    }
    
    /**
     * @author FlowArg
     * @since 0.1.3
     */
    public static class UtilItems
    {
        public static boolean isStackEqualToItem(ItemStack stack, Item item)
        {
            return stack.equals(new ItemStack(item));
        }
        public static ItemStack getItemStackFromItem(Item item)
        {
            return new ItemStack(item);
        }
        public static Item getItemFromItemStack(ItemStack item)
        {
            return item.getItem();
        }
        public static void registerItem(List<Item> listItems, Item item)
        {
            listItems.add(item);
        }
        
        /**
         * @author FlowArg
         * @since 0.1.3
         */
        public static class ListOfItems
        {
        	public static final List<Item> ITEMS = new ArrayList<Item>();
        	
        	public static void init()
        	{
        		addToTheList(Items.ACACIA_BOAT);
        		addToTheList(Items.ACACIA_DOOR);
        		addToTheList(Items.AIR);
        		addToTheList(Items.APPLE);
        		addToTheList(Items.ARROW);
        		addToTheList(Items.BAKED_POTATO);
        		addToTheList(Items.BANNER);
        		addToTheList(Items.BED);
        		addToTheList(Items.BEEF);
        		addToTheList(Items.BEETROOT);
        		addToTheList(Items.BEETROOT_SEEDS);
        		addToTheList(Items.BEETROOT_SOUP);
        		addToTheList(Items.BIRCH_BOAT);
        		addToTheList(Items.BIRCH_DOOR);
        		addToTheList(Items.BLAZE_POWDER);
        		addToTheList(Items.BLAZE_ROD);
        		addToTheList(Items.BOAT);
        		addToTheList(Items.BONE);
        		addToTheList(Items.BOOK);
        		addToTheList(Items.BOW);
        		addToTheList(Items.BOWL);
        		addToTheList(Items.BREAD);
        		addToTheList(Items.BREWING_STAND);
        		addToTheList(Items.BRICK);
        		addToTheList(Items.BUCKET);
        		addToTheList(Items.CAKE);
        		addToTheList(Items.CARROT);
        		addToTheList(Items.CARROT_ON_A_STICK);
        		addToTheList(Items.CAULDRON);
        		addToTheList(Items.CHAINMAIL_BOOTS);
        		addToTheList(Items.CHAINMAIL_CHESTPLATE);
        		addToTheList(Items.CHAINMAIL_HELMET);
        		addToTheList(Items.CHAINMAIL_LEGGINGS);
        		addToTheList(Items.CHEST_MINECART);
        		addToTheList(Items.CHICKEN);
        		addToTheList(Items.CHORUS_FRUIT);
        		addToTheList(Items.CHORUS_FRUIT_POPPED);
        		addToTheList(Items.CLAY_BALL);
        		addToTheList(Items.CLOCK);
        		addToTheList(Items.COAL);
        		addToTheList(Items.COMMAND_BLOCK_MINECART);
        		addToTheList(Items.COMPARATOR);
        		addToTheList(Items.COMPASS);
        		addToTheList(Items.COOKED_BEEF);
        		addToTheList(Items.COOKED_CHICKEN);
        		addToTheList(Items.COOKED_FISH);
        		addToTheList(Items.COOKED_MUTTON);
        		addToTheList(Items.COOKED_PORKCHOP);
        		addToTheList(Items.COOKED_RABBIT);
        		addToTheList(Items.COOKIE);
        		addToTheList(Items.DARK_OAK_BOAT);
        		addToTheList(Items.DARK_OAK_DOOR);
        		addToTheList(Items.DIAMOND);
        		addToTheList(Items.DIAMOND_AXE);
        		addToTheList(Items.DIAMOND_BOOTS);
        		addToTheList(Items.DIAMOND_CHESTPLATE);
        		addToTheList(Items.DIAMOND_HELMET);
        		addToTheList(Items.DIAMOND_HOE);
        		addToTheList(Items.DIAMOND_HORSE_ARMOR);
        		addToTheList(Items.DIAMOND_LEGGINGS);
        		addToTheList(Items.DIAMOND_PICKAXE);
        		addToTheList(Items.DIAMOND_SHOVEL);
        		addToTheList(Items.DIAMOND_SWORD);
        		addToTheList(Items.DRAGON_BREATH);
        		addToTheList(Items.DYE);
        		addToTheList(Items.EGG);
        		addToTheList(Items.ELYTRA);
        		addToTheList(Items.EMERALD);
        		addToTheList(Items.ENCHANTED_BOOK);
        		addToTheList(Items.END_CRYSTAL);
        		addToTheList(Items.ENDER_EYE);
        		addToTheList(Items.ENDER_PEARL);
        		addToTheList(Items.EXPERIENCE_BOTTLE);
        		addToTheList(Items.FEATHER);
        		addToTheList(Items.FERMENTED_SPIDER_EYE);
        		addToTheList(Items.FILLED_MAP);
        		addToTheList(Items.FIRE_CHARGE);
        		addToTheList(Items.FIREWORK_CHARGE);
        		addToTheList(Items.FIREWORKS);
        		addToTheList(Items.FISH);
        		addToTheList(Items.FISHING_ROD);
        		addToTheList(Items.FLINT);
        		addToTheList(Items.FLINT_AND_STEEL);
        		addToTheList(Items.FLOWER_POT);
        		addToTheList(Items.FURNACE_MINECART);
        		addToTheList(Items.GHAST_TEAR);
        		addToTheList(Items.GLASS_BOTTLE);
        		addToTheList(Items.GLOWSTONE_DUST);
        		addToTheList(Items.GOLD_INGOT);
        		addToTheList(Items.GOLD_NUGGET);
        		addToTheList(Items.GOLDEN_APPLE);
        		addToTheList(Items.GOLDEN_AXE);
        		addToTheList(Items.GOLDEN_BOOTS);
        		addToTheList(Items.GOLDEN_CARROT);
        		addToTheList(Items.GOLDEN_CHESTPLATE);
        		addToTheList(Items.GOLDEN_HELMET);
        		addToTheList(Items.GOLDEN_HOE);
        		addToTheList(Items.GOLDEN_HORSE_ARMOR);
        		addToTheList(Items.GOLDEN_LEGGINGS);
        		addToTheList(Items.GOLDEN_PICKAXE);
        		addToTheList(Items.GOLDEN_SHOVEL);
        		addToTheList(Items.GOLDEN_SWORD);
        		addToTheList(Items.GUNPOWDER);
        		addToTheList(Items.HOPPER_MINECART);
        		addToTheList(Items.IRON_AXE);
        		addToTheList(Items.IRON_BOOTS);
        		addToTheList(Items.IRON_CHESTPLATE);
        		addToTheList(Items.IRON_DOOR);
        		addToTheList(Items.IRON_HELMET);
        		addToTheList(Items.IRON_HOE);
        		addToTheList(Items.IRON_HORSE_ARMOR);
        		addToTheList(Items.IRON_INGOT);
        		addToTheList(Items.IRON_LEGGINGS);
        		addToTheList(Items.IRON_NUGGET);
        		addToTheList(Items.IRON_PICKAXE);
        		addToTheList(Items.IRON_SHOVEL);
        		addToTheList(Items.IRON_SWORD);
        		addToTheList(Items.ITEM_FRAME);
        		addToTheList(Items.JUNGLE_BOAT);
        		addToTheList(Items.JUNGLE_DOOR);
        		addToTheList(Items.KNOWLEDGE_BOOK);
        		addToTheList(Items.LAVA_BUCKET);
        		addToTheList(Items.LEAD);
        		addToTheList(Items.LEATHER);
        		addToTheList(Items.LEATHER_BOOTS);
        		addToTheList(Items.LEATHER_CHESTPLATE);
        		addToTheList(Items.LEATHER_HELMET);
        		addToTheList(Items.LEATHER_LEGGINGS);
        		addToTheList(Items.LINGERING_POTION);
        		addToTheList(Items.MAGMA_CREAM);
        		addToTheList(Items.MAP);
        		addToTheList(Items.MELON);
        		addToTheList(Items.MELON_SEEDS);
        		addToTheList(Items.MILK_BUCKET);
        		addToTheList(Items.MINECART);
        		addToTheList(Items.MUSHROOM_STEW);
        		addToTheList(Items.MUTTON);
        		addToTheList(Items.NAME_TAG);
        		addToTheList(Items.NETHER_STAR);
        		addToTheList(Items.NETHER_WART);
        		addToTheList(Items.NETHERBRICK);
        		addToTheList(Items.OAK_DOOR);
        		addToTheList(Items.PAINTING);
        		addToTheList(Items.PAPER);
        		addToTheList(Items.POISONOUS_POTATO);
        		addToTheList(Items.PORKCHOP);
        		addToTheList(Items.POTATO);
        		addToTheList(Items.POTIONITEM);
        		addToTheList(Items.PRISMARINE_CRYSTALS);
        		addToTheList(Items.PRISMARINE_SHARD);
        		addToTheList(Items.PUMPKIN_PIE);
        		addToTheList(Items.PUMPKIN_SEEDS);
        		addToTheList(Items.QUARTZ);
        		addToTheList(Items.RABBIT);
        		addToTheList(Items.RABBIT_FOOT);
        		addToTheList(Items.RABBIT_HIDE);
        		addToTheList(Items.RABBIT_STEW);
        		addToTheList(Items.RECORD_11);
        		addToTheList(Items.RECORD_13);
        		addToTheList(Items.RECORD_BLOCKS);
        		addToTheList(Items.RECORD_CAT);
        		addToTheList(Items.RECORD_CHIRP);
        		addToTheList(Items.RECORD_FAR);
        		addToTheList(Items.RECORD_MALL);
        		addToTheList(Items.RECORD_MELLOHI);
        		addToTheList(Items.RECORD_STAL);
        		addToTheList(Items.RECORD_STRAD);
        		addToTheList(Items.RECORD_WAIT);
        		addToTheList(Items.RECORD_WARD);
        		addToTheList(Items.REDSTONE);
        		addToTheList(Items.REEDS);
        		addToTheList(Items.REPEATER);
        		addToTheList(Items.ROTTEN_FLESH);
        		addToTheList(Items.SADDLE);
        		addToTheList(Items.SHEARS);
        		addToTheList(Items.SHIELD);
        		addToTheList(Items.SHULKER_SHELL);
        		addToTheList(Items.SIGN);
        		addToTheList(Items.SKULL);
        		addToTheList(Items.SLIME_BALL);
        		addToTheList(Items.SNOWBALL);
        		addToTheList(Items.SPAWN_EGG);
        		addToTheList(Items.SPECKLED_MELON);
        		addToTheList(Items.SPECTRAL_ARROW);
        		addToTheList(Items.SPIDER_EYE);
        		addToTheList(Items.SPLASH_POTION);
        		addToTheList(Items.SPRUCE_BOAT);
        		addToTheList(Items.SPRUCE_DOOR);
        		addToTheList(Items.STICK);
        		addToTheList(Items.STONE_AXE);
        		addToTheList(Items.STONE_HOE);
        		addToTheList(Items.STONE_PICKAXE);
        		addToTheList(Items.STONE_SHOVEL);
        		addToTheList(Items.STONE_SWORD);
        		addToTheList(Items.STRING);
        		addToTheList(Items.SUGAR);
        		addToTheList(Items.TIPPED_ARROW);
        		addToTheList(Items.TNT_MINECART);
        		addToTheList(Items.TOTEM_OF_UNDYING);
        		addToTheList(Items.WATER_BUCKET);
        		addToTheList(Items.WHEAT);
        		addToTheList(Items.WHEAT_SEEDS);
        		addToTheList(Items.WOODEN_AXE);
        		addToTheList(Items.WOODEN_HOE);
        		addToTheList(Items.WOODEN_PICKAXE);
        		addToTheList(Items.WOODEN_SHOVEL);
        		addToTheList(Items.WOODEN_SWORD);
        		addToTheList(Items.WRITABLE_BOOK);
        		addToTheList(Items.WRITTEN_BOOK);
        	}
        	
        	private static void addToTheList(Item item)
        	{
        		ITEMS.add(item);
        	}
        }

    }
}
