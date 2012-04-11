// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            EntityFX, RenderEngine, RenderHelper, Tessellator, 
//            World

public class EntityLargeExplodeFX extends EntityFX
{

    private int field_35130_a;
    private int field_35129_ay;
    private RenderEngine field_35128_az;
    private float field_35131_aA;

    public EntityLargeExplodeFX(RenderEngine p_i376_1_, World p_i376_2_, double p_i376_3_, double p_i376_5_, double p_i376_7_, double p_i376_9_, double p_i376_11_, double p_i376_13_)
    {
        super(p_i376_2_, p_i376_3_, p_i376_5_, p_i376_7_, 0.0D, 0.0D, 0.0D);
        field_35130_a = 0;
        field_35129_ay = 0;
        field_35128_az = p_i376_1_;
        field_35129_ay = 6 + field_9312_bd.nextInt(4);
        field_663_i = field_662_j = field_661_k = field_9312_bd.nextFloat() * 0.6F + 0.4F;
        field_35131_aA = 1.0F - (float)p_i376_9_ * 0.5F;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        int i = (int)((((float)field_35130_a + p_406_2_) * 15F) / (float)field_35129_ay);
        if(i > 15)
        {
            return;
        } else
        {
            field_35128_az.func_1076_b(field_35128_az.func_1070_a("/misc/explosion.png"));
            float f = (float)(i % 4) / 4F;
            float f1 = f + 0.24975F;
            float f2 = (float)(i / 4) / 4F;
            float f3 = f2 + 0.24975F;
            float f4 = 2.0F * field_35131_aA;
            float f5 = (float)((field_9285_at + (field_611_ak - field_9285_at) * (double)p_406_2_) - field_660_l);
            float f6 = (float)((field_9284_au + (field_610_al - field_9284_au) * (double)p_406_2_) - field_659_m);
            float f7 = (float)((field_9283_av + (field_609_am - field_9283_av) * (double)p_406_2_) - field_658_n);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(2896);
            RenderHelper.func_1159_a();
            p_406_1_.func_977_b();
            p_406_1_.func_986_a(field_663_i, field_662_j, field_661_k, 1.0F);
            p_406_1_.func_980_b(0.0F, 1.0F, 0.0F);
            p_406_1_.func_35835_b(240);
            p_406_1_.func_983_a(f5 - p_406_3_ * f4 - p_406_6_ * f4, f6 - p_406_4_ * f4, f7 - p_406_5_ * f4 - p_406_7_ * f4, f1, f3);
            p_406_1_.func_983_a((f5 - p_406_3_ * f4) + p_406_6_ * f4, f6 + p_406_4_ * f4, (f7 - p_406_5_ * f4) + p_406_7_ * f4, f1, f2);
            p_406_1_.func_983_a(f5 + p_406_3_ * f4 + p_406_6_ * f4, f6 + p_406_4_ * f4, f7 + p_406_5_ * f4 + p_406_7_ * f4, f, f2);
            p_406_1_.func_983_a((f5 + p_406_3_ * f4) - p_406_6_ * f4, f6 - p_406_4_ * f4, (f7 + p_406_5_ * f4) - p_406_7_ * f4, f, f3);
            p_406_1_.func_982_a();
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glEnable(2896);
            return;
        }
    }

    public int func_35115_a(float p_35115_1_)
    {
        return 61680;
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_35130_a++;
        if(field_35130_a == field_35129_ay)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 3;
    }
}
