// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityOcelot, PathNavigate, EntityAISit, 
//            World, Block, TileEntityChest, BlockBed

public class EntityAIOcelotSit extends EntityAIBase
{

    private final EntityOcelot field_50085_a;
    private final float field_50083_b;
    private int field_50084_c;
    private int field_52011_h;
    private int field_50081_d;
    private int field_50082_e;
    private int field_50079_f;
    private int field_50080_g;

    public EntityAIOcelotSit(EntityOcelot p_i1206_1_, float p_i1206_2_)
    {
        field_50084_c = 0;
        field_52011_h = 0;
        field_50081_d = 0;
        field_50082_e = 0;
        field_50079_f = 0;
        field_50080_g = 0;
        field_50085_a = p_i1206_1_;
        field_50083_b = p_i1206_2_;
        func_46079_a(5);
    }

    public boolean func_46082_a()
    {
        return field_50085_a.func_48139_F_() && !field_50085_a.func_48141_af() && field_50085_a.func_46004_aK().nextDouble() <= 0.0065000001341104507D && func_50077_h();
    }

    public boolean func_46084_g()
    {
        return field_50084_c <= field_50081_d && field_52011_h <= 60 && func_50078_a(field_50085_a.field_615_ag, field_50082_e, field_50079_f, field_50080_g);
    }

    public void func_46080_e()
    {
        field_50085_a.func_48084_aL().func_48666_a((double)(float)field_50082_e + 0.5D, field_50079_f + 1, (double)(float)field_50080_g + 0.5D, field_50083_b);
        field_50084_c = 0;
        field_52011_h = 0;
        field_50081_d = field_50085_a.func_46004_aK().nextInt(field_50085_a.func_46004_aK().nextInt(1200) + 1200) + 1200;
        field_50085_a.func_50008_ai().func_48407_a(false);
    }

    public void func_46077_d()
    {
        field_50085_a.func_48140_f(false);
    }

    public void func_46081_b()
    {
        field_50084_c++;
        field_50085_a.func_50008_ai().func_48407_a(false);
        if(field_50085_a.func_360_d(field_50082_e, field_50079_f + 1, field_50080_g) > 1.0D)
        {
            field_50085_a.func_48140_f(false);
            field_50085_a.func_48084_aL().func_48666_a((double)(float)field_50082_e + 0.5D, field_50079_f + 1, (double)(float)field_50080_g + 0.5D, field_50083_b);
            field_52011_h++;
        } else
        if(!field_50085_a.func_48141_af())
        {
            field_50085_a.func_48140_f(true);
        } else
        {
            field_52011_h--;
        }
    }

    private boolean func_50077_h()
    {
        int i = (int)field_50085_a.field_610_al;
        double d = 2147483647D;
        for(int j = (int)field_50085_a.field_611_ak - 8; (double)j < field_50085_a.field_611_ak + 8D; j++)
        {
            for(int k = (int)field_50085_a.field_609_am - 8; (double)k < field_50085_a.field_609_am + 8D; k++)
            {
                if(!func_50078_a(field_50085_a.field_615_ag, j, i, k) || !field_50085_a.field_615_ag.func_20084_d(j, i + 1, k))
                {
                    continue;
                }
                double d1 = field_50085_a.func_360_d(j, i, k);
                if(d1 < d)
                {
                    field_50082_e = j;
                    field_50079_f = i;
                    field_50080_g = k;
                    d = d1;
                }
            }

        }

        return d < 2147483647D;
    }

    private boolean func_50078_a(World p_50078_1_, int p_50078_2_, int p_50078_3_, int p_50078_4_)
    {
        int i = p_50078_1_.func_600_a(p_50078_2_, p_50078_3_, p_50078_4_);
        int j = p_50078_1_.func_602_e(p_50078_2_, p_50078_3_, p_50078_4_);
        if(i == Block.field_396_av.field_376_bc)
        {
            TileEntityChest tileentitychest = (TileEntityChest)p_50078_1_.func_603_b(p_50078_2_, p_50078_3_, p_50078_4_);
            if(tileentitychest.field_35156_h < 1)
            {
                return true;
            }
        } else
        {
            if(i == Block.field_444_aD.field_376_bc)
            {
                return true;
            }
            if(i == Block.field_9262_S.field_376_bc && !BlockBed.func_22032_d(j))
            {
                return true;
            }
        }
        return false;
    }
}
