package net.minecraft.world.chunk.storage;

public class NibbleArrayReader {
   public final byte[] field_76689_a;
   private final int field_76687_b;
   private final int field_76688_c;

   public NibbleArrayReader(byte[] p_i1998_1_, int p_i1998_2_) {
      this.field_76689_a = p_i1998_1_;
      this.field_76687_b = p_i1998_2_;
      this.field_76688_c = p_i1998_2_ + 4;
   }

   public int func_76686_a(int p_76686_1_, int p_76686_2_, int p_76686_3_) {
      int lvt_4_1_ = p_76686_1_ << this.field_76688_c | p_76686_3_ << this.field_76687_b | p_76686_2_;
      int lvt_5_1_ = lvt_4_1_ >> 1;
      int lvt_6_1_ = lvt_4_1_ & 1;
      return lvt_6_1_ == 0?this.field_76689_a[lvt_5_1_] & 15:this.field_76689_a[lvt_5_1_] >> 4 & 15;
   }
}
