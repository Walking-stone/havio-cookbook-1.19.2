package net.havio.hcookbook;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.havio.hcookbook.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HavioCookbook implements ModInitializer {

	public static final String MOD_ID = "hcookbook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		CompostingChanceRegistry.INSTANCE.add(ModItems.BOILED_EGG, 0.7f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BOILED_TURTLE_EGG, 0.7f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CACTUS_LEAF, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.COOKED_CACTUS_LEAF, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MAGMA_COOKIE, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SUGAR_COOKIE, 0.2f);
	}
}
