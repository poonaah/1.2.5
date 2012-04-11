// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAISit, DataWatcher, NBTTagCompound, 
//            World, EntityLiving

public abstract class EntityTameable extends EntityAnimal
{

    protected EntityAISit field_48146_a;

    public EntityTameable(World p_i1082_1_)
    {
        super(p_i1082_1_);
        field_48146_a = new EntityAISit(this);
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, Byte.valueOf((byte)0));
        field_21064_bx.func_21124_a(17, "");
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        if(func_48145_ag() == null)
        {
            p_352_1_.func_754_a("Owner", "");
        } else
        {
            p_352_1_.func_754_a("Owner", func_48145_ag());
        }
        p_352_1_.func_748_a("Sitting", func_48141_af());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        String s = p_357_1_.func_755_i("Owner");
        if(s.length() > 0)
        {
            func_48143_a(s);
            func_48138_b(true);
        }
        field_48146_a.func_48407_a(p_357_1_.func_760_m("Sitting"));
    }

    protected void func_48142_a(boolean p_48142_1_)
    {
        String s = "heart";
        if(!p_48142_1_)
        {
            s = "smoke";
        }
        for(int i = 0; i < 7; i++)
        {
            double d = field_9312_bd.nextGaussian() * 0.02D;
            double d1 = field_9312_bd.nextGaussian() * 0.02D;
            double d2 = field_9312_bd.nextGaussian() * 0.02D;
            field_615_ag.func_694_a(s, (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + 0.5D + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
        }

    }

    public void func_9282_a(byte p_9282_1_)
    {
        if(p_9282_1_ == 7)
        {
            func_48142_a(true);
        } else
        if(p_9282_1_ == 6)
        {
            func_48142_a(false);
        } else
        {
            super.func_9282_a(p_9282_1_);
        }
    }

    public boolean func_48139_F_()
    {
        return (field_21064_bx.func_21130_a(16) & 4) != 0;
    }

    public void func_48138_b(boolean p_48138_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_48138_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 | 4)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & -5)));
        }
    }

    public boolean func_48141_af()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    public void func_48140_f(boolean p_48140_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_48140_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 | 1)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & -2)));
        }
    }

    public String func_48145_ag()
    {
        return field_21064_bx.func_25116_c(17);
    }

    public void func_48143_a(String p_48143_1_)
    {
        field_21064_bx.func_21129_b(17, p_48143_1_);
    }

    public EntityLiving func_48144_ah()
    {
        return field_615_ag.func_25099_a(func_48145_ag());
    }

    public EntityAISit func_50008_ai()
    {
        return field_48146_a;
    }
}
