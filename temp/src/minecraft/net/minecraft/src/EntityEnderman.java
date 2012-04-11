// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, NBTTagCompound, World, 
//            EntityPlayer, InventoryPlayer, ItemStack, Block, 
//            Vec3D, AxisAlignedBB, DamageSource, MathHelper, 
//            Entity, Material, Item, EntityDamageSourceIndirect, 
//            BlockGrass, BlockFlower, BlockMycelium

public class EntityEnderman extends EntityMob
{

    private static boolean field_35186_b[];
    public boolean field_35187_a;
    private int field_35184_d;
    private int field_35185_e;

    public EntityEnderman(World p_i389_1_)
    {
        super(p_i389_1_);
        field_35187_a = false;
        field_35184_d = 0;
        field_35185_e = 0;
        field_9357_z = "/mob/enderman.png";
        field_9333_am = 0.2F;
        field_762_e = 7;
        func_371_a(0.6F, 2.9F);
        field_9286_aZ = 1.0F;
    }

    public int func_40117_c()
    {
        return 40;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Byte((byte)0));
        field_21064_bx.func_21124_a(17, new Byte((byte)0));
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_749_a("carried", (short)func_35176_r());
        p_352_1_.func_749_a("carriedData", (short)func_35180_s());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_35177_b(p_357_1_.func_745_d("carried"));
        func_35181_c(p_357_1_.func_745_d("carriedData"));
    }

    protected Entity func_438_i()
    {
        EntityPlayer entityplayer = field_615_ag.func_40480_b(this, 64D);
        if(entityplayer != null)
        {
            if(func_35183_c(entityplayer))
            {
                if(field_35185_e++ == 5)
                {
                    field_35185_e = 0;
                    return entityplayer;
                }
            } else
            {
                field_35185_e = 0;
            }
        }
        return null;
    }

    public int func_35115_a(float p_35115_1_)
    {
        return super.func_35115_a(p_35115_1_);
    }

    public float func_382_a(float p_382_1_)
    {
        return super.func_382_a(p_382_1_);
    }

    private boolean func_35183_c(EntityPlayer p_35183_1_)
    {
        ItemStack itemstack = p_35183_1_.field_778_b.field_842_b[3];
        if(itemstack != null && itemstack.field_1617_c == Block.field_4055_bb.field_376_bc)
        {
            return false;
        }
        Vec3D vec3d = p_35183_1_.func_430_f(1.0F).func_1252_b();
        Vec3D vec3d1 = Vec3D.func_1248_b(field_611_ak - p_35183_1_.field_611_ak, (field_601_au.field_1697_b + (double)(field_643_aD / 2.0F)) - (p_35183_1_.field_610_al + (double)p_35183_1_.func_373_s()), field_609_am - p_35183_1_.field_609_am);
        double d = vec3d1.func_1253_c();
        vec3d1 = vec3d1.func_1252_b();
        double d1 = vec3d.func_35612_b(vec3d1);
        if(d1 > 1.0D - 0.025000000000000001D / d)
        {
            return p_35183_1_.func_420_c(this);
        } else
        {
            return false;
        }
    }

    public void func_425_j()
    {
        if(func_27012_af())
        {
            func_396_a(DamageSource.field_35539_e, 1);
        }
        field_35187_a = field_751_f != null;
        field_9333_am = field_751_f == null ? 0.3F : 6.5F;
        if(!field_615_ag.field_1026_y)
        {
            if(func_35176_r() == 0)
            {
                if(field_9312_bd.nextInt(20) == 0)
                {
                    int i = MathHelper.func_1108_b((field_611_ak - 2D) + field_9312_bd.nextDouble() * 4D);
                    int l = MathHelper.func_1108_b(field_610_al + field_9312_bd.nextDouble() * 3D);
                    int j1 = MathHelper.func_1108_b((field_609_am - 2D) + field_9312_bd.nextDouble() * 4D);
                    int l1 = field_615_ag.func_600_a(i, l, j1);
                    if(field_35186_b[l1])
                    {
                        func_35177_b(field_615_ag.func_600_a(i, l, j1));
                        func_35181_c(field_615_ag.func_602_e(i, l, j1));
                        field_615_ag.func_690_d(i, l, j1, 0);
                    }
                }
            } else
            if(field_9312_bd.nextInt(2000) == 0)
            {
                int j = MathHelper.func_1108_b((field_611_ak - 1.0D) + field_9312_bd.nextDouble() * 2D);
                int i1 = MathHelper.func_1108_b(field_610_al + field_9312_bd.nextDouble() * 2D);
                int k1 = MathHelper.func_1108_b((field_609_am - 1.0D) + field_9312_bd.nextDouble() * 2D);
                int i2 = field_615_ag.func_600_a(j, i1, k1);
                int j2 = field_615_ag.func_600_a(j, i1 - 1, k1);
                if(i2 == 0 && j2 > 0 && Block.field_345_n[j2].func_242_c())
                {
                    field_615_ag.func_688_b(j, i1, k1, func_35176_r(), func_35180_s());
                    func_35177_b(0);
                }
            }
        }
        for(int k = 0; k < 2; k++)
        {
            field_615_ag.func_694_a("portal", field_611_ak + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, (field_610_al + field_9312_bd.nextDouble() * (double)field_643_aD) - 0.25D, field_609_am + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, (field_9312_bd.nextDouble() - 0.5D) * 2D, -field_9312_bd.nextDouble(), (field_9312_bd.nextDouble() - 0.5D) * 2D);
        }

        if(field_615_ag.func_624_b() && !field_615_ag.field_1026_y)
        {
            float f = func_382_a(1.0F);
            if(f > 0.5F && field_615_ag.func_647_i(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)) && field_9312_bd.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                field_751_f = null;
                func_35178_q();
            }
        }
        if(func_27012_af())
        {
            field_751_f = null;
            func_35178_q();
        }
        field_9336_ak = false;
        if(field_751_f != null)
        {
            func_426_b(field_751_f, 100F, 100F);
        }
        if(!field_615_ag.field_1026_y && func_354_B())
        {
            if(field_751_f != null)
            {
                if((field_751_f instanceof EntityPlayer) && func_35183_c((EntityPlayer)field_751_f))
                {
                    field_9342_ah = field_9340_ai = 0.0F;
                    field_9333_am = 0.0F;
                    if(field_751_f.func_387_e(this) < 16D)
                    {
                        func_35178_q();
                    }
                    field_35184_d = 0;
                } else
                if(field_751_f.func_387_e(this) > 256D && field_35184_d++ >= 30 && func_35182_c(field_751_f))
                {
                    field_35184_d = 0;
                }
            } else
            {
                field_35184_d = 0;
            }
        }
        super.func_425_j();
    }

    protected boolean func_35178_q()
    {
        double d = field_611_ak + (field_9312_bd.nextDouble() - 0.5D) * 64D;
        double d1 = field_610_al + (double)(field_9312_bd.nextInt(64) - 32);
        double d2 = field_609_am + (field_9312_bd.nextDouble() - 0.5D) * 64D;
        return func_35179_a_(d, d1, d2);
    }

    protected boolean func_35182_c(Entity p_35182_1_)
    {
        Vec3D vec3d = Vec3D.func_1248_b(field_611_ak - p_35182_1_.field_611_ak, ((field_601_au.field_1697_b + (double)(field_643_aD / 2.0F)) - p_35182_1_.field_610_al) + (double)p_35182_1_.func_373_s(), field_609_am - p_35182_1_.field_609_am);
        vec3d = vec3d.func_1252_b();
        double d = 16D;
        double d1 = (field_611_ak + (field_9312_bd.nextDouble() - 0.5D) * 8D) - vec3d.field_1776_a * d;
        double d2 = (field_610_al + (double)(field_9312_bd.nextInt(16) - 8)) - vec3d.field_1775_b * d;
        double d3 = (field_609_am + (field_9312_bd.nextDouble() - 0.5D) * 8D) - vec3d.field_1779_c * d;
        return func_35179_a_(d1, d2, d3);
    }

    protected boolean func_35179_a_(double p_35179_1_, double p_35179_3_, double p_35179_5_)
    {
        double d = field_611_ak;
        double d1 = field_610_al;
        double d2 = field_609_am;
        field_611_ak = p_35179_1_;
        field_610_al = p_35179_3_;
        field_609_am = p_35179_5_;
        boolean flag = false;
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_610_al);
        int k = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_630_d(i, j, k))
        {
            boolean flag1;
            for(flag1 = false; !flag1 && j > 0;)
            {
                int i1 = field_615_ag.func_600_a(i, j - 1, k);
                if(i1 == 0 || !Block.field_345_n[i1].field_356_bn.func_880_c())
                {
                    field_610_al--;
                    j--;
                } else
                {
                    flag1 = true;
                }
            }

            if(flag1)
            {
                func_347_a(field_611_ak, field_610_al, field_609_am);
                if(field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au))
                {
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            func_347_a(d, d1, d2);
            return false;
        }
        int l = 128;
        for(int j1 = 0; j1 < l; j1++)
        {
            double d3 = (double)j1 / ((double)l - 1.0D);
            float f = (field_9312_bd.nextFloat() - 0.5F) * 0.2F;
            float f1 = (field_9312_bd.nextFloat() - 0.5F) * 0.2F;
            float f2 = (field_9312_bd.nextFloat() - 0.5F) * 0.2F;
            double d4 = d + (field_611_ak - d) * d3 + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC * 2D;
            double d5 = d1 + (field_610_al - d1) * d3 + field_9312_bd.nextDouble() * (double)field_643_aD;
            double d6 = d2 + (field_609_am - d2) * d3 + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC * 2D;
            field_615_ag.func_694_a("portal", d4, d5, d6, f, f1, f2);
        }

        field_615_ag.func_684_a(d, d1, d2, "mob.endermen.portal", 1.0F, 1.0F);
        field_615_ag.func_623_a(this, "mob.endermen.portal", 1.0F, 1.0F);
        return true;
    }

    protected String func_6389_d()
    {
        return "mob.endermen.idle";
    }

    protected String func_6394_f_()
    {
        return "mob.endermen.hit";
    }

    protected String func_6390_f()
    {
        return "mob.endermen.death";
    }

    protected int func_422_g()
    {
        return Item.field_35416_bo.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = func_422_g();
        if(i > 0)
        {
            int j = field_9312_bd.nextInt(2 + p_21066_2_);
            for(int k = 0; k < j; k++)
            {
                func_367_b(i, 1);
            }

        }
    }

    public void func_35177_b(int p_35177_1_)
    {
        field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(p_35177_1_ & 0xff)));
    }

    public int func_35176_r()
    {
        return field_21064_bx.func_21130_a(16);
    }

    public void func_35181_c(int p_35181_1_)
    {
        field_21064_bx.func_21129_b(17, Byte.valueOf((byte)(p_35181_1_ & 0xff)));
    }

    public int func_35180_s()
    {
        return field_21064_bx.func_21130_a(17);
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(p_396_1_ instanceof EntityDamageSourceIndirect)
        {
            for(int i = 0; i < 64; i++)
            {
                if(func_35178_q())
                {
                    return true;
                }
            }

            return false;
        } else
        {
            return super.func_396_a(p_396_1_, p_396_2_);
        }
    }

    static 
    {
        field_35186_b = new boolean[256];
        field_35186_b[Block.field_337_v.field_376_bc] = true;
        field_35186_b[Block.field_336_w.field_376_bc] = true;
        field_35186_b[Block.field_393_F.field_376_bc] = true;
        field_35186_b[Block.field_392_G.field_376_bc] = true;
        field_35186_b[Block.field_417_ae.field_376_bc] = true;
        field_35186_b[Block.field_416_af.field_376_bc] = true;
        field_35186_b[Block.field_415_ag.field_376_bc] = true;
        field_35186_b[Block.field_414_ah.field_376_bc] = true;
        field_35186_b[Block.field_408_an.field_376_bc] = true;
        field_35186_b[Block.field_425_aW.field_376_bc] = true;
        field_35186_b[Block.field_424_aX.field_376_bc] = true;
        field_35186_b[Block.field_4055_bb.field_376_bc] = true;
        field_35186_b[Block.field_35281_bs.field_376_bc] = true;
        field_35186_b[Block.field_40199_bz.field_376_bc] = true;
    }
}
