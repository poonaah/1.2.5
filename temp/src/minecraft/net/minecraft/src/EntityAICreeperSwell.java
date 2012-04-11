// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreeper, PathNavigate, EntitySenses, 
//            EntityLiving

public class EntityAICreeperSwell extends EntityAIBase
{

    EntityCreeper field_48237_a;
    EntityLiving field_48236_b;

    public EntityAICreeperSwell(EntityCreeper p_i1009_1_)
    {
        field_48237_a = p_i1009_1_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        EntityLiving entityliving = field_48237_a.func_48094_aS();
        return field_48237_a.func_21091_q() > 0 || entityliving != null && field_48237_a.func_387_e(entityliving) < 9D;
    }

    public void func_46080_e()
    {
        field_48237_a.func_48084_aL().func_48672_f();
        field_48236_b = field_48237_a.func_48094_aS();
    }

    public void func_46077_d()
    {
        field_48236_b = null;
    }

    public void func_46081_b()
    {
        if(field_48236_b == null)
        {
            field_48237_a.func_21090_e(-1);
            return;
        }
        if(field_48237_a.func_387_e(field_48236_b) > 49D)
        {
            field_48237_a.func_21090_e(-1);
            return;
        }
        if(!field_48237_a.func_48090_aM().func_48480_a(field_48236_b))
        {
            field_48237_a.func_21090_e(-1);
            return;
        } else
        {
            field_48237_a.func_21090_e(1);
            return;
        }
    }
}
