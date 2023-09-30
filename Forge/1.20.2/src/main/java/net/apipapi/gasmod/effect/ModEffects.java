package net.apipapi.gasmod.effect;

import net.apipapi.gasmod.Gasmod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Gasmod.MOD_ID);
    public static final RegistryObject<MobEffect> GAS_GAS_GAS = MOB_EFFECTS.register("gas_gas_gas",
            () -> new GasGasGasEffect(MobEffectCategory.BENEFICIAL, 16747723).addAttributeModifier(Attributes.MOVEMENT_SPEED, "4ab74ed6-5e1c-11ee-8c99-0242ac120002", 2.0F, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
