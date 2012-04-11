// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, AxisAlignedBB, EntityLiving, MathHelper, 
//            World, Vec3D, MovingObjectPosition, NBTTagCompound, 
//            EntityPlayer

public abstract class EntityThrowable extends Entity
{

    private int field_40079_d;
    private int field_40080_e;
    private int field_40082_ao;
    private int field_40084_ap;
    protected boolean field_40085_a;
    public int field_40081_b;
    protected EntityLiving field_40083_c;
    private int field_40087_aq;
    private int field_40086_ar;

    public EntityThrowable(World p_i233_1_)
    {
        super(p_i233_1_);
        field_40079_d = -1;
        field_40080_e = -1;
        field_40082_ao = -1;
        field_40084_ap = 0;
        field_40085_a = false;
        field_40081_b = 0;
        field_40086_ar = 0;
        func_371_a(0.25F, 0.25F);
    }

    protected void func_21057_b()
    {
    }

    public boolean func_384_a(double p_384_1_)
    {
        double d = field_601_au.func_1164_b() * 4D;
        d *= 64D;
        return p_384_1_ < d * d;
    }

    public EntityThrowable(World p_i234_1_, EntityLiving p_i234_2_)
    {
        super(p_i234_1_);
        field_40079_d = -1;
        field_40080_e = -1;
        field_40082_ao = -1;
        field_40084_ap = 0;
        field_40085_a = false;
        field_40081_b = 0;
        field_40086_ar = 0;
        field_40083_c = p_i234_2_;
        func_371_a(0.25F, 0.25F);
        func_365_c(p_i234_2_.field_611_ak, p_i234_2_.field_610_al + (double)p_i234_2_.func_373_s(), p_i234_2_.field_609_am, p_i234_2_.field_605_aq, p_i234_2_.field_604_ar);
        field_611_ak -= MathHelper.func_1114_b((field_605_aq / 180F) * 3.141593F) * 0.16F;
        field_610_al -= 0.10000000149011612D;
        field_609_am -= MathHelper.func_1106_a((field_605_aq / 180F) * 3.141593F) * 0.16F;
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_9292_aO = 0.0F;
        float f = 0.4F;
        field_608_an = -MathHelper.func_1106_a((field_605_aq / 180F) * 3.141593F) * MathHelper.func_1114_b((field_604_ar / 180F) * 3.141593F) * f;
        field_606_ap = MathHelper.func_1114_b((field_605_aq / 180F) * 3.141593F) * MathHelper.func_1114_b((field_604_ar / 180F) * 3.141593F) * f;
        field_607_ao = -MathHelper.func_1106_a(((field_604_ar + func_40074_d()) / 180F) * 3.141593F) * f;
        func_40076_a(field_608_an, field_607_ao, field_606_ap, func_40077_c(), 1.0F);
    }

    public EntityThrowable(World p_i235_1_, double p_i235_2_, double p_i235_4_, double p_i235_6_)
    {
        super(p_i235_1_);
        field_40079_d = -1;
        field_40080_e = -1;
        field_40082_ao = -1;
        field_40084_ap = 0;
        field_40085_a = false;
        field_40081_b = 0;
        field_40086_ar = 0;
        field_40087_aq = 0;
        func_371_a(0.25F, 0.25F);
        func_347_a(p_i235_2_, p_i235_4_, p_i235_6_);
        field_9292_aO = 0.0F;
    }

    protected float func_40077_c()
    {
        return 1.5F;
    }

    protected float func_40074_d()
    {
        return 0.0F;
    }

    public void func_40076_a(double p_40076_1_, double p_40076_3_, double p_40076_5_, float p_40076_7_, 
            float p_40076_8_)
    {
        float f = MathHelper.func_1109_a(p_40076_1_ * p_40076_1_ + p_40076_3_ * p_40076_3_ + p_40076_5_ * p_40076_5_);
        p_40076_1_ /= f;
        p_40076_3_ /= f;
        p_40076_5_ /= f;
        p_40076_1_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_40076_8_;
        p_40076_3_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_40076_8_;
        p_40076_5_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_40076_8_;
        p_40076_1_ *= p_40076_7_;
        p_40076_3_ *= p_40076_7_;
        p_40076_5_ *= p_40076_7_;
        field_608_an = p_40076_1_;
        field_607_ao = p_40076_3_;
        field_606_ap = p_40076_5_;
        float f1 = MathHelper.func_1109_a(p_40076_1_ * p_40076_1_ + p_40076_5_ * p_40076_5_);
        field_603_as = field_605_aq = (float)((Math.atan2(p_40076_1_, p_40076_5_) * 180D) / 3.1415927410125732D);
        field_602_at = field_604_ar = (float)((Math.atan2(p_40076_3_, f1) * 180D) / 3.1415927410125732D);
        field_40087_aq = 0;
    }

    public void func_6375_a(double p_6375_1_, double p_6375_3_, double p_6375_5_)
    {
        field_608_an = p_6375_1_;
        field_607_ao = p_6375_3_;
        field_606_ap = p_6375_5_;
        if(field_602_at == 0.0F && field_603_as == 0.0F)
        {
            float f = MathHelper.func_1109_a(p_6375_1_ * p_6375_1_ + p_6375_5_ * p_6375_5_);
            field_603_as = field_605_aq = (float)((Math.atan2(p_6375_1_, p_6375_5_) * 180D) / 3.1415927410125732D);
            field_602_at = field_604_ar = (float)((Math.atan2(p_6375_3_, f) * 180D) / 3.1415927410125732D);
        }
    }

