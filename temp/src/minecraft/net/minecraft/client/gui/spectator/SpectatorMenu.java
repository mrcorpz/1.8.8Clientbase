package net.minecraft.client.gui.spectator;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSpectator;
import net.minecraft.client.gui.spectator.BaseSpectatorGroup;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import net.minecraft.client.gui.spectator.ISpectatorMenuRecipient;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;
import net.minecraft.client.gui.spectator.categories.SpectatorDetails;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class SpectatorMenu {
   private static final ISpectatorMenuObject field_178655_b = new SpectatorMenu.EndSpectatorObject();
   private static final ISpectatorMenuObject field_178656_c = new SpectatorMenu.MoveMenuObject(-1, true);
   private static final ISpectatorMenuObject field_178653_d = new SpectatorMenu.MoveMenuObject(1, true);
   private static final ISpectatorMenuObject field_178654_e = new SpectatorMenu.MoveMenuObject(1, false);
   public static final ISpectatorMenuObject field_178657_a = new ISpectatorMenuObject() {
      public void func_178661_a(SpectatorMenu p_178661_1_) {
      }

      public IChatComponent func_178664_z_() {
         return new ChatComponentText("");
      }

      public void func_178663_a(float p_178663_1_, int p_178663_2_) {
      }

      public boolean func_178662_A_() {
         return false;
      }
   };
   private final ISpectatorMenuRecipient field_178651_f;
   private final List<SpectatorDetails> field_178652_g = Lists.newArrayList();
   private ISpectatorMenuView field_178659_h = new BaseSpectatorGroup();
   private int field_178660_i = -1;
   private int field_178658_j;

   public SpectatorMenu(ISpectatorMenuRecipient p_i45497_1_) {
      this.field_178651_f = p_i45497_1_;
   }

   public ISpectatorMenuObject func_178643_a(int p_178643_1_) {
      int lvt_2_1_ = p_178643_1_ + this.field_178658_j * 6;
      return this.field_178658_j > 0 && p_178643_1_ == 0?field_178656_c:(p_178643_1_ == 7?(lvt_2_1_ < this.field_178659_h.func_178669_a().size()?field_178653_d:field_178654_e):(p_178643_1_ == 8?field_178655_b:(lvt_2_1_ >= 0 && lvt_2_1_ < this.field_178659_h.func_178669_a().size()?(ISpectatorMenuObject)Objects.firstNonNull(this.field_178659_h.func_178669_a().get(lvt_2_1_), field_178657_a):field_178657_a)));
   }

   public List<ISpectatorMenuObject> func_178642_a() {
      List<ISpectatorMenuObject> lvt_1_1_ = Lists.newArrayList();

      for(int lvt_2_1_ = 0; lvt_2_1_ <= 8; ++lvt_2_1_) {
         lvt_1_1_.add(this.func_178643_a(lvt_2_1_));
      }

      return lvt_1_1_;
   }

   public ISpectatorMenuObject func_178645_b() {
      return this.func_178643_a(this.field_178660_i);
   }

   public ISpectatorMenuView func_178650_c() {
      return this.field_178659_h;
   }

   public void func_178644_b(int p_178644_1_) {
      ISpectatorMenuObject lvt_2_1_ = this.func_178643_a(p_178644_1_);
      if(lvt_2_1_ != field_178657_a) {
         if(this.field_178660_i == p_178644_1_ && lvt_2_1_.func_178662_A_()) {
            lvt_2_1_.func_178661_a(this);
         } else {
            this.field_178660_i = p_178644_1_;
         }
      }

   }

   public void func_178641_d() {
      this.field_178651_f.func_175257_a(this);
   }

   public int func_178648_e() {
      return this.field_178660_i;
   }

   public void func_178647_a(ISpectatorMenuView p_178647_1_) {
      this.field_178652_g.add(this.func_178646_f());
      this.field_178659_h = p_178647_1_;
      this.field_178660_i = -1;
      this.field_178658_j = 0;
   }

   public SpectatorDetails func_178646_f() {
      return new SpectatorDetails(this.field_178659_h, this.func_178642_a(), this.field_178660_i);
   }

   static class EndSpectatorObject implements ISpectatorMenuObject {
      private EndSpectatorObject() {
      }

      public void func_178661_a(SpectatorMenu p_178661_1_) {
         p_178661_1_.func_178641_d();
      }

      public IChatComponent func_178664_z_() {
         return new ChatComponentText("Close menu");
      }

      public void func_178663_a(float p_178663_1_, int p_178663_2_) {
         Minecraft.func_71410_x().func_110434_K().func_110577_a(GuiSpectator.field_175269_a);
         Gui.func_146110_a(0, 0, 128.0F, 0.0F, 16, 16, 256.0F, 256.0F);
      }

      public boolean func_178662_A_() {
         return true;
      }
   }

   static class MoveMenuObject implements ISpectatorMenuObject {
      private final int field_178666_a;
      private final boolean field_178665_b;

      public MoveMenuObject(int p_i45495_1_, boolean p_i45495_2_) {
         this.field_178666_a = p_i45495_1_;
         this.field_178665_b = p_i45495_2_;
      }

      public void func_178661_a(SpectatorMenu p_178661_1_) {
         p_178661_1_.field_178658_j = this.field_178666_a;
      }

      public IChatComponent func_178664_z_() {
         return this.field_178666_a < 0?new ChatComponentText("Previous Page"):new ChatComponentText("Next Page");
      }

      public void func_178663_a(float p_178663_1_, int p_178663_2_) {
         Minecraft.func_71410_x().func_110434_K().func_110577_a(GuiSpectator.field_175269_a);
         if(this.field_178666_a < 0) {
            Gui.func_146110_a(0, 0, 144.0F, 0.0F, 16, 16, 256.0F, 256.0F);
         } else {
            Gui.func_146110_a(0, 0, 160.0F, 0.0F, 16, 16, 256.0F, 256.0F);
         }

      }

      public boolean func_178662_A_() {
         return this.field_178665_b;
      }
   }
}
