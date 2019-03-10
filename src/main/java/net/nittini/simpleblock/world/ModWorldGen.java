package net.nittini.simpleblock.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.nittini.simpleblock.init.ModBlocks;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        // 0 - overworld
        if(world.provider.getDimension() == 0) {
            generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    // One line per ore generated
    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int MinSpawnLevel = 16;
        int MaxSpawnLevel = 64;
        generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, MinSpawnLevel, MaxSpawnLevel, rand.nextInt(7) + 4, 18);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        for(int i = 0 ; i < chances ; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore,size);
            generator.generate(world,random,pos);
        }
    }
}