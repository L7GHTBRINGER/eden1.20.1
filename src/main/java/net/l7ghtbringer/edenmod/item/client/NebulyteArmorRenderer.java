package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.InferniumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.NebulyteArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NebulyteArmorRenderer extends GeoArmorRenderer<NebulyteArmorItem> {
    public NebulyteArmorRenderer() {
        super(new NebulyteArmorModel());
    }
}
