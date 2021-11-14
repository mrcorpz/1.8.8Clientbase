package net.minecraft.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWitch extends ModelVillager {
   public boolean field_82900_g;
   private ModelRenderer field_82901_h = (new ModelRenderer(this)).func_78787_b(64, 128);
   private ModelRenderer field_82902_i;

   public ModelWitch(float p_i46361_1_) {
      super(p_i46361_1_, 0.0F, 64, 128);
      this.field_82901_h.func_78793_a(0.0F, -2.0F, 0.0F);
      this.field_82901_h.func_78784_a(0, 0).func_78790_a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.field_82898_f.func_78792_a(this.field_82901_h);
      this.field_82902_i = (new ModelRenderer(this)).func_78787_b(64, 128);
      this.field_82902_i.func_78793_a(-5.0F, -10.03125F, -5.0F);
      this.field_82902_i.func_78784_a(0, 64).func_78789_a(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.field_78191_a.func_78792_a(this.field_82902_i);
      ModelRenderer lvt_2_1_ = (new ModelRenderer(this)).func_78787_b(64, 128);
      lvt_2_1_.func_78793_a(1.75F, -4.0F, 2.0F);
      lvt_2_1_.func_78784_a(0, 76).func_78789_a(0.0F, 0.0F, 0.0F, 7, 4, 7);
      lvt_2_1_.field_78795_f = -0.05235988F;
      lvt_2_1_.field_78808_h = 0.02617994F;
      this.field_82902_i.func_78792_a(lvt_2_1_);
      ModelRenderer lvt_3_1_ = (new ModelRenderer(this)).func_78787_b(64, 128);
      lvt_3_1_.func_78793_a(1.75F, -4.0F, 2.0F);
      lvt_3_1_.func_78784_a(0, 87).func_78789_a(0.0F, 0.0F, 0.0F, 4, 4, 4);
      lvt_3_1_.field_78795_f = -0.10471976F;
      lvt_3_1_.field_78808_h = 0.05235988F;
      lvt_2_1_.func_78792_a(lvt_3_1_);
      ModelRenderer lvt_4_1_ = (new ModelRenderer(this)).func_78787_b(64, 128);
      lvt_4_1_.func_78793_a(1.75F, -2.0F, 2.0F);
      lvt_4_1_.func_78784_a(0, 95).func_78790_a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      lvt_4_1_.field_78795_f = -0.20943952F;
      lvt_4_1_.field_78808_h = 0.10471976F;
      lvt_3_1_.func_78792_a(lvt_4_1_);
   }

   public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
      super.func_78087_a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
      this.field_82898_f.field_82906_o = this.field_82898_f.field_82908_p = this.field_82898_f.field_82907_q = 0.0F;
      float lvt_8_1_ = 0.01F * (float)(p_78087_7_.func_145782_y() % 10);
      this.field_82898_f.field_78795_f = MathHelper.func_76126_a((float)p_78087_7_.field_70173_aa * lvt_8_1_) * 4.5F * 3.1415927F / 180.0F;
      this.field_82898_f.field_78796_g = 0.0F;
      this.field_82898_f.field_78808_h = MathHelper.func_76134_b((float)p_78087_7_.field_70173_aa * lvt_8_1_) * 2.5F * 3.1415927F / 180.0F;
      if(this.field_82900_g) {
         this.field_82898_f.field_78795_f = -0.9F;
         this.field_82898_f.field_82907_q = -0.09375F;
         this.field_82898_f.field_82908_p = 0.1875F;
      }

   }
}