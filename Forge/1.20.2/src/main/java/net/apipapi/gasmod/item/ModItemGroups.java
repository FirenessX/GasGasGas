package net.apipapi.gasmod.item;

import net.apipapi.gasmod.Gasmod;
import net.apipapi.gasmod.ModDrink;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.CreativeModeTab;

public class ModItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gasmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GAS_TAB = CREATIVE_MODE_TABS.register("gas_gas_gas",
            () -> CreativeModeTab.builder().icon(() -> CustomItemGroupIcons.getGroupIcon())
                    .title(Component.translatable("itemgroup.gas_gas_gas"))
                    .displayItems((p_270258_, p_259752_) -> {
                        addPotionToGroup(p_259752_, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS, ModDrink.GAS_GAS_GAS_POTION);
                    })
                    .build());

    public static void addPotionToGroup(CreativeModeTab.Output p_259752_, CreativeModeTab.TabVisibility visibility, RegistryObject<Potion> potion) {
        ItemStack potionStack = PotionUtils.setPotion(new ItemStack(Items.POTION), potion.get());
        ItemStack splashPotionStack = PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), potion.get());
        ItemStack lingeringPotionStack = PotionUtils.setPotion(new ItemStack(Items.LINGERING_POTION), potion.get());
        p_259752_.accept(potionStack, visibility);
        p_259752_.accept(splashPotionStack, visibility);
        p_259752_.accept(lingeringPotionStack, visibility);
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
