package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenMelon extends WorldGenerator {
   public boolean func_180709_b(World p_180709_1_, Random p_180709_2_, BlockPos p_180709_3_) {
      for(int lvt_4_1_ = 0; lvt_4_1_ < 64; ++lvt_4_1_) {
         BlockPos lvt_5_1_ = p_180709_3_.func_177982_a(p_180709_2_.nextInt(8) - p_180709_2_.nextInt(8), p_180709_2_.nextInt(4) - p_180709_2_.nextInt(4), p_180709_2_.nextInt(8) - p_180709_2_.nextInt(8));
         if(Blocks.field_150440_ba.func_176196_c(p_180709_1_, lvt_5_1_) && p_180709_1_.func_180495_p(lvt_5_1_.func_177977_b()).func_177230_c() == Blocks.field_150349_c) {
            p_180709_1_.func_180501_a(lvt_5_1_, Blocks.field_150440_ba.func_176223_P(), 2);
         }
      }

      return true;
   }
}
