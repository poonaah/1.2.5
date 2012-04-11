// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAINearestAttackableTarget, EntityTameable

public class EntityAITargetNonTamed extends EntityAINearestAttackableTarget
{

    private EntityTameable field_48390_g;

    public EntityAITargetNonTamed(EntityTameable p_i1010_1_, Class p_i1010_2_, float p_i1010_3_, int p_i1010_4_, boolean p_i1010_5_)
    {
        super(p_i1010_1_, p_i1010_2_, p_i1010_3_, p_i1010_4_, p_i1010_5_);
        field_48390_g = p_i1010_1_;
    }

    public boolean func_46082_a()
    {
        if(field_48390_g.func_48139_F_())
        {
            return false;
        } else
        {
            return super.func_46082_a();
        }
    }
}
