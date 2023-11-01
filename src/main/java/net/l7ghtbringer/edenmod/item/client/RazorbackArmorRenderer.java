package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.NebulyteArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RazorbackArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RazorbackArmorRenderer extends GeoArmorRenderer<RazorbackArmorItem> {
    public RazorbackArmorRenderer() {
        super(new RazorbackArmorModel());
    }
}
