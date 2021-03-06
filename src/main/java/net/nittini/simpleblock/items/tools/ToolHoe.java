package net.nittini.simpleblock.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.nittini.simpleblock.SimpleBlock;
import net.nittini.simpleblock.init.ModItems;
import net.nittini.simpleblock.util.IHasModel;

public class ToolHoe extends ItemHoe implements IHasModel {
    public ToolHoe(String name, ToolMaterial material) {
        super(material);
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