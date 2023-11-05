
package net.ddraig.papyrus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlantFibersItem extends Item {
	public PlantFibersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
