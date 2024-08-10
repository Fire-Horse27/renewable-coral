package net.fire_horse27.coral.util;

import net.fire_horse27.coral.Coral;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Coral.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TUBE_CORALS = createTag("tube_corals");
        public static final TagKey<Item> BRAIN_CORALS = createTag("brain_corals");
        public static final TagKey<Item> BUBBLE_CORALS = createTag("bubble_corals");
        public static final TagKey<Item> FIRE_CORALS = createTag("fire_corals");
        public static final TagKey<Item> HORN_CORALS = createTag("horn_corals");
        public static final TagKey<Item> DEAD_TUBE_CORALS = createTag("dead_tube_corals");
        public static final TagKey<Item> DEAD_BRAIN_CORALS = createTag("dead_brain_corals");
        public static final TagKey<Item> DEAD_BUBBLE_CORALS = createTag("dead_bubble_corals");
        public static final TagKey<Item> DEAD_FIRE_CORALS = createTag("dead_fire_corals");
        public static final TagKey<Item> DEAD_HORN_CORALS = createTag("dead_horn_corals");

        private static TagKey<Item> createTag(String name) {


            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Coral.MOD_ID, name));
        }
    }
}
