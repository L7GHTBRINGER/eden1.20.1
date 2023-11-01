package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.FrosttailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.FrosttailblueArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FrosttailArmorRenderer extends GeoArmorRenderer<FrosttailArmorItem> {
    public FrosttailArmorRenderer() {
        super(new FrosttailArmorModel());
    }
}
