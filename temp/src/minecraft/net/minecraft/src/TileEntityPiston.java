// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            TileEntity, Facing, Block, BlockPistonMoving, 
//            World, Entity, NBTTagCompound

public class TileEntityPiston extends TileEntity
{

    private int field_31021_a;
    private int field_31019_b;
    private int field_31025_c;
    private boolean field_31024_i;
    private boolean field_31023_j;
    private float field_31022_k;
    private float field_31020_l;
    private static List field_31018_m = new ArrayList();

    public TileEntityPiston()
    {
    }

    public TileEntityPiston(int p_i502_1_, int p_i502_2_, int p_i502_3_, boolean p_i502_4_, boolean p_i502_5_)
    {
        field_31021_a = p_i502_1_;
        field_31019_b = p_i502_2_;
        field_31025_c = p_i502_3_;
        field_31024_i = p_i502_4_;
        field_31023_j = p_i502_5_;
    }

    public int func_31016_a()
    {
        return field_31021_a;
    }

    public int func_479_f()
    {
        return field_31019_b;
    }

    public boolean func_31015_b()
    {
        return field_31024_i;
    }

    public int func_31009_d()
    {
        return field_31025_c;
    }

    public boolean func_31012_k()
    {
        return field_31023_j;
    }

    public float func_31008_a(float p_31008_1_)
    {
        if(p_31008_1_ > 1.0F)
        {
            p_31008_1_ = 1.0F;
        }
        return field_31020_l + (field_31022_k - field_31020_l) * p_31008_1_;
    }

    public float func_31017_b(float p_31017_1_)
    {
        if(field_31024_i)
        {
            return (func_31008_a(p_31017_1_) - 1.0F) * (float)Facing.field_31056_b[field_31025_c];
        } else
        {
            return (1.0F - func_31008_a(p_31017_1_)) * (float)Facing.field_31056_b[field_31025_c];
        }
    }

    public float func_31014_c(float p_31014_1_)
    {
        if(field_31024_i)
        {
            return (func_31008_a(p_31014_1_) - 1.0F) * (float)Facing.field_31059_c[field_31025_c];
        } else
        {
            return (1.0F - func_31008_a(p_31014_1_)) * (float)Facing.field_31059_c[field_31025_c];
        }
    }

    public float func_31013_d(float p_31013_1_)
    {
        if(field_31024_i)
        {
            return (func_31008_a(p_31013_1_) - 1.0F) * (float)Facing.field_31058_d[field_31025_c];
        } else
        {
            return (1.0F - func_31008_a(p_31013_1_)) * (float)Facing.field_31058_d[field_31025_c];
        }
    }

    private void func_31010_a(float p_31010_1_, float p_31010_2_)
    {
        if(!field_31024_i)
        {
            p_31010_1_--;
        } else
        {
            p_31010_1_ = 1.0F - p_31010_1_;
        }
        AxisAlignedBB axisalignedbb = Block.field_9268_ac.func_31035_a(field_824_e, field_823_f, field_822_g, field_821_h, field_31021_a, p_31010_1_, field_31025_c);
        if(axisalignedbb != null)
        {
            List list = field_824_e.func_659_b(null, axisalignedbb);
            if(!list.isEmpty())
            {
                field_31018_m.addAll(list);
                Entity entity;
                for(Iterator iterator = field_31018_m.iterator(); iterator.hasNext(); entity.func_349_c(p_31010_2_ * (float)Facing.field_31056_b[field_31025_c], p_31010_2_ * (float)Facing.field_31059_c[field_31025_c], p_31010_2_ * (float)Facing.field_31058_d[field_31025_c]))
                {
                    entity = (Entity)iterator.next();
                }

                field_31018_m.clear();
            }
        }
    }

    public void func_31011_l()
    {
        if(field_31020_l < 1.0F && field_824_e != null)
        {
            field_31020_l = field_31022_k = 1.0F;
            field_824_e.func_692_l(field_823_f, field_822_g, field_821_h);
            func_31005_i();
            if(field_824_e.func_600_a(field_823_f, field_822_g, field_821_h) == Block.field_9268_ac.field_376_bc)
            {
                field_824_e.func_688_b(field_823_f, field_822_g, field_821_h, field_31021_a, field_31019_b);
            }
        }
    }

    public void func_475_b()
    {
        field_31020_l = field_31022_k;
        if(field_31020_l >= 1.0F)
        {
            func_31010_a(1.0F, 0.25F);
            field_824_e.func_692_l(field_823_f, field_822_g, field_821_h);
            func_31005_i();
            if(field_824_e.func_600_a(field_823_f, field_822_g, field_821_h) == Block.field_9268_ac.field_376_bc)
            {
                field_824_e.func_688_b(field_823_f, field_822_g, field_821_h, field_31021_a, field_31019_b);
            }
            return;
        }
        field_31022_k += 0.5F;
        if(field_31022_k >= 1.0F)
        {
            field_31022_k = 1.0F;
        }
        if(field_31024_i)
        {
            func_31010_a(field_31022_k, (field_31022_k - field_31020_l) + 0.0625F);
        }
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        field_31021_a = p_482_1_.func_756_e("blockId");
        field_31019_b = p_482_1_.func_756_e("blockData");
        field_31025_c = p_482_1_.func_756_e("facing");
        field_31020_l = field_31022_k = p_482_1_.func_752_g("progress");
        field_31024_i = p_482_1_.func_760_m("extending");
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        p_481_1_.func_758_a("blockId", field_31021_a);
        p_481_1_.func_758_a("blockData", field_31019_b);
        p_481_1_.func_758_a("facing", field_31025_c);
        p_481_1_.func_744_a("progress", field_31020_l);
        p_481_1_.func_748_a("extending", field_31024_i);
    }

}
