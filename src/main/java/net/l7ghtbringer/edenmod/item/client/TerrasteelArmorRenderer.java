package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.TerrasteelArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TerrasteelArmorRenderer extends GeoArmorRenderer<TerrasteelArmorItem> {
    public TerrasteelArmorRenderer() {
        super(new TerrasteelArmorModel());
    }
}
