// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, AxisAlignedBB, MathHelper, EntityLiving, 
//            World, Vec3D, MovingObjectPosition, DamageSource, 
//            NBTTagCompound

public class EntityFireball extends Entity
{

    private int field_9402_e;
    private int field_9401_f;
    private int field_9400_g;
    private int field_9399_h;
    private boolean field_9398_i;
    public EntityLiving field_9397_j;
    private int field_9396_k;
    private int field_9395_l;
    public double field_9405_b;
    public double field_9404_c;
    public double field_9403_d;

    public EntityFireball(World p_i250_1_)
    {
        super(p_i250_1_);
        field_9402_e = -1;
        field_9401_f = -1;
        field_9400_g = -1;
        field_9399_h = 0;
        field_9398_i = false;
        field_9395_l = 0;
        func_371_a(1.0F, 1.0F);
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

    public EntityFireball(World p_i251_1_, double p_i251_2_, double p_i251_4_, double p_i251_6_, 
            double p_i251_8_, double p_i251_10_, double p_i251_12_)
    {
        super(p_i251_1_);
        field_9402_e = -1;
        field_9401_f = -1;
        field_9400_g = -1;
        field_9399_h = 0;
        field_9398_i = false;
        field_9395_l = 0;
        func_371_a(1.0F, 1.0F);
        func_365_c(p_i251_2_, p_i251_4_, p_i251_6_, field_605_aq, field_604_ar);
        func_347_a(p_i251_2_, p_i251_4_, p_i251_6_);
        double d = MathHelper.func_1109_a(p_i251_8_ * p_i251_8_ + p_i251_10_ * p_i251_10_ + p_i251_12_ * p_i251_12_);
        field_9405_b = (p_i251_8_ / d) * 0.10000000000000001D;
        field_9404_c = (p_i251_10_ / d) * 0.10000000000000001D;
        field_9403_d = (p_i251_12_ / d) * 0.10000000000000001D;
    }

    public EntityFireball(World p_i252_1_, EntityLiving p_i252_2_, double p_i252_3_, double p_i252_5_, double p_i252_7_)
    {
        super(p_i252_1_);
        field_9402_e = -1;
        field_9401_f = -1;
        field_9400_g = -1;
        field_9399_h = 0;
        field_9398_i = false;
        field_9395_l = 0;
        field_9397_j = p_i252_2_;
        func_371_a(1.0F, 1.0F);
        func_365_c(p_i252_2_.field_611_ak, p_i252_2_.field_610_al, p_i252_2_.field_609_am, p_i252_2_.field_605_aq, p_i252_2_.field_604_ar);
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_9292_aO = 0.0F;
        field_608_an = field_607_ao = field_606_ap = 0.0D;
        p_i252_3_ += field_9312_bd.nextGaussian() * 0.40000000000000002D;
        p_i252_5_ += field_9312_bd.nextGaussian() * 0.40000000000000002D;
        p_i252_7_ += field_9312_bd.nextGaussian() * 0.40000000000000002D;
        double d = MathHelper.func_1109_a(p_i252_3_ * p_i252_3_ + p_i252_5_ * p_i252_5_ + p_i252_7_ * p_i252_7_);
        field_9405_b = (p_i252_3_ / d) * 0.10000000000000001D;
        field_9404_c = (p_i252_5_ / d) * 0.10000000000000001D;
        field_9403_d = (p_i252_7_ / d) * 0.10000000000000001D;
    }

    public void func_370_e_()
    {
        if(!field_615_ag.field_1026_y && (field_9397_j != null && field_9397_j.field_646_aA || !field_615_ag.func_630_d((int)field_611_ak, (int)field_610_al, (int)field_609_am)))
        {
            func_395_F();
            return;
        }
        super.func_370_e_();
        func_40046_d(1);
        if(field_9398_i)
        {
            int i = field_615_ag.func_600_a(field_9402_e, field_9401_f, field_9400_g);
            if(i != field_9399_h)
            {
                field_9398_i = false;
                field_608_an *= field_9312_bd.nextFloat() * 0.2F;
                field_607_ao *= field_9312_bd.nextFloat() * 0.2F;
                field_606_ap *= field_9312_bd.nextFloat() * 0.2F;
                field_9396_k = 0;
                field_9395_l = 0;
            } else
            {
                field_9396_k++;
                if(field_9396_k == 600)
                {
                    func_395_F();
                }
                return;
            }
        } else
        {
            field_9395_l++;
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
        Entity entity = null;
        List list = field_615_ag.func_659_b(this, field_601_au.func_1170_a(field_608_an, field_607_ao, field_606_ap).func_1177_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            Entity entity1 = (Entity)list.get(j);
            if(!entity1.func_401_c_() || entity1.func_41004_h(field_9397_j) && field_9395_l < 25)
            {
                continue;
            }
            float f2 = 0.3F;
            AxisAlignedBB axisalignedbb = entity1.field_601_au.func_1177_b(f2, f2, f2);
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
        if(movingobjectposition != null)
        {
            func_40071_a(movingobjectposition);
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
        float f1 = 0.95F;
        if(func_27013_ag())
        {
            for(int k = 0; k < 4; k++)
            {
                float f3 = 0.25F;
                field_615_ag.func_694_a("bubble", field_611_ak - field_608_an * (double)f3, field_610_al - field_607_ao * (double)f3, field_609_am - field_606_ap * (double)f3, field_608_an, field_607_ao, field_606_ap);
            }

            f1 = 0.8F;
        }
        field_608_an += field_9405_b;
        field_607_ao += field_9404_c;
        field_606_ap += field_9403_d;
        field_608_an *= f1;
        field_607_ao *= f1;
        field_606_ap *= f1;
        field_615_ag.func_694_a("smoke", field_611_ak, field_610_al + 0.5D, field_609_am, 0.0D, 0.0D, 0.0D);
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    protected void func_40071_a(MovingObjectPosition p_40071_1_)
    {
        if(!field_615_ag.field_1026_y)
        {
            if(p_40071_1_.field_1168_g != null)
            {
                if(!p_40071_1_.field_1168_g.func_396_a(DamageSource.func_35530_a(this, field_9397_j), 4));
            }
            field_615_ag.func_12244_a(null, field_611_ak, field_610_al, field_609_am, 1.0F, true);
            func_395_F();
        }
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("xTile", (short)field_9402_e);
        p_352_1_.func_749_a("yTile", (short)field_9401_f);
        p_352_1_.func_749_a("zTile", (short)field_9400_g);
        p_352_1_.func_761_a("inTile", (byte)field_9399_h);
        p_352_1_.func_761_a("inGround", (byte)(field_9398_i ? 1 : 0));
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_9402_e = p_357_1_.func_745_d("xTile");
        field_9401_f = p_357_1_.func_745_d("yTile");
        field_9400_g = p_357_1_.func_745_d("zTile");
        field_9399_h = p_357_1_.func_746_c("inTile") & 0xff;
        field_9398_i = p_357_1_.func_746_c("inGround") == 1;
    }

    public boolean func_401_c_()
    {
        return true;
    }

    public float func_4035_j_()
    {
        return 1.0F;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        func_9281_M();
        if(p_396_1_.func_35532_a() != null)
        {
            Vec3D vec3d = p_396_1_.func_35532_a().func_4037_H();
            if(vec3d != null)
            {
                field_608_an = vec3d.field_1776_a;
                field_607_ao = vec3d.field_1775_b;
                field_606_ap = vec3d.field_1779_c;
                field_9405_b = field_608_an * 0.10000000000000001D;
                field_9404_c = field_607_ao * 0.10000000000000001D;
                field_9403_d = field_606_ap * 0.10000000000000001D;
            }
            if(p_396_1_.func_35532_a() instanceof EntityLiving)
            {
                field_9397_j = (EntityLiving)p_396_1_.func_35532_a();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public float func_382_a(float p_382_1_)
    {
        return 1.0F;
    }

    public int func_35115_a(float p_35115_1_)
    {
        return 0xf000f0;
    }
}
