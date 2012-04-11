// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityPlayer, EntityLiving, MathHelper, 
//            World, Block, Vec3D, AxisAlignedBB, 
//            MovingObjectPosition, DamageSource, NBTTagCompound, ItemStack, 
//            Item, InventoryPlayer

public class EntityArrow extends Entity
{

    private int field_9319_c;
    private int field_9318_d;
    private int field_9317_e;
    private int field_9316_f;
    private int field_28019_h;
    private boolean field_9315_g;
    public boolean field_28020_a;
    public int field_688_a;
    public Entity field_682_g;
    private int field_681_h;
    private int field_680_i;
    private double field_46026_at;
    private int field_46027_au;
    public boolean field_35140_d;

    public EntityArrow(World p_i477_1_)
    {
        super(p_i477_1_);
        field_9319_c = -1;
        field_9318_d = -1;
        field_9317_e = -1;
        field_9316_f = 0;
        field_28019_h = 0;
        field_9315_g = false;
        field_28020_a = false;
        field_688_a = 0;
        field_680_i = 0;
        field_46026_at = 2D;
        field_35140_d = false;
        func_371_a(0.5F, 0.5F);
    }

    public EntityArrow(World p_i478_1_, double p_i478_2_, double p_i478_4_, double p_i478_6_)
    {
        super(p_i478_1_);
        field_9319_c = -1;
        field_9318_d = -1;
        field_9317_e = -1;
        field_9316_f = 0;
        field_28019_h = 0;
        field_9315_g = false;
        field_28020_a = false;
        field_688_a = 0;
        field_680_i = 0;
        field_46026_at = 2D;
        field_35140_d = false;
        func_371_a(0.5F, 0.5F);
        func_347_a(p_i478_2_, p_i478_4_, p_i478_6_);
        field_9292_aO = 0.0F;
    }

