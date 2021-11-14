package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.StatCollector;
import net.minecraft.util.Tuple;
import net.minecraft.world.World;

public class BlockSponge extends Block {
   public static final PropertyBool field_176313_a = PropertyBool.func_177716_a("wet");

   protected BlockSponge() {
      super(Material.field_151583_m);
      this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(field_176313_a, Boolean.valueOf(false)));
      this.func_149647_a(CreativeTabs.field_78030_b);
   }

   public String func_149732_F() {
      return StatCollector.func_74838_a(this.func_149739_a() + ".dry.name");
   }

   public int func_180651_a(IBlockState p_180651_1_) {
      return ((Boolean)p_180651_1_.func_177229_b(field_176313_a)).booleanValue()?1:0;
   }

   public void func_176213_c(World p_176213_1_, BlockPos p_176213_2_, IBlockState p_176213_3_) {
      this.func_176311_e(p_176213_1_, p_176213_2_, p_176213_3_);
   }

   public void func_176204_a(World p_176204_1_, BlockPos p_176204_2_, IBlockState p_176204_3_, Block p_176204_4_) {
      this.func_176311_e(p_176204_1_, p_176204_2_, p_176204_3_);
      super.func_176204_a(p_176204_1_, p_176204_2_, p_176204_3_, p_176204_4_);
   }

   protected void func_176311_e(World p_176311_1_, BlockPos p_176311_2_, IBlockState p_176311_3_) {
      if(!((Boolean)p_176311_3_.func_177229_b(field_176313_a)).booleanValue() && this.func_176312_d(p_176311_1_, p_176311_2_)) {
         p_176311_1_.func_180501_a(p_176311_2_, p_176311_3_.func_177226_a(field_176313_a, Boolean.valueOf(true)), 2);
         p_176311_1_.func_175718_b(2001, p_176311_2_, Block.func_149682_b(Blocks.field_150355_j));
      }

   }

   private boolean func_176312_d(World p_176312_1_, BlockPos p_176312_2_) {
      Queue<Tuple<BlockPos, Integer>> lvt_3_1_ = Lists.newLinkedList();
      ArrayList<BlockPos> lvt_4_1_ = Lists.newArrayList();
      lvt_3_1_.add(new Tuple(p_176312_2_, Integer.valueOf(0)));
      int lvt_5_1_ = 0;

      while(!((Queue)lvt_3_1_).isEmpty()) {
         Tuple<BlockPos, Integer> lvt_6_1_ = (Tuple)lvt_3_1_.poll();
         BlockPos lvt_7_1_ = (BlockPos)lvt_6_1_.func_76341_a();
         int lvt_8_1_ = ((Integer)lvt_6_1_.func_76340_b()).intValue();

         for(EnumFacing lvt_12_1_ : EnumFacing.values()) {
            BlockPos lvt_13_1_ = lvt_7_1_.func_177972_a(lvt_12_1_);
            if(p_176312_1_.func_180495_p(lvt_13_1_).func_177230_c().func_149688_o() == Material.field_151586_h) {
               p_176312_1_.func_180501_a(lvt_13_1_, Blocks.field_150350_a.func_176223_P(), 2);
               lvt_4_1_.add(lvt_13_1_);
               ++lvt_5_1_;
               if(lvt_8_1_ < 6) {
                  lvt_3_1_.add(new Tuple(lvt_13_1_, Integer.valueOf(lvt_8_1_ + 1)));
               }
            }
         }

         if(lvt_5_1_ > 64) {
            break;
         }
      }

      for(BlockPos lvt_7_2_ : lvt_4_1_) {
         p_176312_1_.func_175685_c(lvt_7_2_, Blocks.field_150350_a);
      }

      return lvt_5_1_ > 0;
   }

   public void func_149666_a(Item p_149666_1_, CreativeTabs p_149666_2_, List<ItemStack> p_149666_3_) {
      p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
      p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
   }

   public IBlockState func_176203_a(int p_176203_1_) {
      return this.func_176223_P().func_177226_a(field_176313_a, Boolean.valueOf((p_176203_1_ & 1) == 1));
   }

   public int func_176201_c(IBlockState p_176201_1_) {
      return ((Boolean)p_176201_1_.func_177229_b(field_176313_a)).booleanValue()?1:0;
   }

   protected BlockState func_180661_e() {
      return new BlockState(this, new IProperty[]{field_176313_a});
   }

   public void func_180655_c(World p_180655_1_, BlockPos p_180655_2_, IBlockState p_180655_3_, Random p_180655_4_) {
      if(((Boolean)p_180655_3_.func_177229_b(field_176313_a)).booleanValue()) {
         EnumFacing lvt_5_1_ = EnumFacing.func_176741_a(p_180655_4_);
         if(lvt_5_1_ != EnumFacing.UP && !World.func_175683_a(p_180655_1_, p_180655_2_.func_177972_a(lvt_5_1_))) {
            double lvt_6_1_ = (double)p_180655_2_.func_177958_n();
            double lvt_8_1_ = (double)p_180655_2_.func_177956_o();
            double lvt_10_1_ = (double)p_180655_2_.func_177952_p();
            if(lvt_5_1_ == EnumFacing.DOWN) {
               lvt_8_1_ = lvt_8_1_ - 0.05D;
               lvt_6_1_ += p_180655_4_.nextDouble();
               lvt_10_1_ += p_180655_4_.nextDouble();
            } else {
               lvt_8_1_ = lvt_8_1_ + p_180655_4_.nextDouble() * 0.8D;
               if(lvt_5_1_.func_176740_k() == EnumFacing.Axis.X) {
                  lvt_10_1_ += p_180655_4_.nextDouble();
                  if(lvt_5_1_ == EnumFacing.EAST) {
                     ++lvt_6_1_;
                  } else {
                     lvt_6_1_ += 0.05D;
                  }
               } else {
                  lvt_6_1_ += p_180655_4_.nextDouble();
                  if(lvt_5_1_ == EnumFacing.SOUTH) {
                     ++lvt_10_1_;
                  } else {
                     lvt_10_1_ += 0.05D;
                  }
               }
            }

            p_180655_1_.func_175688_a(EnumParticleTypes.DRIP_WATER, lvt_6_1_, lvt_8_1_, lvt_10_1_, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      }
   }
}
