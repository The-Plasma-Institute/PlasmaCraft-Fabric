package com.joelinrome.datagen;

import com.joelinrome.block.BlockRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleState(BlockRegister.DEUTERIUM_EXTRACTOR);
        blockStateModelGenerator.registerParentedItemModel(BlockRegister.DEUTERIUM_EXTRACTOR, ModelIds.getBlockModelId(BlockRegister.DEUTERIUM_EXTRACTOR));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
