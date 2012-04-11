// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityTameable, EntityLiving

public class EntityAIOwnerHurtTarget extends EntityAITarget
{

    EntityTameable field_48392_a;
    EntityLiving field_48391_b;

    public EntityAIOwnerHurtTarget(EntityTameable p_i1091_1_)
    {
        super(p_i1091_1_, 32F, false);
        field_48392_a = p_i1091_1_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(!field_48392_a.func_48139_F_())
        {
            return false;
        }
        EntityLiving entityliving = field_48392_a.func_48144_ah();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48391_b = entityliving.func_48088_aP();
            return func_48376_a(field_48391_b, false);
        }
    }

    public void func_46080_e()
    {
        field_48382_c.func_48092_c(field_48391_b);
        super.func_46080_e();
    }
}
