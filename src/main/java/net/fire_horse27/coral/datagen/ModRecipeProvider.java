package net.fire_horse27.coral.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fire_horse27.coral.util.ModTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<Item> CORALS = List.of(Items.TUBE_CORAL, Items.TUBE_CORAL_FAN, Items.BRAIN_CORAL,
            Items.BRAIN_CORAL_FAN, Items.BUBBLE_CORAL, Items.BUBBLE_CORAL_FAN, Items.FIRE_CORAL, Items.FIRE_CORAL_FAN,
            Items.HORN_CORAL, Items.HORN_CORAL_FAN, Items.DEAD_TUBE_CORAL, Items.DEAD_TUBE_CORAL_FAN,
            Items.DEAD_BRAIN_CORAL, Items.DEAD_BRAIN_CORAL_FAN, Items.DEAD_BUBBLE_CORAL, Items.DEAD_BUBBLE_CORAL_FAN,
            Items.DEAD_FIRE_CORAL, Items.DEAD_FIRE_CORAL_FAN, Items.DEAD_HORN_CORAL, Items.DEAD_HORN_CORAL_FAN);

    private static final List<TagKey<Item>> MATERIAL = List.of(ModTags.Items.TUBE_CORALS, ModTags.Items.BRAIN_CORALS,
            ModTags.Items.BUBBLE_CORALS, ModTags.Items.FIRE_CORALS, ModTags.Items.HORN_CORALS,
            ModTags.Items.DEAD_TUBE_CORALS, ModTags.Items.DEAD_BRAIN_CORALS, ModTags.Items.DEAD_BUBBLE_CORALS,
            ModTags.Items.DEAD_FIRE_CORALS, ModTags.Items.DEAD_HORN_CORALS);

    private static final List<Item> CORAL = List.of(Items.TUBE_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK,
            Items.BUBBLE_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK, Items.HORN_CORAL_BLOCK, Items.DEAD_TUBE_CORAL_BLOCK,
            Items.DEAD_BRAIN_CORAL_BLOCK, Items.DEAD_BUBBLE_CORAL_BLOCK, Items.DEAD_FIRE_CORAL_BLOCK,
            Items.DEAD_HORN_CORAL_BLOCK);

    @Override
    public void generate(RecipeExporter exporter) {
        for(int i = 0; i < 5; i++) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CORAL.get(i))
                    .pattern("##")
                    .pattern("##")
                    .group("coral")
                    .input('#', MATERIAL.get(i))
                    .criterion(hasItem(CORALS.get(i * 2)), conditionsFromItem(CORALS.get(i * 2)))
                    .criterion(hasItem(CORALS.get(i * 2 + 1)), conditionsFromItem(CORALS.get(i * 2 + 1)))
                    .offerTo(exporter, "coral:" + CORAL.get(i).toString()
                            .replace("minecraft:", ""));
        }

        for(int i = 5; i < 10; i++) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CORAL.get(i))
                    .pattern("##")
                    .pattern("##")
                    .group("dead_coral")
                    .input('#', MATERIAL.get(i))
                    .criterion(hasItem(CORALS.get(i * 2)), conditionsFromItem(CORALS.get(i * 2)))
                    .criterion(hasItem(CORALS.get(i * 2 + 1)), conditionsFromItem(CORALS.get(i * 2 + 1)))
                    .offerTo(exporter, "coral:" + CORAL.get(i).toString()
                            .replace("minecraft:", ""));
        }
    }
}
