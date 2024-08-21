package com.joelinrome.block;

import com.joelinrome.PlasmaCraft;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegister {

	public static final Block DEUTERIUM_EXTRACTOR_BLOCK = register(
			new Block(AbstractBlock.Settings.create()),
			"deuterium_extractor",
			true
	);

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
		// Register the block and its item.
		Identifier id = Identifier.of(PlasmaCraft.MOD_ID, name);

		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

    public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(itemgroup -> {
			itemgroup.add(DEUTERIUM_EXTRACTOR_BLOCK);
		});
	}
}
