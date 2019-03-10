package net.nittini.simpleblock.init;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.nittini.simpleblock.blocks.CoolBlock;
import net.nittini.simpleblock.blocks.RubyBlock;
import net.nittini.simpleblock.blocks.RubyOre;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Blocks
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
    public static final Block COOL_BLOCK = new CoolBlock("cool_block", Material.IRON);
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
}