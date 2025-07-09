package net.icedly.netherend.item;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.item.custom.HammerItem;
import net.icedly.netherend.item.custom.PaxelItem;
import net.minecraft.world.item.*;
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

    public static final DeferredItem<Item> BLACK_OPAL_SWORD =
            ITEMS.register("black_opal_sword",
                    () -> new SwordItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BLACK_OPAL, 3, -2.4f))));

    public static final DeferredItem<Item> BLACK_OPAL_PICKAXE =
            ITEMS.register("black_opal_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BLACK_OPAL, 1, -2.8f))));

    public static final DeferredItem<Item> BLACK_OPAL_AXE =
            ITEMS.register("black_opal_axe",
                    () -> new AxeItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BLACK_OPAL, 6, -3.2f))));

    public static final DeferredItem<Item> BLACK_OPAL_SHOVEL =
            ITEMS.register("black_opal_shovel",
                    () -> new ShovelItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BLACK_OPAL, 1.5f, -3.0f))));

    public static final DeferredItem<Item> BLACK_OPAL_HOE =
            ITEMS.register("black_opal_hoe",
                    () -> new HoeItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BLACK_OPAL, 0, -3.0f))));

   public static final DeferredItem<Item> BLACK_OPAL_PAXEL =
            ITEMS.register("black_opal_paxel",
                    () -> new PaxelItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BLACK_OPAL, 1, -2.8f))));

   public static final DeferredItem<Item> BLACK_OPAL_HAMMER =
            ITEMS.register("black_opal_hammer",
                    () -> new HammerItem(ModToolTiers.BLACK_OPAL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BLACK_OPAL, 8, -3.3f))));

   public static final DeferredItem<Item> BISMUTH_HAMMER =
            ITEMS.register("bismuth_hammer",
                    () -> new HammerItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH, 9, -3.5f))));

    public static final DeferredItem<Item> BISMUTH_SWORD =
            ITEMS.register("bismuth_sword",
                    () -> new SwordItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BISMUTH, 5, -2.9f))));

    public static final DeferredItem<Item> BISMUTH_PICKAXE =
            ITEMS.register("bismuth_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH, 1, -2.8f))));

    public static final DeferredItem<Item> BISMUTH_AXE =
            ITEMS.register("bismuth_axe",
                    () -> new AxeItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BISMUTH, 7, -3.4f))));

    public static final DeferredItem<Item> BISMUTH_SHOVEL =
            ITEMS.register("bismuth_shovel",
                    () -> new ShovelItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BISMUTH, 1.5f, -3.0f))));

    public static final DeferredItem<Item> BISMUTH_HOE =
            ITEMS.register("bismuth_hoe",
                    () -> new HoeItem(ModToolTiers.BISMUTH,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BISMUTH, 0, -3.0f))));




    public static final DeferredItem<Item> BLACK_OPAL_HELMET = ITEMS.register("black_opal_helmet",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(36))));
    public static final DeferredItem<Item> BLACK_OPAL_CHESTPLATE = ITEMS.register("black_opal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(36))));
    public static final DeferredItem<Item> BLACK_OPAL_LEGGINGS = ITEMS.register("black_opal_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(36))));
    public static final DeferredItem<Item> BLACK_OPAL_BOOTS = ITEMS.register("black_opal_boots",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(36))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
