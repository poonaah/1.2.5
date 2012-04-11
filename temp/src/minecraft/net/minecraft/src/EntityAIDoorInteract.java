// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, PathEntity, 
//            PathPoint, MathHelper, World, Block, 
//            BlockDoor

public abstract class EntityAIDoorInteract extends EntityAIBase
{

    protected EntityLiving field_48325_a;
    protected int field_48323_b;
    protected int field_48324_c;
    protected int field_48321_d;
    protected BlockDoor field_48322_e;
    boolean field_48319_f;
    float field_48320_g;
    float field_48326_h;

    public EntityAIDoorInteract(EntityLiving p_i1045_1_)
    {
        field_48325_a = p_i1045_1_;
    }

    public boolean func_46082_a()
    {
        if(!field_48325_a.field_9297_aI)
        {
            return false;
        }
        PathNavigate pathnavigate = field_48325_a.func_48084_aL();
        PathEntity pathentity = pathnavigate.func_48670_c();
        if(pathentity == null || pathentity.func_1207_b() || !pathnavigate.func_48665_b())
        {
            return false;
        }
        for(int i = 0; i < Math.min(pathentity.func_48643_e() + 2, pathentity.func_48644_d()); i++)
        {
            PathPoint pathpoint = pathentity.func_48648_a(i);
            field_48323_b = pathpoint.field_1718_a;
            field_48324_c = pathpoint.field_1717_b + 1;
            field_48321_d = pathpoint.field_1716_c;
            if(field_48325_a.func_360_d(field_48323_b, field_48325_a.field_610_al, field_48321_d) > 2.25D)
            {
                continue;
            }
            field_48322_e = func_48318_a(field_48323_b, field_48324_c, field_48321_d);
            if(field_48322_e != null)
            {
                return true;
            }
        }

        field_48323_b = MathHelper.func_1108_b(field_48325_a.field_611_ak);
        field_48324_c = MathHelper.func_1108_b(field_48325_a.field_610_al + 1.0D);
        field_48321_d = MathHelper.func_1108_b(field_48325_a.field_609_am);
        field_48322_e = func_48318_a(field_48323_b, field_48324_c, field_48321_d);
        return field_48322_e != null;
    }

    public boolean func_46084_g()
    {
        return !field_48319_f;
    }

    public void func_46080_e()
    {
        field_48319_f = false;
        field_48320_g = (float)((double)((float)field_48323_b + 0.5F) - field_48325_a.field_611_ak);
        field_48326_h = (float)((double)((float)field_48321_d + 0.5F) - field_48325_a.field_609_am);
    }

    public void func_46081_b()
    {
        float f = (float)((double)((float)field_48323_b + 0.5F) - field_48325_a.field_611_ak);
        float f1 = (float)((double)((float)field_48321_d + 0.5F) - field_48325_a.field_609_am);
        float f2 = field_48320_g * f + field_48326_h * f1;
        if(f2 < 0.0F)
        {
            field_48319_f = true;
        }
    }

    private BlockDoor func_48318_a(int p_48318_1_, int p_48318_2_, int p_48318_3_)
    {
        int i = field_48325_a.field_615_ag.func_600_a(p_48318_1_, p_48318_2_, p_48318_3_);
        if(i != Block.field_442_aF.field_376_bc)
        {
            return null;
        } else
        {
            BlockDoor blockdoor = (BlockDoor)Block.field_345_n[i];
            return blockdoor;
        }
    }
}
