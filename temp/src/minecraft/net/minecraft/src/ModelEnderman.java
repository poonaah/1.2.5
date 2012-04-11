// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBiped, ModelRenderer

public class ModelEnderman extends ModelBiped
{

    public boolean field_35407_a;
    public boolean field_35406_b;

    public ModelEnderman()
    {
        super(0.0F, -14F);
        field_35407_a = false;
        field_35406_b = false;
        float f = -14F;
        float f1 = 0.0F;
        field_1285_b = new ModelRenderer(this, 0, 16);
        field_1285_b.func_923_a(-4F, -8F, -4F, 8, 8, 8, f1 - 0.5F);
        field_1285_b.func_925_a(0.0F, 0.0F + f, 0.0F);
        field_1284_c = new ModelRenderer(this, 32, 16);
        field_1284_c.func_923_a(-4F, 0.0F, -2F, 8, 12, 4, f1);
        field_1284_c.func_925_a(0.0F, 0.0F + f, 0.0F);
        field_1283_d = new ModelRenderer(this, 56, 0);
        field_1283_d.func_923_a(-1F, -2F, -1F, 2, 30, 2, f1);
        field_1283_d.func_925_a(-3F, 2.0F + f, 0.0F);
        field_1282_e = new ModelRenderer(this, 56, 0);
        field_1282_e.field_1404_g = true;
        field_1282_e.func_923_a(-1F, -2F, -1F, 2, 30, 2, f1);
        field_1282_e.func_925_a(5F, 2.0F + f, 0.0F);
        field_1281_f = new ModelRenderer(this, 56, 0);
        field_1281_f.func_923_a(-1F, 0.0F, -1F, 2, 30, 2, f1);
        field_1281_f.func_925_a(-2F, 12F + f, 0.0F);
        field_1280_g = new ModelRenderer(this, 56, 0);
        field_1280_g.field_1404_g = true;
        field_1280_g.func_923_a(-1F, 0.0F, -1F, 2, 30, 2, f1);
        field_1280_g.func_925_a(2.0F, 12F + f, 0.0F);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        super.func_863_a(p_863_1_, p_863_2_, p_863_3_, p_863_4_, p_863_5_, p_863_6_);
        field_1286_a.field_1403_h = true;
        float f = -14F;
        field_1284_c.field_1407_d = 0.0F;
        field_1284_c.field_1409_b = f;
        field_1284_c.field_1408_c = -0F;
        field_1281_f.field_1407_d -= 0.0F;
        field_1280_g.field_1407_d -= 0.0F;
        field_1283_d.field_1407_d *= 0.5D;
        field_1282_e.field_1407_d *= 0.5D;
        field_1281_f.field_1407_d *= 0.5D;
        field_1280_g.field_1407_d *= 0.5D;
        float f1 = 0.4F;
        if(field_1283_d.field_1407_d > f1)
        {
            field_1283_d.field_1407_d = f1;
        }
        if(field_1282_e.field_1407_d > f1)
        {
            field_1282_e.field_1407_d = f1;
        }
        if(field_1283_d.field_1407_d < -f1)
        {
            field_1283_d.field_1407_d = -f1;
        }
        if(field_1282_e.field_1407_d < -f1)
        {
            field_1282_e.field_1407_d = -f1;
        }
        if(field_1281_f.field_1407_d > f1)
        {
            field_1281_f.field_1407_d = f1;
        }
        if(field_1280_g.field_1407_d > f1)
        {
            field_1280_g.field_1407_d = f1;
        }
        if(field_1281_f.field_1407_d < -f1)
        {
            field_1281_f.field_1407_d = -f1;
        }
        if(field_1280_g.field_1407_d < -f1)
        {
            field_1280_g.field_1407_d = -f1;
        }
        if(field_35407_a)
        {
            field_1283_d.field_1407_d = -0.5F;
            field_1282_e.field_1407_d = -0.5F;
            field_1283_d.field_1405_f = 0.05F;
            field_1282_e.field_1405_f = -0.05F;
        }
        field_1283_d.field_1408_c = 0.0F;
        field_1282_e.field_1408_c = 0.0F;
        field_1281_f.field_1408_c = 0.0F;
        field_1280_g.field_1408_c = 0.0F;
        field_1281_f.field_1409_b = 9F + f;
        field_1280_g.field_1409_b = 9F + f;
        field_1286_a.field_1408_c = -0F;
        field_1286_a.field_1409_b = f + 1.0F;
        field_1285_b.field_1410_a = field_1286_a.field_1410_a;
        field_1285_b.field_1409_b = field_1286_a.field_1409_b;
        field_1285_b.field_1408_c = field_1286_a.field_1408_c;
        field_1285_b.field_1407_d = field_1286_a.field_1407_d;
        field_1285_b.field_1406_e = field_1286_a.field_1406_e;
        field_1285_b.field_1405_f = field_1286_a.field_1405_f;
        if(field_35406_b)
        {
            float f2 = 1.0F;
            field_1286_a.field_1409_b -= f2 * 5F;
        }
    }
}
