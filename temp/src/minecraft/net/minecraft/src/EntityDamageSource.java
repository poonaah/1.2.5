// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            DamageSource, Entity

public class EntityDamageSource extends DamageSource
{

    protected Entity field_35552_n;

    public EntityDamageSource(String p_i322_1_, Entity p_i322_2_)
    {
        super(p_i322_1_);
        field_35552_n = p_i322_2_;
    }

    public Entity func_35532_a()
    {
        return field_35552_n;
    }
}
