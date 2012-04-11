// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityRainFX, World

public class EntitySplashFX extends EntityRainFX
{

    public EntitySplashFX(World p_i486_1_, double p_i486_2_, double p_i486_4_, double p_i486_6_, 
            double p_i486_8_, double p_i486_10_, double p_i486_12_)
    {
        super(p_i486_1_, p_i486_2_, p_i486_4_, p_i486_6_);
        field_664_h = 0.04F;
        func_40099_c(func_40100_q() + 1);
        if(p_i486_10_ == 0.0D && (p_i486_8_ != 0.0D || p_i486_12_ != 0.0D))
        {
            field_608_an = p_i486_8_;
            field_607_ao = p_i486_10_ + 0.10000000000000001D;
            field_606_ap = p_i486_12_;
        }
    }
}
