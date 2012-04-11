// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, Entity

public class ModelMinecart extends ModelBase
{

    public ModelRenderer field_1256_a[];

    public ModelMinecart()
    {
        field_1256_a = new ModelRenderer[7];
        field_1256_a[0] = new ModelRenderer(this, 0, 10);
        field_1256_a[1] = new ModelRenderer(this, 0, 0);
        field_1256_a[2] = new ModelRenderer(this, 0, 0);
        field_1256_a[3] = new ModelRenderer(this, 0, 0);
        field_1256_a[4] = new ModelRenderer(this, 0, 0);
        field_1256_a[5] = new ModelRenderer(this, 44, 10);
        byte byte0 = 20;
        byte byte1 = 8;
        byte byte2 = 16;
        int i = 4;
        field_1256_a[0].func_923_a(-byte0 / 2, -byte2 / 2, -1F, byte0, byte2, 2, 0.0F);
        field_1256_a[0].func_925_a(0.0F, i, 0.0F);
        field_1256_a[5].func_923_a(-byte0 / 2 + 1, -byte2 / 2 + 1, -1F, byte0 - 2, byte2 - 2, 1, 0.0F);
        field_1256_a[5].func_925_a(0.0F, i, 0.0F);
        field_1256_a[1].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1256_a[1].func_925_a(-byte0 / 2 + 1, i, 0.0F);
        field_1256_a[2].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1256_a[2].func_925_a(byte0 / 2 - 1, i, 0.0F);
        field_1256_a[3].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1256_a[3].func_925_a(0.0F, i, -byte2 / 2 + 1);
        field_1256_a[4].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1256_a[4].func_925_a(0.0F, i, byte2 / 2 - 1);
        field_1256_a[0].field_1407_d = 1.570796F;
        field_1256_a[1].field_1406_e = 4.712389F;
        field_1256_a[2].field_1406_e = 1.570796F;
        field_1256_a[3].field_1406_e = 3.141593F;
        field_1256_a[5].field_1407_d = -1.570796F;
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        field_1256_a[5].field_1409_b = 4F - p_864_4_;
        for(int i = 0; i < 6; i++)
        {
            field_1256_a[i].func_922_a(p_864_7_);
        }

    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }
}
