package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.icedly.netherend.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> BLACK_OPAL_SMELTABLES = List.of(ModItems.BLACK_OPAL,
                ModBlocks.BLACK_OPAL_END_ORE);

        List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.BISMUTH,
                ModBlocks.BISMUTH_END_ORE);

        List<ItemLike> SULFUR_SMELTABLES = List.of(ModItems.SULFUR_INGOT,
                ModBlocks.SULFUR_NETHER_ORE);

        List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RUBY_INGOT,
                ModBlocks.RUBY_NETHER_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PINK_GARNET.get())
                .unlockedBy("has_pink_garnet", has(ModItems.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY_INGOT.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY_INGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDER_SPIKE_SPEAR.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.ENDER_SPIKE_STICK.get())
                .define('B', Blocks.END_STONE.asItem())
                .unlockedBy("has_black", has(ModItems.ENDER_SPIKE_STICK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_HAMMER.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModBlocks.BLACK_OPAL_BLOCK.get())
                .unlockedBy("has_black", has(ModBlocks.BLACK_OPAL_BLOCK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_PAXEL.get())
                .pattern("DBC")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL_PICKAXE.get())
                .define('C', ModItems.BLACK_OPAL_SHOVEL.get())
                .define('D', ModItems.BLACK_OPAL_AXE.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_HAMMER.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModBlocks.BISMUTH_BLOCK.get())
                .unlockedBy("has_bismuth", has(ModBlocks.BISMUTH_BLOCK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_OPAL_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK.asItem())
                .define('B', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_black_opal", has(ModItems.BLACK_OPAL.get())).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 9)
                .requires(ModBlocks.BLACK_OPAL_BLOCK.get())
                .unlockedBy("has_black_opal_block", has(ModBlocks.BLACK_OPAL_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 9)
                .requires(ModBlocks.BISMUTH_BLOCK.get())
                .unlockedBy("has_bismuth_block", has(ModBlocks.BISMUTH_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY_INGOT.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_bismuth_block", has(ModBlocks.RUBY_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 9)
                .requires(ModBlocks.PINK_GARNET_BLOCK.get())
                .unlockedBy("has_pink_garnet_block", has(ModBlocks.PINK_GARNET_BLOCK.get())).save(recipeOutput);


        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f ,200, "bismuth");
        oreSmelting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f ,200, "bismuth");
        oreSmelting(recipeOutput, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 0.25f ,200, "black_opal");
        oreBlasting(recipeOutput, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 0.25f ,100, "black_opal");
        oreSmelting(recipeOutput, SULFUR_SMELTABLES, RecipeCategory.MISC, ModItems.SULFUR_INGOT.get(), 0.25f ,200, "sulfur_ingot");
        oreBlasting(recipeOutput, SULFUR_SMELTABLES, RecipeCategory.MISC, ModItems.SULFUR_INGOT.get(), 0.25f ,100, "sulfur_ingot");
        oreSmelting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_INGOT.get(), 0.25f ,200, "ruby_ingot");
        oreBlasting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_INGOT.get(), 0.25f ,100, "ruby_ingot");
    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, EndandNether.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
