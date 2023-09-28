package net.gasmod.item;

import net.gasmod.ModPotions;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potion;
import net.minecraft.util.collection.DefaultedList;

public class CustomItemGroupIcons {
    public static ItemStack getGroupIcon() {
        // Возвращаем одну из иконок из списка, например, первую
        return getGroupIcons().get(0);
    }

    public static DefaultedList<ItemStack> getGroupIcons() {
        DefaultedList<ItemStack> icons = DefaultedList.of();

        // Добавьте ваше зелье в список иконок
        ItemStack gasGasGasPotion = PotionUtil.setPotion(new ItemStack(Items.POTION), ModPotions.GAS_GAS_GAS_POTION);
        icons.add(gasGasGasPotion);

        return icons;
    }
}


