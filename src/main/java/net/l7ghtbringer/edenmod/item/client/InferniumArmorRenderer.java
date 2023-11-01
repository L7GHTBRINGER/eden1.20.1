package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.InferniumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class InferniumArmorRenderer extends GeoArmorRenderer<InferniumArmorItem> {
    public InferniumArmorRenderer() {
        super(new InferniumArmorModel());
    }
}
