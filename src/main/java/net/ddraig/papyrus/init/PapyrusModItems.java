
package net.ddraig.papyrus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.ddraig.papyrus.item.WoodFibersItem;
import net.ddraig.papyrus.item.ScraperItem;
import net.ddraig.papyrus.item.PlantFibersItem;
import net.ddraig.papyrus.PapyrusMod;

public class PapyrusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PapyrusMod.MODID);
	public static final RegistryObject<Item> PLANT_FIBERS = REGISTRY.register("plant_fibers", () -> new PlantFibersItem());
	public static final RegistryObject<Item> WOOD_FIBERS = REGISTRY.register("wood_fibers", () -> new WoodFibersItem());
	public static final RegistryObject<Item> SCRAPER = REGISTRY.register("scraper", () -> new ScraperItem());
}
