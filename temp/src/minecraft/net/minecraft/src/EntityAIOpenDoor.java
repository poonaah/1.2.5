// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIDoorInteract, EntityLiving, BlockDoor

public class EntityAIOpenDoor extends EntityAIDoorInteract
{

    boolean field_48328_i;
    int field_48327_j;

    public EntityAIOpenDoor(EntityLiving p_i1003_1_, boolean p_i1003_2_)
    {
        super(p_i1003_1_);
        field_48325_a = p_i1003_1_;
        field_48328_i = p_i1003_2_;
    }

    public boolean func_46084_g()
    {
        return field_48328_i && field_48327_j > 0 && super.func_46084_g();
    }

    public void func_46080_e()
    {
        field_48327_j = 20;
        field_48322_e.func_311_a(field_48325_a.field_615_ag, field_48323_b, field_48324_c, field_48321_d, true);
    }

    public void func_46077_d()
    {
        if(field_48328_i)
        {
            field_48322_e.func_311_a(field_48325_a.field_615_ag, field_48323_b, field_48324_c, field_48321_d, false);
        }
    }

    public void func_46081_b()
    {
        field_48327_j--;
        super.func_46081_b();
    }
}
