// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityTameable, EntityLiving, PathNavigate

public class EntityAISit extends EntityAIBase
{

    private EntityTameable field_48409_a;
    private boolean field_48408_b;

    public EntityAISit(EntityTameable p_i1035_1_)
    {
        field_48408_b = false;
        field_48409_a = p_i1035_1_;
        func_46079_a(5);
    }

    public boolean func_46082_a()
    {
        if(!field_48409_a.func_48139_F_())
        {
            return false;
        }
        if(field_48409_a.func_27013_ag())
        {
            return false;
        }
        if(!field_48409_a.field_9298_aH)
        {
            return false;
        }
        EntityLiving entityliving = field_48409_a.func_48144_ah();
        if(entityliving == null)
        {
            return true;
        }
        if(field_48409_a.func_387_e(entityliving) < 144D && entityliving.func_46007_aL() != null)
        {
            return false;
        } else
        {
            return field_48408_b;
        }
    }

    public void func_46080_e()
    {
        field_48409_a.func_48084_aL().func_48672_f();
        field_48409_a.func_48140_f(true);
    }

    public void func_46077_d()
    {
        field_48409_a.func_48140_f(false);
    }

    public void func_48407_a(boolean p_48407_1_)
    {
        field_48408_b = p_48407_1_;
    }
}
