package com.gcmz.gcmzmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@SuppressWarnings("unused")
@Mod(modid = GcmzMod.MODID, name = GcmzMod.NAME, version = GcmzMod.VERSION)
public class GcmzMod
{
    public static final String MODID = "gcmzmod";
    public static final String NAME = "GCMZ Mod";
    public static final String VERSION = "0.1.0";

    public static final Item MATERIALS = new Itemmaterial();

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SuppressWarnings("unchecked")
    @SubscribeEvent
    public void registerItems(@SuppressWarnings("rawtypes") RegistryEvent.Register event) {
        event.getRegistry().register(MATERIALS);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(MATERIALS, 0, new ModelResourceLocation(new ResourceLocation("gcmzmmod", "material"), "inventory"));
    }
}
