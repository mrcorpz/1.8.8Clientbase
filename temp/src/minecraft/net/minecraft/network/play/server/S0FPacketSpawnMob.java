package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.List;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.util.MathHelper;

public class S0FPacketSpawnMob implements Packet<INetHandlerPlayClient> {
   private int field_149042_a;
   private int field_149040_b;
   private int field_149041_c;
   private int field_149038_d;
   private int field_149039_e;
   private int field_149036_f;
   private int field_149037_g;
   private int field_149047_h;
   private byte field_149048_i;
   private byte field_149045_j;
   private byte field_149046_k;
   private DataWatcher field_149043_l;
   private List<DataWatcher.WatchableObject> field_149044_m;

   public S0FPacketSpawnMob() {
   }

   public S0FPacketSpawnMob(EntityLivingBase p_i45192_1_) {
      this.field_149042_a = p_i45192_1_.func_145782_y();
      this.field_149040_b = (byte)EntityList.func_75619_a(p_i45192_1_);
      this.field_149041_c = MathHelper.func_76128_c(p_i45192_1_.field_70165_t * 32.0D);
      this.field_149038_d = MathHelper.func_76128_c(p_i45192_1_.field_70163_u * 32.0D);
      this.field_149039_e = MathHelper.func_76128_c(p_i45192_1_.field_70161_v * 32.0D);
      this.field_149048_i = (byte)((int)(p_i45192_1_.field_70177_z * 256.0F / 360.0F));
      this.field_149045_j = (byte)((int)(p_i45192_1_.field_70125_A * 256.0F / 360.0F));
      this.field_149046_k = (byte)((int)(p_i45192_1_.field_70759_as * 256.0F / 360.0F));
      double lvt_2_1_ = 3.9D;
      double lvt_4_1_ = p_i45192_1_.field_70159_w;
      double lvt_6_1_ = p_i45192_1_.field_70181_x;
      double lvt_8_1_ = p_i45192_1_.field_70179_y;
      if(lvt_4_1_ < -lvt_2_1_) {
         lvt_4_1_ = -lvt_2_1_;
      }

      if(lvt_6_1_ < -lvt_2_1_) {
         lvt_6_1_ = -lvt_2_1_;
      }

      if(lvt_8_1_ < -lvt_2_1_) {
         lvt_8_1_ = -lvt_2_1_;
      }

      if(lvt_4_1_ > lvt_2_1_) {
         lvt_4_1_ = lvt_2_1_;
      }

      if(lvt_6_1_ > lvt_2_1_) {
         lvt_6_1_ = lvt_2_1_;
      }

      if(lvt_8_1_ > lvt_2_1_) {
         lvt_8_1_ = lvt_2_1_;
      }

      this.field_149036_f = (int)(lvt_4_1_ * 8000.0D);
      this.field_149037_g = (int)(lvt_6_1_ * 8000.0D);
      this.field_149047_h = (int)(lvt_8_1_ * 8000.0D);
      this.field_149043_l = p_i45192_1_.func_70096_w();
   }

   public void func_148837_a(PacketBuffer p_148837_1_) throws IOException {
      this.field_149042_a = p_148837_1_.func_150792_a();
      this.field_149040_b = p_148837_1_.readByte() & 255;
      this.field_149041_c = p_148837_1_.readInt();
      this.field_149038_d = p_148837_1_.readInt();
      this.field_149039_e = p_148837_1_.readInt();
      this.field_149048_i = p_148837_1_.readByte();
      this.field_149045_j = p_148837_1_.readByte();
      this.field_149046_k = p_148837_1_.readByte();
      this.field_149036_f = p_148837_1_.readShort();
      this.field_149037_g = p_148837_1_.readShort();
      this.field_149047_h = p_148837_1_.readShort();
      this.field_149044_m = DataWatcher.func_151508_b(p_148837_1_);
   }

   public void func_148840_b(PacketBuffer p_148840_1_) throws IOException {
      p_148840_1_.func_150787_b(this.field_149042_a);
      p_148840_1_.writeByte(this.field_149040_b & 255);
      p_148840_1_.writeInt(this.field_149041_c);
      p_148840_1_.writeInt(this.field_149038_d);
      p_148840_1_.writeInt(this.field_149039_e);
      p_148840_1_.writeByte(this.field_149048_i);
      p_148840_1_.writeByte(this.field_149045_j);
      p_148840_1_.writeByte(this.field_149046_k);
      p_148840_1_.writeShort(this.field_149036_f);
      p_148840_1_.writeShort(this.field_149037_g);
      p_148840_1_.writeShort(this.field_149047_h);
      this.field_149043_l.func_151509_a(p_148840_1_);
   }

   public void func_148833_a(INetHandlerPlayClient p_148833_1_) {
      p_148833_1_.func_147281_a(this);
   }

   public List<DataWatcher.WatchableObject> func_149027_c() {
      if(this.field_149044_m == null) {
         this.field_149044_m = this.field_149043_l.func_75685_c();
      }

      return this.field_149044_m;
   }

   public int func_149024_d() {
      return this.field_149042_a;
   }

   public int func_149025_e() {
      return this.field_149040_b;
   }

   public int func_149023_f() {
      return this.field_149041_c;
   }

   public int func_149034_g() {
      return this.field_149038_d;
   }

   public int func_149029_h() {
      return this.field_149039_e;
   }

   public int func_149026_i() {
      return this.field_149036_f;
   }

   public int func_149033_j() {
      return this.field_149037_g;
   }

   public int func_149031_k() {
      return this.field_149047_h;
   }

   public byte func_149028_l() {
      return this.field_149048_i;
   }

   public byte func_149030_m() {
      return this.field_149045_j;
   }

   public byte func_149032_n() {
      return this.field_149046_k;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void func_148833_a(INetHandler p_148833_1_) {
      this.func_148833_a((INetHandlerPlayClient)p_148833_1_);
   }
}
