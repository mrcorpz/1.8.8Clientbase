package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelEnderMite;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.util.ResourceLocation;

public class RenderEndermite extends RenderLiving<EntityEndermite> {
   private static final ResourceLocation field_177108_a = new ResourceLocation("textures/entity/endermite.png");

   public RenderEndermite(RenderManager p_i46181_1_) {
      super(p_i46181_1_, new ModelEnderMite(), 0.3F);
   }

   protected float func_77037_a(EntityEndermite p_77037_1_) {
      return 180.0F;
   }

   protected ResourceLocation func_110775_a(EntityEndermite p_110775_1_) {
      return field_177108_a;
   }

   // $FF: synthetic method
   protected float func_77037_a(EntityLivingBase p_77037_1_) {
      return this.func_77037_a((EntityEndermite)p_77037_1_);
   }

   // $FF: synthetic method
   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.func_110775_a((EntityEndermite)p_110775_1_);
   }
}
