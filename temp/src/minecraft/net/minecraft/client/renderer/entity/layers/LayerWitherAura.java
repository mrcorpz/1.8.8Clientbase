package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.ModelWither;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderWither;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class LayerWitherAura implements LayerRenderer<EntityWither> {
   private static final ResourceLocation field_177217_a = new ResourceLocation("textures/entity/wither/wither_armor.png");
   private final RenderWither field_177215_b;
   private final ModelWither field_177216_c = new ModelWither(0.5F);

   public LayerWitherAura(RenderWither p_i46105_1_) {
      this.field_177215_b = p_i46105_1_;
   }

   public void func_177141_a(EntityWither p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_) {
      if(p_177141_1_.func_82205_o()) {
         GlStateManager.func_179132_a(!p_177141_1_.func_82150_aj());
         this.field_177215_b.func_110776_a(field_177217_a);
         GlStateManager.func_179128_n(5890);
         GlStateManager.func_179096_D();
         float lvt_9_1_ = (float)p_177141_1_.field_70173_aa + p_177141_4_;
         float lvt_10_1_ = MathHelper.func_76134_b(lvt_9_1_ * 0.02F) * 3.0F;
         float lvt_11_1_ = lvt_9_1_ * 0.01F;
         GlStateManager.func_179109_b(lvt_10_1_, lvt_11_1_, 0.0F);
         GlStateManager.func_179128_n(5888);
         GlStateManager.func_179147_l();
         float lvt_12_1_ = 0.5F;
         GlStateManager.func_179131_c(lvt_12_1_, lvt_12_1_, lvt_12_1_, 1.0F);
         GlStateManager.func_179140_f();
         GlStateManager.func_179112_b(1, 1);
         this.field_177216_c.func_78086_a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_);
         this.field_177216_c.func_178686_a(this.field_177215_b.func_177087_b());
         this.field_177216_c.func_78088_a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
         GlStateManager.func_179128_n(5890);
         GlStateManager.func_179096_D();
         GlStateManager.func_179128_n(5888);
         GlStateManager.func_179145_e();
         GlStateManager.func_179084_k();
      }
   }

   public boolean func_177142_b() {
      return false;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void func_177141_a(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_) {
      this.func_177141_a((EntityWither)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
   }
}
