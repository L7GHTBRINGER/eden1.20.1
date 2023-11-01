package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.BasmuArmorItem;
import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BasmuArmorRenderer extends GeoArmorRenderer<BasmuArmorItem> {
    public BasmuArmorRenderer() {
        super(new BasmuArmorModel());
    }
}
