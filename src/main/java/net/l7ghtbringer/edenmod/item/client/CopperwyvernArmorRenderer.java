package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.CopperwyvernArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RedwyvernArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CopperwyvernArmorRenderer extends GeoArmorRenderer<CopperwyvernArmorItem> {
    public CopperwyvernArmorRenderer() {
        super(new CopperwyvernArmorModel());
    }
}
