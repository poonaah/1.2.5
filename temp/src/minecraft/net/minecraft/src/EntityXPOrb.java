// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Material, 
//            AxisAlignedBB, EntityPlayer, Block, DamageSource, 
//            NBTTagCompound

public class EntityXPOrb extends Entity
{

    public int field_35127_a;
    public int field_35124_b;
    public int field_35126_c;
    private int field_35123_e;
    private int field_35125_ap;

    public EntityXPOrb(World p_i255_1_, double p_i255_2_, double p_i255_4_, double p_i255_6_, 
            int p_i255_8_)
    {
        super(p_i255_1_);
        field_35124_b = 0;
        field_35123_e = 5;
        func_371_a(0.5F, 0.5F);
        field_9292_aO = field_643_aD / 2.0F;
        func_347_a(p_i255_2_, p_i255_4_, p_i255_6_);
        field_605_aq = (float)(Math.random() * 360D);
        field_608_an = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F;
        field_607_ao = (float)(Math.random() * 0.20000000000000001D) * 2.0F;
        field_606_ap = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F;
        field_35125_ap = p_i255_8_;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    public EntityXPOrb(World p_i256_1_)
    {
        super(p_i256_1_);
        field_35124_b = 0;
        field_35123_e = 5;
        func_371_a(0.25F, 0.25F);
        field_9292_aO = field_643_aD / 2.0F;
    }

    protected void func_21057_b()
    {
    }

    public int func_35115_a(float p_35115_1_)
    {
        float f = 0.5F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        int i = super.func_35115_a(p_35115_1_);
        int j = i & 0xff;
        int k = i >> 16 & 0xff;
        j += (int)(f * 15F * 16F);
        if(j > 240)
        {
            j = 240;
        }
        return j | k << 16;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_35126_c > 0)
        {
            field_35126_c--;
        }
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_607_ao -= 0.029999999329447746D;
        if(field_615_ag.func_599_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)) == Material.field_1331_g)
        {
            field_607_ao = 0.20000000298023224D;
            field_608_an = (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F;
            field_606_ap = (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F;
            field_615_ag.func_623_a(this, "random.fizz", 0.4F, 2.0F + field_9312_bd.nextFloat() * 0.4F);
        }
        func_28014_c(field_611_ak, (field_601_au.field_1697_b + field_601_au.field_1702_e) / 2D, field_609_am);
        double d = 8D;
        EntityPlayer entityplayer = field_615_ag.func_609_a(this, d);
        if(entityplayer != null)
        {
            double d1 = (entityplayer.field_611_ak - field_611_ak) / d;
            double d2 = ((entityplayer.field_610_al + (double)entityplayer.func_373_s()) - field_610_al) / d;
            double d3 = (entityplayer.field_609_am - field_609_am) / d;
            double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
            double d5 = 1.0D - d4;
            if(d5 > 0.0D)
            {
                d5 *= d5;
                field_608_an += (d1 / d4) * d5 * 0.10000000000000001D;
                field_607_ao += (d2 / d4) * d5 * 0.10000000000000001D;
                field_606_ap += (d3 / d4) * d5 * 0.10000000000000001D;
            }
        }
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        float f = 0.98F;
        if(field_9298_aH)
        {
            f = 0.5880001F;
            int i = field_615_ag.func_600_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_601_au.field_1697_b) - 1, MathHelper.func_1108_b(field_609_am));
            if(i > 0)
            {
                f = Block.field_345_n[i].field_355_bo * 0.98F;
            }
        }
        field_608_an *= f;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= f;
        if(field_9298_aH)
        {
            field_607_ao *= -0.89999997615814209D;
        }
        field_35127_a++;
        field_35124_b++;
        if(field_35124_b >= 6000)
        {
            func_395_F();
        }
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(field_601_au, Material.field_1332_f, this);
    }

    protected void func_355_a(int p_355_1_)
    {
        func_396_a(DamageSource.field_35542_a, p_355_1_);
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        func_9281_M();
        field_35123_e -= p_396_2_;
        if(field_35123_e <= 0)
        {
            func_395_F();
        }
        return false;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("Health", (byte)field_35123_e);
        p_352_1_.func_749_a("Age", (short)field_35124_b);
        p_352_1_.func_749_a("Value", (short)field_35125_ap);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_35123_e = p_357_1_.func_745_d("Health") & 0xff;
        field_35124_b = p_357_1_.func_745_d("Age");
        field_35125_ap = p_357_1_.func_745_d("Value");
    }

    public void func_6378_b(EntityPlayer p_6378_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        if(field_35126_c == 0 && p_6378_1_.field_35214_aG == 0)
        {
            p_6378_1_.field_35214_aG = 2;
            field_615_ag.func_623_a(this, "random.orb", 0.1F, 0.5F * ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.7F + 1.8F));
            p_6378_1_.func_443_a_(this, 1);
            p_6378_1_.func_35204_c(field_35125_ap);
            func_395_F();
        }
    }

    public int func_35119_j_()
    {
        return field_35125_ap;
    }

    public int func_35120_i()
    {
        if(field_35125_ap >= 2477)
        {
            return 10;
        }
        if(field_35125_ap >= 1237)
        {
            return 9;
        }
        if(field_35125_ap >= 617)
        {
            return 8;
        }
        if(field_35125_ap >= 307)
        {
            return 7;
        }
        if(field_35125_ap >= 149)
        {
            return 6;
        }
        if(field_35125_ap >= 73)
        {
            return 5;
        }
        if(field_35125_ap >= 37)
        {
            return 4;
        }
        if(field_35125_ap >= 17)
        {
            return 3;
        }
        if(field_35125_ap >= 7)
        {
            return 2;
        }
        return field_35125_ap < 3 ? 0 : 1;
    }

    public static int func_35121_b(int p_35121_0_)
    {
        if(p_35121_0_ >= 2477)
        {
            return 2477;
        }
        if(p_35121_0_ >= 1237)
        {
            return 1237;
        }
        if(p_35121_0_ >= 617)
        {
            return 617;
        }
        if(p_35121_0_ >= 307)
        {
            return 307;
        }
        if(p_35121_0_ >= 149)
        {
            return 149;
        }
        if(p_35121_0_ >= 73)
        {
            return 73;
        }
        if(p_35121_0_ >= 37)
        {
            return 37;
        }
        if(p_35121_0_ >= 17)
        {
            return 17;
        }
        if(p_35121_0_ >= 7)
        {
            return 7;
        }
        return p_35121_0_ < 3 ? 1 : 3;
    }

    public boolean func_48080_j()
    {
        return false;
    }
}
