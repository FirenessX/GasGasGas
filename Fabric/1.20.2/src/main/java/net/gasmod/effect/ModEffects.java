package net.gasmod.effect;

import net.gasmod.GasMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEffects {
    public static StatusEffect GAS_GAS_GAS;

    public static StatusEffect registerStatusEffect(String id) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(GasMod.MOD_ID, id),
                new GasGasGasEffect(StatusEffectCategory.BENEFICIAL, 0xff8ccb));
    }

    public static void registerEffects() {
        GAS_GAS_GAS = registerStatusEffect("gas_gas_gas");
    }
}