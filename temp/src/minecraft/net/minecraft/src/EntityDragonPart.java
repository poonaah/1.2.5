// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, EntityDragonBase, NBTTagCompound, DamageSource

public class EntityDragonPart extends Entity
{

    public final EntityDragonBase field_40073_a;
    public final String field_40072_b;

    public EntityDragonPart(EntityDragonBase p_i283_1_, String p_i283_2_, float p_i283_3_, float p_i283_4_)
    {
        super(p_i283_1_.field_615_ag);
        func_371_a(p_i283_3_, p_i283_4_);
        field_40073_a = p_i283_1_;
        field_40072_b = p_i283_2_;
    }

    protected void func_21057_b()
    {
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    public boolean func_401_c_()
    {
        return true;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        return field_40073_a.func_40156_a(this, p_396_1_, p_396_2_);
    }

    public boolean func_41004_h(Entity p_41004_1_)
    {
        return this == p_41004_1_ || field_40073_a == p_41004_1_;
    }
}
