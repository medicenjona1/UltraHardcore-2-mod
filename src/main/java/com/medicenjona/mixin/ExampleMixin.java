package com.medicenjona.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ZombieEntity.class)
public class ExampleMixin {


	@Inject(method = "initGoals", at = @At("TAIL"))
	private void equipZombiePick(CallbackInfo ci) {
		ZombieEntity zombie = (ZombieEntity) (Object) this;
		if (zombie.getMainHandStack().isEmpty()) {
			zombie.equipStack(EquipmentSlot.MAINHAND, Items.NETHERITE_PICKAXE.getDefaultStack());
			zombie.equipStack(EquipmentSlot.BODY, Items.NETHERITE_CHESTPLATE.getDefaultStack());

		}

		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}