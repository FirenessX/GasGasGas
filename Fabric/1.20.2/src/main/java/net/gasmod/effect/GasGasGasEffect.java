package net.gasmod.effect;

import net.gasmod.ModPotions;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtil;

public class GasGasGasEffect extends StatusEffect {


    protected GasGasGasEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    StatusEffectInstance speedEffect = new StatusEffectInstance(StatusEffects.SPEED, 10, 9, false, false);
    StatusEffectInstance glowingEffect = new StatusEffectInstance(StatusEffects.GLOWING, 10, 0, false, false);

    @Override
    public void applyUpdateEffect(net.minecraft.entity.LivingEntity entity, int amplifier) {
        entity.addStatusEffect(speedEffect);
        entity.addStatusEffect(glowingEffect);
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
