package net.minecraft.client.renderer.entity.layers;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;

public class LayerHeldBlock implements LayerRenderer<EntityEnderman> {
   private final RenderEnderman field_177174_a;

   public LayerHeldBlock(RenderEnderman p_i46122_1_) {
      this.field_177174_a = p_i46122_1_;
   }

   public void func_177141_a(EntityEnderman p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_) {
      IBlockState lvt_9_1_ = p_177141_1_.func_175489_ck();
      if(lvt_9_1_.func_177230_c().func_149688_o() != Material.field_151579_a) {
         BlockRendererDispatcher lvt_10_1_ = Minecraft.func_71410_x().func_175602_ab();
         GlStateManager.func_179091_B();
         GlStateManager.func_179094_E();
         GlStateManager.func_179109_b(0.0F, 0.6875F, -0.75F);
         GlStateManager.func_179114_b(20.0F, 1.0F, 0.0F, 0.0F);
         GlStateManager.func_179114_b(45.0F, 0.0F, 1.0F, 0.0F);
         GlStateManager.func_179109_b(0.25F, 0.1875F, 0.25F);
         float lvt_11_1_ = 0.5F;
         GlStateManager.func_179152_a(-lvt_11_1_, -lvt_11_1_, lvt_11_1_);
         int lvt_12_1_ = p_177141_1_.func_70070_b(p_177141_4_);
         int lvt_13_1_ = lvt_12_1_ % 65536;
         int lvt_14_1_ = lvt_12_1_ / 65536;
         OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, (float)lvt_13_1_ / 1.0F, (float)lvt_14_1_ / 1.0F);
         GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_177174_a.func_110776_a(TextureMap.field_110575_b);
         lvt_10_1_.func_175016_a(lvt_9_1_, 1.0F);
         GlStateManager.func_179121_F();
         GlStateManager.func_179101_C();
      }
   }

   public boolean func_177142_b() {
      return false;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void func_177141_a(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_) {
      this.func_177141_a((EntityEnderman)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
   }
}
