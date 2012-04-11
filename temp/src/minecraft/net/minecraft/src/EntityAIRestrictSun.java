// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, PathNavigate

public class EntityAIRestrictSun extends EntityAIBase
{

    private EntityCreature field_48235_a;

    public EntityAIRestrictSun(EntityCreature p_i1017_1_)
    {
        field_48235_a = p_i1017_1_;
    }

    public boolean func_46082_a()
    {
        return field_48235_a.field_615_ag.func_624_b();
    }

    public void func_46080_e()
    {
        field_48235_a.func_48084_aL().func_48680_d(true);
    }

    public void func_46077_d()
    {
        field_48235_a.func_48084_aL().func_48680_d(false);
    }
}