    public void func_370_e_()
    {
        field_638_aI = field_611_ak;
        field_637_aJ = field_610_al;
        field_636_aK = field_609_am;
        super.func_370_e_();
        if(field_40081_b > 0)
        {
            field_40081_b--;
        }
        if(field_40085_a)
        {
            int i = field_615_ag.func_600_a(field_40079_d, field_40080_e, field_40082_ao);
            if(i != field_40084_ap)
            {
                field_40085_a = false;
                field_608_an *= field_9312_bd.nextFloat() * 0.2F;
                field_607_ao *= field_9312_bd.nextFloat() * 0.2F;
                field_606_ap *= field_9312_bd.nextFloat() * 0.2F;
                field_40087_aq = 0;
                field_40086_ar = 0;
            } else
            {
                field_40087_aq++;
                if(field_40087_aq == 1200)
                {
                    func_395_F();
                }
                return;
            }
        } else
        {
            field_40086_ar++;
        }
        Vec3D vec3d = Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am);
        Vec3D vec3d1 = Vec3D.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        MovingObjectPosition movingobjectposition = field_615_ag.func_645_a(vec3d, vec3d1);
        vec3d = Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am);
        vec3d1 = Vec3D.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        if(movingobjectposition != null)
        {
            vec3d1 = Vec3D.func_1248_b(movingobjectposition.field_1169_f.field_1776_a, movingobjectposition.field_1169_f.field_1775_b, movingobjectposition.field_1169_f.field_1779_c);
        }
        if(!field_615_ag.field_1026_y)
        {
            Entity entity = null;
            List list = field_615_ag.func_659_b(this, field_601_au.func_1170_a(field_608_an, field_607_ao, field_606_ap).func_1177_b(1.0D, 1.0D, 1.0D));
            double d = 0.0D;
            for(int k = 0; k < list.size(); k++)
            {
                Entity entity1 = (Entity)list.get(k);
                if(!entity1.func_401_c_() || entity1 == field_40083_c && field_40086_ar < 5)
                {
                    continue;
                }
                float f4 = 0.3F;
                AxisAlignedBB axisalignedbb = entity1.field_601_au.func_1177_b(f4, f4, f4);
                MovingObjectPosition movingobjectposition1 = axisalignedbb.func_1169_a(vec3d, vec3d1);
                if(movingobjectposition1 == null)
                {
                    continue;
                }
                double d1 = vec3d.func_1251_c(movingobjectposition1.field_1169_f);
                if(d1 < d || d == 0.0D)
                {
                    entity = entity1;
                    d = d1;
                }
            }

            if(entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }
        }
        if(movingobjectposition != null)
        {
            func_40078_a(movingobjectposition);
        }
        field_611_ak += field_608_an;
        field_610_al += field_607_ao;
        field_609_am += field_606_ap;
        float f = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
        field_605_aq = (float)((Math.atan2(field_608_an, field_606_ap) * 180D) / 3.1415927410125732D);
        for(field_604_ar = (float)((Math.atan2(field_607_ao, f) * 180D) / 3.1415927410125732D); field_604_ar - field_602_at < -180F; field_602_at -= 360F) { }
        for(; field_604_ar - field_602_at >= 180F; field_602_at += 360F) { }
        for(; field_605_aq - field_603_as < -180F; field_603_as -= 360F) { }
        for(; field_605_aq - field_603_as >= 180F; field_603_as += 360F) { }
        field_604_ar = field_602_at + (field_604_ar - field_602_at) * 0.2F;
        field_605_aq = field_603_as + (field_605_aq - field_603_as) * 0.2F;
        float f1 = 0.99F;
        float f2 = func_40075_e();
        if(func_27013_ag())
        {
            for(int j = 0; j < 4; j++)
            {
                float f3 = 0.25F;
                field_615_ag.func_694_a("bubble", field_611_ak - field_608_an * (double)f3, field_610_al - field_607_ao * (double)f3, field_609_am - field_606_ap * (double)f3, field_608_an, field_607_ao, field_606_ap);
            }

            f1 = 0.8F;
        }
        field_608_an *= f1;
        field_607_ao *= f1;
        field_606_ap *= f1;
        field_607_ao -= f2;
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    protected float func_40075_e()
    {
        return 0.03F;
    }

    protected abstract void func_40078_a(MovingObjectPosition movingobjectposition);

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("xTile", (short)field_40079_d);
        p_352_1_.func_749_a("yTile", (short)field_40080_e);
        p_352_1_.func_749_a("zTile", (short)field_40082_ao);
        p_352_1_.func_761_a("inTile", (byte)field_40084_ap);
        p_352_1_.func_761_a("shake", (byte)field_40081_b);
        p_352_1_.func_761_a("inGround", (byte)(field_40085_a ? 1 : 0));
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_40079_d = p_357_1_.func_745_d("xTile");
        field_40080_e = p_357_1_.func_745_d("yTile");
        field_40082_ao = p_357_1_.func_745_d("zTile");
        field_40084_ap = p_357_1_.func_746_c("inTile") & 0xff;
        field_40081_b = p_357_1_.func_746_c("shake") & 0xff;
        field_40085_a = p_357_1_.func_746_c("inGround") == 1;
    }

    public void func_6378_b(EntityPlayer entityplayer)
    {
    }

    public float func_392_h_()
    {
        return 0.0F;
    }
}
