// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityTameable, EntityLiving

public class EntityAIOwnerHurtByTarget extends EntityAITarget
{

    EntityTameable field_48394_a;
    EntityLiving field_48393_b;

    public EntityAIOwnerHurtByTarget(EntityTameable p_i1088_1_)
    {
        super(p_i1088_1_, 32F, false);
        field_48394_a = p_i1088_1_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(!field_48394_a.func_48139_F_())
        {
            return false;
        }
        EntityLiving entityliving = field_48394_a.func_48144_ah();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48393_b = entityliving.func_46007_aL();
            return func_48376_a(field_48393_b, false);
        }
    }

    public void func_46080_e()
    {
        field_48382_c.func_48092_c(field_48393_b);
        super.func_46080_e();
    }
}
