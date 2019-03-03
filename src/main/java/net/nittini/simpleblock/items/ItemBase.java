package net.nittini.simpleblock.item;

import net.nittini.simpleblock.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.createtab.CreateTabs;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.Proxy.registerItemRenderer(this,0,"inventory");
	}
}
