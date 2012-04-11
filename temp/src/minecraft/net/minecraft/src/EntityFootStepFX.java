// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            EntityFX, MathHelper, World, RenderEngine, 
//            Tessellator

public class EntityFootStepFX extends EntityFX
{

    private int field_27018_a;
    private int field_27020_o;
    private RenderEngine field_27019_p;

    public EntityFootStepFX(RenderEngine p_i703_1_, World p_i703_2_, double p_i703_3_, double p_i703_5_, double p_i703_7_)
    {
        super(p_i703_2_, p_i703_3_, p_i703_5_, p_i703_7_, 0.0D, 0.0D, 0.0D);
        field_27018_a = 0;
        field_27020_o = 0;
        field_27019_p = p_i703_1_;
        field_608_an = field_607_ao = field_606_ap = 0.0D;
        field_27020_o = 200;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)field_27018_a + p_406_2_) / (float)field_27020_o;
        f *= f;
        float f1 = 2.0F - f * 2.0F;
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        f1 *= 0.2F;
        GL11.glDisable(2896);
        float f2 = 0.125F;
        float f3 = (float)(field_611_ak - field_660_l);
        float f4 = (float)(field_610_al - field_659_m);
        float f5 = (float)(field_609_am - field_658_n);
        float f6 = field_615_ag.func_598_c(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
        field_27019_p.func_1076_b(field_27019_p.func_1070_a("/misc/footprint.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        p_406_1_.func_977_b();
        p_406_1_.func_986_a(f6, f6, f6, f1);
        p_406_1_.func_983_a(f3 - f2, f4, f5 + f2, 0.0D, 1.0D);
        p_406_1_.func_983_a(f3 + f2, f4, f5 + f2, 1.0D, 1.0D);
        p_406_1_.func_983_a(f3 + f2, f4, f5 - f2, 1.0D, 0.0D);
        p_406_1_.func_983_a(f3 - f2, f4, f5 - f2, 0.0D, 0.0D);
        p_406_1_.func_982_a();
        GL11.glDisable(3042);
        GL11.glEnable(2896);
    }

    public void func_370_e_()
    {
        field_27018_a++;
        if(field_27018_a == field_27020_o)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 3;
    }
}
