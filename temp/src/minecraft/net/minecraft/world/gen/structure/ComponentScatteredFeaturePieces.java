package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;

public class ComponentScatteredFeaturePieces {
   public static void func_143045_a() {
      MapGenStructureIO.func_143031_a(ComponentScatteredFeaturePieces.DesertPyramid.class, "TeDP");
      MapGenStructureIO.func_143031_a(ComponentScatteredFeaturePieces.JunglePyramid.class, "TeJP");
      MapGenStructureIO.func_143031_a(ComponentScatteredFeaturePieces.SwampHut.class, "TeSH");
   }

   public static class DesertPyramid extends ComponentScatteredFeaturePieces.Feature {
      private boolean[] field_74940_h = new boolean[4];
      private static final List<WeightedRandomChestContent> field_74941_i = Lists.newArrayList(new WeightedRandomChestContent[]{new WeightedRandomChestContent(Items.field_151045_i, 0, 1, 3, 3), new WeightedRandomChestContent(Items.field_151042_j, 0, 1, 5, 10), new WeightedRandomChestContent(Items.field_151043_k, 0, 2, 7, 15), new WeightedRandomChestContent(Items.field_151166_bC, 0, 1, 3, 2), new WeightedRandomChestContent(Items.field_151103_aS, 0, 4, 6, 20), new WeightedRandomChestContent(Items.field_151078_bh, 0, 3, 7, 16), new WeightedRandomChestContent(Items.field_151141_av, 0, 1, 1, 3), new WeightedRandomChestContent(Items.field_151138_bX, 0, 1, 1, 1), new WeightedRandomChestContent(Items.field_151136_bY, 0, 1, 1, 1), new WeightedRandomChestContent(Items.field_151125_bZ, 0, 1, 1, 1)});

      public DesertPyramid() {
      }

      public DesertPyramid(Random p_i2062_1_, int p_i2062_2_, int p_i2062_3_) {
         super(p_i2062_1_, p_i2062_2_, 64, p_i2062_3_, 21, 15, 21);
      }

      protected void func_143012_a(NBTTagCompound p_143012_1_) {
         super.func_143012_a(p_143012_1_);
         p_143012_1_.func_74757_a("hasPlacedChest0", this.field_74940_h[0]);
         p_143012_1_.func_74757_a("hasPlacedChest1", this.field_74940_h[1]);
         p_143012_1_.func_74757_a("hasPlacedChest2", this.field_74940_h[2]);
         p_143012_1_.func_74757_a("hasPlacedChest3", this.field_74940_h[3]);
      }

      protected void func_143011_b(NBTTagCompound p_143011_1_) {
         super.func_143011_b(p_143011_1_);
         this.field_74940_h[0] = p_143011_1_.func_74767_n("hasPlacedChest0");
         this.field_74940_h[1] = p_143011_1_.func_74767_n("hasPlacedChest1");
         this.field_74940_h[2] = p_143011_1_.func_74767_n("hasPlacedChest2");
         this.field_74940_h[3] = p_143011_1_.func_74767_n("hasPlacedChest3");
      }

