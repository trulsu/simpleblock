package net.nittini.simpleblock.blocks;

import net.nittini.simpleblock.util.IHasModel;
import net.nittini.simpleblock.SimpleBlock;
import net.nittini.simpleblock.init.ModBlocks;
import net.nittini.simpleblock.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        SimpleBlock.proxy.registerItemRenderer(Item.getItemFromBlock(this),0, "inventory");
    }
}