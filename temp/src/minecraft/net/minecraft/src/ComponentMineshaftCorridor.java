// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World, TileEntityMobSpawner

public class ComponentMineshaftCorridor extends StructureComponent
{

    private final boolean field_35070_a;
    private final boolean field_35068_b;
    private boolean field_35069_c;
    private int field_35067_d;

    public ComponentMineshaftCorridor(int p_i488_1_, Random p_i488_2_, StructureBoundingBox p_i488_3_, int p_i488_4_)
    {
        super(p_i488_1_);
        field_35025_h = p_i488_4_;
        field_35024_g = p_i488_3_;
        field_35070_a = p_i488_2_.nextInt(3) == 0;
        field_35068_b = !field_35070_a && p_i488_2_.nextInt(23) == 0;
        if(field_35025_h == 2 || field_35025_h == 0)
        {
            field_35067_d = p_i488_3_.func_35739_d() / 5;
        } else
        {
            field_35067_d = p_i488_3_.func_35744_b() / 5;
        }
    }

    public static StructureBoundingBox func_35066_a(List p_35066_0_, Random p_35066_1_, int p_35066_2_, int p_35066_3_, int p_35066_4_, int p_35066_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35066_2_, p_35066_3_, p_35066_4_, p_35066_2_, p_35066_3_ + 2, p_35066_4_);
        int i = p_35066_1_.nextInt(3) + 2;
        do
        {
            if(i <= 0)
            {
                break;
            }
            int j = i * 5;
            switch(p_35066_5_)
            {
            case 2: // '\002'
                structureboundingbox.field_35749_d = p_35066_2_ + 2;
                structureboundingbox.field_35752_c = p_35066_4_ - (j - 1);
                break;

            case 0: // '\0'
                structureboundingbox.field_35749_d = p_35066_2_ + 2;
                structureboundingbox.field_35748_f = p_35066_4_ + (j - 1);
                break;

            case 1: // '\001'
                structureboundingbox.field_35753_a = p_35066_2_ - (j - 1);
                structureboundingbox.field_35748_f = p_35066_4_ + 2;
                break;

            case 3: // '\003'
                structureboundingbox.field_35749_d = p_35066_2_ + (j - 1);
                structureboundingbox.field_35748_f = p_35066_4_ + 2;
                break;
            }
            if(StructureComponent.func_35020_a(p_35066_0_, structureboundingbox) == null)
            {
                break;
            }
            i--;
        } while(true);
        if(i > 0)
        {
            return structureboundingbox;
        } else
        {
            return null;
        }
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        int i = func_35012_c();
        int j = p_35004_3_.nextInt(4);
        switch(field_35025_h)
        {
        case 2: // '\002'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c - 1, field_35025_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c, 1, i);
            } else
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c, 3, i);
            }
            break;

        case 0: // '\0'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35748_f + 1, field_35025_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35748_f - 3, 1, i);
            } else
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35748_f - 3, 3, i);
            }
            break;

        case 1: // '\001'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c, field_35025_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c - 1, 2, i);
            } else
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35748_f + 1, 0, i);
            }
            break;

        case 3: // '\003'
            if(j <= 1)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c, field_35025_h, i);
            } else
            if(j == 2)
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d - 3, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35752_c - 1, 2, i);
            } else
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d - 3, (field_35024_g.field_35751_b - 1) + p_35004_3_.nextInt(3), field_35024_g.field_35748_f + 1, 0, i);
            }
            break;
        }
        if(i < 8)
        {
            if(field_35025_h == 2 || field_35025_h == 0)
            {
                for(int k = field_35024_g.field_35752_c + 3; k + 3 <= field_35024_g.field_35748_f; k += 5)
                {
                    int i1 = p_35004_3_.nextInt(5);
                    if(i1 == 0)
                    {
                        StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, k, 1, i + 1);
                    } else
                    if(i1 == 1)
                    {
                        StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, k, 3, i + 1);
                    }
                }

            } else
            {
                for(int l = field_35024_g.field_35753_a + 3; l + 3 <= field_35024_g.field_35749_d; l += 5)
                {
                    int j1 = p_35004_3_.nextInt(5);
                    if(j1 == 0)
                    {
                        StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, l, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, i + 1);
                        continue;
                    }
                    if(j1 == 1)
                    {
                        StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, l, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, i + 1);
                    }
                }

            }
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        int i = field_35067_d * 5 - 1;
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 2, 1, i, 0, 0, false);
        func_35010_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.8F, 0, 2, 0, 2, 2, i, 0, 0, false);
        if(field_35068_b)
        {
            func_35010_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.6F, 0, 0, 0, 2, 1, i, Block.field_9258_W.field_376_bc, 0, false);
        }
        for(int j = 0; j < field_35067_d; j++)
        {
            int i1 = 2 + j * 5;
            func_35011_a(p_35023_1_, p_35023_3_, 0, 0, i1, 0, 1, i1, Block.field_4057_ba.field_376_bc, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, 2, 0, i1, 2, 1, i1, Block.field_4057_ba.field_376_bc, 0, false);
            if(p_35023_2_.nextInt(4) != 0)
            {
                func_35011_a(p_35023_1_, p_35023_3_, 0, 2, i1, 2, 2, i1, Block.field_334_y.field_376_bc, 0, false);
            } else
            {
                func_35011_a(p_35023_1_, p_35023_3_, 0, 2, i1, 0, 2, i1, Block.field_334_y.field_376_bc, 0, false);
                func_35011_a(p_35023_1_, p_35023_3_, 2, 2, i1, 2, 2, i1, Block.field_334_y.field_376_bc, 0, false);
            }
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.1F, 0, 2, i1 - 1, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.1F, 2, 2, i1 - 1, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.1F, 0, 2, i1 + 1, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.1F, 2, 2, i1 + 1, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 0, 2, i1 - 2, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 2, 2, i1 - 2, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 0, 2, i1 + 2, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 2, 2, i1 + 2, Block.field_9258_W.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 1, 2, i1 - 1, Block.field_404_ar.field_376_bc, 0);
            func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.05F, 1, 2, i1 + 1, Block.field_404_ar.field_376_bc, 0);
            if(p_35023_2_.nextInt(100) == 0)
            {
                func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 2, 0, i1 - 1, StructureMineshaftPieces.func_35588_a(), 3 + p_35023_2_.nextInt(4));
            }
            if(p_35023_2_.nextInt(100) == 0)
            {
                func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 0, 0, i1 + 1, StructureMineshaftPieces.func_35588_a(), 3 + p_35023_2_.nextInt(4));
            }
            if(!field_35068_b || field_35069_c)
            {
                continue;
            }
            int l1 = func_35008_a(0);
            int j2 = (i1 - 1) + p_35023_2_.nextInt(3);
            int k2 = func_35017_a(1, j2);
            j2 = func_35006_b(1, j2);
            if(!p_35023_3_.func_35742_b(k2, l1, j2))
            {
                continue;
            }
            field_35069_c = true;
            p_35023_1_.func_690_d(k2, l1, j2, Block.field_400_at.field_376_bc);
            TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_35023_1_.func_603_b(k2, l1, j2);
            if(tileentitymobspawner != null)
            {
                tileentitymobspawner.func_21098_a("CaveSpider");
            }
        }

        for(int k = 0; k <= 2; k++)
        {
            for(int j1 = 0; j1 <= i; j1++)
            {
                int i2 = func_35007_a(p_35023_1_, k, -1, j1, p_35023_3_);
                if(i2 == 0)
                {
                    func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, k, -1, j1, p_35023_3_);
                }
            }

        }

        if(field_35070_a)
        {
            for(int l = 0; l <= i; l++)
            {
                int k1 = func_35007_a(p_35023_1_, 1, -1, l, p_35023_3_);
                if(k1 > 0 && Block.field_343_p[k1])
                {
                    func_35014_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.7F, 1, 0, l, Block.field_440_aH.field_376_bc, func_35009_c(Block.field_440_aH.field_376_bc, 0));
                }
            }

        }
        return true;
    }
}
