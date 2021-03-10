package io.github.Stonewall0210.kirb.mobs.kirb;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class kirbRender extends MobEntityRenderer<kirb, kirbModel> {
    public kirbRender(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new kirbModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(kirb entity) {
        return new Identifier("kirbpoyo", "textures/entity/kirb/kirb.png");
    }
}
