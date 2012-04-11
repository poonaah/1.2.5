// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureBoundingBox, ChunkPosition, World, Block, 
//            Material, StructurePieceBlockSelector, TileEntityChest, WeightedRandom, 
//            StructurePieceTreasure, Item, ItemStack, ItemDoor

public abstract class StructureComponent
{

    protected StructureBoundingBox field_35024_g;
    protected int field_35025_h;
    protected int field_35026_i;

    protected StructureComponent(int p_i353_1_)
    {
        field_35026_i = p_i353_1_;
        field_35025_h = -1;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public abstract boolean func_35023_a(World world, Random random, StructureBoundingBox structureboundingbox);

    public StructureBoundingBox func_35021_b()
    {
        return field_35024_g;
    }

    public int func_35012_c()
    {
        return field_35026_i;
    }

    public static StructureComponent func_35020_a(List p_35020_0_, StructureBoundingBox p_35020_1_)
    {
        for(Iterator iterator = p_35020_0_.iterator(); iterator.hasNext();)
        {
            StructureComponent structurecomponent = (StructureComponent)iterator.next();
            if(structurecomponent.func_35021_b() != null && structurecomponent.func_35021_b().func_35740_a(p_35020_1_))
            {
                return structurecomponent;
            }
        }

        return null;
    }

    public ChunkPosition func_40008_a_()
    {
        return new ChunkPosition(field_35024_g.func_40597_e(), field_35024_g.func_40596_f(), field_35024_g.func_40598_g());
    }

    protected boolean func_35013_a(World p_35013_1_, StructureBoundingBox p_35013_2_)
    {
        int i = Math.max(field_35024_g.field_35753_a - 1, p_35013_2_.field_35753_a);
        int j = Math.max(field_35024_g.field_35751_b - 1, p_35013_2_.field_35751_b);
        int k = Math.max(field_35024_g.field_35752_c - 1, p_35013_2_.field_35752_c);
        int l = Math.min(field_35024_g.field_35749_d + 1, p_35013_2_.field_35749_d);
        int i1 = Math.min(field_35024_g.field_35750_e + 1, p_35013_2_.field_35750_e);
        int j1 = Math.min(field_35024_g.field_35748_f + 1, p_35013_2_.field_35748_f);
        for(int k1 = i; k1 <= l; k1++)
        {
            for(int j2 = k; j2 <= j1; j2++)
            {
                int i3 = p_35013_1_.func_600_a(k1, j, j2);
                if(i3 > 0 && Block.field_345_n[i3].field_356_bn.func_879_d())
                {
                    return true;
                }
                i3 = p_35013_1_.func_600_a(k1, i1, j2);
                if(i3 > 0 && Block.field_345_n[i3].field_356_bn.func_879_d())
                {
                    return true;
                }
            }

        }

        for(int l1 = i; l1 <= l; l1++)
        {
            for(int k2 = j; k2 <= i1; k2++)
            {
                int j3 = p_35013_1_.func_600_a(l1, k2, k);
                if(j3 > 0 && Block.field_345_n[j3].field_356_bn.func_879_d())
                {
                    return true;
                }
                j3 = p_35013_1_.func_600_a(l1, k2, j1);
                if(j3 > 0 && Block.field_345_n[j3].field_356_bn.func_879_d())
                {
                    return true;
                }
            }

        }

        for(int i2 = k; i2 <= j1; i2++)
        {
            for(int l2 = j; l2 <= i1; l2++)
            {
                int k3 = p_35013_1_.func_600_a(i, l2, i2);
                if(k3 > 0 && Block.field_345_n[k3].field_356_bn.func_879_d())
                {
                    return true;
                }
                k3 = p_35013_1_.func_600_a(l, l2, i2);
                if(k3 > 0 && Block.field_345_n[k3].field_356_bn.func_879_d())
                {
                    return true;
                }
            }

        }

        return false;
    }

    protected int func_35017_a(int p_35017_1_, int p_35017_2_)
    {
        switch(field_35025_h)
        {
        case 0: // '\0'
        case 2: // '\002'
            return field_35024_g.field_35753_a + p_35017_1_;

        case 1: // '\001'
            return field_35024_g.field_35749_d - p_35017_2_;

        case 3: // '\003'
            return field_35024_g.field_35753_a + p_35017_2_;
        }
        return p_35017_1_;
    }

    protected int func_35008_a(int p_35008_1_)
    {
        if(field_35025_h == -1)
        {
            return p_35008_1_;
        } else
        {
            return p_35008_1_ + field_35024_g.field_35751_b;
        }
    }

    protected int func_35006_b(int p_35006_1_, int p_35006_2_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return field_35024_g.field_35748_f - p_35006_2_;

        case 0: // '\0'
            return field_35024_g.field_35752_c + p_35006_2_;

        case 1: // '\001'
        case 3: // '\003'
            return field_35024_g.field_35752_c + p_35006_1_;
        }
        return p_35006_2_;
    }

