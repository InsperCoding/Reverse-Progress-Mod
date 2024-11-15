
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reverseprogress.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.reverseprogress.item.DimensaoTesteItem;
import net.mcreator.reverseprogress.ReverseProgressMod;

public class ReverseProgressModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReverseProgressMod.MODID);
	public static final RegistryObject<Item> DIMENSAO_INTERMEDIARIA = REGISTRY.register("dimensao_intermediaria", () -> new DimensaoTesteItem());
	// Start of user code block custom items
	// End of user code block custom items
}
