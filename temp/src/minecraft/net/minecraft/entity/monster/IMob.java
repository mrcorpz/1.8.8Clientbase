package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.IAnimals;

public interface IMob extends IAnimals {
   Predicate<Entity> field_82192_a = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return p_apply_1_ instanceof IMob;
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };
   Predicate<Entity> field_175450_e = new Predicate<Entity>() {
      public boolean apply(Entity p_apply_1_) {
         return p_apply_1_ instanceof IMob && !p_apply_1_.func_82150_aj();
      }

      // $FF: synthetic method
      public boolean apply(Object p_apply_1_) {
         return this.apply((Entity)p_apply_1_);
      }
   };
}
