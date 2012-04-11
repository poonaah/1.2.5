// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityDamageSource, Entity

public class EntityDamageSourceIndirect extends EntityDamageSource
{

    private Entity field_35553_n;

    public EntityDamageSourceIndirect(String p_i331_1_, Entity p_i331_2_, Entity p_i331_3_)
    {
        super(p_i331_1_, p_i331_2_);
        field_35553_n = p_i331_3_;
    }

    public Entity func_35526_e()
    {
        return field_35552_n;
    }

    public Entity func_35532_a()
    {
        return field_35553_n;
    }
}
