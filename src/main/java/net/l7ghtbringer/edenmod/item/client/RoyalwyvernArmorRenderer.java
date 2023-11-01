package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.RedwyvernArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RoyalwyvernArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RoyalwyvernArmorRenderer extends GeoArmorRenderer<RoyalwyvernArmorItem> {
    public RoyalwyvernArmorRenderer() {
        super(new RoyalwyvernArmorModel());
    }
}
