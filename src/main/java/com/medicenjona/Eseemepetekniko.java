package com.medicenjona;

import com.medicenjona.commands.TimerCommand;
import com.medicenjona.items.ItemGroups;
import com.medicenjona.items.Items;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eseemepetekniko implements ModInitializer {
	public static final String MOD_ID = "eseemepetekniko";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {
            TimerCommand.register(dispatcher);
        }));
		Items.registerItems();
		ItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}