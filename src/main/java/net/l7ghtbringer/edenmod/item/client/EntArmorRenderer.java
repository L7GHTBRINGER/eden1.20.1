package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.BasmuArmorItem;
import net.l7ghtbringer.edenmod.item.custom.EntArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EntArmorRenderer extends GeoArmorRenderer<EntArmorItem> {
    public EntArmorRenderer() {
        super(new EntArmorModel());
    }
}
