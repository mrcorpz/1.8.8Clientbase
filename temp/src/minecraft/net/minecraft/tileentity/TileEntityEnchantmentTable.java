package net.minecraft.tileentity;

import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerEnchantment;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ITickable;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IInteractionObject;

public class TileEntityEnchantmentTable extends TileEntity implements ITickable, IInteractionObject {
   public int field_145926_a;
   public float field_145933_i;
   public float field_145931_j;
   public float field_145932_k;
   public float field_145929_l;
   public float field_145930_m;
   public float field_145927_n;
   public float field_145928_o;
   public float field_145925_p;
   public float field_145924_q;
   private static Random field_145923_r = new Random();
   private String field_145922_s;

   public void func_145841_b(NBTTagCompound p_145841_1_) {
      super.func_145841_b(p_145841_1_);
      if(this.func_145818_k_()) {
         p_145841_1_.func_74778_a("CustomName", this.field_145922_s);
      }

   }

   public void func_145839_a(NBTTagCompound p_145839_1_) {
      super.func_145839_a(p_145839_1_);
      if(p_145839_1_.func_150297_b("CustomName", 8)) {
         this.field_145922_s = p_145839_1_.func_74779_i("CustomName");
      }

   }

   public void func_73660_a() {
      this.field_145927_n = this.field_145930_m;
      this.field_145925_p = this.field_145928_o;
      EntityPlayer lvt_1_1_ = this.field_145850_b.func_72977_a((double)((float)this.field_174879_c.func_177958_n() + 0.5F), (double)((float)this.field_174879_c.func_177956_o() + 0.5F), (double)((float)this.field_174879_c.func_177952_p() + 0.5F), 3.0D);
      if(lvt_1_1_ != null) {
         double lvt_2_1_ = lvt_1_1_.field_70165_t - (double)((float)this.field_174879_c.func_177958_n() + 0.5F);
         double lvt_4_1_ = lvt_1_1_.field_70161_v - (double)((float)this.field_174879_c.func_177952_p() + 0.5F);
         this.field_145924_q = (float)MathHelper.func_181159_b(lvt_4_1_, lvt_2_1_);
         this.field_145930_m += 0.1F;
         if(this.field_145930_m < 0.5F || field_145923_r.nextInt(40) == 0) {
            float lvt_6_1_ = this.field_145932_k;

            while(true) {
               this.field_145932_k += (float)(field_145923_r.nextInt(4) - field_145923_r.nextInt(4));
               if(lvt_6_1_ != this.field_145932_k) {
                  break;
               }
            }
         }
      } else {
         this.field_145924_q += 0.02F;
         this.field_145930_m -= 0.1F;
      }

      while(this.field_145928_o >= 3.1415927F) {
         this.field_145928_o -= 6.2831855F;
      }

      while(this.field_145928_o < -3.1415927F) {
         this.field_145928_o += 6.2831855F;
      }

      while(this.field_145924_q >= 3.1415927F) {
         this.field_145924_q -= 6.2831855F;
      }

      while(this.field_145924_q < -3.1415927F) {
         this.field_145924_q += 6.2831855F;
      }

      float lvt_2_2_;
      for(lvt_2_2_ = this.field_145924_q - this.field_145928_o; lvt_2_2_ >= 3.1415927F; lvt_2_2_ -= 6.2831855F) {
         ;
      }

      while(lvt_2_2_ < -3.1415927F) {
         lvt_2_2_ += 6.2831855F;
      }

      this.field_145928_o += lvt_2_2_ * 0.4F;
      this.field_145930_m = MathHelper.func_76131_a(this.field_145930_m, 0.0F, 1.0F);
      ++this.field_145926_a;
      this.field_145931_j = this.field_145933_i;
      float lvt_3_1_ = (this.field_145932_k - this.field_145933_i) * 0.4F;
      float lvt_4_2_ = 0.2F;
      lvt_3_1_ = MathHelper.func_76131_a(lvt_3_1_, -lvt_4_2_, lvt_4_2_);
      this.field_145929_l += (lvt_3_1_ - this.field_145929_l) * 0.9F;
      this.field_145933_i += this.field_145929_l;
   }

   public String func_70005_c_() {
      return this.func_145818_k_()?this.field_145922_s:"container.enchant";
   }

   public boolean func_145818_k_() {
      return this.field_145922_s != null && this.field_145922_s.length() > 0;
   }

   public void func_145920_a(String p_145920_1_) {
      this.field_145922_s = p_145920_1_;
   }

   public IChatComponent func_145748_c_() {
      return (IChatComponent)(this.func_145818_k_()?new ChatComponentText(this.func_70005_c_()):new ChatComponentTranslation(this.func_70005_c_(), new Object[0]));
   }

   public Container func_174876_a(InventoryPlayer p_174876_1_, EntityPlayer p_174876_2_) {
      return new ContainerEnchantment(p_174876_1_, this.field_145850_b, this.field_174879_c);
   }

   public String func_174875_k() {
      return "minecraft:enchanting_table";
   }
}
