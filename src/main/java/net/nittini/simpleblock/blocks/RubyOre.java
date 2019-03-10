package net.nittini.simpleblock.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.nittini.simpleblock.init.ModItems;

public class RubyOre extends BlockBase {
    public RubyOre(String name, Material material) {
        super(name,material);
        setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.RUBY; // ITEMS.RABBIT
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 4;
        int min = 1;
        return rand.nextInt(max) + min;
    }
}