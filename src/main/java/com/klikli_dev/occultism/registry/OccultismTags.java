/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.klikli_dev.occultism.registry;

import com.klikli_dev.occultism.Occultism;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class OccultismTags {
    public static class Blocks {

        // Block Tags
        public static final TagKey<Block> TREE_SOIL = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "tree_soil"));
        public static final TagKey<Block> CAVE_WALL_BLOCKS = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "cave_wall_blocks"));
        public static final TagKey<Block> WORLDGEN_BLACKLIST = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "worldgen_blacklist"));

        public static final TagKey<Block> NETHERRACK = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "netherrack"));
        public static final TagKey<Block> CANDLES = makeBlockTag(ResourceLocation.fromNamespaceAndPath("minecraft", "candles"));
        public static final TagKey<Block> IESNIUM_ORE = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium"));
        public static final TagKey<Block> SILVER_ORE = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "ores/silver"));
        // Storage Bock Tags
        public static final TagKey<Block> STORAGE_BLOCKS_IESNIUM = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/iesnium"));
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/silver"));
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_IESNIUM = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_iesnium"));
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_SILVER = makeBlockTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_silver"));

        public static final TagKey<Block> OTHERWORLD_SAPLINGS = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "saplings/otherworld"));
        public static final TagKey<Block> OCCULTISM_CANDLES = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "candles"));
        public static final TagKey<Block> STORAGE_STABILIZER = makeBlockTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "storage_stabilizer"));
    }


    public static class Items {

        public static final TagKey<Item> DEMONIC_PARTNER_FOOD = makeItemTag(ResourceLocation.fromNamespaceAndPath("occultism", "demonic_partner_food"));

        public static final TagKey<Item> IESNIUM_ORE = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium"));
        public static final TagKey<Item> SILVER_ORE = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/silver"));
        public static final TagKey<Item> RAW_IESNIUM = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/iesnium"));
        public static final TagKey<Item> RAW_SILVER = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/silver"));
        public static final TagKey<Item> STORAGE_BLOCK_IESNIUM = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/iesnium"));
        public static final TagKey<Item> STORAGE_BLOCK_SILVER = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/silver"));
        public static final TagKey<Item> STORAGE_BLOCK_RAW_IESNIUM = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_iesnium"));
        public static final TagKey<Item> STORAGE_BLOCK_RAW_SILVER = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_silver"));

        // Dusts
        public static final TagKey<Item> COPPER_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/copper"));
        public static final TagKey<Item> END_STONE_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/end_stone"));
        public static final TagKey<Item> GOLD_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/gold"));
        public static final TagKey<Item> IRON_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/iron"));
        public static final TagKey<Item> IESNIUM_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/iesnium"));
        public static final TagKey<Item> SILVER_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/silver"));
        public static final TagKey<Item> RAW_MATERIALS_SILVER =makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/silver"));
        public static final TagKey<Item> OBSIDIAN_DUST=makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/obsidian"));
        public static final TagKey<Item> BLAZE_DUST = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "dusts/blaze"));

        public static final TagKey<Item> DATURA_CROP = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "crops/datura"));

        // Ingots
        public static final TagKey<Item> IESNIUM_INGOT = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/iesnium"));
        public static final TagKey<Item> SILVER_INGOT = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/silver"));

        // Nuggets
        public static final TagKey<Item> IESNIUM_NUGGET = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iesnium"));
        public static final TagKey<Item> SILVER_NUGGET = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/silver"));

        // Seeds
        public static final TagKey<Item> DATURA_SEEDS = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "seeds/datura"));

        //Item Tags
        public static final TagKey<Item> TOOL_KNIVES = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "tools/knives"));
        public static final TagKey<Item> OTHERWORLD_GOGGLES = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "otherworld_goggles"));
        public static final TagKey<Item> ELYTRA = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "elytra"));
        public static final TagKey<Item> BOOKS = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "books"));
        public static final TagKey<Item> FRUITS = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "fruits"));
        public static final TagKey<Item> TALLOW = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "tallow"));
        public static final TagKey<Item> BOOK_OF_CALLING_FOLIOT = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "books/book_of_calling_foliot"));
        public static final TagKey<Item> BOOK_OF_CALLING_DJINNI = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "books/book_of_calling_djinni"));


        public static final TagKey<Item> MAGMA = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "magma"));

        public static final TagKey<Item> MANUALS = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "manuals"));

        public static final TagKey<Item> METAL_AXES = makeItemTag(ResourceLocation.fromNamespaceAndPath("c", "tools/metal/axes"));
        public static final TagKey<Item> OTHERWORLD_SAPLINGS = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "saplings/otherworld"));

        public static class Miners {
            public static final TagKey<Item> MINERS = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "miners"));

            public static final TagKey<Item> BASIC_RESOURCES = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "miners/basic_resources"));
            public static final TagKey<Item> DEEPS = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "miners/deeps"));
            public static final TagKey<Item> MASTER = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "miners/master"));
            public static final TagKey<Item> ORES = makeItemTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "miners/ores"));
        }
    }

    public static class Entities {
        public static final TagKey<EntityType<?>> AXOLOTL = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "axolotls"));
        public static final TagKey<EntityType<?>> CHICKEN = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "chicken"));
        public static final TagKey<EntityType<?>> PARROTS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "parrots"));
        public static final TagKey<EntityType<?>> PIGS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "pigs"));
        public static final TagKey<EntityType<?>> COWS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "cows"));
        public static final TagKey<EntityType<?>> VILLAGERS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "villagers"));
        public static final TagKey<EntityType<?>> ZOMBIES = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "zombies"));
        public static final TagKey<EntityType<?>> BATS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "bats"));
        public static final TagKey<EntityType<?>> SNOW_GOLEM=makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "golems/snow"));
        public static final TagKey<EntityType<?>> IRON_GOLEM=makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "golems/iron"));
        public static final TagKey<EntityType<?>> DONKEYS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "donkeys"));
        public static final TagKey<EntityType<?>> FISH = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "fish"));
        public static final TagKey<EntityType<?>> GOATS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "goats"));
        public static final TagKey<EntityType<?>> HOGLINS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "hoglins"));
        public static final TagKey<EntityType<?>> HORSES = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "horses"));
        public static final TagKey<EntityType<?>> LLAMAS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "llamas"));
        public static final TagKey<EntityType<?>> MULES = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "mules"));
        public static final TagKey<EntityType<?>> PANDAS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "pandas"));
        public static final TagKey<EntityType<?>> SHEEP = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "sheep"));
        public static final TagKey<EntityType<?>> SPIDERS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "spiders"));
        public static final TagKey<EntityType<?>> SQUID = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath("c", "squid"));
        //Entity Tags
        public static final TagKey<EntityType<?>> SOUL_GEM_DENY_LIST = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "soul_gem_deny_list"));
        public static final TagKey<EntityType<?>> AFRIT_ALLIES = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "afrit_allies"));
        public static final TagKey<EntityType<?>> WILD_HUNT = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "wild_hunt"));
        public static final TagKey<EntityType<?>> HEALED_BY_DEMONS_DREAM_FRUIT = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "healed_by_demons_dream_fruit"));
        public static final TagKey<EntityType<?>> CUBEMOB = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "cubemob"));
        public static final TagKey<EntityType<?>> FLYING_PASSIVE = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "flying_passive"));
        public static final TagKey<EntityType<?>> HUMANS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "humans"));
        public static final TagKey<EntityType<?>> CAMEL = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "camel"));
        public static final TagKey<EntityType<?>> DOLPHIN = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "dolphin"));
        public static final TagKey<EntityType<?>> WOLFS = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "wolfs"));
        public static final TagKey<EntityType<?>> OCELOT = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "ocelot"));
        public static final TagKey<EntityType<?>> VEX = makeEntityTypeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "vex"));
    }


    //Biome Tags

    public static final TagKey<Biome> ALLOWS_SHUB_NIGGURRATH_TRANSFORMATION = makeBiomeTag(ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "allows_shub_niggurath_transformation"));


    public static TagKey<Item> makeItemTag(String id) {
        return makeItemTag(ResourceLocation.parse(id));
    }

    public static TagKey<Item> makeItemTag(ResourceLocation id) {
        return TagKey.create(Registries.ITEM, id);
    }

    public static TagKey<Block> makeBlockTag(String id) {
        return makeBlockTag(ResourceLocation.parse(id));
    }

    public static TagKey<Block> makeBlockTag(ResourceLocation id) {
        return TagKey.create(Registries.BLOCK, id);
    }

    public static TagKey<EntityType<?>> makeEntityTypeTag(String id) {
        return makeEntityTypeTag(ResourceLocation.parse(id));
    }

    public static TagKey<EntityType<?>> makeEntityTypeTag(ResourceLocation id) {
        return TagKey.create(Registries.ENTITY_TYPE, id);
    }

    public static TagKey<Biome> makeBiomeTag(String id) {
        return makeBiomeTag(ResourceLocation.parse(id));
    }

    public static TagKey<Biome> makeBiomeTag(ResourceLocation id) {
        return TagKey.create(Registries.BIOME, id);
    }
}
