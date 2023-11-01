package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ForktailArmorRenderer extends GeoArmorRenderer<ForktailArmorItem> {
    public ForktailArmorRenderer() {
        super(new ForktailArmorModel());
    }
}
