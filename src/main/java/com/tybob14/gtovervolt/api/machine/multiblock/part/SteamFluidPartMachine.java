package com.tybob14.gtovervolt.api.machine.multiblock.part;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.gui.UITemplate;
import com.gregtechceu.gtceu.api.gui.widget.TankWidget;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableFluidTank;
import com.gregtechceu.gtceu.common.machine.multiblock.part.FluidHatchPartMachine;
import com.lowdragmc.lowdraglib.gui.modular.ModularUI;
import com.lowdragmc.lowdraglib.gui.widget.ImageWidget;
import com.lowdragmc.lowdraglib.gui.widget.LabelWidget;
import com.tybob14.gtovervolt.common.data.GTOVMachines;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;

import static com.gregtechceu.gtceu.common.machine.multiblock.part.SteamHatchPartMachine.IS_STEEL;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SteamFluidPartMachine extends FluidHatchPartMachine {

    public SteamFluidPartMachine(IMachineBlockEntity holder, int tier, IO io, int initialCapacity, int slots, Object... args) {
        super(holder, tier, io, initialCapacity, slots, args);
    }


    @Override
    public boolean swapIO() {
        BlockPos blockPos = getHolder().pos();
        MachineDefinition newDefinition = null;
        if (io == IO.IN) {
            newDefinition = GTOVMachines.STEAM_EXPORT_HATCH;
        } else if (io == IO.OUT) {
            newDefinition = GTOVMachines.STEAM_IMPORT_HATCH;
        }

        if (newDefinition == null) return false;
        BlockState newBlockState = newDefinition.getBlock().defaultBlockState();

        getLevel().setBlockAndUpdate(blockPos, newBlockState);

        if (getLevel().getBlockEntity(blockPos) instanceof IMachineBlockEntity newHolder) {
            if (newHolder.getMetaMachine() instanceof SteamFluidPartMachine newMachine) {
                newMachine.setFrontFacing(this.getFrontFacing());
                newMachine.setUpwardsFacing(this.getUpwardsFacing());
            }
        }
        return true;
    }

    @Override
    protected NotifiableFluidTank createTank(int initialCapacity, int slots, Object... args) {
        return super.createTank(initialCapacity, slots);
    }

    @Override
    public ModularUI createUI(Player entityPlayer) {
        return new ModularUI(176, 166, this, entityPlayer)
                .background(GuiTextures.BACKGROUND_STEAM.get(IS_STEEL))
                .widget(new ImageWidget(7, 16, 81, 55, GuiTextures.DISPLAY_STEAM.get(IS_STEEL)))
                .widget(new LabelWidget(11, 20, "gtceu.gui.fluid_amount"))
                .widget(new LabelWidget(11, 30, () -> tank.getFluidInTank(0).getAmount() + "").setTextColor(-1)
                        .setDropShadow(true))
                .widget(new LabelWidget(6, 6, getBlockState().getBlock().getDescriptionId()))
                .widget(new TankWidget(tank.getStorages()[0], 90, 35, true, true)
                        .setBackground(GuiTextures.FLUID_SLOT))
                .widget(UITemplate.bindPlayerInventory(entityPlayer.getInventory(),
                        GuiTextures.SLOT_STEAM.get(IS_STEEL), 7, 84, true));
    }

}
