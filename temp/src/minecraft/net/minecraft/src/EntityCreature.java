// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityLiving, Profiler, World, Entity, 
//            AxisAlignedBB, MathHelper, PathEntity, Vec3D

public abstract class EntityCreature extends EntityLiving
{

    private PathEntity field_749_a;
    protected Entity field_751_f;
    protected boolean field_750_g;
    protected int field_35174_at;

    public EntityCreature(World p_i730_1_)
    {
        super(p_i730_1_);
        field_750_g = false;
        field_35174_at = 0;
    }

    protected boolean func_25028_d_()
    {
        return false;
    }

    protected void func_418_b_()
    {
        Profiler.func_40663_a("ai");
        if(field_35174_at > 0)
        {
            field_35174_at--;
        }
        field_750_g = func_25028_d_();
        float f = 16F;
        if(field_751_f == null)
        {
            field_751_f = func_438_i();
            if(field_751_f != null)
            {
                field_749_a = field_615_ag.func_48463_a(this, field_751_f, f, true, false, false, true);
            }
        } else
        if(!field_751_f.func_354_B())
        {
            field_751_f = null;
        } else
        {
            float f1 = field_751_f.func_379_d(this);
            if(func_420_c(field_751_f))
            {
                func_437_a(field_751_f, f1);
            } else
            {
                func_28022_b(field_751_f, f1);
            }
        }
        Profiler.func_40662_b();
        if(!field_750_g && field_751_f != null && (field_749_a == null || field_9312_bd.nextInt(20) == 0))
        {
            field_749_a = field_615_ag.func_48463_a(this, field_751_f, f, true, false, false, true);
        } else
        if(!field_750_g && (field_749_a == null && field_9312_bd.nextInt(180) == 0 || field_9312_bd.nextInt(120) == 0 || field_35174_at > 0) && field_9344_ag < 100)
        {
            func_31026_E();
        }
        int i = MathHelper.func_1108_b(field_601_au.field_1697_b + 0.5D);
        boolean flag = func_27013_ag();
        boolean flag1 = func_359_G();
        field_604_ar = 0.0F;
        if(field_749_a == null || field_9312_bd.nextInt(100) == 0)
        {
            super.func_418_b_();
            field_749_a = null;
            return;
        }
        Profiler.func_40663_a("followpath");
        Vec3D vec3d = field_749_a.func_48640_a(this);
        for(double d = field_644_aC * 2.0F; vec3d != null && vec3d.func_1255_d(field_611_ak, vec3d.field_1775_b, field_609_am) < d * d;)
        {
            field_749_a.func_1206_a();
            if(field_749_a.func_1207_b())
            {
                vec3d = null;
                field_749_a = null;
            } else
            {
                vec3d = field_749_a.func_48640_a(this);
            }
        }

        field_9336_ak = false;
        if(vec3d != null)
        {
            double d1 = vec3d.field_1776_a - field_611_ak;
            double d2 = vec3d.field_1779_c - field_609_am;
            double d3 = vec3d.field_1775_b - (double)i;
            float f2 = (float)((Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - 90F;
            float f3 = f2 - field_605_aq;
            field_9340_ai = field_9333_am;
            for(; f3 < -180F; f3 += 360F) { }
            for(; f3 >= 180F; f3 -= 360F) { }
            if(f3 > 30F)
            {
                f3 = 30F;
            }
            if(f3 < -30F)
            {
                f3 = -30F;
            }
            field_605_aq += f3;
            if(field_750_g && field_751_f != null)
            {
                double d4 = field_751_f.field_611_ak - field_611_ak;
                double d5 = field_751_f.field_609_am - field_609_am;
                float f5 = field_605_aq;
                field_605_aq = (float)((Math.atan2(d5, d4) * 180D) / 3.1415927410125732D) - 90F;
                float f4 = (((f5 - field_605_aq) + 90F) * 3.141593F) / 180F;
                field_9342_ah = -MathHelper.func_1106_a(f4) * field_9340_ai * 1.0F;
                field_9340_ai = MathHelper.func_1114_b(f4) * field_9340_ai * 1.0F;
            }
            if(d3 > 0.0D)
            {
                field_9336_ak = true;
            }
        }
        if(field_751_f != null)
        {
            func_426_b(field_751_f, 30F, 30F);
        }
        if(field_9297_aI && !func_25031_E())
        {
            field_9336_ak = true;
        }
        if(field_9312_bd.nextFloat() < 0.8F && (flag || flag1))
        {
            field_9336_ak = true;
        }
        Profiler.func_40662_b();
    }

    protected void func_31026_E()
    {
        Profiler.func_40663_a("stroll");
        boolean flag = false;
        int i = -1;
        int j = -1;
        int k = -1;
        float f = -99999F;
        for(int l = 0; l < 10; l++)
        {
            int i1 = MathHelper.func_1108_b((field_611_ak + (double)field_9312_bd.nextInt(13)) - 6D);
            int j1 = MathHelper.func_1108_b((field_610_al + (double)field_9312_bd.nextInt(7)) - 3D);
            int k1 = MathHelper.func_1108_b((field_609_am + (double)field_9312_bd.nextInt(13)) - 6D);
            float f1 = func_439_a(i1, j1, k1);
            if(f1 > f)
            {
                f = f1;
                i = i1;
                j = j1;
                k = k1;
                flag = true;
            }
        }

        if(flag)
        {
            field_749_a = field_615_ag.func_48460_a(this, i, j, k, 10F, true, false, false, true);
        }
        Profiler.func_40662_b();
    }

    protected void func_437_a(Entity entity, float f)
    {
    }

    protected void func_28022_b(Entity entity, float f)
    {
    }

    public float func_439_a(int p_439_1_, int p_439_2_, int p_439_3_)
    {
        return 0.0F;
    }

    protected Entity func_438_i()
    {
        return null;
    }

    public boolean func_433_a()
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_601_au.field_1697_b);
        int k = MathHelper.func_1108_b(field_609_am);
        return super.func_433_a() && func_439_a(i, j, k) >= 0.0F;
    }

    public boolean func_25031_E()
    {
        return field_749_a != null;
    }

    public void func_25029_a(PathEntity p_25029_1_)
    {
        field_749_a = p_25029_1_;
    }

    public Entity func_25030_F()
    {
        return field_751_f;
    }

    public void func_25032_c(Entity p_25032_1_)
    {
        field_751_f = p_25032_1_;
    }

    protected float func_35166_t_()
    {
        if(func_46006_aR())
        {
            return 1.0F;
        }
        float f = super.func_35166_t_();
        if(field_35174_at > 0)
        {
            f *= 2.0F;
        }
        return f;
    }
}
