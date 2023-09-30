package net.apipapi.gasmod.item;

import net.apipapi.gasmod.Gasmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class CustomItemGroupIcons {
    public static ItemStack getGroupIcon() {
        // Возвращаем одну из иконок из списка, например, первую
        return getGroupIcons().get(0);
    }

    public static List<ItemStack> getGroupIcons() {
        List<ItemStack> icons = new ArrayList<>();

        // Добавляем иконку вашего зелья
        ResourceLocation potionLocation = new ResourceLocation(Gasmod.MOD_ID, "gas_gas_gas_potion");
        Potion potion = ForgeRegistries.POTIONS.getValue(potionLocation);
        if (potion != null) {
            ItemStack potionStack = PotionUtils.setPotion(new ItemStack(Items.POTION), potion);
            icons.add(potionStack);
        }

        // Добавляем другие иконки, если необходимо
        // icons.add(другие_иконки_зелий);

        return icons;
    }

    public static void addIconsToGroup(CreativeModeTab.Output iconSetter) {
        List<ItemStack> icons = getGroupIcons();
        for (ItemStack icon : icons) {
            iconSetter.accept(icon, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
