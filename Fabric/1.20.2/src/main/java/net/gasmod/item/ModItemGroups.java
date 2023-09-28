package net.gasmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gasmod.GasMod;
import net.gasmod.ModPotions;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

import static net.gasmod.ModPotions.GAS_GAS_GAS_POTION;

public class ModItemGroups {
    public static final ItemGroup GASMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GasMod.MOD_ID, "gas_gas_gas"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.gas_gas_gas"))
                    .icon(() -> CustomItemGroupIcons.getGroupIcon()) // Вместо CustomItemGroupIcons.getGroupIcons()
                    .entries((displayContext, entries) -> {
                        addPotionToGroup(entries, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS, ModPotions.GAS_GAS_GAS_POTION);
                    }).build());

    public static void addPotionToGroup(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility, Potion potion) {
        ItemStack potionStack = PotionUtil.setPotion(new ItemStack(Items.POTION), potion);
        ItemStack splashPotionStack = PotionUtil.setPotion(new ItemStack(Items.SPLASH_POTION), potion);
        ItemStack lingeringPotionStack = PotionUtil.setPotion(new ItemStack(Items.LINGERING_POTION), potion);
        entries.add(potionStack, visibility);
        entries.add(splashPotionStack, visibility);
        entries.add(lingeringPotionStack, visibility);
    }

    public static void registerItemGroups() {
        GasMod.LOGGER.info("Registering Item Groups for: " + GasMod.MOD_ID);
    }
}
