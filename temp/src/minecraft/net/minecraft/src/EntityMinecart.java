// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, IInventory, ItemStack, DataWatcher, 
//            World, Item, EntityItem, Block, 
//            NBTTagCompound, MathHelper, BlockRail, Vec3D, 
//            AxisAlignedBB, NBTTagList, EntityLiving, EntityPlayer, 
//            EntityIronGolem, InventoryPlayer, DamageSource

public class EntityMinecart extends Entity
    implements IInventory
{

    private ItemStack field_857_h[];
    private int field_9418_e;
    private boolean field_856_i;
    public int field_20913_d;
    public double field_9417_f;
    public double field_9416_g;
    private static final int field_855_j[][][] = {
        {
            {
                0, 0, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, -1, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, -1, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                0, -1, 1
            }
        }, {
            {
                0, -1, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                0, 0, 1
            }, {
                1, 0, 0
            }
        }, {
            {
                0, 0, 1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                1, 0, 0
            }
        }
    };
    private int field_9415_k;
    private double field_9414_l;
    private double field_9413_m;
    private double field_9412_n;
    private double field_9411_o;
    private double field_9410_p;
    private double field_9409_q;
    private double field_9408_r;
    private double field_9407_s;

    public EntityMinecart(World p_i214_1_)
    {
        super(p_i214_1_);
        field_857_h = new ItemStack[36];
        field_9418_e = 0;
        field_856_i = false;
        field_618_ad = true;
        func_371_a(0.98F, 0.7F);
        field_9292_aO = field_643_aD / 2.0F;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected void func_21057_b()
    {
        field_21064_bx.func_21124_a(16, new Byte((byte)0));
        field_21064_bx.func_21124_a(17, new Integer(0));
        field_21064_bx.func_21124_a(18, new Integer(1));
        field_21064_bx.func_21124_a(19, new Integer(0));
    }

    public AxisAlignedBB func_383_b_(Entity p_383_1_)
    {
        return p_383_1_.field_601_au;
    }

    public AxisAlignedBB func_372_f_()
    {
        return null;
    }

    public boolean func_385_d_()
    {
        return true;
    }

    public EntityMinecart(World p_i215_1_, double p_i215_2_, double p_i215_4_, double p_i215_6_, 
            int p_i215_8_)
    {
        this(p_i215_1_);
        func_347_a(p_i215_2_, p_i215_4_ + (double)field_9292_aO, p_i215_6_);
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        field_9285_at = p_i215_2_;
        field_9284_au = p_i215_4_;
        field_9283_av = p_i215_6_;
        field_20913_d = p_i215_8_;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.0D - 0.30000001192092896D;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(field_615_ag.field_1026_y || field_646_aA)
        {
            return true;
        }
        func_41029_h(-func_41030_m());
        func_41028_c(10);
        func_9281_M();
        func_41024_b(func_41025_i() + p_396_2_ * 10);
        if(func_41025_i() > 40)
        {
            if(field_617_ae != null)
            {
                field_617_ae.func_6377_h(this);
            }
            func_395_F();
            func_394_a(Item.field_256_ax.field_291_aS, 1, 0.0F);
            if(field_20913_d == 1)
            {
                EntityMinecart entityminecart = this;
label0:
                for(int i = 0; i < entityminecart.func_469_c(); i++)
                {
                    ItemStack itemstack = entityminecart.func_468_c(i);
                    if(itemstack == null)
                    {
                        continue;
                    }
                    float f = field_9312_bd.nextFloat() * 0.8F + 0.1F;
                    float f1 = field_9312_bd.nextFloat() * 0.8F + 0.1F;
                    float f2 = field_9312_bd.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if(itemstack.field_1615_a <= 0)
                        {
                            continue label0;
                        }
                        int j = field_9312_bd.nextInt(21) + 10;
                        if(j > itemstack.field_1615_a)
                        {
                            j = itemstack.field_1615_a;
                        }
                        itemstack.field_1615_a -= j;
                        EntityItem entityitem = new EntityItem(field_615_ag, field_611_ak + (double)f, field_610_al + (double)f1, field_609_am + (double)f2, new ItemStack(itemstack.field_1617_c, j, itemstack.func_21181_i()));
                        float f3 = 0.05F;
                        entityitem.field_608_an = (float)field_9312_bd.nextGaussian() * f3;
                        entityitem.field_607_ao = (float)field_9312_bd.nextGaussian() * f3 + 0.2F;
                        entityitem.field_606_ap = (float)field_9312_bd.nextGaussian() * f3;
                        field_615_ag.func_674_a(entityitem);
                    } while(true);
                }

                func_394_a(Block.field_396_av.field_376_bc, 1, 0.0F);
            } else
            if(field_20913_d == 2)
            {
                func_394_a(Block.field_445_aC.field_376_bc, 1, 0.0F);
            }
        }
        return true;
    }

    public void func_9280_g()
    {
        func_41029_h(-func_41030_m());
        func_41028_c(10);
        func_41024_b(func_41025_i() + func_41025_i() * 10);
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_395_F()
    {
label0:
        for(int i = 0; i < func_469_c(); i++)
        {
            ItemStack itemstack = func_468_c(i);
            if(itemstack == null)
            {
                continue;
            }
            float f = field_9312_bd.nextFloat() * 0.8F + 0.1F;
            float f1 = field_9312_bd.nextFloat() * 0.8F + 0.1F;
            float f2 = field_9312_bd.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(itemstack.field_1615_a <= 0)
                {
                    continue label0;
                }
                int j = field_9312_bd.nextInt(21) + 10;
                if(j > itemstack.field_1615_a)
                {
                    j = itemstack.field_1615_a;
                }
                itemstack.field_1615_a -= j;
                EntityItem entityitem = new EntityItem(field_615_ag, field_611_ak + (double)f, field_610_al + (double)f1, field_609_am + (double)f2, new ItemStack(itemstack.field_1617_c, j, itemstack.func_21181_i()));
                if(itemstack.func_40710_n())
                {
                    entityitem.field_801_a.func_40706_d((NBTTagCompound)itemstack.func_40709_o().func_40195_b());
                }
                float f3 = 0.05F;
                entityitem.field_608_an = (float)field_9312_bd.nextGaussian() * f3;
                entityitem.field_607_ao = (float)field_9312_bd.nextGaussian() * f3 + 0.2F;
                entityitem.field_606_ap = (float)field_9312_bd.nextGaussian() * f3;
                field_615_ag.func_674_a(entityitem);
            } while(true);
        }

        super.func_395_F();
    }

    public void func_370_e_()
    {
        if(func_41023_l() > 0)
        {
            func_41028_c(func_41023_l() - 1);
        }
        if(func_41025_i() > 0)
        {
            func_41024_b(func_41025_i() - 1);
        }
        if(field_610_al < -64D)
        {
            func_4034_G();
        }
        if(func_41026_g() && field_9312_bd.nextInt(4) == 0)
        {
            field_615_ag.func_694_a("largesmoke", field_611_ak, field_610_al + 0.80000000000000004D, field_609_am, 0.0D, 0.0D, 0.0D);
        }
        if(field_615_ag.field_1026_y)
        {
            if(field_9415_k > 0)
            {
                double d = field_611_ak + (field_9414_l - field_611_ak) / (double)field_9415_k;
                double d1 = field_610_al + (field_9413_m - field_610_al) / (double)field_9415_k;
                double d3 = field_609_am + (field_9412_n - field_609_am) / (double)field_9415_k;
                double d5;
                for(d5 = field_9411_o - (double)field_605_aq; d5 < -180D; d5 += 360D) { }
                for(; d5 >= 180D; d5 -= 360D) { }
                field_605_aq += d5 / (double)field_9415_k;
                field_604_ar += (field_9410_p - (double)field_604_ar) / (double)field_9415_k;
                field_9415_k--;
                func_347_a(d, d1, d3);
                func_376_c(field_605_aq, field_604_ar);
            } else
            {
                func_347_a(field_611_ak, field_610_al, field_609_am);
                func_376_c(field_605_aq, field_604_ar);
            }
            return;
        }
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_610_al);
        int k = MathHelper.func_1108_b(field_609_am);
        if(BlockRail.func_27040_h(field_615_ag, i, j - 1, k))
        {
            j--;
        }
        double d2 = 0.40000000000000002D;
        double d4 = 0.0078125D;
        int l = field_615_ag.func_600_a(i, j, k);
        if(BlockRail.func_27041_c(l))
        {
            Vec3D vec3d = func_514_g(field_611_ak, field_610_al, field_609_am);
            int i1 = field_615_ag.func_602_e(i, j, k);
            field_610_al = j;
            boolean flag = false;
            boolean flag1 = false;
            if(l == Block.field_9261_T.field_376_bc)
            {
                flag = (i1 & 8) != 0;
                flag1 = !flag;
            }
            if(((BlockRail)Block.field_345_n[l]).func_27042_h())
            {
                i1 &= 7;
            }
            if(i1 >= 2 && i1 <= 5)
            {
                field_610_al = j + 1;
            }
            if(i1 == 2)
            {
                field_608_an -= d4;
            }
            if(i1 == 3)
            {
                field_608_an += d4;
            }
            if(i1 == 4)
            {
                field_606_ap += d4;
            }
            if(i1 == 5)
            {
                field_606_ap -= d4;
            }
            int ai[][] = field_855_j[i1];
            double d9 = ai[1][0] - ai[0][0];
            double d10 = ai[1][2] - ai[0][2];
            double d11 = Math.sqrt(d9 * d9 + d10 * d10);
            double d12 = field_608_an * d9 + field_606_ap * d10;
            if(d12 < 0.0D)
            {
                d9 = -d9;
                d10 = -d10;
            }
            double d13 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
            field_608_an = (d13 * d9) / d11;
            field_606_ap = (d13 * d10) / d11;
            if(flag1)
            {
                double d16 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                if(d16 < 0.029999999999999999D)
                {
                    field_608_an *= 0.0D;
                    field_607_ao *= 0.0D;
                    field_606_ap *= 0.0D;
                } else
                {
                    field_608_an *= 0.5D;
                    field_607_ao *= 0.0D;
                    field_606_ap *= 0.5D;
                }
            }
            double d17 = 0.0D;
            double d18 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d19 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d20 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d21 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            d9 = d20 - d18;
            d10 = d21 - d19;
            if(d9 == 0.0D)
            {
                field_611_ak = (double)i + 0.5D;
                d17 = field_609_am - (double)k;
            } else
            if(d10 == 0.0D)
            {
                field_609_am = (double)k + 0.5D;
                d17 = field_611_ak - (double)i;
            } else
            {
                double d22 = field_611_ak - d18;
                double d24 = field_609_am - d19;
                double d26 = (d22 * d9 + d24 * d10) * 2D;
                d17 = d26;
            }
            field_611_ak = d18 + d9 * d17;
            field_609_am = d19 + d10 * d17;
            func_347_a(field_611_ak, field_610_al + (double)field_9292_aO, field_609_am);
            double d23 = field_608_an;
            double d25 = field_606_ap;
            if(field_617_ae != null)
            {
                d23 *= 0.75D;
                d25 *= 0.75D;
            }
            if(d23 < -d2)
            {
                d23 = -d2;
            }
            if(d23 > d2)
            {
                d23 = d2;
            }
            if(d25 < -d2)
            {
                d25 = -d2;
            }
            if(d25 > d2)
            {
                d25 = d2;
            }
            func_349_c(d23, 0.0D, d25);
            if(ai[0][1] != 0 && MathHelper.func_1108_b(field_611_ak) - i == ai[0][0] && MathHelper.func_1108_b(field_609_am) - k == ai[0][2])
            {
                func_347_a(field_611_ak, field_610_al + (double)ai[0][1], field_609_am);
            } else
            if(ai[1][1] != 0 && MathHelper.func_1108_b(field_611_ak) - i == ai[1][0] && MathHelper.func_1108_b(field_609_am) - k == ai[1][2])
            {
                func_347_a(field_611_ak, field_610_al + (double)ai[1][1], field_609_am);
            }
            if(field_617_ae != null)
            {
                field_608_an *= 0.99699997901916504D;
                field_607_ao *= 0.0D;
                field_606_ap *= 0.99699997901916504D;
            } else
            {
                if(field_20913_d == 2)
                {
                    double d27 = MathHelper.func_1109_a(field_9417_f * field_9417_f + field_9416_g * field_9416_g);
                    if(d27 > 0.01D)
                    {
                        field_9417_f /= d27;
                        field_9416_g /= d27;
                        double d29 = 0.040000000000000001D;
                        field_608_an *= 0.80000001192092896D;
                        field_607_ao *= 0.0D;
                        field_606_ap *= 0.80000001192092896D;
                        field_608_an += field_9417_f * d29;
                        field_606_ap += field_9416_g * d29;
                    } else
                    {
                        field_608_an *= 0.89999997615814209D;
                        field_607_ao *= 0.0D;
                        field_606_ap *= 0.89999997615814209D;
                    }
                }
                field_608_an *= 0.95999997854232788D;
                field_607_ao *= 0.0D;
                field_606_ap *= 0.95999997854232788D;
            }
            Vec3D vec3d1 = func_514_g(field_611_ak, field_610_al, field_609_am);
            if(vec3d1 != null && vec3d != null)
            {
                double d28 = (vec3d.field_1775_b - vec3d1.field_1775_b) * 0.050000000000000003D;
                double d14 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                if(d14 > 0.0D)
                {
                    field_608_an = (field_608_an / d14) * (d14 + d28);
                    field_606_ap = (field_606_ap / d14) * (d14 + d28);
                }
                func_347_a(field_611_ak, vec3d1.field_1775_b, field_609_am);
            }
            int k1 = MathHelper.func_1108_b(field_611_ak);
            int l1 = MathHelper.func_1108_b(field_609_am);
            if(k1 != i || l1 != k)
            {
                double d15 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                field_608_an = d15 * (double)(k1 - i);
                field_606_ap = d15 * (double)(l1 - k);
            }
            if(field_20913_d == 2)
            {
                double d30 = MathHelper.func_1109_a(field_9417_f * field_9417_f + field_9416_g * field_9416_g);
                if(d30 > 0.01D && field_608_an * field_608_an + field_606_ap * field_606_ap > 0.001D)
                {
                    field_9417_f /= d30;
                    field_9416_g /= d30;
                    if(field_9417_f * field_608_an + field_9416_g * field_606_ap < 0.0D)
                    {
                        field_9417_f = 0.0D;
                        field_9416_g = 0.0D;
                    } else
                    {
                        field_9417_f = field_608_an;
                        field_9416_g = field_606_ap;
                    }
                }
            }
            if(flag)
            {
                double d31 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                if(d31 > 0.01D)
                {
                    double d32 = 0.059999999999999998D;
                    field_608_an += (field_608_an / d31) * d32;
                    field_606_ap += (field_606_ap / d31) * d32;
                } else
                if(i1 == 1)
                {
                    if(field_615_ag.func_28100_h(i - 1, j, k))
                    {
                        field_608_an = 0.02D;
                    } else
                    if(field_615_ag.func_28100_h(i + 1, j, k))
                    {
                        field_608_an = -0.02D;
                    }
                } else
                if(i1 == 0)
                {
                    if(field_615_ag.func_28100_h(i, j, k - 1))
                    {
                        field_606_ap = 0.02D;
                    } else
                    if(field_615_ag.func_28100_h(i, j, k + 1))
                    {
                        field_606_ap = -0.02D;
                    }
                }
            }
        } else
        {
            if(field_608_an < -d2)
            {
                field_608_an = -d2;
            }
            if(field_608_an > d2)
            {
                field_608_an = d2;
            }
            if(field_606_ap < -d2)
            {
                field_606_ap = -d2;
            }
            if(field_606_ap > d2)
            {
                field_606_ap = d2;
            }
            if(field_9298_aH)
            {
                field_608_an *= 0.5D;
                field_607_ao *= 0.5D;
                field_606_ap *= 0.5D;
            }
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            if(!field_9298_aH)
            {
                field_608_an *= 0.94999998807907104D;
                field_607_ao *= 0.94999998807907104D;
                field_606_ap *= 0.94999998807907104D;
            }
        }
        field_604_ar = 0.0F;
        double d6 = field_9285_at - field_611_ak;
        double d7 = field_9283_av - field_609_am;
        if(d6 * d6 + d7 * d7 > 0.001D)
        {
            field_605_aq = (float)((Math.atan2(d7, d6) * 180D) / 3.1415926535897931D);
            if(field_856_i)
            {
                field_605_aq += 180F;
            }
        }
        double d8;
        for(d8 = field_605_aq - field_603_as; d8 >= 180D; d8 -= 360D) { }
        for(; d8 < -180D; d8 += 360D) { }
        if(d8 < -170D || d8 >= 170D)
        {
            field_605_aq += 180F;
            field_856_i = !field_856_i;
        }
        func_376_c(field_605_aq, field_604_ar);
        List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != field_617_ae && entity.func_385_d_() && (entity instanceof EntityMinecart))
                {
                    entity.func_380_f(this);
                }
            }

        }
        if(field_617_ae != null && field_617_ae.field_646_aA)
        {
            if(field_617_ae.field_616_af == this)
            {
                field_617_ae.field_616_af = null;
            }
            field_617_ae = null;
        }
        if(field_9418_e > 0)
        {
            field_9418_e--;
        }
        if(field_9418_e <= 0)
        {
            field_9417_f = field_9416_g = 0.0D;
        }
        func_41027_b(field_9418_e > 0);
    }

    public Vec3D func_515_a(double p_515_1_, double p_515_3_, double p_515_5_, double p_515_7_)
    {
        int i = MathHelper.func_1108_b(p_515_1_);
        int j = MathHelper.func_1108_b(p_515_3_);
        int k = MathHelper.func_1108_b(p_515_5_);
        if(BlockRail.func_27040_h(field_615_ag, i, j - 1, k))
        {
            j--;
        }
        int l = field_615_ag.func_600_a(i, j, k);
        if(BlockRail.func_27041_c(l))
        {
            int i1 = field_615_ag.func_602_e(i, j, k);
            if(((BlockRail)Block.field_345_n[l]).func_27042_h())
            {
                i1 &= 7;
            }
            p_515_3_ = j;
            if(i1 >= 2 && i1 <= 5)
            {
                p_515_3_ = j + 1;
            }
            int ai[][] = field_855_j[i1];
            double d = ai[1][0] - ai[0][0];
            double d1 = ai[1][2] - ai[0][2];
            double d2 = Math.sqrt(d * d + d1 * d1);
            d /= d2;
            d1 /= d2;
            p_515_1_ += d * p_515_7_;
            p_515_5_ += d1 * p_515_7_;
            if(ai[0][1] != 0 && MathHelper.func_1108_b(p_515_1_) - i == ai[0][0] && MathHelper.func_1108_b(p_515_5_) - k == ai[0][2])
            {
                p_515_3_ += ai[0][1];
            } else
            if(ai[1][1] != 0 && MathHelper.func_1108_b(p_515_1_) - i == ai[1][0] && MathHelper.func_1108_b(p_515_5_) - k == ai[1][2])
            {
                p_515_3_ += ai[1][1];
            }
            return func_514_g(p_515_1_, p_515_3_, p_515_5_);
        } else
        {
            return null;
        }
    }

    public Vec3D func_514_g(double p_514_1_, double p_514_3_, double p_514_5_)
    {
        int i = MathHelper.func_1108_b(p_514_1_);
        int j = MathHelper.func_1108_b(p_514_3_);
        int k = MathHelper.func_1108_b(p_514_5_);
        if(BlockRail.func_27040_h(field_615_ag, i, j - 1, k))
        {
            j--;
        }
        int l = field_615_ag.func_600_a(i, j, k);
        if(BlockRail.func_27041_c(l))
        {
            int i1 = field_615_ag.func_602_e(i, j, k);
            p_514_3_ = j;
            if(((BlockRail)Block.field_345_n[l]).func_27042_h())
            {
                i1 &= 7;
            }
            if(i1 >= 2 && i1 <= 5)
            {
                p_514_3_ = j + 1;
            }
            int ai[][] = field_855_j[i1];
            double d = 0.0D;
            double d1 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d2 = (double)j + 0.5D + (double)ai[0][1] * 0.5D;
            double d3 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d4 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d5 = (double)j + 0.5D + (double)ai[1][1] * 0.5D;
            double d6 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            double d7 = d4 - d1;
            double d8 = (d5 - d2) * 2D;
            double d9 = d6 - d3;
            if(d7 == 0.0D)
            {
                p_514_1_ = (double)i + 0.5D;
                d = p_514_5_ - (double)k;
            } else
            if(d9 == 0.0D)
            {
                p_514_5_ = (double)k + 0.5D;
                d = p_514_1_ - (double)i;
            } else
            {
                double d10 = p_514_1_ - d1;
                double d11 = p_514_5_ - d3;
                double d12 = (d10 * d7 + d11 * d9) * 2D;
                d = d12;
            }
            p_514_1_ = d1 + d7 * d;
            p_514_3_ = d2 + d8 * d;
            p_514_5_ = d3 + d9 * d;
            if(d8 < 0.0D)
            {
                p_514_3_++;
            }
            if(d8 > 0.0D)
            {
                p_514_3_ += 0.5D;
            }
            return Vec3D.func_1248_b(p_514_1_, p_514_3_, p_514_5_);
        } else
        {
            return null;
        }
    }

    protected void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_758_a("Type", field_20913_d);
        if(field_20913_d == 2)
        {
            p_352_1_.func_765_a("PushX", field_9417_f);
            p_352_1_.func_765_a("PushZ", field_9416_g);
            p_352_1_.func_749_a("Fuel", (short)field_9418_e);
        } else
        if(field_20913_d == 1)
        {
            NBTTagList nbttaglist = new NBTTagList();
            for(int i = 0; i < field_857_h.length; i++)
            {
                if(field_857_h[i] != null)
                {
                    NBTTagCompound nbttagcompound = new NBTTagCompound();
                    nbttagcompound.func_761_a("Slot", (byte)i);
                    field_857_h[i].func_1086_a(nbttagcompound);
                    nbttaglist.func_742_a(nbttagcompound);
                }
            }

            p_352_1_.func_762_a("Items", nbttaglist);
        }
    }

    protected void func_357_b(NBTTagCompound p_357_1_)
    {
        field_20913_d = p_357_1_.func_756_e("Type");
        if(field_20913_d == 2)
        {
            field_9417_f = p_357_1_.func_757_h("PushX");
            field_9416_g = p_357_1_.func_757_h("PushZ");
            field_9418_e = p_357_1_.func_745_d("Fuel");
        } else
        if(field_20913_d == 1)
        {
            NBTTagList nbttaglist = p_357_1_.func_753_l("Items");
            field_857_h = new ItemStack[func_469_c()];
            for(int i = 0; i < nbttaglist.func_740_c(); i++)
            {
                NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
                int j = nbttagcompound.func_746_c("Slot") & 0xff;
                if(j >= 0 && j < field_857_h.length)
                {
                    field_857_h[j] = ItemStack.func_35864_a(nbttagcompound);
                }
            }

        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_380_f(Entity p_380_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        if(p_380_1_ == field_617_ae)
        {
            return;
        }
        if((p_380_1_ instanceof EntityLiving) && !(p_380_1_ instanceof EntityPlayer) && !(p_380_1_ instanceof EntityIronGolem) && field_20913_d == 0 && field_608_an * field_608_an + field_606_ap * field_606_ap > 0.01D && field_617_ae == null && p_380_1_.field_616_af == null)
        {
            p_380_1_.func_6377_h(this);
        }
        double d = p_380_1_.field_611_ak - field_611_ak;
        double d1 = p_380_1_.field_609_am - field_609_am;
        double d2 = d * d + d1 * d1;
        if(d2 >= 9.9999997473787516E-005D)
        {
            d2 = MathHelper.func_1109_a(d2);
            d /= d2;
            d1 /= d2;
            double d3 = 1.0D / d2;
            if(d3 > 1.0D)
            {
                d3 = 1.0D;
            }
            d *= d3;
            d1 *= d3;
            d *= 0.10000000149011612D;
            d1 *= 0.10000000149011612D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            d *= 0.5D;
            d1 *= 0.5D;
            if(p_380_1_ instanceof EntityMinecart)
            {
                double d4 = p_380_1_.field_611_ak - field_611_ak;
                double d5 = p_380_1_.field_609_am - field_609_am;
                Vec3D vec3d = Vec3D.func_1248_b(d4, 0.0D, d5).func_1252_b();
                Vec3D vec3d1 = Vec3D.func_1248_b(MathHelper.func_1114_b((field_605_aq * 3.141593F) / 180F), 0.0D, MathHelper.func_1106_a((field_605_aq * 3.141593F) / 180F)).func_1252_b();
                double d6 = Math.abs(vec3d.func_35612_b(vec3d1));
                if(d6 < 0.80000001192092896D)
                {
                    return;
                }
                double d7 = p_380_1_.field_608_an + field_608_an;
                double d8 = p_380_1_.field_606_ap + field_606_ap;
                if(((EntityMinecart)p_380_1_).field_20913_d == 2 && field_20913_d != 2)
                {
                    field_608_an *= 0.20000000298023224D;
                    field_606_ap *= 0.20000000298023224D;
                    func_348_f(p_380_1_.field_608_an - d, 0.0D, p_380_1_.field_606_ap - d1);
                    p_380_1_.field_608_an *= 0.94999998807907104D;
                    p_380_1_.field_606_ap *= 0.94999998807907104D;
                } else
                if(((EntityMinecart)p_380_1_).field_20913_d != 2 && field_20913_d == 2)
                {
                    p_380_1_.field_608_an *= 0.20000000298023224D;
                    p_380_1_.field_606_ap *= 0.20000000298023224D;
                    p_380_1_.func_348_f(field_608_an + d, 0.0D, field_606_ap + d1);
                    field_608_an *= 0.94999998807907104D;
                    field_606_ap *= 0.94999998807907104D;
                } else
                {
                    d7 /= 2D;
                    d8 /= 2D;
                    field_608_an *= 0.20000000298023224D;
                    field_606_ap *= 0.20000000298023224D;
                    func_348_f(d7 - d, 0.0D, d8 - d1);
                    p_380_1_.field_608_an *= 0.20000000298023224D;
                    p_380_1_.field_606_ap *= 0.20000000298023224D;
                    p_380_1_.func_348_f(d7 + d, 0.0D, d8 + d1);
                }
            } else
            {
                func_348_f(-d, 0.0D, -d1);
                p_380_1_.func_348_f(d / 4D, 0.0D, d1 / 4D);
            }
        }
    }

    public int func_469_c()
    {
        return 27;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        return field_857_h[p_468_1_];
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_857_h[p_473_1_] != null)
        {
            if(field_857_h[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_857_h[p_473_1_];
                field_857_h[p_473_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = field_857_h[p_473_1_].func_1085_a(p_473_2_);
            if(field_857_h[p_473_1_].field_1615_a == 0)
            {
                field_857_h[p_473_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48081_b(int p_48081_1_)
    {
        if(field_857_h[p_48081_1_] != null)
        {
            ItemStack itemstack = field_857_h[p_48081_1_];
            field_857_h[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_857_h[p_472_1_] = p_472_2_;
        if(p_472_2_ != null && p_472_2_.field_1615_a > func_470_e())
        {
            p_472_2_.field_1615_a = func_470_e();
        }
    }

    public String func_471_d()
    {
        return "container.minecart";
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        if(field_20913_d == 0)
        {
            if(field_617_ae != null && (field_617_ae instanceof EntityPlayer) && field_617_ae != p_353_1_)
            {
                return true;
            }
            if(!field_615_ag.field_1026_y)
            {
                p_353_1_.func_6377_h(this);
            }
        } else
        if(field_20913_d == 1)
        {
            if(!field_615_ag.field_1026_y)
            {
                p_353_1_.func_452_a(this);
            }
        } else
        if(field_20913_d == 2)
        {
            ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
            if(itemstack != null && itemstack.field_1617_c == Item.field_225_k.field_291_aS)
            {
                if(--itemstack.field_1615_a == 0)
                {
                    p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, null);
                }
                field_9418_e += 3600;
            }
            field_9417_f = field_611_ak - p_353_1_.field_611_ak;
            field_9416_g = field_609_am - p_353_1_.field_609_am;
        }
        return true;
    }

    public void func_378_a(double p_378_1_, double p_378_3_, double p_378_5_, float p_378_7_, 
            float p_378_8_, int p_378_9_)
    {
        field_9414_l = p_378_1_;
        field_9413_m = p_378_3_;
        field_9412_n = p_378_5_;
        field_9411_o = p_378_7_;
        field_9410_p = p_378_8_;
        field_9415_k = p_378_9_ + 2;
        field_608_an = field_9409_q;
        field_607_ao = field_9408_r;
        field_606_ap = field_9407_s;
    }

    public void func_6375_a(double p_6375_1_, double p_6375_3_, double p_6375_5_)
    {
        field_9409_q = field_608_an = p_6375_1_;
        field_9408_r = field_607_ao = p_6375_3_;
        field_9407_s = field_606_ap = p_6375_5_;
    }

    public boolean func_20070_a_(EntityPlayer p_20070_1_)
    {
        if(field_646_aA)
        {
            return false;
        }
        return p_20070_1_.func_387_e(this) <= 64D;
    }

    protected boolean func_41026_g()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    protected void func_41027_b(boolean p_41027_1_)
    {
        if(p_41027_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(field_21064_bx.func_21130_a(16) | 1)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(field_21064_bx.func_21130_a(16) & -2)));
        }
    }

    public void func_35142_x_()
    {
    }

    public void func_35141_y_()
    {
    }

    public void func_41024_b(int p_41024_1_)
    {
        field_21064_bx.func_21129_b(19, Integer.valueOf(p_41024_1_));
    }

    public int func_41025_i()
    {
        return field_21064_bx.func_25115_b(19);
    }

    public void func_41028_c(int p_41028_1_)
    {
        field_21064_bx.func_21129_b(17, Integer.valueOf(p_41028_1_));
    }

    public int func_41023_l()
    {
        return field_21064_bx.func_25115_b(17);
    }

    public void func_41029_h(int p_41029_1_)
    {
        field_21064_bx.func_21129_b(18, Integer.valueOf(p_41029_1_));
    }

    public int func_41030_m()
    {
        return field_21064_bx.func_25115_b(18);
    }

}
