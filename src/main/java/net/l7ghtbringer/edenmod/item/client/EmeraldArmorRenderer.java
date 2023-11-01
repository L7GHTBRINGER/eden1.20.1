package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.EmeraldArmorItem;
import net.l7ghtbringer.edenmod.item.custom.EntArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EmeraldArmorRenderer extends GeoArmorRenderer<EmeraldArmorItem> {
    public EmeraldArmorRenderer() {
        super(new EmeraldArmorModel());
    }
}
