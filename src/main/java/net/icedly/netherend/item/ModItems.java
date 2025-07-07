package net.icedly.netherend.item;

import net.icedly.netherend.EndandNether;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndandNether.MOD_ID);

    public static final DeferredItem<Item> BLACK_OPAL =
            ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL =
            ITEMS.registerItem("raw_black_opal",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> SULFUR_INGOT =
            ITEMS.registerItem("sulfur_ingot",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_SULFUR =
            ITEMS.registerItem("raw_sulfur",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
