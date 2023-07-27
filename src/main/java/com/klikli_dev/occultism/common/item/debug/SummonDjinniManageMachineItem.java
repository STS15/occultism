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

package com.klikli_dev.occultism.common.item.debug;

import com.klikli_dev.occultism.common.entity.job.SpiritJob;
import com.klikli_dev.occultism.common.entity.spirit.DjinniEntity;
import com.klikli_dev.occultism.registry.OccultismEntities;
import com.klikli_dev.occultism.registry.OccultismSpiritJobs;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraftforge.event.ForgeEventFactory;

public class SummonDjinniManageMachineItem extends Item {

    //region Initialization
    public SummonDjinniManageMachineItem(Properties properties) {
        super(properties);
    }
    //endregion Initialization

    //region Overrides
    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide) {

            DjinniEntity spirit = OccultismEntities.DJINNI.get().create(context.getLevel());

            if (!ForgeEventFactory.doSpecialSpawn(spirit, context.getLevel(), (float) spirit.getX(), (float) spirit.getY(), (float) spirit.getZ(), null, MobSpawnType.SPAWN_EGG))
                spirit.finalizeSpawn((ServerLevel) context.getLevel(),
                        context.getLevel().getCurrentDifficultyAt(context.getClickedPos()),
                        MobSpawnType.SPAWN_EGG, null, null);
            spirit.tame(context.getPlayer());
            spirit.setPos(context.getClickedPos().getX(), context.getClickedPos().getY() + 1.0f, context.getClickedPos().getZ());
            spirit.setCustomName(Component.literal("Testspirit Manage Machine"));
            spirit.setSpiritMaxAge(-1); //cannot die from age
            //set up the job
            SpiritJob manageMachine = OccultismSpiritJobs.MANAGE_MACHINE.get().create(spirit);
            manageMachine.init();
            spirit.setJob(manageMachine);

            //notify players nearby and spawn
            for (ServerPlayer player : context.getLevel().getEntitiesOfClass(ServerPlayer.class,
                    spirit.getBoundingBox().inflate(50)))
                CriteriaTriggers.SUMMONED_ENTITY.trigger(player, spirit);
            context.getLevel().addFreshEntity(spirit);
        }
        return InteractionResult.SUCCESS;
    }

    //endregion Overrides
}
