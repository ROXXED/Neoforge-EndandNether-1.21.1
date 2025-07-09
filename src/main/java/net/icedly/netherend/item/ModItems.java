package net.icedly.netherend.item;

import net.icedly.netherend.EndandNether;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.logging.Level;

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
    public static final DeferredItem<Item> RUBY_INGOT =
            ITEMS.registerItem("ruby_ingot",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_RUBY =
            ITEMS.registerItem("raw_ruby",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_BISMUTH =
            ITEMS.registerItem("raw_bismuth",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> BISMUTH =
            ITEMS.registerItem("bismuth",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> SKULL_END_ARTIFACT =
            ITEMS.registerItem("skull_end_artifact",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> ENDER_SPIKE_STICK =
            ITEMS.registerItem("ender_spike_stick",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> ENDER_SPIKE_SPEAR =
            ITEMS.registerItem("ender_spike_spear",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
