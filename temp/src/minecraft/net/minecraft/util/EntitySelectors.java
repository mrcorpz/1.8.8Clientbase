package net.minecraft.util;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public final class EntitySelectors {
   public static final Predicate<Entity> field_94557_a = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return p_apply_1_.func_70089_S();
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };
   public static final Predicate<Entity> field_152785_b = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return p_apply_1_.func_70089_S() && p_apply_1_.field_70153_n == null && p_apply_1_.field_70154_o == null;
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };
   public static final Predicate<Entity> field_96566_b = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return p_apply_1_ instanceof IInventory && p_apply_1_.func_70089_S();
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };
   public static final Predicate<Entity> field_180132_d = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return !(p_apply_1_ instanceof EntityPlayer) || !((EntityPlayer)p_apply_1_).func_175149_v();
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };

   public static class ArmoredMob implements Predicate<Entity> {
      private final ItemStack field_96567_c;

      public ArmoredMob(ItemStack p_i1584_1_) {
         this.field_96567_c = p_i1584_1_;
      }

      public boolean apply(Entity p_apply_1_) {
         if(!p_apply_1_.func_70089_S()) {
            return false;
         } else if(!(p_apply_1_ instanceof EntityLivingBase)) {
            return false;
         } else {
            EntityLivingBase lvt_2_1_ = (EntityLivingBase)p_apply_1_;
            return lvt_2_1_.func_71124_b(EntityLiving.func_82159_b(this.field_96567_c)) != null?false:(lvt_2_1_ instanceof EntityLiving?((EntityLiving)lvt_2_1_).func_98052_bS():(lvt_2_1_ instanceof EntityArmorStand?true:lvt_2_1_ instanceof EntityPlayer));
         }
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   }
}
