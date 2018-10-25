package com.eardwulf.wickedfrontier.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.eardwulf.wickedfrontier.world.gen.generators.WorldGenArcaneTree;
import com.eardwulf.wickedfrontier.world.gen.generators.WorldGenAshTree;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenTrees implements IWorldGenerator
{
	private final WorldGenerator ARCANE = new WorldGenArcaneTree(false);
	private final WorldGenerator ASH = new WorldGenAshTree(false);
	

	/**
	 * @param b
	 */
	public WorldGenTrees(boolean b) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			break;
		case 0:
			runGenerator(ARCANE, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeForest.class);
			runGenerator(ARCANE, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeTaiga.class);
			runGenerator(ARCANE, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeMesa.class);
			runGenerator(ASH, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeForest.class);
			runGenerator(ASH, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeTaiga.class);
			runGenerator(ASH, world, random, chunkX, chunkZ, 0.01, -1, 0, BiomeMesa.class);
			break;
		case -1:
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classes)
	{
		if(chancesToSpawn < 0.00001) 
		{
			if(random.nextDouble() < chancesToSpawn) chancesToSpawn = 0.00001;
			else chancesToSpawn = 0.00001;
		}
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff), chunkZ * 16 + 10 + random.nextInt(15));
			if(minHeight < 0) pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
		}
	}
}