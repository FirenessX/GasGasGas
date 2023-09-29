package net.apipapi.gasmod;

import net.apipapi.gasmod.effect.ModEffects;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModDrink{
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, Gasmod.MOD_ID);

    public static final RegistryObject<Potion> GAS_GAS_GAS_POTION = POTIONS.register("gas_gas_gas_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GAS_GAS_GAS.get(), 500, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}