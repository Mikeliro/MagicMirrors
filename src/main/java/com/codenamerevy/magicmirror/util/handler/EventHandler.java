package com.codenamerevy.magicmirror.util.handler;

import com.codenamerevy.magicmirror.config.Config;
import com.codenamerevy.magicmirror.content.items.ItemConditions;
import com.codenamerevy.magicmirror.util.Ref;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler
{
    @SubscribeEvent
    public static void registerRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        if (Config.CategoryDeveloper.enableLogger.get()) {
            Ref.LOGGER.info("Begin Recipe Serializer conditions");
        }
        CraftingHelper.register(ItemConditions.Serializer.INSTANCE);
    }
}
