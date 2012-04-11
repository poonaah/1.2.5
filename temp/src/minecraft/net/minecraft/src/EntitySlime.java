// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityLiving, IMob, DataWatcher, NBTTagCompound, 
//            World, MathHelper, AxisAlignedBB, DamageSource, 
//            EntityPlayer, Item, Chunk

public class EntitySlime extends EntityLiving
    implements IMob
{

    public float field_40139_a;
    public float field_768_a;
    public float field_767_b;
    private int field_769_d;

    public EntitySlime(World p_i151_1_)
    {
        super(p_i151_1_);
        field_769_d = 0;
        field_9357_z = "/mob/slime.png";
        int i = 1 << field_9312_bd.nextInt(3);
        field_9292_aO = 0.0F;
        field_769_d = field_9312_bd.nextInt(20) + 10;
        func_441_c(i);
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Byte((byte)1));
    }

    public void func_441_c(int p_441_1_)
    {
        field_21064_bx.func_21129_b(16, new Byte((byte)p_441_1_));
        func_371_a(0.6F * (float)p_441_1_, 0.6F * (float)p_441_1_);
        func_347_a(field_611_ak, field_610_al, field_609_am);
        func_40121_k(func_40117_c());
        field_35171_bJ = p_441_1_;
    }

    public int func_40117_c()
    {
        int i = func_25027_v();
        return i * i;
    }

    public int func_25027_v()
    {
        return field_21064_bx.func_21130_a(16);
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("Size", func_25027_v() - 1);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_441_c(p_357_1_.func_756_e("Size") + 1);
    }

    protected String func_40135_ac()
    {
        return "slime";
    }

    protected String func_40138_aj()
    {
        return "mob.slime";
    }

    public void func_370_e_()
    {
        if(!field_615_ag.field_1026_y && field_615_ag.field_1039_l == 0 && func_25027_v() > 0)
        {
            field_646_aA = true;
        }
        field_768_a = field_768_a + (field_40139_a - field_768_a) * 0.5F;
        field_767_b = field_768_a;
        boolean flag = field_9298_aH;
        super.func_370_e_();
        if(field_9298_aH && !flag)
        {
            int i = func_25027_v();
            for(int j = 0; j < i * 8; j++)
            {
                float f = field_9312_bd.nextFloat() * 3.141593F * 2.0F;
                float f1 = field_9312_bd.nextFloat() * 0.5F + 0.5F;
                float f2 = MathHelper.func_1106_a(f) * (float)i * 0.5F * f1;
                float f3 = MathHelper.func_1114_b(f) * (float)i * 0.5F * f1;
                field_615_ag.func_694_a(func_40135_ac(), field_611_ak + (double)f2, field_601_au.field_1697_b, field_609_am + (double)f3, 0.0D, 0.0D, 0.0D);
            }

            if(func_40134_ak())
            {
                field_615_ag.func_623_a(this, func_40138_aj(), func_6393_h(), ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F) / 0.8F);
            }
            field_40139_a = -0.5F;
        }
        func_40136_ag();
    }

    protected void func_418_b_()
    {
        func_27021_X();
        EntityPlayer entityplayer = field_615_ag.func_40480_b(this, 16D);
        if(entityplayer != null)
        {
            func_426_b(entityplayer, 10F, 20F);
        }
        if(field_9298_aH && field_769_d-- <= 0)
        {
            field_769_d = func_40131_af();
            if(entityplayer != null)
            {
                field_769_d /= 3;
            }
            field_9336_ak = true;
            if(func_40133_ao())
            {
                field_615_ag.func_623_a(this, func_40138_aj(), func_6393_h(), ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            }
            field_40139_a = 1.0F;
            field_9342_ah = 1.0F - field_9312_bd.nextFloat() * 2.0F;
            field_9340_ai = 1 * func_25027_v();
        } else
        {
            field_9336_ak = false;
            if(field_9298_aH)
            {
                field_9342_ah = field_9340_ai = 0.0F;
            }
        }
    }

    protected void func_40136_ag()
    {
        field_40139_a = field_40139_a * 0.6F;
    }

    protected int func_40131_af()
    {
        return field_9312_bd.nextInt(20) + 10;
    }

    protected EntitySlime func_40132_ae()
    {
        return new EntitySlime(field_615_ag);
    }

    public void func_395_F()
    {
        int i = func_25027_v();
        if(!field_615_ag.field_1026_y && i > 1 && func_40114_aH() <= 0)
        {
            int j = 2 + field_9312_bd.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                float f = (((float)(k % 2) - 0.5F) * (float)i) / 4F;
                float f1 = (((float)(k / 2) - 0.5F) * (float)i) / 4F;
                EntitySlime entityslime = func_40132_ae();
                entityslime.func_441_c(i / 2);
                entityslime.func_365_c(field_611_ak + (double)f, field_610_al + 0.5D, field_609_am + (double)f1, field_9312_bd.nextFloat() * 360F, 0.0F);
                field_615_ag.func_674_a(entityslime);
            }

        }
        super.func_395_F();
    }

    public void func_6378_b(EntityPlayer p_6378_1_)
    {
        if(func_40137_ah())
        {
            int i = func_25027_v();
            if(func_420_c(p_6378_1_) && (double)func_379_d(p_6378_1_) < 0.59999999999999998D * (double)i && p_6378_1_.func_396_a(DamageSource.func_35525_a(this), func_40130_ai()))
            {
                field_615_ag.func_623_a(this, "mob.slimeattack", 1.0F, (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F);
            }
        }
    }

    protected boolean func_40137_ah()
    {
        return func_25027_v() > 1;
    }

    protected int func_40130_ai()
    {
        return func_25027_v();
    }

    protected String func_6394_f_()
    {
        return "mob.slime";
    }

    protected String func_6390_f()
    {
        return "mob.slime";
    }

    protected int func_422_g()
    {
        if(func_25027_v() == 1)
        {
            return Item.field_299_aK.field_291_aS;
        } else
        {
            return 0;
        }
    }

    public boolean func_433_a()
    {
        Chunk chunk = field_615_ag.func_673_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_609_am));
        if((func_25027_v() == 1 || field_615_ag.field_1039_l > 0) && field_9312_bd.nextInt(10) == 0 && chunk.func_997_a(0x3ad8025fL).nextInt(10) == 0 && field_610_al < 40D)
        {
            return super.func_433_a();
        } else
        {
            return false;
        }
    }

    protected float func_6393_h()
    {
        return 0.4F * (float)func_25027_v();
    }

    public int func_25026_x()
    {
        return 0;
    }

    protected boolean func_40133_ao()
    {
        return func_25027_v() > 1;
    }

    protected boolean func_40134_ak()
    {
        return func_25027_v() > 2;
    }
}
