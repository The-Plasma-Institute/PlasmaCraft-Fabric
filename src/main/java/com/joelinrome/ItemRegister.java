package com.joelinrome;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegister {
    public static Item register(Item item, String id) {
		// Create the identifier for the item.
		Identifier itemID = Identifier.of(PlasmaCraft.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
	}

    public static final Item DEUTERIUM_EXTRACTOR_ITEM = register(
       new Item(new Item.Settings()),
        "deuterium_extractor_item"
    );
}
