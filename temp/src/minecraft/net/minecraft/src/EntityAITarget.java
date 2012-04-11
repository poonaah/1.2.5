// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntitySenses, AxisAlignedBB, 
//            EntityTameable, EntityPlayer, PlayerCapabilities, MathHelper, 
//            PathNavigate, PathEntity, PathPoint

public abstract class EntityAITarget extends EntityAIBase
{

    protected EntityLiving field_48382_c;
    protected float field_48379_d;
    protected boolean field_48380_e;
    private boolean field_48383_a;
    private int field_48381_b;
    private int field_48377_f;
    private int field_48378_g;

    public EntityAITarget(EntityLiving p_i1061_1_, float p_i1061_2_, boolean p_i1061_3_)
    {
        this(p_i1061_1_, p_i1061_2_, p_i1061_3_, false);
    }

    public EntityAITarget(EntityLiving p_i1062_1_, float p_i1062_2_, boolean p_i1062_3_, boolean p_i1062_4_)
    {
        field_48381_b = 0;
        field_48377_f = 0;
        field_48378_g = 0;
        field_48382_c = p_i1062_1_;
        field_48379_d = p_i1062_2_;
        field_48380_e = p_i1062_3_;
        field_48383_a = p_i1062_4_;
    }

    public boolean func_46084_g()
    {
        EntityLiving entityliving = field_48382_c.func_48094_aS();
        if(entityliving == null)
        {
            return false;
        }
        if(!entityliving.func_354_B())
        {
            return false;
        }
        if(field_48382_c.func_387_e(entityliving) > (double)(field_48379_d * field_48379_d))
        {
            return false;
        }
        if(field_48380_e)
        {
            if(!field_48382_c.func_48090_aM().func_48480_a(entityliving))
            {
                if(++field_48378_g > 60)
                {
                    return false;
                }
            } else
            {
                field_48378_g = 0;
            }
        }
        return true;
    }

    public void func_46080_e()
    {
        field_48381_b = 0;
        field_48377_f = 0;
        field_48378_g = 0;
    }

    public void func_46077_d()
    {
        field_48382_c.func_48092_c(null);
    }

    protected boolean func_48376_a(EntityLiving p_48376_1_, boolean p_48376_2_)
    {
        if(p_48376_1_ == null)
        {
            return false;
        }
        if(p_48376_1_ == field_48382_c)
        {
            return false;
        }
        if(!p_48376_1_.func_354_B())
        {
            return false;
        }
        if(p_48376_1_.field_601_au.field_1702_e <= field_48382_c.field_601_au.field_1697_b || p_48376_1_.field_601_au.field_1697_b >= field_48382_c.field_601_au.field_1702_e)
        {
            return false;
        }
        if(!field_48382_c.func_48100_a(p_48376_1_.getClass()))
        {
            return false;
        }
        if((field_48382_c instanceof EntityTameable) && ((EntityTameable)field_48382_c).func_48139_F_())
        {
            if((p_48376_1_ instanceof EntityTameable) && ((EntityTameable)p_48376_1_).func_48139_F_())
            {
                return false;
            }
            if(p_48376_1_ == ((EntityTameable)field_48382_c).func_48144_ah())
            {
                return false;
            }
        } else
        if((p_48376_1_ instanceof EntityPlayer) && !p_48376_2_ && ((EntityPlayer)p_48376_1_).field_35212_aW.field_35759_a)
        {
            return false;
        }
        if(!field_48382_c.func_48096_f(MathHelper.func_1108_b(p_48376_1_.field_611_ak), MathHelper.func_1108_b(p_48376_1_.field_610_al), MathHelper.func_1108_b(p_48376_1_.field_609_am)))
        {
            return false;
        }
        if(field_48380_e && !field_48382_c.func_48090_aM().func_48480_a(p_48376_1_))
        {
            return false;
        }
        if(field_48383_a)
        {
            if(--field_48377_f <= 0)
            {
                field_48381_b = 0;
            }
            if(field_48381_b == 0)
            {
                field_48381_b = func_48375_a(p_48376_1_) ? 1 : 2;
            }
            if(field_48381_b == 2)
            {
                return false;
            }
        }
        return true;
    }

    private boolean func_48375_a(EntityLiving p_48375_1_)
    {
        field_48377_f = 10 + field_48382_c.func_46004_aK().nextInt(5);
        PathEntity pathentity = field_48382_c.func_48084_aL().func_48679_a(p_48375_1_);
        if(pathentity == null)
        {
            return false;
        }
        PathPoint pathpoint = pathentity.func_48645_c();
        if(pathpoint == null)
        {
            return false;
        } else
        {
            int i = pathpoint.field_1718_a - MathHelper.func_1108_b(p_48375_1_.field_611_ak);
            int j = pathpoint.field_1716_c - MathHelper.func_1108_b(p_48375_1_.field_609_am);
            return (double)(i * i + j * j) <= 2.25D;
        }
    }
}
