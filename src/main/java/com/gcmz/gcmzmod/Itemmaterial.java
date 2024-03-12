package com.gcmz.gcmzmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Itemmaterial extends Item {

    public Itemmaterial() {
        super();
        this.setRegistryName("gcmzmod", "material");
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setUnlocalizedName("material");
    }
}