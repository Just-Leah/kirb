package io.github.Stonewall0210.kirb;

import io.github.Stonewall0210.kirb.mobs.kirb.kirbRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class KirbPoyoClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(KirbPoyo.KIRB, (dispatcher, context) -> {
            return new kirbRender(dispatcher);
        });
    }
}
