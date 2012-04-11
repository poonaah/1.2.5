// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityCreature, DataWatcher, NBTTagCompound, World

public abstract class EntityAgeable extends EntityCreature
{

    public EntityAgeable(World p_i1016_1_)
    {
        super(p_i1016_1_);
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(12, new Integer(0));
    }

    public int func_48123_at()
    {
        return field_21064_bx.func_25115_b(12);
    }

    public void func_48122_d(int p_48122_1_)
    {
        field_21064_bx.func_21129_b(12, Integer.valueOf(p_48122_1_));
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("Age", func_48123_at());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_48122_d(p_357_1_.func_756_e("Age"));
    }

    public void func_425_j()
    {
        super.func_425_j();
        int i = func_48123_at();
        if(i < 0)
        {
            i++;
            func_48122_d(i);
        } else
        if(i > 0)
        {
            i--;
            func_48122_d(i);
        }
    }

    public boolean func_40127_l()
    {
        return func_48123_at() < 0;
    }
}
