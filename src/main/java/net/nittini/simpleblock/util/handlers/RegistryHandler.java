package net.nittini.simpleblock.util.handlers;

import net.nittini.simpleblock.init.ModItems;
import net.nittini.simpleblock.item.Item;
import net.nittini.simpleblock.util.IHasModel;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.Items) {
			if(item instanceof IHasModel) {
				((IhasModel)item).registerModels();
			}
		}
	}
}