      public boolean func_74875_a(World p_74875_1_, Random p_74875_2_, StructureBoundingBox p_74875_3_) {
         this.func_175804_a(p_74875_1_, p_74875_3_, 0, -4, 0, this.field_74939_a - 1, 0, this.field_74938_c - 1, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);

         for(int lvt_4_1_ = 1; lvt_4_1_ <= 9; ++lvt_4_1_) {
            this.func_175804_a(p_74875_1_, p_74875_3_, lvt_4_1_, lvt_4_1_, lvt_4_1_, this.field_74939_a - 1 - lvt_4_1_, lvt_4_1_, this.field_74938_c - 1 - lvt_4_1_, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, lvt_4_1_ + 1, lvt_4_1_, lvt_4_1_ + 1, this.field_74939_a - 2 - lvt_4_1_, lvt_4_1_, this.field_74938_c - 2 - lvt_4_1_, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         }

         for(int lvt_4_2_ = 0; lvt_4_2_ < this.field_74939_a; ++lvt_4_2_) {
            for(int lvt_5_1_ = 0; lvt_5_1_ < this.field_74938_c; ++lvt_5_1_) {
               int lvt_6_1_ = -5;
               this.func_175808_b(p_74875_1_, Blocks.field_150322_A.func_176223_P(), lvt_4_2_, lvt_6_1_, lvt_5_1_, p_74875_3_);
            }
         }

         int lvt_4_3_ = this.func_151555_a(Blocks.field_150372_bz, 3);
         int lvt_5_2_ = this.func_151555_a(Blocks.field_150372_bz, 2);
         int lvt_6_2_ = this.func_151555_a(Blocks.field_150372_bz, 0);
         int lvt_7_1_ = this.func_151555_a(Blocks.field_150372_bz, 1);
         int lvt_8_1_ = ~EnumDyeColor.ORANGE.func_176767_b() & 15;
         int lvt_9_1_ = ~EnumDyeColor.BLUE.func_176767_b() & 15;
         this.func_175804_a(p_74875_1_, p_74875_3_, 0, 0, 0, 4, 9, 4, Blocks.field_150322_A.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 1, 10, 1, 3, 10, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), 2, 10, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_5_2_), 2, 10, 4, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_6_2_), 0, 10, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_7_1_), 4, 10, 2, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 5, 0, 0, this.field_74939_a - 1, 9, 4, Blocks.field_150322_A.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 4, 10, 1, this.field_74939_a - 2, 10, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), this.field_74939_a - 3, 10, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_5_2_), this.field_74939_a - 3, 10, 4, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_6_2_), this.field_74939_a - 5, 10, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_7_1_), this.field_74939_a - 1, 10, 2, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, 0, 0, 12, 4, 4, Blocks.field_150322_A.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 9, 1, 0, 11, 3, 4, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 9, 1, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 9, 2, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 9, 3, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 10, 3, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 11, 3, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 11, 2, 1, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 11, 1, 1, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 4, 1, 1, 8, 3, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 4, 1, 2, 8, 2, 2, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 12, 1, 1, 16, 3, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 12, 1, 2, 16, 2, 2, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 5, 4, 5, this.field_74939_a - 6, 4, this.field_74938_c - 6, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 9, 4, 9, 11, 4, 11, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, 1, 8, 8, 3, 8, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 12, 1, 8, 12, 3, 8, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, 1, 12, 8, 3, 12, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 12, 1, 12, 12, 3, 12, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 1, 1, 5, 4, 4, 11, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 5, 1, 5, this.field_74939_a - 2, 4, 11, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 6, 7, 9, 6, 7, 11, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 7, 7, 9, this.field_74939_a - 7, 7, 11, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 5, 5, 9, 5, 7, 11, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 6, 5, 9, this.field_74939_a - 6, 7, 11, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 5, 5, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 5, 6, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 6, 6, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), this.field_74939_a - 6, 5, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), this.field_74939_a - 6, 6, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), this.field_74939_a - 7, 6, 10, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 2, 4, 4, 2, 6, 4, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 3, 4, 4, this.field_74939_a - 3, 6, 4, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), 2, 4, 5, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), 2, 3, 4, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), this.field_74939_a - 3, 4, 5, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_4_3_), this.field_74939_a - 3, 3, 4, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 1, 1, 3, 2, 2, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 3, 1, 3, this.field_74939_a - 2, 2, 3, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176223_P(), 1, 1, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176223_P(), this.field_74939_a - 2, 1, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150333_U.func_176203_a(BlockStoneSlab.EnumType.SAND.func_176624_a()), 1, 2, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150333_U.func_176203_a(BlockStoneSlab.EnumType.SAND.func_176624_a()), this.field_74939_a - 2, 2, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_7_1_), 2, 1, 2, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150372_bz.func_176203_a(lvt_6_2_), this.field_74939_a - 3, 1, 2, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 4, 3, 5, 4, 3, 18, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 5, 3, 5, this.field_74939_a - 5, 3, 17, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 3, 1, 5, 4, 2, 16, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, this.field_74939_a - 6, 1, 5, this.field_74939_a - 5, 2, 16, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);

         for(int lvt_10_1_ = 5; lvt_10_1_ <= 17; lvt_10_1_ += 2) {
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 4, 1, lvt_10_1_, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 4, 2, lvt_10_1_, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), this.field_74939_a - 5, 1, lvt_10_1_, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), this.field_74939_a - 5, 2, lvt_10_1_, p_74875_3_);
         }

         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 10, 0, 7, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 10, 0, 8, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 9, 0, 9, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 11, 0, 9, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 8, 0, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 12, 0, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 7, 0, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 13, 0, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 9, 0, 11, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 11, 0, 11, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 10, 0, 12, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 10, 0, 13, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_9_1_), 10, 0, 10, p_74875_3_);

         for(int lvt_10_2_ = 0; lvt_10_2_ <= this.field_74939_a - 1; lvt_10_2_ += this.field_74939_a - 1) {
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 2, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 2, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 2, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 3, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 3, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 3, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 4, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), lvt_10_2_, 4, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 4, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 5, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 5, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 5, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 6, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), lvt_10_2_, 6, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 6, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 7, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 7, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_2_, 7, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 8, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 8, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_2_, 8, 3, p_74875_3_);
         }

         for(int lvt_10_3_ = 2; lvt_10_3_ <= this.field_74939_a - 3; lvt_10_3_ += this.field_74939_a - 3 - 2) {
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ - 1, 2, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_, 2, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ + 1, 2, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ - 1, 3, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_, 3, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ + 1, 3, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ - 1, 4, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), lvt_10_3_, 4, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ + 1, 4, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ - 1, 5, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_, 5, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ + 1, 5, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ - 1, 6, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), lvt_10_3_, 6, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ + 1, 6, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ - 1, 7, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_, 7, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), lvt_10_3_ + 1, 7, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ - 1, 8, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_, 8, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), lvt_10_3_ + 1, 8, 0, p_74875_3_);
         }

         this.func_175804_a(p_74875_1_, p_74875_3_, 8, 4, 0, 12, 6, 0, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 8, 6, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 12, 6, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 9, 5, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 10, 5, 0, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150406_ce.func_176203_a(lvt_8_1_), 11, 5, 0, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, -14, 8, 12, -11, 12, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, -10, 8, 12, -10, 12, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, -9, 8, 12, -9, 12, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 8, -8, 8, 12, -1, 12, Blocks.field_150322_A.func_176223_P(), Blocks.field_150322_A.func_176223_P(), false);
         this.func_175804_a(p_74875_1_, p_74875_3_, 9, -11, 9, 11, -1, 11, Blocks.field_150350_a.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150456_au.func_176223_P(), 10, -11, 10, p_74875_3_);
         this.func_175804_a(p_74875_1_, p_74875_3_, 9, -13, 9, 11, -13, 11, Blocks.field_150335_W.func_176223_P(), Blocks.field_150350_a.func_176223_P(), false);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 8, -11, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 8, -10, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 7, -10, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 7, -11, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 12, -11, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 12, -10, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 13, -10, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 13, -11, 10, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, -11, 8, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, -10, 8, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 10, -10, 7, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 10, -11, 7, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, -11, 12, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, -10, 12, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.CHISELED.func_176675_a()), 10, -10, 13, p_74875_3_);
         this.func_175811_a(p_74875_1_, Blocks.field_150322_A.func_176203_a(BlockSandStone.EnumType.SMOOTH.func_176675_a()), 10, -11, 13, p_74875_3_);

         for(EnumFacing lvt_11_1_ : EnumFacing.Plane.HORIZONTAL) {
            if(!this.field_74940_h[lvt_11_1_.func_176736_b()]) {
               int lvt_12_1_ = lvt_11_1_.func_82601_c() * 2;
               int lvt_13_1_ = lvt_11_1_.func_82599_e() * 2;
               this.field_74940_h[lvt_11_1_.func_176736_b()] = this.func_180778_a(p_74875_1_, p_74875_3_, p_74875_2_, 10 + lvt_12_1_, -11, 10 + lvt_13_1_, WeightedRandomChestContent.func_177629_a(field_74941_i, new WeightedRandomChestContent[]{Items.field_151134_bR.func_92114_b(p_74875_2_)}), 2 + p_74875_2_.nextInt(5));
            }
         }

         return true;
      }
   }

   abstract static class Feature extends StructureComponent {
      protected int field_74939_a;
      protected int field_74937_b;
      protected int field_74938_c;
      protected int field_74936_d = -1;

      public Feature() {
      }

      protected Feature(Random p_i2065_1_, int p_i2065_2_, int p_i2065_3_, int p_i2065_4_, int p_i2065_5_, int p_i2065_6_, int p_i2065_7_) {
         super(0);
         this.field_74939_a = p_i2065_5_;
         this.field_74937_b = p_i2065_6_;
         this.field_74938_c = p_i2065_7_;
         this.field_74885_f = EnumFacing.Plane.HORIZONTAL.func_179518_a(p_i2065_1_);
         switch(this.field_74885_f) {
         case NORTH:
         case SOUTH:
            this.field_74887_e = new StructureBoundingBox(p_i2065_2_, p_i2065_3_, p_i2065_4_, p_i2065_2_ + p_i2065_5_ - 1, p_i2065_3_ + p_i2065_6_ - 1, p_i2065_4_ + p_i2065_7_ - 1);
            break;
         default:
            this.field_74887_e = new StructureBoundingBox(p_i2065_2_, p_i2065_3_, p_i2065_4_, p_i2065_2_ + p_i2065_7_ - 1, p_i2065_3_ + p_i2065_6_ - 1, p_i2065_4_ + p_i2065_5_ - 1);
         }

      }

      protected void func_143012_a(NBTTagCompound p_143012_1_) {
         p_143012_1_.func_74768_a("Width", this.field_74939_a);
         p_143012_1_.func_74768_a("Height", this.field_74937_b);
         p_143012_1_.func_74768_a("Depth", this.field_74938_c);
         p_143012_1_.func_74768_a("HPos", this.field_74936_d);
      }

      protected void func_143011_b(NBTTagCompound p_143011_1_) {
         this.field_74939_a = p_143011_1_.func_74762_e("Width");
         this.field_74937_b = p_143011_1_.func_74762_e("Height");
         this.field_74938_c = p_143011_1_.func_74762_e("Depth");
         this.field_74936_d = p_143011_1_.func_74762_e("HPos");
      }

      protected boolean func_74935_a(World p_74935_1_, StructureBoundingBox p_74935_2_, int p_74935_3_) {
         if(this.field_74936_d >= 0) {
            return true;
         } else {
            int lvt_4_1_ = 0;
            int lvt_5_1_ = 0;
            BlockPos.MutableBlockPos lvt_6_1_ = new BlockPos.MutableBlockPos();

            for(int lvt_7_1_ = this.field_74887_e.field_78896_c; lvt_7_1_ <= this.field_74887_e.field_78892_f; ++lvt_7_1_) {
               for(int lvt_8_1_ = this.field_74887_e.field_78897_a; lvt_8_1_ <= this.field_74887_e.field_78893_d; ++lvt_8_1_) {
                  lvt_6_1_.func_181079_c(lvt_8_1_, 64, lvt_7_1_);
                  if(p_74935_2_.func_175898_b(lvt_6_1_)) {
                     lvt_4_1_ += Math.max(p_74935_1_.func_175672_r(lvt_6_1_).func_177956_o(), p_74935_1_.field_73011_w.func_76557_i());
                     ++lvt_5_1_;
                  }
               }
            }

            if(lvt_5_1_ == 0) {
               return false;
            } else {
               this.field_74936_d = lvt_4_1_ / lvt_5_1_;
               this.field_74887_e.func_78886_a(0, this.field_74936_d - this.field_74887_e.field_78895_b + p_74935_3_, 0);
               return true;
            }
         }
      }
   }

   public static class JunglePyramid extends ComponentScatteredFeaturePieces.Feature {
      private boolean field_74947_h;
      private boolean field_74948_i;
      private boolean field_74945_j;
      private boolean field_74946_k;
      private static final List<WeightedRandomChestContent> field_175816_i = Lists.newArrayList(new WeightedRandomChestContent[]{new WeightedRandomChestContent(Items.field_151045_i, 0, 1, 3, 3), new WeightedRandomChestContent(Items.field_151042_j, 0, 1, 5, 10), new WeightedRandomChestContent(Items.field_151043_k, 0, 2, 7, 15), new WeightedRandomChestContent(Items.field_151166_bC, 0, 1, 3, 2), new WeightedRandomChestContent(Items.field_151103_aS, 0, 4, 6, 20), new WeightedRandomChestContent(Items.field_151078_bh, 0, 3, 7, 16), new WeightedRandomChestContent(Items.field_151141_av, 0, 1, 1, 3), new WeightedRandomChestContent(Items.field_151138_bX, 0, 1, 1, 1), new WeightedRandomChestContent(Items.field_151136_bY, 0, 1, 1, 1), new WeightedRandomChestContent(Items.field_151125_bZ, 0, 1, 1, 1)});
      private static final List<WeightedRandomChestContent> field_175815_j = Lists.newArrayList(new WeightedRandomChestContent[]{new WeightedRandomChestContent(Items.field_151032_g, 0, 2, 7, 30)});
      private static ComponentScatteredFeaturePieces.JunglePyramid.Stones field_74942_n = new ComponentScatteredFeaturePieces.JunglePyramid.Stones();

      public JunglePyramid() {
      }

      public JunglePyramid(Random p_i2064_1_, int p_i2064_2_, int p_i2064_3_) {
         super(p_i2064_1_, p_i2064_2_, 64, p_i2064_3_, 12, 10, 15);
      }

      protected void func_143012_a(NBTTagCompound p_143012_1_) {
         super.func_143012_a(p_143012_1_);
         p_143012_1_.func_74757_a("placedMainChest", this.field_74947_h);
         p_143012_1_.func_74757_a("placedHiddenChest", this.field_74948_i);
         p_143012_1_.func_74757_a("placedTrap1", this.field_74945_j);
         p_143012_1_.func_74757_a("placedTrap2", this.field_74946_k);
      }

      protected void func_143011_b(NBTTagCompound p_143011_1_) {
         super.func_143011_b(p_143011_1_);
         this.field_74947_h = p_143011_1_.func_74767_n("placedMainChest");
         this.field_74948_i = p_143011_1_.func_74767_n("placedHiddenChest");
         this.field_74945_j = p_143011_1_.func_74767_n("placedTrap1");
         this.field_74946_k = p_143011_1_.func_74767_n("placedTrap2");
      }

      public boolean func_74875_a(World p_74875_1_, Random p_74875_2_, StructureBoundingBox p_74875_3_) {
         if(!this.func_74935_a(p_74875_1_, p_74875_3_, 0)) {
            return false;
         } else {
            int lvt_4_1_ = this.func_151555_a(Blocks.field_150446_ar, 3);
            int lvt_5_1_ = this.func_151555_a(Blocks.field_150446_ar, 2);
            int lvt_6_1_ = this.func_151555_a(Blocks.field_150446_ar, 0);
            int lvt_7_1_ = this.func_151555_a(Blocks.field_150446_ar, 1);
            this.func_74882_a(p_74875_1_, p_74875_3_, 0, -4, 0, this.field_74939_a - 1, 0, this.field_74938_c - 1, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 1, 2, 9, 2, 2, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 1, 12, 9, 2, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 1, 3, 2, 2, 11, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 9, 1, 3, 9, 2, 11, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 1, 3, 1, 10, 6, 1, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 1, 3, 13, 10, 6, 13, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 1, 3, 2, 1, 6, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 10, 3, 2, 10, 6, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 3, 2, 9, 3, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 6, 2, 9, 6, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 3, 7, 3, 8, 7, 11, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 4, 8, 4, 7, 8, 10, false, p_74875_2_, field_74942_n);
            this.func_74878_a(p_74875_1_, p_74875_3_, 3, 1, 3, 8, 2, 11);
            this.func_74878_a(p_74875_1_, p_74875_3_, 4, 3, 6, 7, 3, 9);
            this.func_74878_a(p_74875_1_, p_74875_3_, 2, 4, 2, 9, 5, 12);
            this.func_74878_a(p_74875_1_, p_74875_3_, 4, 6, 5, 7, 6, 9);
            this.func_74878_a(p_74875_1_, p_74875_3_, 5, 7, 6, 6, 7, 8);
            this.func_74878_a(p_74875_1_, p_74875_3_, 5, 1, 2, 6, 2, 2);
            this.func_74878_a(p_74875_1_, p_74875_3_, 5, 2, 12, 6, 2, 12);
            this.func_74878_a(p_74875_1_, p_74875_3_, 5, 5, 1, 6, 5, 1);
            this.func_74878_a(p_74875_1_, p_74875_3_, 5, 5, 13, 6, 5, 13);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 1, 5, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, 5, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 1, 5, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 10, 5, 9, p_74875_3_);

            for(int lvt_8_1_ = 0; lvt_8_1_ <= 14; lvt_8_1_ += 14) {
               this.func_74882_a(p_74875_1_, p_74875_3_, 2, 4, lvt_8_1_, 2, 5, lvt_8_1_, false, p_74875_2_, field_74942_n);
               this.func_74882_a(p_74875_1_, p_74875_3_, 4, 4, lvt_8_1_, 4, 5, lvt_8_1_, false, p_74875_2_, field_74942_n);
               this.func_74882_a(p_74875_1_, p_74875_3_, 7, 4, lvt_8_1_, 7, 5, lvt_8_1_, false, p_74875_2_, field_74942_n);
               this.func_74882_a(p_74875_1_, p_74875_3_, 9, 4, lvt_8_1_, 9, 5, lvt_8_1_, false, p_74875_2_, field_74942_n);
            }

            this.func_74882_a(p_74875_1_, p_74875_3_, 5, 6, 0, 6, 6, 0, false, p_74875_2_, field_74942_n);

            for(int lvt_8_2_ = 0; lvt_8_2_ <= 11; lvt_8_2_ += 11) {
               for(int lvt_9_1_ = 2; lvt_9_1_ <= 12; lvt_9_1_ += 2) {
                  this.func_74882_a(p_74875_1_, p_74875_3_, lvt_8_2_, 4, lvt_9_1_, lvt_8_2_, 5, lvt_9_1_, false, p_74875_2_, field_74942_n);
               }

               this.func_74882_a(p_74875_1_, p_74875_3_, lvt_8_2_, 6, 5, lvt_8_2_, 6, 5, false, p_74875_2_, field_74942_n);
               this.func_74882_a(p_74875_1_, p_74875_3_, lvt_8_2_, 6, 9, lvt_8_2_, 6, 9, false, p_74875_2_, field_74942_n);
            }

            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 7, 2, 2, 9, 2, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 9, 7, 2, 9, 9, 2, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 2, 7, 12, 2, 9, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 9, 7, 12, 9, 9, 12, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 4, 9, 4, 4, 9, 4, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 7, 9, 4, 7, 9, 4, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 4, 9, 10, 4, 9, 10, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 7, 9, 10, 7, 9, 10, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 5, 9, 7, 6, 9, 7, false, p_74875_2_, field_74942_n);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 5, 9, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 6, 9, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_5_1_), 5, 9, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_5_1_), 6, 9, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 4, 0, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 5, 0, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 6, 0, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 7, 0, 0, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 4, 1, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 4, 2, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 4, 3, 10, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 7, 1, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 7, 2, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_4_1_), 7, 3, 10, p_74875_3_);
            this.func_74882_a(p_74875_1_, p_74875_3_, 4, 1, 9, 4, 1, 9, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 7, 1, 9, 7, 1, 9, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 4, 1, 10, 7, 2, 10, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 5, 4, 5, 6, 4, 5, false, p_74875_2_, field_74942_n);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_6_1_), 4, 4, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_7_1_), 7, 4, 5, p_74875_3_);

            for(int lvt_8_3_ = 0; lvt_8_3_ < 4; ++lvt_8_3_) {
               this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_5_1_), 5, 0 - lvt_8_3_, 6 + lvt_8_3_, p_74875_3_);
               this.func_175811_a(p_74875_1_, Blocks.field_150446_ar.func_176203_a(lvt_5_1_), 6, 0 - lvt_8_3_, 6 + lvt_8_3_, p_74875_3_);
               this.func_74878_a(p_74875_1_, p_74875_3_, 5, 0 - lvt_8_3_, 7 + lvt_8_3_, 6, 0 - lvt_8_3_, 9 + lvt_8_3_);
            }

            this.func_74878_a(p_74875_1_, p_74875_3_, 1, -3, 12, 10, -1, 13);
            this.func_74878_a(p_74875_1_, p_74875_3_, 1, -3, 1, 3, -1, 13);
            this.func_74878_a(p_74875_1_, p_74875_3_, 1, -3, 1, 9, -1, 5);

            for(int lvt_8_4_ = 1; lvt_8_4_ <= 13; lvt_8_4_ += 2) {
               this.func_74882_a(p_74875_1_, p_74875_3_, 1, -3, lvt_8_4_, 1, -2, lvt_8_4_, false, p_74875_2_, field_74942_n);
            }

            for(int lvt_8_5_ = 2; lvt_8_5_ <= 12; lvt_8_5_ += 2) {
               this.func_74882_a(p_74875_1_, p_74875_3_, 1, -1, lvt_8_5_, 3, -1, lvt_8_5_, false, p_74875_2_, field_74942_n);
            }

            this.func_74882_a(p_74875_1_, p_74875_3_, 2, -2, 1, 5, -2, 1, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 7, -2, 1, 9, -2, 1, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 6, -3, 1, 6, -3, 1, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 6, -1, 1, 6, -1, 1, false, p_74875_2_, field_74942_n);
            this.func_175811_a(p_74875_1_, Blocks.field_150479_bC.func_176203_a(this.func_151555_a(Blocks.field_150479_bC, EnumFacing.EAST.func_176736_b())).func_177226_a(BlockTripWireHook.field_176265_M, Boolean.valueOf(true)), 1, -3, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150479_bC.func_176203_a(this.func_151555_a(Blocks.field_150479_bC, EnumFacing.WEST.func_176736_b())).func_177226_a(BlockTripWireHook.field_176265_M, Boolean.valueOf(true)), 4, -3, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150473_bD.func_176223_P().func_177226_a(BlockTripWire.field_176294_M, Boolean.valueOf(true)), 2, -3, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150473_bD.func_176223_P().func_177226_a(BlockTripWire.field_176294_M, Boolean.valueOf(true)), 3, -3, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 7, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 4, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 5, -3, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 4, -3, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 3, -3, 1, p_74875_3_);
            if(!this.field_74945_j) {
               this.field_74945_j = this.func_175806_a(p_74875_1_, p_74875_3_, p_74875_2_, 3, -2, 1, EnumFacing.NORTH.func_176745_a(), field_175815_j, 2);
            }

            this.func_175811_a(p_74875_1_, Blocks.field_150395_bd.func_176203_a(15), 3, -2, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150479_bC.func_176203_a(this.func_151555_a(Blocks.field_150479_bC, EnumFacing.NORTH.func_176736_b())).func_177226_a(BlockTripWireHook.field_176265_M, Boolean.valueOf(true)), 7, -3, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150479_bC.func_176203_a(this.func_151555_a(Blocks.field_150479_bC, EnumFacing.SOUTH.func_176736_b())).func_177226_a(BlockTripWireHook.field_176265_M, Boolean.valueOf(true)), 7, -3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150473_bD.func_176223_P().func_177226_a(BlockTripWire.field_176294_M, Boolean.valueOf(true)), 7, -3, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150473_bD.func_176223_P().func_177226_a(BlockTripWire.field_176294_M, Boolean.valueOf(true)), 7, -3, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150473_bD.func_176223_P().func_177226_a(BlockTripWire.field_176294_M, Boolean.valueOf(true)), 7, -3, 4, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 8, -3, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 9, -3, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 9, -3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 9, -3, 4, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 9, -2, 4, p_74875_3_);
            if(!this.field_74946_k) {
               this.field_74946_k = this.func_175806_a(p_74875_1_, p_74875_3_, p_74875_2_, 9, -2, 3, EnumFacing.WEST.func_176745_a(), field_175815_j, 2);
            }

            this.func_175811_a(p_74875_1_, Blocks.field_150395_bd.func_176203_a(15), 8, -1, 3, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150395_bd.func_176203_a(15), 8, -2, 3, p_74875_3_);
            if(!this.field_74947_h) {
               this.field_74947_h = this.func_180778_a(p_74875_1_, p_74875_3_, p_74875_2_, 8, -3, 3, WeightedRandomChestContent.func_177629_a(field_175816_i, new WeightedRandomChestContent[]{Items.field_151134_bR.func_92114_b(p_74875_2_)}), 2 + p_74875_2_.nextInt(5));
            }

            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 9, -3, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 8, -3, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 4, -3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 5, -2, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 5, -1, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 6, -3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 7, -2, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 7, -1, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 8, -3, 5, p_74875_3_);
            this.func_74882_a(p_74875_1_, p_74875_3_, 9, -1, 1, 9, -1, 5, false, p_74875_2_, field_74942_n);
            this.func_74878_a(p_74875_1_, p_74875_3_, 8, -3, 8, 10, -1, 10);
            this.func_175811_a(p_74875_1_, Blocks.field_150417_aV.func_176203_a(BlockStoneBrick.field_176252_O), 8, -2, 11, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150417_aV.func_176203_a(BlockStoneBrick.field_176252_O), 9, -2, 11, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150417_aV.func_176203_a(BlockStoneBrick.field_176252_O), 10, -2, 11, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150442_at.func_176203_a(BlockLever.func_176357_a(EnumFacing.func_82600_a(this.func_151555_a(Blocks.field_150442_at, EnumFacing.NORTH.func_176745_a())))), 8, -2, 12, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150442_at.func_176203_a(BlockLever.func_176357_a(EnumFacing.func_82600_a(this.func_151555_a(Blocks.field_150442_at, EnumFacing.NORTH.func_176745_a())))), 9, -2, 12, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150442_at.func_176203_a(BlockLever.func_176357_a(EnumFacing.func_82600_a(this.func_151555_a(Blocks.field_150442_at, EnumFacing.NORTH.func_176745_a())))), 10, -2, 12, p_74875_3_);
            this.func_74882_a(p_74875_1_, p_74875_3_, 8, -3, 8, 8, -3, 10, false, p_74875_2_, field_74942_n);
            this.func_74882_a(p_74875_1_, p_74875_3_, 10, -3, 8, 10, -3, 10, false, p_74875_2_, field_74942_n);
            this.func_175811_a(p_74875_1_, Blocks.field_150341_Y.func_176223_P(), 10, -2, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 8, -2, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 8, -2, 10, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150488_af.func_176223_P(), 10, -1, 9, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150320_F.func_176203_a(EnumFacing.UP.func_176745_a()), 9, -2, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150320_F.func_176203_a(this.func_151555_a(Blocks.field_150320_F, EnumFacing.WEST.func_176745_a())), 10, -2, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150320_F.func_176203_a(this.func_151555_a(Blocks.field_150320_F, EnumFacing.WEST.func_176745_a())), 10, -1, 8, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150413_aR.func_176203_a(this.func_151555_a(Blocks.field_150413_aR, EnumFacing.NORTH.func_176736_b())), 10, -2, 10, p_74875_3_);
            if(!this.field_74948_i) {
               this.field_74948_i = this.func_180778_a(p_74875_1_, p_74875_3_, p_74875_2_, 9, -3, 10, WeightedRandomChestContent.func_177629_a(field_175816_i, new WeightedRandomChestContent[]{Items.field_151134_bR.func_92114_b(p_74875_2_)}), 2 + p_74875_2_.nextInt(5));
            }

            return true;
         }
      }

      static class Stones extends StructureComponent.BlockSelector {
         private Stones() {
         }

         public void func_75062_a(Random p_75062_1_, int p_75062_2_, int p_75062_3_, int p_75062_4_, boolean p_75062_5_) {
            if(p_75062_1_.nextFloat() < 0.4F) {
               this.field_151562_a = Blocks.field_150347_e.func_176223_P();
            } else {
               this.field_151562_a = Blocks.field_150341_Y.func_176223_P();
            }

         }
      }
   }

   public static class SwampHut extends ComponentScatteredFeaturePieces.Feature {
      private boolean field_82682_h;

      public SwampHut() {
      }

      public SwampHut(Random p_i2066_1_, int p_i2066_2_, int p_i2066_3_) {
         super(p_i2066_1_, p_i2066_2_, 64, p_i2066_3_, 7, 7, 9);
      }

      protected void func_143012_a(NBTTagCompound p_143012_1_) {
         super.func_143012_a(p_143012_1_);
         p_143012_1_.func_74757_a("Witch", this.field_82682_h);
      }

      protected void func_143011_b(NBTTagCompound p_143011_1_) {
         super.func_143011_b(p_143011_1_);
         this.field_82682_h = p_143011_1_.func_74767_n("Witch");
      }

      public boolean func_74875_a(World p_74875_1_, Random p_74875_2_, StructureBoundingBox p_74875_3_) {
         if(!this.func_74935_a(p_74875_1_, p_74875_3_, 0)) {
            return false;
         } else {
            this.func_175804_a(p_74875_1_, p_74875_3_, 1, 1, 1, 5, 1, 7, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 1, 4, 2, 5, 4, 7, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 2, 1, 0, 4, 1, 0, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 2, 2, 2, 3, 3, 2, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 1, 2, 3, 1, 3, 6, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 5, 2, 3, 5, 3, 6, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 2, 2, 7, 4, 3, 7, Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), Blocks.field_150344_f.func_176203_a(BlockPlanks.EnumType.SPRUCE.func_176839_a()), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 1, 0, 2, 1, 3, 2, Blocks.field_150364_r.func_176223_P(), Blocks.field_150364_r.func_176223_P(), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 5, 0, 2, 5, 3, 2, Blocks.field_150364_r.func_176223_P(), Blocks.field_150364_r.func_176223_P(), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 1, 0, 7, 1, 3, 7, Blocks.field_150364_r.func_176223_P(), Blocks.field_150364_r.func_176223_P(), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 5, 0, 7, 5, 3, 7, Blocks.field_150364_r.func_176223_P(), Blocks.field_150364_r.func_176223_P(), false);
            this.func_175811_a(p_74875_1_, Blocks.field_180407_aO.func_176223_P(), 2, 3, 2, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_180407_aO.func_176223_P(), 3, 3, 7, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 1, 3, 4, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 5, 3, 4, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150350_a.func_176223_P(), 5, 3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150457_bL.func_176223_P().func_177226_a(BlockFlowerPot.field_176443_b, BlockFlowerPot.EnumFlowerType.MUSHROOM_RED), 1, 3, 5, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150462_ai.func_176223_P(), 3, 2, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_150383_bp.func_176223_P(), 4, 2, 6, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_180407_aO.func_176223_P(), 1, 2, 1, p_74875_3_);
            this.func_175811_a(p_74875_1_, Blocks.field_180407_aO.func_176223_P(), 5, 2, 1, p_74875_3_);
            int lvt_4_1_ = this.func_151555_a(Blocks.field_150476_ad, 3);
            int lvt_5_1_ = this.func_151555_a(Blocks.field_150476_ad, 1);
            int lvt_6_1_ = this.func_151555_a(Blocks.field_150476_ad, 0);
            int lvt_7_1_ = this.func_151555_a(Blocks.field_150476_ad, 2);
            this.func_175804_a(p_74875_1_, p_74875_3_, 0, 4, 1, 6, 4, 1, Blocks.field_150485_bF.func_176203_a(lvt_4_1_), Blocks.field_150485_bF.func_176203_a(lvt_4_1_), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 0, 4, 2, 0, 4, 7, Blocks.field_150485_bF.func_176203_a(lvt_6_1_), Blocks.field_150485_bF.func_176203_a(lvt_6_1_), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 6, 4, 2, 6, 4, 7, Blocks.field_150485_bF.func_176203_a(lvt_5_1_), Blocks.field_150485_bF.func_176203_a(lvt_5_1_), false);
            this.func_175804_a(p_74875_1_, p_74875_3_, 0, 4, 8, 6, 4, 8, Blocks.field_150485_bF.func_176203_a(lvt_7_1_), Blocks.field_150485_bF.func_176203_a(lvt_7_1_), false);

            for(int lvt_8_1_ = 2; lvt_8_1_ <= 7; lvt_8_1_ += 5) {
               for(int lvt_9_1_ = 1; lvt_9_1_ <= 5; lvt_9_1_ += 4) {
                  this.func_175808_b(p_74875_1_, Blocks.field_150364_r.func_176223_P(), lvt_9_1_, -1, lvt_8_1_, p_74875_3_);
               }
            }

            if(!this.field_82682_h) {
               int lvt_8_2_ = this.func_74865_a(2, 5);
               int lvt_9_2_ = this.func_74862_a(2);
               int lvt_10_1_ = this.func_74873_b(2, 5);
               if(p_74875_3_.func_175898_b(new BlockPos(lvt_8_2_, lvt_9_2_, lvt_10_1_))) {
                  this.field_82682_h = true;
                  EntityWitch lvt_11_1_ = new EntityWitch(p_74875_1_);
                  lvt_11_1_.func_70012_b((double)lvt_8_2_ + 0.5D, (double)lvt_9_2_, (double)lvt_10_1_ + 0.5D, 0.0F, 0.0F);
                  lvt_11_1_.func_180482_a(p_74875_1_.func_175649_E(new BlockPos(lvt_8_2_, lvt_9_2_, lvt_10_1_)), (IEntityLivingData)null);
                  p_74875_1_.func_72838_d(lvt_11_1_);
               }
            }

            return true;
         }
      }
   }
}