    public EntityArrow(World p_i1055_1_, EntityLiving p_i1055_2_, EntityLiving p_i1055_3_, float p_i1055_4_, float p_i1055_5_)
    {
        super(p_i1055_1_);
        field_9319_c = -1;
        field_9318_d = -1;
        field_9317_e = -1;
        field_9316_f = 0;
        field_28019_h = 0;
        field_9315_g = false;
        field_28020_a = false;
        field_688_a = 0;
        field_680_i = 0;
        field_46026_at = 2D;
        field_35140_d = false;
        field_682_g = p_i1055_2_;
        field_28020_a = p_i1055_2_ instanceof EntityPlayer;
        field_610_al = (p_i1055_2_.field_610_al + (double)p_i1055_2_.func_373_s()) - 0.10000000149011612D;
        double d = p_i1055_3_.field_611_ak - p_i1055_2_.field_611_ak;
        double d1 = (p_i1055_3_.field_610_al + (double)p_i1055_3_.func_373_s()) - 0.69999998807907104D - field_610_al;
        double d2 = p_i1055_3_.field_609_am - p_i1055_2_.field_609_am;
        double d3 = MathHelper.func_1109_a(d * d + d2 * d2);
        if(d3 < 9.9999999999999995E-008D)
        {
            return;
        } else
        {
            float f = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            float f1 = (float)(-((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D));
            double d4 = d / d3;
            double d5 = d2 / d3;
            func_365_c(p_i1055_2_.field_611_ak + d4, field_610_al, p_i1055_2_.field_609_am + d5, f, f1);
            field_9292_aO = 0.0F;
            float f2 = (float)d3 * 0.2F;
            func_408_a(d, d1 + (double)f2, d2, p_i1055_4_, p_i1055_5_);
            return;
        }
    }

    public EntityArrow(World p_i479_1_, EntityLiving p_i479_2_, float p_i479_3_)
    {
        super(p_i479_1_);
        field_9319_c = -1;
        field_9318_d = -1;
        field_9317_e = -1;
        field_9316_f = 0;
        field_28019_h = 0;
        field_9315_g = false;
        field_28020_a = false;
        field_688_a = 0;
        field_680_i = 0;
        field_46026_at = 2D;
        field_35140_d = false;
        field_682_g = p_i479_2_;
        field_28020_a = p_i479_2_ instanceof EntityPlayer;
        func_371_a(0.5F, 0.5F);
        func_365_c(p_i479_2_.field_611_ak, p_i479_2_.field_610_al + (double)p_i479_2_.func_373_s(), p_i479_2_.field_609_am, p_i479_2_.field_605_aq, p_i479_2_.field_604_ar);
        field_611_ak -= MathHelper.func_1114_b((field_605_aq / 180F) * 3.141593F) * 0.16F;
        field_610_al -= 0.10000000149011612D;
        field_609_am -= MathHelper.func_1106_a((field_605_aq / 180F) * 3.141593F) * 0.16F;
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_9292_aO = 0.0F;
        field_608_an = -MathHelper.func_1106_a((field_605_aq / 180F) * 3.141593F) * MathHelper.func_1114_b((field_604_ar / 180F) * 3.141593F);
        field_606_ap = MathHelper.func_1114_b((field_605_aq / 180F) * 3.141593F) * MathHelper.func_1114_b((field_604_ar / 180F) * 3.141593F);
        field_607_ao = -MathHelper.func_1106_a((field_604_ar / 180F) * 3.141593F);
        func_408_a(field_608_an, field_607_ao, field_606_ap, p_i479_3_ * 1.5F, 1.0F);
    }

    protected void func_21057_b()
    {
    }

    public void func_408_a(double p_408_1_, double p_408_3_, double p_408_5_, float p_408_7_, 
            float p_408_8_)
    {
        float f = MathHelper.func_1109_a(p_408_1_ * p_408_1_ + p_408_3_ * p_408_3_ + p_408_5_ * p_408_5_);
        p_408_1_ /= f;
        p_408_3_ /= f;
        p_408_5_ /= f;
        p_408_1_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_408_8_;
        p_408_3_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_408_8_;
        p_408_5_ += field_9312_bd.nextGaussian() * 0.0074999998323619366D * (double)p_408_8_;
        p_408_1_ *= p_408_7_;
        p_408_3_ *= p_408_7_;
        p_408_5_ *= p_408_7_;
        field_608_an = p_408_1_;
        field_607_ao = p_408_3_;
        field_606_ap = p_408_5_;
        float f1 = MathHelper.func_1109_a(p_408_1_ * p_408_1_ + p_408_5_ * p_408_5_);
        field_603_as = field_605_aq = (float)((Math.atan2(p_408_1_, p_408_5_) * 180D) / 3.1415927410125732D);
        field_602_at = field_604_ar = (float)((Math.atan2(p_408_3_, f1) * 180D) / 3.1415927410125732D);
        field_681_h = 0;
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
            field_602_at = field_604_ar;
            field_603_as = field_605_aq;
            func_365_c(field_611_ak, field_610_al, field_609_am, field_605_aq, field_604_ar);
            field_681_h = 0;
        }
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_602_at == 0.0F && field_603_as == 0.0F)
        {
            float f = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
            field_603_as = field_605_aq = (float)((Math.atan2(field_608_an, field_606_ap) * 180D) / 3.1415927410125732D);
            field_602_at = field_604_ar = (float)((Math.atan2(field_607_ao, f) * 180D) / 3.1415927410125732D);
        }
        int i = field_615_ag.func_600_a(field_9319_c, field_9318_d, field_9317_e);
        if(i > 0)
        {
            Block.field_345_n[i].func_238_a(field_615_ag, field_9319_c, field_9318_d, field_9317_e);
            AxisAlignedBB axisalignedbb = Block.field_345_n[i].func_221_d(field_615_ag, field_9319_c, field_9318_d, field_9317_e);
            if(axisalignedbb != null && axisalignedbb.func_4150_a(Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am)))
            {
                field_9315_g = true;
            }
        }
        if(field_688_a > 0)
        {
            field_688_a--;
        }
        if(field_9315_g)
        {
            int j = field_615_ag.func_600_a(field_9319_c, field_9318_d, field_9317_e);
            int k = field_615_ag.func_602_e(field_9319_c, field_9318_d, field_9317_e);
            if(j != field_9316_f || k != field_28019_h)
            {
                field_9315_g = false;
                field_608_an *= field_9312_bd.nextFloat() * 0.2F;
                field_607_ao *= field_9312_bd.nextFloat() * 0.2F;
                field_606_ap *= field_9312_bd.nextFloat() * 0.2F;
                field_681_h = 0;
                field_680_i = 0;
                return;
            }
            field_681_h++;
            if(field_681_h == 1200)
            {
                func_395_F();
            }
            return;
        }
        field_680_i++;
        Vec3D vec3d = Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am);
        Vec3D vec3d1 = Vec3D.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        MovingObjectPosition movingobjectposition = field_615_ag.func_28105_a(vec3d, vec3d1, false, true);
        vec3d = Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am);
        vec3d1 = Vec3D.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        if(movingobjectposition != null)
        {
            vec3d1 = Vec3D.func_1248_b(movingobjectposition.field_1169_f.field_1776_a, movingobjectposition.field_1169_f.field_1775_b, movingobjectposition.field_1169_f.field_1779_c);
        }
        Entity entity = null;
        List list = field_615_ag.func_659_b(this, field_601_au.func_1170_a(field_608_an, field_607_ao, field_606_ap).func_1177_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int l = 0; l < list.size(); l++)
        {
            Entity entity1 = (Entity)list.get(l);
            if(!entity1.func_401_c_() || entity1 == field_682_g && field_680_i < 5)
            {
                continue;
            }
            float f5 = 0.3F;
            AxisAlignedBB axisalignedbb1 = entity1.field_601_au.func_1177_b(f5, f5, f5);
            MovingObjectPosition movingobjectposition1 = axisalignedbb1.func_1169_a(vec3d, vec3d1);
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
            if(movingobjectposition.field_1168_g != null)
            {
                float f1 = MathHelper.func_1109_a(field_608_an * field_608_an + field_607_ao * field_607_ao + field_606_ap * field_606_ap);
                int j1 = (int)Math.ceil((double)f1 * field_46026_at);
                if(field_35140_d)
                {
                    j1 += field_9312_bd.nextInt(j1 / 2 + 2);
                }
                DamageSource damagesource = null;
                if(field_682_g == null)
                {
                    damagesource = DamageSource.func_35535_a(this, this);
                } else
                {
                    damagesource = DamageSource.func_35535_a(this, field_682_g);
                }
                if(func_21062_U())
                {
                    movingobjectposition.field_1168_g.func_40046_d(5);
                }
                if(movingobjectposition.field_1168_g.func_396_a(damagesource, j1))
                {
                    if(movingobjectposition.field_1168_g instanceof EntityLiving)
                    {
                        ((EntityLiving)movingobjectposition.field_1168_g).field_35172_bP++;
                        if(field_46027_au > 0)
                        {
                            float f7 = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
                            if(f7 > 0.0F)
                            {
                                movingobjectposition.field_1168_g.func_348_f((field_608_an * (double)field_46027_au * 0.60000002384185791D) / (double)f7, 0.10000000000000001D, (field_606_ap * (double)field_46027_au * 0.60000002384185791D) / (double)f7);
                            }
                        }
                    }
                    field_615_ag.func_623_a(this, "random.bowhit", 1.0F, 1.2F / (field_9312_bd.nextFloat() * 0.2F + 0.9F));
                    func_395_F();
                } else
                {
                    field_608_an *= -0.10000000149011612D;
                    field_607_ao *= -0.10000000149011612D;
                    field_606_ap *= -0.10000000149011612D;
                    field_605_aq += 180F;
                    field_603_as += 180F;
                    field_680_i = 0;
                }
            } else
            {
                field_9319_c = movingobjectposition.field_1166_b;
                field_9318_d = movingobjectposition.field_1172_c;
                field_9317_e = movingobjectposition.field_1171_d;
                field_9316_f = field_615_ag.func_600_a(field_9319_c, field_9318_d, field_9317_e);
                field_28019_h = field_615_ag.func_602_e(field_9319_c, field_9318_d, field_9317_e);
                field_608_an = (float)(movingobjectposition.field_1169_f.field_1776_a - field_611_ak);
                field_607_ao = (float)(movingobjectposition.field_1169_f.field_1775_b - field_610_al);
                field_606_ap = (float)(movingobjectposition.field_1169_f.field_1779_c - field_609_am);
                float f2 = MathHelper.func_1109_a(field_608_an * field_608_an + field_607_ao * field_607_ao + field_606_ap * field_606_ap);
                field_611_ak -= (field_608_an / (double)f2) * 0.05000000074505806D;
                field_610_al -= (field_607_ao / (double)f2) * 0.05000000074505806D;
                field_609_am -= (field_606_ap / (double)f2) * 0.05000000074505806D;
                field_615_ag.func_623_a(this, "random.bowhit", 1.0F, 1.2F / (field_9312_bd.nextFloat() * 0.2F + 0.9F));
                field_9315_g = true;
                field_688_a = 7;
                field_35140_d = false;
            }
        }
        if(field_35140_d)
        {
            for(int i1 = 0; i1 < 4; i1++)
            {
                field_615_ag.func_694_a("crit", field_611_ak + (field_608_an * (double)i1) / 4D, field_610_al + (field_607_ao * (double)i1) / 4D, field_609_am + (field_606_ap * (double)i1) / 4D, -field_608_an, -field_607_ao + 0.20000000000000001D, -field_606_ap);
            }

        }
        field_611_ak += field_608_an;
        field_610_al += field_607_ao;
        field_609_am += field_606_ap;
        float f3 = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
        field_605_aq = (float)((Math.atan2(field_608_an, field_606_ap) * 180D) / 3.1415927410125732D);
        for(field_604_ar = (float)((Math.atan2(field_607_ao, f3) * 180D) / 3.1415927410125732D); field_604_ar - field_602_at < -180F; field_602_at -= 360F) { }
        for(; field_604_ar - field_602_at >= 180F; field_602_at += 360F) { }
        for(; field_605_aq - field_603_as < -180F; field_603_as -= 360F) { }
        for(; field_605_aq - field_603_as >= 180F; field_603_as += 360F) { }
        field_604_ar = field_602_at + (field_604_ar - field_602_at) * 0.2F;
        field_605_aq = field_603_as + (field_605_aq - field_603_as) * 0.2F;
        float f4 = 0.99F;
        float f6 = 0.05F;
        if(func_27013_ag())
        {
            for(int k1 = 0; k1 < 4; k1++)
            {
                float f8 = 0.25F;
                field_615_ag.func_694_a("bubble", field_611_ak - field_608_an * (double)f8, field_610_al - field_607_ao * (double)f8, field_609_am - field_606_ap * (double)f8, field_608_an, field_607_ao, field_606_ap);
            }

            f4 = 0.8F;
        }
        field_608_an *= f4;
        field_607_ao *= f4;
        field_606_ap *= f4;
        field_607_ao -= f6;
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("xTile", (short)field_9319_c);
        p_352_1_.func_749_a("yTile", (short)field_9318_d);
        p_352_1_.func_749_a("zTile", (short)field_9317_e);
        p_352_1_.func_761_a("inTile", (byte)field_9316_f);
        p_352_1_.func_761_a("inData", (byte)field_28019_h);
        p_352_1_.func_761_a("shake", (byte)field_688_a);
        p_352_1_.func_761_a("inGround", (byte)(field_9315_g ? 1 : 0));
        p_352_1_.func_748_a("player", field_28020_a);
        p_352_1_.func_765_a("damage", field_46026_at);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_9319_c = p_357_1_.func_745_d("xTile");
        field_9318_d = p_357_1_.func_745_d("yTile");
        field_9317_e = p_357_1_.func_745_d("zTile");
        field_9316_f = p_357_1_.func_746_c("inTile") & 0xff;
        field_28019_h = p_357_1_.func_746_c("inData") & 0xff;
        field_688_a = p_357_1_.func_746_c("shake") & 0xff;
        field_9315_g = p_357_1_.func_746_c("inGround") == 1;
        field_28020_a = p_357_1_.func_760_m("player");
        if(p_357_1_.func_751_b("damage"))
        {
            field_46026_at = p_357_1_.func_757_h("damage");
        }
    }

    public void func_6378_b(EntityPlayer p_6378_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        if(field_9315_g && field_28020_a && field_688_a <= 0 && p_6378_1_.field_778_b.func_504_a(new ItemStack(Item.field_226_j, 1)))
        {
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            p_6378_1_.func_443_a_(this, 1);
            func_395_F();
        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_46024_b(double p_46024_1_)
    {
        field_46026_at = p_46024_1_;
    }

    public double func_46025_l()
    {
        return field_46026_at;
    }

    public void func_46023_b(int p_46023_1_)
    {
        field_46027_au = p_46023_1_;
    }

    public boolean func_48080_j()
    {
        return false;
    }
}
