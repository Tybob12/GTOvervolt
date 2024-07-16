package com.tybob14.gtovervolt;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.lowdragmc.lowdraglib.Platform;
import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import com.tybob14.gtovervolt.common.data.GTOVMachines;
import com.tybob14.gtovervolt.common.data.GTOVRecipeTypes;
import com.tybob14.gtovervolt.common.data.GTOvervoltCreativeModeTabs;
import com.tybob14.gtovervolt.common.data.materials.IntegratedMaterials;
import com.tybob14.gtovervolt.common.data.materials.OriginalMaterials;
import com.tybob14.gtovervolt.data.GTOvervoltDatagen;
import com.tybob14.gtovervolt.common.data.materials.ChemistryMaterials;
import com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(GTOvervolt.MOD_ID)
public class GTOvervolt {

    public static final String MOD_ID = "gtovervolt", NAME = "GTOvervolt Coremod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    public static MaterialRegistry MATERIAL_REGISTRY;

    public GTOvervolt(){
        GTOvervolt.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        bus.addGenericListener(GTRecipeType.class, this::registerRecipeTypes);
        bus.addGenericListener(MachineDefinition.class, this::registerMachines);
        bus.register(this);
    }


    public static void init() {
        GTOvervoltCreativeModeTabs.init();

        GTOvervoltDatagen.init();

        GTOvervoltRegistries.REGISTRATE.registerRegistrate();

    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        if (Platform.isModLoaded("ae2")) IntegratedMaterials.modifyAE2Materials();
        if (Platform.isModLoaded("enderio")) IntegratedMaterials.modifyEnderIOMaterials();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(GTOvervolt.MOD_ID);


    }

    @SubscribeEvent
    public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
        GTOVRecipeTypes.init();
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        GTOVMachines.init();
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        PrimaryMaterials.init();
        ChemistryMaterials.init();
        IntegratedMaterials.init();
    }

    @SubscribeEvent
    public void modifyMaterials(PostMaterialEvent event) {
        PrimaryMaterials.modifyMaterials();
        OriginalMaterials.modifyMaterials();
    }

}