    protected int func_35009_c(int p_35009_1_, int p_35009_2_)
    {
        if(p_35009_1_ == Block.field_440_aH.field_376_bc)
        {
            if(field_35025_h == 1 || field_35025_h == 3)
            {
                return p_35009_2_ != 1 ? 1 : 0;
            }
        } else
        if(p_35009_1_ == Block.field_442_aF.field_376_bc || p_35009_1_ == Block.field_435_aM.field_376_bc)
        {
            if(field_35025_h == 0)
            {
                if(p_35009_2_ == 0)
                {
                    return 2;
                }
                if(p_35009_2_ == 2)
                {
                    return 0;
                }
            } else
            {
                if(field_35025_h == 1)
                {
                    return p_35009_2_ + 1 & 3;
                }
                if(field_35025_h == 3)
                {
                    return p_35009_2_ + 3 & 3;
                }
            }
        } else
        if(p_35009_1_ == Block.field_4069_aI.field_376_bc || p_35009_1_ == Block.field_4059_au.field_376_bc || p_35009_1_ == Block.field_40204_bD.field_376_bc || p_35009_1_ == Block.field_35279_by.field_376_bc)
        {
            if(field_35025_h == 0)
            {
                if(p_35009_2_ == 2)
                {
                    return 3;
                }
                if(p_35009_2_ == 3)
                {
                    return 2;
                }
            } else
            if(field_35025_h == 1)
            {
                if(p_35009_2_ == 0)
                {
                    return 2;
                }
                if(p_35009_2_ == 1)
                {
                    return 3;
                }
                if(p_35009_2_ == 2)
                {
                    return 0;
                }
                if(p_35009_2_ == 3)
                {
                    return 1;
                }
            } else
            if(field_35025_h == 3)
            {
                if(p_35009_2_ == 0)
                {
                    return 2;
                }
                if(p_35009_2_ == 1)
                {
                    return 3;
                }
                if(p_35009_2_ == 2)
                {
                    return 1;
                }
                if(p_35009_2_ == 3)
                {
                    return 0;
                }
            }
        } else
        if(p_35009_1_ == Block.field_441_aG.field_376_bc)
        {
            if(field_35025_h == 0)
            {
                if(p_35009_2_ == 2)
                {
                    return 3;
                }
                if(p_35009_2_ == 3)
                {
                    return 2;
                }
            } else
            if(field_35025_h == 1)
            {
                if(p_35009_2_ == 2)
                {
                    return 4;
                }
                if(p_35009_2_ == 3)
                {
                    return 5;
                }
                if(p_35009_2_ == 4)
                {
                    return 2;
                }
                if(p_35009_2_ == 5)
                {
                    return 3;
                }
            } else
            if(field_35025_h == 3)
            {
                if(p_35009_2_ == 2)
                {
                    return 5;
                }
                if(p_35009_2_ == 3)
                {
                    return 4;
                }
                if(p_35009_2_ == 4)
                {
                    return 2;
                }
                if(p_35009_2_ == 5)
                {
                    return 3;
                }
            }
        } else
        if(p_35009_1_ == Block.field_4064_aS.field_376_bc)
        {
            if(field_35025_h == 0)
            {
                if(p_35009_2_ == 3)
                {
                    return 4;
                }
                if(p_35009_2_ == 4)
                {
                    return 3;
                }
            } else
            if(field_35025_h == 1)
            {
                if(p_35009_2_ == 3)
                {
                    return 1;
                }
                if(p_35009_2_ == 4)
                {
                    return 2;
                }
                if(p_35009_2_ == 2)
                {
                    return 3;
                }
                if(p_35009_2_ == 1)
                {
                    return 4;
                }
            } else
            if(field_35025_h == 3)
            {
                if(p_35009_2_ == 3)
                {
                    return 2;
                }
                if(p_35009_2_ == 4)
                {
                    return 1;
                }
                if(p_35009_2_ == 2)
                {
                    return 3;
                }
                if(p_35009_2_ == 1)
                {
                    return 4;
                }
            }
        }
        return p_35009_2_;
    }

