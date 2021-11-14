package net.minecraft.client.gui.spectator.categories;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSpectator;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;
import net.minecraft.client.gui.spectator.PlayerMenuObject;
import net.minecraft.client.gui.spectator.SpectatorMenu;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.WorldSettings;

public class TeleportToPlayer implements ISpectatorMenuView, ISpectatorMenuObject {
   private static final Ordering<NetworkPlayerInfo> field_178674_a = Ordering.from(new Comparator<NetworkPlayerInfo>() {
      public int compare(NetworkPlayerInfo p_compare_1_, NetworkPlayerInfo p_compare_2_) {
         return ComparisonChain.start().compare(p_compare_1_.func_178845_a().getId(), p_compare_2_.func_178845_a().getId()).result();
      }

      // $FF: synthetic method
      public int compare(Object p_compare_1_, Object p_compare_2_) {
         return this.compare((NetworkPlayerInfo)p_compare_1_, (NetworkPlayerInfo)p_compare_2_);
      }
   });
   private final List<ISpectatorMenuObject> field_178673_b;

   public TeleportToPlayer() {
      this(field_178674_a.sortedCopy(Minecraft.func_71410_x().func_147114_u().func_175106_d()));
   }

   public TeleportToPlayer(Collection<NetworkPlayerInfo> p_i45493_1_) {
      this.field_178673_b = Lists.newArrayList();

      for(NetworkPlayerInfo lvt_3_1_ : field_178674_a.sortedCopy(p_i45493_1_)) {
         if(lvt_3_1_.func_178848_b() != WorldSettings.GameType.SPECTATOR) {
            this.field_178673_b.add(new PlayerMenuObject(lvt_3_1_.func_178845_a()));
         }
      }

   }

   public List<ISpectatorMenuObject> func_178669_a() {
      return this.field_178673_b;
   }

   public IChatComponent func_178670_b() {
      return new ChatComponentText("Select a player to teleport to");
   }

   public void func_178661_a(SpectatorMenu p_178661_1_) {
      p_178661_1_.func_178647_a(this);
   }

   public IChatComponent func_178664_z_() {
      return new ChatComponentText("Teleport to player");
   }

   public void func_178663_a(float p_178663_1_, int p_178663_2_) {
      Minecraft.func_71410_x().func_110434_K().func_110577_a(GuiSpectator.field_175269_a);
      Gui.func_146110_a(0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   public boolean func_178662_A_() {
      return !this.field_178673_b.isEmpty();
   }
}
