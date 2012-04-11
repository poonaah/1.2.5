// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            EntityFX, Entity, MathHelper, OpenGlHelper, 
//            RenderManager, World, Tessellator

public class EntityPickupFX extends EntityFX
{

    private Entity field_675_a;
    private Entity field_679_o;
    private int field_678_p;
    private int field_677_q;
    private float field_676_r;

    public EntityPickupFX(World p_i665_1_, Entity p_i665_2_, Entity p_i665_3_, float p_i665_4_)
    {
        super(p_i665_1_, p_i665_2_.field_611_ak, p_i665_2_.field_610_al, p_i665_2_.field_609_am, p_i665_2_.field_608_an, p_i665_2_.field_607_ao, p_i665_2_.field_606_ap);
        field_678_p = 0;
        field_677_q = 0;
        field_675_a = p_i665_2_;
        field_679_o = p_i665_3_;
        field_677_q = 3;
        field_676_r = p_i665_4_;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)field_678_p + p_406_2_) / (float)field_677_q;
        f *= f;
        double d = field_675_a.field_611_ak;
        double d1 = field_675_a.field_610_al;
        double d2 = field_675_a.field_609_am;
        double d3 = field_679_o.field_638_aI + (field_679_o.field_611_ak - field_679_o.field_638_aI) * (double)p_406_2_;
        double d4 = field_679_o.field_637_aJ + (field_679_o.field_610_al - field_679_o.field_637_aJ) * (double)p_406_2_ + (double)field_676_r;
        double d5 = field_679_o.field_636_aK + (field_679_o.field_609_am - field_679_o.field_636_aK) * (double)p_406_2_;
        double d6 = d + (d3 - d) * (double)f;
        double d7 = d1 + (d4 - d1) * (double)f;
        double d8 = d2 + (d5 - d2) * (double)f;
        int i = MathHelper.func_1108_b(d6);
        int j = MathHelper.func_1108_b(d7 + (double)(field_9292_aO / 2.0F));
        int k = MathHelper.func_1108_b(d8);
        int l = func_35115_a(p_406_2_);
        int i1 = l % 0x10000;
        int j1 = l / 0x10000;
        OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)i1 / 1.0F, (float)j1 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        d6 -= field_660_l;
        d7 -= field_659_m;
        d8 -= field_658_n;
        RenderManager.field_1233_a.func_853_a(field_675_a, (float)d6, (float)d7, (float)d8, field_675_a.field_605_aq, p_406_2_);
    }

    public void func_370_e_()
    {
        field_678_p++;
        if(field_678_p == field_677_q)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 3;
    }
}
