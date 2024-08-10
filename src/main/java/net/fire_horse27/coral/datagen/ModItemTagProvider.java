package net.fire_horse27.coral.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fire_horse27.coral.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.TUBE_CORALS)
                .add(Items.TUBE_CORAL)
                .add(Items.TUBE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.BRAIN_CORALS)
                .add(Items.BRAIN_CORAL)
                .add(Items.BRAIN_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.BUBBLE_CORALS)
                .add(Items.BUBBLE_CORAL)
                .add(Items.BUBBLE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.FIRE_CORALS)
                .add(Items.FIRE_CORAL)
                .add(Items.FIRE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.HORN_CORALS)
                .add(Items.HORN_CORAL)
                .add(Items.HORN_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.DEAD_TUBE_CORALS)
                .add(Items.DEAD_TUBE_CORAL)
                .add(Items.DEAD_TUBE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.DEAD_BRAIN_CORALS)
                .add(Items.DEAD_BRAIN_CORAL)
                .add(Items.DEAD_BRAIN_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.DEAD_BUBBLE_CORALS)
                .add(Items.DEAD_BUBBLE_CORAL)
                .add(Items.DEAD_BUBBLE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.DEAD_FIRE_CORALS)
                .add(Items.DEAD_FIRE_CORAL)
                .add(Items.DEAD_FIRE_CORAL_FAN);

        getOrCreateTagBuilder(ModTags.Items.DEAD_HORN_CORALS)
                .add(Items.DEAD_HORN_CORAL)
                .add(Items.DEAD_HORN_CORAL_FAN);
    }
}
