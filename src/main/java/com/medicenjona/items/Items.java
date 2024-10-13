package com.medicenjona.items;

import com.medicenjona.Eseemepetekniko;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item ADMIN_NOSE = registerItem("admin_nose", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Eseemepetekniko.MOD_ID, name), item);
    }
    public static void registerItems() {
        Eseemepetekniko.LOGGER.info("Registering Mod Items for " + Eseemepetekniko.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ADMIN_NOSE);
        });
    }

}
