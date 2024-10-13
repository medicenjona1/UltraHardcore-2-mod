package com.medicenjona.mixin;


import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.GoalSelector;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ZombieEntity.class)
public abstract class BreakBlockZombieMixin {
    @Shadow
    public abstract World getWorld();


  @Inject(method = "initGoals", at = @At("TAIL"));
  private void addBreakGoal(CallbackInfo ci) {
      ZombieEntity zombie = (ZombieEntity) (Object) this;
      GoalSelector goalSelector;

      zombie.pat
  }

}
