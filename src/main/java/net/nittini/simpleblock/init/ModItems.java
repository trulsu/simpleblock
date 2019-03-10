package net.nittini.simpleblock.init;

import net.nittini.simpleblock.items.ItemBase;
import net.nittini.simpleblock.items.tools.ToolAxe;
import net.nittini.simpleblock.items.tools.ToolHoe;
import net.nittini.simpleblock.items.tools.ToolPickaxe;
import net.nittini.simpleblock.items.tools.ToolSpade;
import net.nittini.simpleblock.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	// Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0f, 3.0f, 10);

	// Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item RUBY = new ItemBase("ruby");

	// Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_spade", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
}