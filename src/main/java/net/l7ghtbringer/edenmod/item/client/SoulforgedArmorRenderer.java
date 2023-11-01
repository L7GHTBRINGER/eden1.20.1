package net.l7ghtbringer.edenmod.item.client;



import net.l7ghtbringer.edenmod.item.custom.NebulyteArmorItem;
import net.l7ghtbringer.edenmod.item.custom.SoulforgedArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SoulforgedArmorRenderer extends GeoArmorRenderer<SoulforgedArmorItem> {
    public SoulforgedArmorRenderer() {
        super(new SoulforgedArmorModel());
    }
}
