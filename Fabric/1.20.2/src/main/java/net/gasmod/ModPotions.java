package net.gasmod;

import net.gasmod.effect.ModEffects;
import net.minecraft.entity.ai.goal.WolfBegGoal;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModPotions {
    public static Potion GAS_GAS_GAS_POTION;

    public static Potion registerPotion(String id) {
        return Registry.register(Registries.POTION, new Identifier(GasMod.MOD_ID, id),
                new Potion(new StatusEffectInstance(ModEffects.GAS_GAS_GAS, 500, 0)));
    }

    public static void registerPotions() {
        GAS_GAS_GAS_POTION = registerPotion("gas_gas_gas_potion");
    }
}
