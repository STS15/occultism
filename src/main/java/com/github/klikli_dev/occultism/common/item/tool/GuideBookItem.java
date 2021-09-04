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

package com.github.klikli_dev.occultism.common.item.tool;

import com.github.klikli_dev.occultism.Occultism;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.util.List;

public class GuideBookItem extends Item {

    //region Fields
    public static final ResourceLocation GUIDE = new ResourceLocation(Occultism.MODID, "dictionary_of_spirits");
    protected static Field craftingRemainingItemField =
            ObfuscationReflectionHelper.findField(Item.class, "f_41378_");
    //endregion Fields

    //region Initialization
    public GuideBookItem(Properties properties) {
        super(properties);
        try {
            craftingRemainingItemField.set(this, this);
        } catch (IllegalAccessException e) {
        }
    }
    //endregion Initialization

    //region Overrides

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        if (!worldIn.isClientSide) {
            //TODO: Patchouli
            //PatchouliAPI.instance.openBookGUI((ServerPlayer) playerIn, GUIDE);
        }
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, playerIn.getItemInHand(handIn));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        //TODO: Patchouli
//        Book book = BookRegistry.INSTANCE.books.get(GUIDE);
//        if (book != null && book.contents != null) {
//            tooltip.add(book.contents.book.getSubtitle().mergeStyle(ChatFormatting.GRAY));
//        }

    }

    @Override
    public Component getName(ItemStack stack) {
        //TODO: Patchouli
//        Book book = BookRegistry.INSTANCE.books.get(GUIDE);
//        return book != null ? new TranslatableComponent(book.name, new Object[0]) : super.getName(stack);
        return super.getName(stack);
    }
}
