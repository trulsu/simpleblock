package net.nittini.simpleblock.items;

import net.nittini.simpleblock.SimpleBlock;
import net.nittini.simpleblock.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
        super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);

        //ModBlocks.BLOCKS.add(this);
        //ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		SimpleBlock.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
	}
}
