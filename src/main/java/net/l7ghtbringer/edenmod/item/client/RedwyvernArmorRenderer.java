package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.NebulyteArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RedwyvernArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RedwyvernArmorRenderer extends GeoArmorRenderer<RedwyvernArmorItem> {
    public RedwyvernArmorRenderer() {
        super(new RedwyvernArmorModel());
    }
}
