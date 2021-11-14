package net.minecraft.command;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.NumberInvalidException;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class CommandReplaceItem extends CommandBase {
   private static final Map<String, Integer> field_175785_a = Maps.newHashMap();

   public String func_71517_b() {
      return "replaceitem";
   }

   public int func_82362_a() {
      return 2;
   }

   public String func_71518_a(ICommandSender p_71518_1_) {
      return "commands.replaceitem.usage";
   }

   public void func_71515_b(ICommandSender p_71515_1_, String[] p_71515_2_) throws CommandException {
      if(p_71515_2_.length < 1) {
         throw new WrongUsageException("commands.replaceitem.usage", new Object[0]);
      } else {
         boolean lvt_3_1_;
         if(p_71515_2_[0].equals("entity")) {
            lvt_3_1_ = false;
         } else {
            if(!p_71515_2_[0].equals("block")) {
               throw new WrongUsageException("commands.replaceitem.usage", new Object[0]);
            }

            lvt_3_1_ = true;
         }

         int lvt_4_1_;
         if(lvt_3_1_) {
            if(p_71515_2_.length < 6) {
               throw new WrongUsageException("commands.replaceitem.block.usage", new Object[0]);
            }

            lvt_4_1_ = 4;
         } else {
            if(p_71515_2_.length < 4) {
               throw new WrongUsageException("commands.replaceitem.entity.usage", new Object[0]);
            }

            lvt_4_1_ = 2;
         }

         int lvt_5_1_ = this.func_175783_e(p_71515_2_[lvt_4_1_++]);

         Item lvt_6_1_;
         try {
            lvt_6_1_ = func_147179_f(p_71515_1_, p_71515_2_[lvt_4_1_]);
         } catch (NumberInvalidException var15) {
            if(Block.func_149684_b(p_71515_2_[lvt_4_1_]) != Blocks.field_150350_a) {
               throw var15;
            }

            lvt_6_1_ = null;
         }

         ++lvt_4_1_;
         int lvt_7_2_ = p_71515_2_.length > lvt_4_1_?func_175764_a(p_71515_2_[lvt_4_1_++], 1, 64):1;
         int lvt_8_1_ = p_71515_2_.length > lvt_4_1_?func_175755_a(p_71515_2_[lvt_4_1_++]):0;
         ItemStack lvt_9_1_ = new ItemStack(lvt_6_1_, lvt_7_2_, lvt_8_1_);
         if(p_71515_2_.length > lvt_4_1_) {
            String lvt_10_1_ = func_147178_a(p_71515_1_, p_71515_2_, lvt_4_1_).func_150260_c();

            try {
               lvt_9_1_.func_77982_d(JsonToNBT.func_180713_a(lvt_10_1_));
            } catch (NBTException var14) {
               throw new CommandException("commands.replaceitem.tagError", new Object[]{var14.getMessage()});
            }
         }

         if(lvt_9_1_.func_77973_b() == null) {
            lvt_9_1_ = null;
         }

         if(lvt_3_1_) {
            p_71515_1_.func_174794_a(CommandResultStats.Type.AFFECTED_ITEMS, 0);
            BlockPos lvt_10_2_ = func_175757_a(p_71515_1_, p_71515_2_, 1, false);
            World lvt_11_2_ = p_71515_1_.func_130014_f_();
            TileEntity lvt_12_1_ = lvt_11_2_.func_175625_s(lvt_10_2_);
            if(lvt_12_1_ == null || !(lvt_12_1_ instanceof IInventory)) {
               throw new CommandException("commands.replaceitem.noContainer", new Object[]{Integer.valueOf(lvt_10_2_.func_177958_n()), Integer.valueOf(lvt_10_2_.func_177956_o()), Integer.valueOf(lvt_10_2_.func_177952_p())});
            }

            IInventory lvt_13_1_ = (IInventory)lvt_12_1_;
            if(lvt_5_1_ >= 0 && lvt_5_1_ < lvt_13_1_.func_70302_i_()) {
               lvt_13_1_.func_70299_a(lvt_5_1_, lvt_9_1_);
            }
         } else {
            Entity lvt_10_3_ = func_175768_b(p_71515_1_, p_71515_2_[1]);
            p_71515_1_.func_174794_a(CommandResultStats.Type.AFFECTED_ITEMS, 0);
            if(lvt_10_3_ instanceof EntityPlayer) {
               ((EntityPlayer)lvt_10_3_).field_71069_bz.func_75142_b();
            }

            if(!lvt_10_3_.func_174820_d(lvt_5_1_, lvt_9_1_)) {
               throw new CommandException("commands.replaceitem.failed", new Object[]{Integer.valueOf(lvt_5_1_), Integer.valueOf(lvt_7_2_), lvt_9_1_ == null?"Air":lvt_9_1_.func_151000_E()});
            }

            if(lvt_10_3_ instanceof EntityPlayer) {
               ((EntityPlayer)lvt_10_3_).field_71069_bz.func_75142_b();
            }
         }

         p_71515_1_.func_174794_a(CommandResultStats.Type.AFFECTED_ITEMS, lvt_7_2_);
         func_152373_a(p_71515_1_, this, "commands.replaceitem.success", new Object[]{Integer.valueOf(lvt_5_1_), Integer.valueOf(lvt_7_2_), lvt_9_1_ == null?"Air":lvt_9_1_.func_151000_E()});
      }
   }

   private int func_175783_e(String p_175783_1_) throws CommandException {
      if(!field_175785_a.containsKey(p_175783_1_)) {
         throw new CommandException("commands.generic.parameter.invalid", new Object[]{p_175783_1_});
      } else {
         return ((Integer)field_175785_a.get(p_175783_1_)).intValue();
      }
   }

   public List<String> func_180525_a(ICommandSender p_180525_1_, String[] p_180525_2_, BlockPos p_180525_3_) {
      return p_180525_2_.length == 1?func_71530_a(p_180525_2_, new String[]{"entity", "block"}):(p_180525_2_.length == 2 && p_180525_2_[0].equals("entity")?func_71530_a(p_180525_2_, this.func_175784_d()):(p_180525_2_.length >= 2 && p_180525_2_.length <= 4 && p_180525_2_[0].equals("block")?func_175771_a(p_180525_2_, 1, p_180525_3_):((p_180525_2_.length != 3 || !p_180525_2_[0].equals("entity")) && (p_180525_2_.length != 5 || !p_180525_2_[0].equals("block"))?((p_180525_2_.length != 4 || !p_180525_2_[0].equals("entity")) && (p_180525_2_.length != 6 || !p_180525_2_[0].equals("block"))?null:func_175762_a(p_180525_2_, Item.field_150901_e.func_148742_b())):func_175762_a(p_180525_2_, field_175785_a.keySet()))));
   }

   protected String[] func_175784_d() {
      return MinecraftServer.func_71276_C().func_71213_z();
   }

   public boolean func_82358_a(String[] p_82358_1_, int p_82358_2_) {
      return p_82358_1_.length > 0 && p_82358_1_[0].equals("entity") && p_82358_2_ == 1;
   }

   static {
      for(int lvt_0_1_ = 0; lvt_0_1_ < 54; ++lvt_0_1_) {
         field_175785_a.put("slot.container." + lvt_0_1_, Integer.valueOf(lvt_0_1_));
      }

      for(int lvt_0_2_ = 0; lvt_0_2_ < 9; ++lvt_0_2_) {
         field_175785_a.put("slot.hotbar." + lvt_0_2_, Integer.valueOf(lvt_0_2_));
      }

      for(int lvt_0_3_ = 0; lvt_0_3_ < 27; ++lvt_0_3_) {
         field_175785_a.put("slot.inventory." + lvt_0_3_, Integer.valueOf(9 + lvt_0_3_));
      }

      for(int lvt_0_4_ = 0; lvt_0_4_ < 27; ++lvt_0_4_) {
         field_175785_a.put("slot.enderchest." + lvt_0_4_, Integer.valueOf(200 + lvt_0_4_));
      }

      for(int lvt_0_5_ = 0; lvt_0_5_ < 8; ++lvt_0_5_) {
         field_175785_a.put("slot.villager." + lvt_0_5_, Integer.valueOf(300 + lvt_0_5_));
      }

      for(int lvt_0_6_ = 0; lvt_0_6_ < 15; ++lvt_0_6_) {
         field_175785_a.put("slot.horse." + lvt_0_6_, Integer.valueOf(500 + lvt_0_6_));
      }

      field_175785_a.put("slot.weapon", Integer.valueOf(99));
      field_175785_a.put("slot.armor.head", Integer.valueOf(103));
      field_175785_a.put("slot.armor.chest", Integer.valueOf(102));
      field_175785_a.put("slot.armor.legs", Integer.valueOf(101));
      field_175785_a.put("slot.armor.feet", Integer.valueOf(100));
      field_175785_a.put("slot.horse.saddle", Integer.valueOf(400));
      field_175785_a.put("slot.horse.armor", Integer.valueOf(401));
      field_175785_a.put("slot.horse.chest", Integer.valueOf(499));
   }
}
