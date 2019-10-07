package com.fabriccommunity.spookytime.registry;

import com.fabriccommunity.spookytime.SpookyTime;
import com.fabriccommunity.spookytime.block.*;
import com.fabriccommunity.spookytime.block.entity.InfusionAltarBlockEntity;
import com.fabriccommunity.spookytime.block.entity.InfusionPillarBlockEntity;
import com.fabriccommunity.spookytime.block.entity.TinyPumpkinBlockEntity;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class SpookyBlocks {
	public static Block TINY_PUMPKIN = register("tiny_pumpkin", new TinyPumpkinBlock(FabricBlockSettings.of(Material.PUMPKIN).strength(1.0F, 1.0F).sounds(BlockSoundGroup.LANTERN).build()));
	public static Block WITCHED_PUMPKIN = register("witched_pumpkin", new TinyPumpkinBlock(Block.Settings.copy(TINY_PUMPKIN)), new Item.Settings().group(SpookyTime.GROUP).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200), 1).hunger(1).saturationModifier(0.1f).alwaysEdible().build()));
	public static final BlockEntityType<TinyPumpkinBlockEntity> TINY_PUMPKIN_BLOCK_ENTITY = register("tiny_pumpkin", TinyPumpkinBlockEntity::new, TINY_PUMPKIN, WITCHED_PUMPKIN);
	public static Block DECEASED_DIRT = register("deceased_dirt", new Block(FabricBlockSettings.copy(Blocks.DIRT).materialColor(MaterialColor.PURPLE).build()));
	public static Block DECEASED_GRASS_BLOCK = register("deceased_grass_block", new DeceasedGrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_SAND = register("tainted_sand", new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_GRAVEL = register("tainted_gravel", new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_GLASS = register("tainted_glass", new TranslucentGlassBlock(FabricBlockSettings.copy(Blocks.GLASS).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_GLASS_PANE = register("tainted_glass_pane", new TranslucentGlassPaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE).build()));
	public static Block TAINTED_SANDSTONE = register("tainted_sandstone", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).materialColor(MaterialColor.PURPLE).build()));
	public static Block SMOOTH_TAINTED_SANDSTONE = register("smooth_tainted_sandstone", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE).materialColor(MaterialColor.PURPLE).build()));
	public static Block CUT_TAINTED_SANDSTONE = register("cut_tainted_sandstone", new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE).materialColor(MaterialColor.PURPLE).build()));
	public static Block CHISELED_TAINTED_SANDSTONE = register("chiseled_tainted_sandstone", new Block(FabricBlockSettings.copy(Blocks.CHISELED_SANDSTONE).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_SANDSTONE_STAIRS = register("tainted_sandstone_stairs", new SpookyStairsBlock(TAINTED_SANDSTONE, FabricBlockSettings.copy(Blocks.SANDSTONE_STAIRS).materialColor(MaterialColor.PURPLE).build()));
	public static Block SMOOTH_TAINTED_SANDSTONE_STAIRS = register("smooth_tainted_sandstone_stairs", new SpookyStairsBlock(SMOOTH_TAINTED_SANDSTONE, FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_SANDSTONE_SLAB = register("tainted_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE_SLAB).materialColor(MaterialColor.PURPLE).build()));
	public static Block SMOOTH_TAINTED_SANDSTONE_SLAB = register("smooth_tainted_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE_SLAB).materialColor(MaterialColor.PURPLE).build()));
	public static Block CUT_TAINTED_SANDSTONE_SLAB = register("cut_tainted_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE_SLAB).materialColor(MaterialColor.PURPLE).build()));
	public static Block TAINTED_SANDSTONE_WALL = register("tainted_sandstone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.SANDSTONE_WALL).materialColor(MaterialColor.PURPLE).build()));
	public static Block SOUL_GLASS = register("soul_glass", new TranslucentGlassBlock(FabricBlockSettings.copy(Blocks.GLASS).materialColor(MaterialColor.BROWN).build()));
	public static Block SOUL_GLASS_PANE = register("soul_glass_pane", new TranslucentGlassPaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE).build()));
	public static Block SPOOKIUM_ORE = register("spookium_ore", new OreBlock(FabricBlockSettings.copy(Blocks.IRON_ORE).build()), new Item.Settings().group(SpookyTime.GROUP).rarity(Rarity.EPIC));
	public static Block SPOOKIUM_BLOCK = register("spookium_block", new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).materialColor(MaterialColor.RED).build()), new Item.Settings().group(SpookyTime.GROUP).rarity(Rarity.EPIC));
	public static Block WITCH_WATER_BLOCK = register("witch_water", new WitchWaterBlock(SpookyFluids.WITCH_WATER, FabricBlockSettings.copy(Blocks.WATER).build()), (BlockItem) null);
	public static Block BLOOD_BLOCK = register("blood", new BloodBlock(SpookyFluids.BLOOD, FabricBlockSettings.copy(Blocks.LAVA).lightLevel(0).build()), (BlockItem) null);
	public static InfusionPillarBlock INFUSION_PILLAR_BLOCK = register("infusion_pillar", new InfusionPillarBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE_WALL).build()));
	public static final BlockEntityType<InfusionPillarBlockEntity> INFUSION_PILLAR_BLOCK_ENTITY = register("infusion_pillar", InfusionPillarBlockEntity::new, INFUSION_PILLAR_BLOCK);
	public static InfusionAltarBlock INFUSION_ALTAR_BLOCK = register("infusion_altar", new InfusionAltarBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE_WALL).build()));
	public static final BlockEntityType<InfusionAltarBlockEntity> INFUSION_ALTAR_BLOCK_ENTITY = register("infusion_altar", InfusionAltarBlockEntity::new, INFUSION_ALTAR_BLOCK);
	private SpookyBlocks() {
		// NO-OP
	}
	
	public static void init() {
	
	}
	
	static <T extends Block> T register(String name, T block, Item.Settings settings) {
		return register(name, block, new BlockItem(block, settings));
	}
	
	static <T extends Block> T register(String name, T block) {
		return register(name, block, new Item.Settings().group(SpookyTime.GROUP));
	}
	
	static <T extends Block> T register(String name, T block, BlockItem item) {
		T b = Registry.register(Registry.BLOCK, SpookyTime.id(name), block);
		if (item != null) {
			BlockItem bi = SpookyItems.register(name, item);
			bi.appendBlocks(BlockItem.BLOCK_ITEMS, bi);
		}
		return b;
	}
	
	private static <B extends BlockEntity> BlockEntityType<B> register(String name, Supplier<B> supplier, Block... supportedBlocks) {
		return Registry.register(Registry.BLOCK_ENTITY, SpookyTime.id(name), BlockEntityType.Builder.create(supplier, supportedBlocks).build(null));
	}
}