    protected void func_35018_a(World p_35018_1_, int p_35018_2_, int p_35018_3_, int p_35018_4_, int p_35018_5_, int p_35018_6_, StructureBoundingBox p_35018_7_)
    {
        int i = func_35017_a(p_35018_4_, p_35018_6_);
        int j = func_35008_a(p_35018_5_);
        int k = func_35006_b(p_35018_4_, p_35018_6_);
        if(!p_35018_7_.func_35742_b(i, j, k))
        {
            return;
        } else
        {
            p_35018_1_.func_643_a(i, j, k, p_35018_2_, p_35018_3_);
            return;
        }
    }

    protected int func_35007_a(World p_35007_1_, int p_35007_2_, int p_35007_3_, int p_35007_4_, StructureBoundingBox p_35007_5_)
    {
        int i = func_35017_a(p_35007_2_, p_35007_4_);
        int j = func_35008_a(p_35007_3_);
        int k = func_35006_b(p_35007_2_, p_35007_4_);
        if(!p_35007_5_.func_35742_b(i, j, k))
        {
            return 0;
        } else
        {
            return p_35007_1_.func_600_a(i, j, k);
        }
    }

    protected void func_35011_a(World p_35011_1_, StructureBoundingBox p_35011_2_, int p_35011_3_, int p_35011_4_, int p_35011_5_, int p_35011_6_, int p_35011_7_, 
            int p_35011_8_, int p_35011_9_, int p_35011_10_, boolean p_35011_11_)
    {
        for(int i = p_35011_4_; i <= p_35011_7_; i++)
        {
            for(int j = p_35011_3_; j <= p_35011_6_; j++)
            {
                for(int k = p_35011_5_; k <= p_35011_8_; k++)
                {
                    if(p_35011_11_ && func_35007_a(p_35011_1_, j, i, k, p_35011_2_) == 0)
                    {
                        continue;
                    }
                    if(i == p_35011_4_ || i == p_35011_7_ || j == p_35011_3_ || j == p_35011_6_ || k == p_35011_5_ || k == p_35011_8_)
                    {
                        func_35018_a(p_35011_1_, p_35011_9_, 0, j, i, k, p_35011_2_);
                    } else
                    {
                        func_35018_a(p_35011_1_, p_35011_10_, 0, j, i, k, p_35011_2_);
                    }
                }

            }

        }

    }

    protected void func_35022_a(World p_35022_1_, StructureBoundingBox p_35022_2_, int p_35022_3_, int p_35022_4_, int p_35022_5_, int p_35022_6_, int p_35022_7_, 
            int p_35022_8_, boolean p_35022_9_, Random p_35022_10_, StructurePieceBlockSelector p_35022_11_)
    {
        for(int i = p_35022_4_; i <= p_35022_7_; i++)
        {
            for(int j = p_35022_3_; j <= p_35022_6_; j++)
            {
                for(int k = p_35022_5_; k <= p_35022_8_; k++)
                {
                    if(!p_35022_9_ || func_35007_a(p_35022_1_, j, i, k, p_35022_2_) != 0)
                    {
                        p_35022_11_.func_35706_a(p_35022_10_, j, i, k, i == p_35022_4_ || i == p_35022_7_ || j == p_35022_3_ || j == p_35022_6_ || k == p_35022_5_ || k == p_35022_8_);
                        func_35018_a(p_35022_1_, p_35022_11_.func_35707_a(), p_35022_11_.func_35708_b(), j, i, k, p_35022_2_);
                    }
                }

            }

        }

    }

