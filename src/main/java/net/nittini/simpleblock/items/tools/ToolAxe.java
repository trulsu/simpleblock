package net.nittini.simpleblock.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.nittini.simpleblock.SimpleBlock;
import net.nittini.simpleblock.init.ModItems;
import net.nittini.simpleblock.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, ToolMaterial material) {
        super(material, 6.0f, -3.2f);
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