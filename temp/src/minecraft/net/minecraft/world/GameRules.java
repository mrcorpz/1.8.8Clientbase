package net.minecraft.world;

import java.util.Set;
import java.util.TreeMap;
import net.minecraft.nbt.NBTTagCompound;

public class GameRules {
   private TreeMap<String, GameRules.Value> field_82771_a = new TreeMap();

   public GameRules() {
      this.func_180262_a("doFireTick", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("mobGriefing", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("keepInventory", "false", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("doMobSpawning", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("doMobLoot", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("doTileDrops", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("doEntityDrops", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("commandBlockOutput", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("naturalRegeneration", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("doDaylightCycle", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("logAdminCommands", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("showDeathMessages", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("randomTickSpeed", "3", GameRules.ValueType.NUMERICAL_VALUE);
      this.func_180262_a("sendCommandFeedback", "true", GameRules.ValueType.BOOLEAN_VALUE);
      this.func_180262_a("reducedDebugInfo", "false", GameRules.ValueType.BOOLEAN_VALUE);
   }

   public void func_180262_a(String p_180262_1_, String p_180262_2_, GameRules.ValueType p_180262_3_) {
      this.field_82771_a.put(p_180262_1_, new GameRules.Value(p_180262_2_, p_180262_3_));
   }

   public void func_82764_b(String p_82764_1_, String p_82764_2_) {
      GameRules.Value lvt_3_1_ = (GameRules.Value)this.field_82771_a.get(p_82764_1_);
      if(lvt_3_1_ != null) {
         lvt_3_1_.func_82757_a(p_82764_2_);
      } else {
         this.func_180262_a(p_82764_1_, p_82764_2_, GameRules.ValueType.ANY_VALUE);
      }

   }

   public String func_82767_a(String p_82767_1_) {
      GameRules.Value lvt_2_1_ = (GameRules.Value)this.field_82771_a.get(p_82767_1_);
      return lvt_2_1_ != null?lvt_2_1_.func_82756_a():"";
   }

   public boolean func_82766_b(String p_82766_1_) {
      GameRules.Value lvt_2_1_ = (GameRules.Value)this.field_82771_a.get(p_82766_1_);
      return lvt_2_1_ != null?lvt_2_1_.func_82758_b():false;
   }

   public int func_180263_c(String p_180263_1_) {
      GameRules.Value lvt_2_1_ = (GameRules.Value)this.field_82771_a.get(p_180263_1_);
      return lvt_2_1_ != null?lvt_2_1_.func_180255_c():0;
   }

   public NBTTagCompound func_82770_a() {
      NBTTagCompound lvt_1_1_ = new NBTTagCompound();

      for(String lvt_3_1_ : this.field_82771_a.keySet()) {
         GameRules.Value lvt_4_1_ = (GameRules.Value)this.field_82771_a.get(lvt_3_1_);
         lvt_1_1_.func_74778_a(lvt_3_1_, lvt_4_1_.func_82756_a());
      }

      return lvt_1_1_;
   }

   public void func_82768_a(NBTTagCompound p_82768_1_) {
      for(String lvt_4_1_ : p_82768_1_.func_150296_c()) {
         String lvt_6_1_ = p_82768_1_.func_74779_i(lvt_4_1_);
         this.func_82764_b(lvt_4_1_, lvt_6_1_);
      }

   }

   public String[] func_82763_b() {
      Set<String> lvt_1_1_ = this.field_82771_a.keySet();
      return (String[])lvt_1_1_.toArray(new String[lvt_1_1_.size()]);
   }

   public boolean func_82765_e(String p_82765_1_) {
      return this.field_82771_a.containsKey(p_82765_1_);
   }

   public boolean func_180264_a(String p_180264_1_, GameRules.ValueType p_180264_2_) {
      GameRules.Value lvt_3_1_ = (GameRules.Value)this.field_82771_a.get(p_180264_1_);
      return lvt_3_1_ != null && (lvt_3_1_.func_180254_e() == p_180264_2_ || p_180264_2_ == GameRules.ValueType.ANY_VALUE);
   }

   static class Value {
      private String field_82762_a;
      private boolean field_82760_b;
      private int field_82761_c;
      private double field_82759_d;
      private final GameRules.ValueType field_180256_e;

      public Value(String p_i45751_1_, GameRules.ValueType p_i45751_2_) {
         this.field_180256_e = p_i45751_2_;
         this.func_82757_a(p_i45751_1_);
      }

      public void func_82757_a(String p_82757_1_) {
         this.field_82762_a = p_82757_1_;
         this.field_82760_b = Boolean.parseBoolean(p_82757_1_);
         this.field_82761_c = this.field_82760_b?1:0;

         try {
            this.field_82761_c = Integer.parseInt(p_82757_1_);
         } catch (NumberFormatException var4) {
            ;
         }

         try {
            this.field_82759_d = Double.parseDouble(p_82757_1_);
         } catch (NumberFormatException var3) {
            ;
         }

      }

      public String func_82756_a() {
         return this.field_82762_a;
      }

      public boolean func_82758_b() {
         return this.field_82760_b;
      }

      public int func_180255_c() {
         return this.field_82761_c;
      }

      public GameRules.ValueType func_180254_e() {
         return this.field_180256_e;
      }
   }

   public static enum ValueType {
      ANY_VALUE,
      BOOLEAN_VALUE,
      NUMERICAL_VALUE;
   }
}
