package net.minecraft.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;

public class RenderFireball extends Render<EntityFireball> {
   private float field_77002_a;

   public RenderFireball(RenderManager p_i46176_1_, float p_i46176_2_) {
      super(p_i46176_1_);
      this.field_77002_a = p_i46176_2_;
   }

   public void func_76986_a(EntityFireball p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      GlStateManager.func_179094_E();
      this.func_180548_c(p_76986_1_);
      GlStateManager.func_179109_b((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
      GlStateManager.func_179091_B();
      GlStateManager.func_179152_a(this.field_77002_a, this.field_77002_a, this.field_77002_a);
      TextureAtlasSprite lvt_10_1_ = Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178082_a(Items.field_151059_bz);
      Tessellator lvt_11_1_ = Tessellator.func_178181_a();
      WorldRenderer lvt_12_1_ = lvt_11_1_.func_178180_c();
      float lvt_13_1_ = lvt_10_1_.func_94209_e();
      float lvt_14_1_ = lvt_10_1_.func_94212_f();
      float lvt_15_1_ = lvt_10_1_.func_94206_g();
      float lvt_16_1_ = lvt_10_1_.func_94210_h();
      float lvt_17_1_ = 1.0F;
      float lvt_18_1_ = 0.5F;
      float lvt_19_1_ = 0.25F;
      GlStateManager.func_179114_b(180.0F - this.field_76990_c.field_78735_i, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(-this.field_76990_c.field_78732_j, 1.0F, 0.0F, 0.0F);
      lvt_12_1_.func_181668_a(7, DefaultVertexFormats.field_181710_j);
      lvt_12_1_.func_181662_b(-0.5D, -0.25D, 0.0D).func_181673_a((double)lvt_13_1_, (double)lvt_16_1_).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
      lvt_12_1_.func_181662_b(0.5D, -0.25D, 0.0D).func_181673_a((double)lvt_14_1_, (double)lvt_16_1_).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
      lvt_12_1_.func_181662_b(0.5D, 0.75D, 0.0D).func_181673_a((double)lvt_14_1_, (double)lvt_15_1_).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
      lvt_12_1_.func_181662_b(-0.5D, 0.75D, 0.0D).func_181673_a((double)lvt_13_1_, (double)lvt_15_1_).func_181663_c(0.0F, 1.0F, 0.0F).func_181675_d();
      lvt_11_1_.func_78381_a();
      GlStateManager.func_179101_C();
      GlStateManager.func_179121_F();
      super.func_76986_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }

   protected ResourceLocation func_110775_a(EntityFireball p_110775_1_) {
      return TextureMap.field_110575_b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.func_110775_a((EntityFireball)p_110775_1_);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void func_76986_a(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      this.func_76986_a((EntityFireball)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }
}
