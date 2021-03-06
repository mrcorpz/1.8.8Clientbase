package net.minecraft.world.gen.structure;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;
import net.minecraft.world.gen.structure.StructureVillagePieces;

public class MapGenVillage extends MapGenStructure {
   public static final List<BiomeGenBase> field_75055_e = Arrays.asList(new BiomeGenBase[]{BiomeGenBase.field_76772_c, BiomeGenBase.field_76769_d, BiomeGenBase.field_150588_X});
   private int field_75054_f;
   private int field_82665_g;
   private int field_82666_h;

   public MapGenVillage() {
      this.field_82665_g = 32;
      this.field_82666_h = 8;
   }

   public MapGenVillage(Map<String, String> p_i2093_1_) {
      this();

      for(Entry<String, String> lvt_3_1_ : p_i2093_1_.entrySet()) {
         if(((String)lvt_3_1_.getKey()).equals("size")) {
            this.field_75054_f = MathHelper.func_82714_a((String)lvt_3_1_.getValue(), this.field_75054_f, 0);
         } else if(((String)lvt_3_1_.getKey()).equals("distance")) {
            this.field_82665_g = MathHelper.func_82714_a((String)lvt_3_1_.getValue(), this.field_82665_g, this.field_82666_h + 1);
         }
      }

   }

   public String func_143025_a() {
      return "Village";
   }

   protected boolean func_75047_a(int p_75047_1_, int p_75047_2_) {
      int lvt_3_1_ = p_75047_1_;
      int lvt_4_1_ = p_75047_2_;
      if(p_75047_1_ < 0) {
         p_75047_1_ -= this.field_82665_g - 1;
      }

      if(p_75047_2_ < 0) {
         p_75047_2_ -= this.field_82665_g - 1;
      }

      int lvt_5_1_ = p_75047_1_ / this.field_82665_g;
      int lvt_6_1_ = p_75047_2_ / this.field_82665_g;
      Random lvt_7_1_ = this.field_75039_c.func_72843_D(lvt_5_1_, lvt_6_1_, 10387312);
      lvt_5_1_ = lvt_5_1_ * this.field_82665_g;
      lvt_6_1_ = lvt_6_1_ * this.field_82665_g;
      lvt_5_1_ = lvt_5_1_ + lvt_7_1_.nextInt(this.field_82665_g - this.field_82666_h);
      lvt_6_1_ = lvt_6_1_ + lvt_7_1_.nextInt(this.field_82665_g - this.field_82666_h);
      if(lvt_3_1_ == lvt_5_1_ && lvt_4_1_ == lvt_6_1_) {
         boolean lvt_8_1_ = this.field_75039_c.func_72959_q().func_76940_a(lvt_3_1_ * 16 + 8, lvt_4_1_ * 16 + 8, 0, field_75055_e);
         if(lvt_8_1_) {
            return true;
         }
      }

      return false;
   }

   protected StructureStart func_75049_b(int p_75049_1_, int p_75049_2_) {
      return new MapGenVillage.Start(this.field_75039_c, this.field_75038_b, p_75049_1_, p_75049_2_, this.field_75054_f);
   }

   public static class Start extends StructureStart {
      private boolean field_75076_c;

      public Start() {
      }

      public Start(World p_i2092_1_, Random p_i2092_2_, int p_i2092_3_, int p_i2092_4_, int p_i2092_5_) {
         super(p_i2092_3_, p_i2092_4_);
         List<StructureVillagePieces.PieceWeight> lvt_6_1_ = StructureVillagePieces.func_75084_a(p_i2092_2_, p_i2092_5_);
         StructureVillagePieces.Start lvt_7_1_ = new StructureVillagePieces.Start(p_i2092_1_.func_72959_q(), 0, p_i2092_2_, (p_i2092_3_ << 4) + 2, (p_i2092_4_ << 4) + 2, lvt_6_1_, p_i2092_5_);
         this.field_75075_a.add(lvt_7_1_);
         lvt_7_1_.func_74861_a(lvt_7_1_, this.field_75075_a, p_i2092_2_);
         List<StructureComponent> lvt_8_1_ = lvt_7_1_.field_74930_j;
         List<StructureComponent> lvt_9_1_ = lvt_7_1_.field_74932_i;

         while(!lvt_8_1_.isEmpty() || !lvt_9_1_.isEmpty()) {
            if(lvt_8_1_.isEmpty()) {
               int lvt_10_1_ = p_i2092_2_.nextInt(lvt_9_1_.size());
               StructureComponent lvt_11_1_ = (StructureComponent)lvt_9_1_.remove(lvt_10_1_);
               lvt_11_1_.func_74861_a(lvt_7_1_, this.field_75075_a, p_i2092_2_);
            } else {
               int lvt_10_2_ = p_i2092_2_.nextInt(lvt_8_1_.size());
               StructureComponent lvt_11_2_ = (StructureComponent)lvt_8_1_.remove(lvt_10_2_);
               lvt_11_2_.func_74861_a(lvt_7_1_, this.field_75075_a, p_i2092_2_);
            }
         }

         this.func_75072_c();
         int lvt_10_3_ = 0;

         for(StructureComponent lvt_12_1_ : this.field_75075_a) {
            if(!(lvt_12_1_ instanceof StructureVillagePieces.Road)) {
               ++lvt_10_3_;
            }
         }

         this.field_75076_c = lvt_10_3_ > 2;
      }

      public boolean func_75069_d() {
         return this.field_75076_c;
      }

      public void func_143022_a(NBTTagCompound p_143022_1_) {
         super.func_143022_a(p_143022_1_);
         p_143022_1_.func_74757_a("Valid", this.field_75076_c);
      }

      public void func_143017_b(NBTTagCompound p_143017_1_) {
         super.func_143017_b(p_143017_1_);
         this.field_75076_c = p_143017_1_.func_74767_n("Valid");
      }
   }
}
