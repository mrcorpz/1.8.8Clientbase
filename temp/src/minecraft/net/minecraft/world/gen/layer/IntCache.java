package net.minecraft.world.gen.layer;

import com.google.common.collect.Lists;
import java.util.List;

public class IntCache {
   private static int field_76451_a = 256;
   private static List<int[]> field_76449_b = Lists.newArrayList();
   private static List<int[]> field_76450_c = Lists.newArrayList();
   private static List<int[]> field_76447_d = Lists.newArrayList();
   private static List<int[]> field_76448_e = Lists.newArrayList();

   public static synchronized int[] func_76445_a(int p_76445_0_) {
      if(p_76445_0_ <= 256) {
         if(field_76449_b.isEmpty()) {
            int[] lvt_1_1_ = new int[256];
            field_76450_c.add(lvt_1_1_);
            return lvt_1_1_;
         } else {
            int[] lvt_1_2_ = (int[])field_76449_b.remove(field_76449_b.size() - 1);
            field_76450_c.add(lvt_1_2_);
            return lvt_1_2_;
         }
      } else if(p_76445_0_ > field_76451_a) {
         field_76451_a = p_76445_0_;
         field_76447_d.clear();
         field_76448_e.clear();
         int[] lvt_1_3_ = new int[field_76451_a];
         field_76448_e.add(lvt_1_3_);
         return lvt_1_3_;
      } else if(field_76447_d.isEmpty()) {
         int[] lvt_1_4_ = new int[field_76451_a];
         field_76448_e.add(lvt_1_4_);
         return lvt_1_4_;
      } else {
         int[] lvt_1_5_ = (int[])field_76447_d.remove(field_76447_d.size() - 1);
         field_76448_e.add(lvt_1_5_);
         return lvt_1_5_;
      }
   }

   public static synchronized void func_76446_a() {
      if(!field_76447_d.isEmpty()) {
         field_76447_d.remove(field_76447_d.size() - 1);
      }

      if(!field_76449_b.isEmpty()) {
         field_76449_b.remove(field_76449_b.size() - 1);
      }

      field_76447_d.addAll(field_76448_e);
      field_76449_b.addAll(field_76450_c);
      field_76448_e.clear();
      field_76450_c.clear();
   }

   public static synchronized String func_85144_b() {
      return "cache: " + field_76447_d.size() + ", tcache: " + field_76449_b.size() + ", allocated: " + field_76448_e.size() + ", tallocated: " + field_76450_c.size();
   }
}
