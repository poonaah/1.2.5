// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, World, NBTTagCompound

public class EntityTNTPrimed extends Entity
{

    public int field_689_a;

    public EntityTNTPrimed(World p_i104_1_)
    {
        super(p_i104_1_);
        field_689_a = 0;
        field_618_ad = true;
        func_371_a(0.98F, 0.98F);
        field_9292_aO = field_643_aD / 2.0F;
    }

    public EntityTNTPrimed(World p_i105_1_, double p_i105_2_, double p_i105_4_, double p_i105_6_)
    {
        this(p_i105_1_);
        func_347_a(p_i105_2_, p_i105_4_, p_i105_6_);
        float f = (float)(Math.random() * 3.1415927410125732D * 2D);
        field_608_an = -(float)Math.sin(f) * 0.02F;
        field_607_ao = 0.20000000298023224D;
        field_606_ap = -(float)Math.cos(f) * 0.02F;
        field_689_a = 80;
        field_9285_at = p_i105_2_;
        field_9284_au = p_i105_4_;
        field_9283_av = p_i105_6_;
    }

    protected void func_21057_b()
    {
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
            field_607_ao *= -0.5D;
        }
        if(field_689_a-- <= 0)
        {
            if(!field_615_ag.field_1026_y)
            {
                func_395_F();
                func_409_i();
            } else
            {
                func_395_F();
            }
        } else
        {
            field_615_ag.func_694_a("smoke", field_611_ak, field_610_al + 0.5D, field_609_am, 0.0D, 0.0D, 0.0D);
        }
    }

    private void func_409_i()
    {
        float f = 4F;
        field_615_ag.func_12243_a(null, field_611_ak, field_610_al, field_609_am, f);
    }

    protected void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_761_a("Fuse", (byte)field_689_a);
    }

    protected void func_357_b(NBTTagCompound p_357_1_)
    {
        field_689_a = p_357_1_.func_746_c("Fuse");
    }

    public float func_392_h_()
    {
        return 0.0F;
    }
}
