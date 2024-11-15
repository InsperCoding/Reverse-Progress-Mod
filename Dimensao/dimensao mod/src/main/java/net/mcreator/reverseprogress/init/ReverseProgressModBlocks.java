
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reverseprogress.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.reverseprogress.block.DimensaoTestePortalBlock;
import net.mcreator.reverseprogress.ReverseProgressMod;

public class ReverseProgressModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReverseProgressMod.MODID);
	public static final RegistryObject<Block> DIMENSAO_INTERMEDIARIA_PORTAL = REGISTRY.register("dimensao_intermediaria_portal", () -> new DimensaoTestePortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
