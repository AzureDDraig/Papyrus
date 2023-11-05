package net.ddraig.papyrus.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.ddraig.papyrus.init.PapyrusModItems;

public class ScraperRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs"))) || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:logs")))) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			for (int index0 = 0; index0 < 12; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PapyrusModItems.WOOD_FIBERS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:lush_plants_replaceable")))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:underwater_bonemeals")))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:flowers")))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:azalea_log_replaceable"))) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_GRASS
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:crops"))) || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:leaves")))) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			for (int index1 = 0; index1 < 2; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PapyrusModItems.PLANT_FIBERS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
