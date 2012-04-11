// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBiped, MathHelper, ModelRenderer

public class ModelZombie extends ModelBiped
{

    public ModelZombie()
    {
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        super.func_863_a(p_863_1_, p_863_2_, p_863_3_, p_863_4_, p_863_5_, p_863_6_);
        float f = MathHelper.func_1106_a(field_1244_k * 3.141593F);
        float f1 = MathHelper.func_1106_a((1.0F - (1.0F - field_1244_k) * (1.0F - field_1244_k)) * 3.141593F);
        field_1283_d.field_1405_f = 0.0F;
        field_1282_e.field_1405_f = 0.0F;
        field_1283_d.field_1406_e = -(0.1F - f * 0.6F);
        field_1282_e.field_1406_e = 0.1F - f * 0.6F;
        field_1283_d.field_1407_d = -1.570796F;
        field_1282_e.field_1407_d = -1.570796F;
        field_1283_d.field_1407_d -= f * 1.2F - f1 * 0.4F;
        field_1282_e.field_1407_d -= f * 1.2F - f1 * 0.4F;
        field_1283_d.field_1405_f += MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
        field_1282_e.field_1405_f -= MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
        field_1283_d.field_1407_d += MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
        field_1282_e.field_1407_d -= MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
    }
}
