package net.gasmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class GasGasGasEffect extends StatusEffect {

    protected GasGasGasEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        StatusEffectInstance effectInstance = entity.getStatusEffect(this);
        int remainingTime = effectInstance.getDuration();
        if (remainingTime >= 60) {
            entity.sendMessage(Text.literal("start"));
            entity.setGlowing(true);
        }
        else {
            entity.sendMessage(Text.literal("end"));
            entity.setGlowing(false);
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}