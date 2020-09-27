package mart.mods.emergency_services;

import mart.mods.emergency_services.items.BatonItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EmergencyServicesMod implements ModInitializer {

    public static final BatonItem baton = new BatonItem(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        Registry.register(Registry.ITEM, new Identifier("police", "fabric_item"), baton);

        System.out.println("Hello Fabric world!");
    }
}
