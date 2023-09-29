package net.apipapi.gasmod.item;

import net.apipapi.gasmod.Gasmod;
import net.apipapi.gasmod.ModDrink;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomItemGroupIcons {
    public static RegistryObject<Item> GAS_GAS_GAS_POTION_ITEM = getGroupIcons().register("gas_gas_gas_potion",
            () -> {
                Potion GasGasGasPotion = ModDrink.GAS_GAS_GAS_POTION.get();
                return new Item(new Item.Properties()); // Здесь вы можете настроить свойства вашего предмета
            });

    public static DeferredRegister<Item> getGroupIcons() {
        DeferredRegister<Item> icons = DeferredRegister.create(ForgeRegistries.ITEMS, Gasmod.MOD_ID);
        return icons;
    }
}