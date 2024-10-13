package com.medicenjona.items;

import com.medicenjona.Eseemepetekniko;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.BarrierBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup ADMIN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Eseemepetekniko.MOD_ID, "admin_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.ADMIN_NOSE))
                    .displayName(Text.translatable("itemgroup.eseemepetekniko.admin_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.ADMIN_NOSE);
                        //masitemsuwu
                    }).build()
    );

    public static void registerItemGroups() {
        Eseemepetekniko.LOGGER.info("Registering Item Groups for " + Eseemepetekniko.MOD_ID);
    }

}
