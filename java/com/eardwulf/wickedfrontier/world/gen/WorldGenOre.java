package com.eardwulf.wickedfrontier.world.gen;

import java.util.Random;

import com.eardwulf.wickedfrontier.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.ORICHALCUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 10, random.nextInt(7) + 1, 15);
		generateOre(ModBlocks.ADAMANTINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 10, random.nextInt(7) + 1, 15);
		generateOre(ModBlocks.MITHRIL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 10, random.nextInt(7) + 1, 15);
		generateOre(ModBlocks.ALUMINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 50, 64, random.nextInt(4) + 2, 18);
		generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(6) + 4, 18);
		generateOre(ModBlocks.FIRESTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 50, 64, random.nextInt(4) + 2, 18);
		generateOre(ModBlocks.LEAD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(7) + 4, 18);
		generateOre(ModBlocks.SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 50, 64, random.nextInt(8) + 4, 18);
		generateOre(ModBlocks.NICKEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 60, random.nextInt(7) + 3, 18);
		generateOre(ModBlocks.PLATINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 50, 64, random.nextInt(8) + 4, 18);
		generateOre(ModBlocks.ZINC_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 60, random.nextInt(7) + 3, 18);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
