package com.joelinrome;

import com.joelinrome.block.BlockRegister;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlasmaCraft implements ModInitializer {
	public static final String MOD_ID = "plasmacraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegister.initialize();
	}
}