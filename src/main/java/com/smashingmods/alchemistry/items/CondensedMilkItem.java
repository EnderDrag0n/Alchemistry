package com.smashingmods.alchemistry.items;

import com.smashingmods.alchemistry.setup.ModSetup;
import com.smashingmods.alchemylib.items.BaseItem;
import net.minecraft.world.item.Item;

public class CondensedMilkItem extends BaseItem {
    public CondensedMilkItem() {
        super(ModSetup.ITEM_GROUP, new Item.Properties());//"condensed_milk");
    }
}