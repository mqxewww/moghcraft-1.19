package net.mqxewww.moghcraft.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class GlitteringLapisLazuliBlock extends Block {
    public GlitteringLapisLazuliBlock() {
        super(
            FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
        );
    }
}
