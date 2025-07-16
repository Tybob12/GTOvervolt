package com.tybob14.gtovervolt.api.machine.multiblock;


import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.gui.UITemplate;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.feature.ITieredMachine;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IDisplayUIMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.lowdragmc.lowdraglib.gui.modular.ModularUI;
import com.lowdragmc.lowdraglib.gui.texture.IGuiTexture;
import com.lowdragmc.lowdraglib.gui.widget.ComponentPanelWidget;
import com.lowdragmc.lowdraglib.gui.widget.DraggableScrollableWidgetGroup;
import com.lowdragmc.lowdraglib.gui.widget.LabelWidget;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.entity.player.Player;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class TieredSteamParallelMultiblockMachine extends WorkableMultiblockMachine implements IDisplayUIMachine, ITieredMachine {

    // if in millibuckets, this is 2.0, Meaning 2mb of steam -> 1 EU
    public static final double CONVERSION_RATE = 2.0;
    public int maxParallels = ConfigHolder.INSTANCE.machines.steamMultiParallelAmount;
    protected int tier;

    public TieredSteamParallelMultiblockMachine(IMachineBlockEntity holder, Object... args) {
        super(holder);
        if (args.length > 0 && args[0] instanceof Integer i) {
            this.maxParallels = i;
        }
    }

    public static Material getMaterial(int tier) {
        if (tier == 0) return GTMaterials.Bronze;
        if (tier == 1) return GTMaterials.Steel;
        return GTMaterials.Steel;
    }

    @Override
    public void onStructureFormed() {
        super.onStructureFormed();
        this.tier = 1;

    }

    @Override
    public void onStructureInvalid() {
        super.onStructureInvalid();
        this.tier = 0;
    }

    @Override
    public void onPartUnload() {
        super.onPartUnload();
        this.tier = 0;
    }


    public double getConversionRate() {
        return CONVERSION_RATE;
    }

    @Override
    public IGuiTexture getScreenTexture() {
        return GuiTextures.DISPLAY_STEAM.get(ConfigHolder.INSTANCE.machines.steelSteamMultiblocks);
    }


    @Override
    public ModularUI createUI(Player entityPlayer) {
        var screen = new DraggableScrollableWidgetGroup(7, 4, 162, 121).setBackground(getScreenTexture());
        screen.addWidget(new LabelWidget(4, 5, self().getBlockState().getBlock().getDescriptionId()));
        screen.addWidget(new ComponentPanelWidget(4, 17, this::addDisplayText)
                .setMaxWidthLimit(150)
                .clickHandler(this::handleDisplayClick));
        return new ModularUI(176, 216, this, entityPlayer)
                .background(GuiTextures.BACKGROUND_STEAM.get(ConfigHolder.INSTANCE.machines.steelSteamMultiblocks))
                .widget(screen)
                .widget(UITemplate.bindPlayerInventory(entityPlayer.getInventory(),
                        GuiTextures.SLOT_STEAM.get(ConfigHolder.INSTANCE.machines.steelSteamMultiblocks), 7, 134,
                        true));
    }
}
