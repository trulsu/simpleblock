package net.nittini.simpleblock.items;

import net.nittini.simpleblock.SimpleBlock;
import net.nittini.simpleblock.util.IHasModel;
import net.nittini.simpleblock.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		SimpleBlock.proxy.registerItemRenderer(this,0,"inventory");
	}
}