    protected void func_35010_a(World p_35010_1_, StructureBoundingBox p_35010_2_, Random p_35010_3_, float p_35010_4_, int p_35010_5_, int p_35010_6_, int p_35010_7_, 
            int p_35010_8_, int p_35010_9_, int p_35010_10_, int p_35010_11_, int p_35010_12_, boolean p_35010_13_)
    {
        for(int i = p_35010_6_; i <= p_35010_9_; i++)
        {
            for(int j = p_35010_5_; j <= p_35010_8_; j++)
            {
                for(int k = p_35010_7_; k <= p_35010_10_; k++)
                {
                    if(p_35010_3_.nextFloat() > p_35010_4_ || p_35010_13_ && func_35007_a(p_35010_1_, j, i, k, p_35010_2_) == 0)
                    {
                        continue;
                    }
                    if(i == p_35010_6_ || i == p_35010_9_ || j == p_35010_5_ || j == p_35010_8_ || k == p_35010_7_ || k == p_35010_10_)
                    {
                        func_35018_a(p_35010_1_, p_35010_11_, 0, j, i, k, p_35010_2_);
                    } else
                    {
                        func_35018_a(p_35010_1_, p_35010_12_, 0, j, i, k, p_35010_2_);
                    }
                }

            }

        }

    }

    protected void func_35014_a(World p_35014_1_, StructureBoundingBox p_35014_2_, Random p_35014_3_, float p_35014_4_, int p_35014_5_, int p_35014_6_, int p_35014_7_, 
            int p_35014_8_, int p_35014_9_)
    {
        if(p_35014_3_.nextFloat() < p_35014_4_)
        {
            func_35018_a(p_35014_1_, p_35014_8_, p_35014_9_, p_35014_5_, p_35014_6_, p_35014_7_, p_35014_2_);
        }
    }

    protected void func_35015_a(World p_35015_1_, StructureBoundingBox p_35015_2_, int p_35015_3_, int p_35015_4_, int p_35015_5_, int p_35015_6_, int p_35015_7_, 
            int p_35015_8_, int p_35015_9_, boolean p_35015_10_)
    {
        float f = (p_35015_6_ - p_35015_3_) + 1;
        float f1 = (p_35015_7_ - p_35015_4_) + 1;
        float f2 = (p_35015_8_ - p_35015_5_) + 1;
        float f3 = (float)p_35015_3_ + f / 2.0F;
        float f4 = (float)p_35015_5_ + f2 / 2.0F;
        for(int i = p_35015_4_; i <= p_35015_7_; i++)
        {
            float f5 = (float)(i - p_35015_4_) / f1;
            for(int j = p_35015_3_; j <= p_35015_6_; j++)
            {
                float f6 = ((float)j - f3) / (f * 0.5F);
                for(int k = p_35015_5_; k <= p_35015_8_; k++)
                {
                    float f7 = ((float)k - f4) / (f2 * 0.5F);
                    if(p_35015_10_ && func_35007_a(p_35015_1_, j, i, k, p_35015_2_) == 0)
                    {
                        continue;
                    }
                    float f8 = f6 * f6 + f5 * f5 + f7 * f7;
                    if(f8 <= 1.05F)
                    {
                        func_35018_a(p_35015_1_, p_35015_9_, 0, j, i, k, p_35015_2_);
                    }
                }

            }

        }

    }

