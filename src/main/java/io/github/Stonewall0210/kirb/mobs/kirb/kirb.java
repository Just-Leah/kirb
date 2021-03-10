package io.github.Stonewall0210.kirb.mobs.kirb;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class kirb extends PathAwareEntity {
    public kirb(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
