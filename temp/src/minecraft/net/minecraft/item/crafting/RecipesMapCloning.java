package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipesMapCloning implements IRecipe {
   public boolean func_77569_a(InventoryCrafting p_77569_1_, World p_77569_2_) {
      int lvt_3_1_ = 0;
      ItemStack lvt_4_1_ = null;

      for(int lvt_5_1_ = 0; lvt_5_1_ < p_77569_1_.func_70302_i_(); ++lvt_5_1_) {
         ItemStack lvt_6_1_ = p_77569_1_.func_70301_a(lvt_5_1_);
         if(lvt_6_1_ != null) {
            if(lvt_6_1_.func_77973_b() == Items.field_151098_aY) {
               if(lvt_4_1_ != null) {
                  return false;
               }

               lvt_4_1_ = lvt_6_1_;
            } else {
               if(lvt_6_1_.func_77973_b() != Items.field_151148_bJ) {
                  return false;
               }

               ++lvt_3_1_;
            }
         }
      }

      return lvt_4_1_ != null && lvt_3_1_ > 0;
   }

   public ItemStack func_77572_b(InventoryCrafting p_77572_1_) {
      int lvt_2_1_ = 0;
      ItemStack lvt_3_1_ = null;

      for(int lvt_4_1_ = 0; lvt_4_1_ < p_77572_1_.func_70302_i_(); ++lvt_4_1_) {
         ItemStack lvt_5_1_ = p_77572_1_.func_70301_a(lvt_4_1_);
         if(lvt_5_1_ != null) {
            if(lvt_5_1_.func_77973_b() == Items.field_151098_aY) {
               if(lvt_3_1_ != null) {
                  return null;
               }

               lvt_3_1_ = lvt_5_1_;
            } else {
               if(lvt_5_1_.func_77973_b() != Items.field_151148_bJ) {
                  return null;
               }

               ++lvt_2_1_;
            }
         }
      }

      if(lvt_3_1_ != null && lvt_2_1_ >= 1) {
         ItemStack lvt_4_2_ = new ItemStack(Items.field_151098_aY, lvt_2_1_ + 1, lvt_3_1_.func_77960_j());
         if(lvt_3_1_.func_82837_s()) {
            lvt_4_2_.func_151001_c(lvt_3_1_.func_82833_r());
         }

         return lvt_4_2_;
      } else {
         return null;
      }
   }

   public int func_77570_a() {
      return 9;
   }

   public ItemStack func_77571_b() {
      return null;
   }

   public ItemStack[] func_179532_b(InventoryCrafting p_179532_1_) {
      ItemStack[] lvt_2_1_ = new ItemStack[p_179532_1_.func_70302_i_()];

      for(int lvt_3_1_ = 0; lvt_3_1_ < lvt_2_1_.length; ++lvt_3_1_) {
         ItemStack lvt_4_1_ = p_179532_1_.func_70301_a(lvt_3_1_);
         if(lvt_4_1_ != null && lvt_4_1_.func_77973_b().func_77634_r()) {
            lvt_2_1_[lvt_3_1_] = new ItemStack(lvt_4_1_.func_77973_b().func_77668_q());
         }
      }

      return lvt_2_1_;
   }
}