    protected void func_35016_b(World p_35016_1_, int p_35016_2_, int p_35016_3_, int p_35016_4_, StructureBoundingBox p_35016_5_)
    {
        int i = func_35017_a(p_35016_2_, p_35016_4_);
        int j = func_35008_a(p_35016_3_);
        int k = func_35006_b(p_35016_2_, p_35016_4_);
        if(!p_35016_5_.func_35742_b(i, j, k))
        {
            return;
        }
        for(; !p_35016_1_.func_20084_d(i, j, k) && j < 255; j++)
        {
            p_35016_1_.func_643_a(i, j, k, 0, 0);
        }

    }

    protected void func_35005_b(World p_35005_1_, int p_35005_2_, int p_35005_3_, int p_35005_4_, int p_35005_5_, int p_35005_6_, StructureBoundingBox p_35005_7_)
    {
        int i = func_35017_a(p_35005_4_, p_35005_6_);
        int j = func_35008_a(p_35005_5_);
        int k = func_35006_b(p_35005_4_, p_35005_6_);
        if(!p_35005_7_.func_35742_b(i, j, k))
        {
            return;
        }
        for(; (p_35005_1_.func_20084_d(i, j, k) || p_35005_1_.func_599_f(i, j, k).func_879_d()) && j > 1; j--)
        {
            p_35005_1_.func_643_a(i, j, k, p_35005_2_, p_35005_3_);
        }

    }

    protected void func_35003_a(World p_35003_1_, StructureBoundingBox p_35003_2_, Random p_35003_3_, int p_35003_4_, int p_35003_5_, int p_35003_6_, StructurePieceTreasure p_35003_7_[], 
            int p_35003_8_)
    {
        int i = func_35017_a(p_35003_4_, p_35003_6_);
        int j = func_35008_a(p_35003_5_);
        int k = func_35006_b(p_35003_4_, p_35003_6_);
        if(p_35003_2_.func_35742_b(i, j, k) && p_35003_1_.func_600_a(i, j, k) != Block.field_396_av.field_376_bc)
        {
            p_35003_1_.func_690_d(i, j, k, Block.field_396_av.field_376_bc);
            TileEntityChest tileentitychest = (TileEntityChest)p_35003_1_.func_603_b(i, j, k);
            if(tileentitychest != null)
            {
                func_35019_a(p_35003_3_, p_35003_7_, tileentitychest, p_35003_8_);
            }
        }
    }

    private static void func_35019_a(Random p_35019_0_, StructurePieceTreasure p_35019_1_[], TileEntityChest p_35019_2_, int p_35019_3_)
    {
        for(int i = 0; i < p_35019_3_; i++)
        {
            StructurePieceTreasure structurepiecetreasure = (StructurePieceTreasure)WeightedRandom.func_35735_a(p_35019_0_, p_35019_1_);
            int j = structurepiecetreasure.field_35595_c + p_35019_0_.nextInt((structurepiecetreasure.field_35593_e - structurepiecetreasure.field_35595_c) + 1);
            if(Item.field_233_c[structurepiecetreasure.field_35596_a].func_200_b() >= j)
            {
                p_35019_2_.func_472_a(p_35019_0_.nextInt(p_35019_2_.func_469_c()), new ItemStack(structurepiecetreasure.field_35596_a, j, structurepiecetreasure.field_35594_b));
                continue;
            }
            for(int k = 0; k < j; k++)
            {
                p_35019_2_.func_472_a(p_35019_0_.nextInt(p_35019_2_.func_469_c()), new ItemStack(structurepiecetreasure.field_35596_a, 1, structurepiecetreasure.field_35594_b));
            }

        }

    }

    protected void func_35002_a(World p_35002_1_, StructureBoundingBox p_35002_2_, Random p_35002_3_, int p_35002_4_, int p_35002_5_, int p_35002_6_, int p_35002_7_)
    {
        int i = func_35017_a(p_35002_4_, p_35002_6_);
        int j = func_35008_a(p_35002_5_);
        int k = func_35006_b(p_35002_4_, p_35002_6_);
        if(p_35002_2_.func_35742_b(i, j, k))
        {
            ItemDoor.func_35434_a(p_35002_1_, i, j, k, p_35002_7_, Block.field_442_aF);
        }
    }
}
