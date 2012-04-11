// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, Entity

public class ModelBoat extends ModelBase
{

    public ModelRenderer field_1287_a[];

    public ModelBoat()
    {
        field_1287_a = new ModelRenderer[5];
        field_1287_a[0] = new ModelRenderer(this, 0, 8);
        field_1287_a[1] = new ModelRenderer(this, 0, 0);
        field_1287_a[2] = new ModelRenderer(this, 0, 0);
        field_1287_a[3] = new ModelRenderer(this, 0, 0);
        field_1287_a[4] = new ModelRenderer(this, 0, 0);
        byte byte0 = 24;
        byte byte1 = 6;
        byte byte2 = 20;
        int i = 4;
        field_1287_a[0].func_923_a(-byte0 / 2, -byte2 / 2 + 2, -3F, byte0, byte2 - 4, 4, 0.0F);
        field_1287_a[0].func_925_a(0.0F, i, 0.0F);
        field_1287_a[1].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[1].func_925_a(-byte0 / 2 + 1, i, 0.0F);
        field_1287_a[2].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[2].func_925_a(byte0 / 2 - 1, i, 0.0F);
        field_1287_a[3].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[3].func_925_a(0.0F, i, -byte2 / 2 + 1);
        field_1287_a[4].func_923_a(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[4].func_925_a(0.0F, i, byte2 / 2 - 1);
        field_1287_a[0].field_1407_d = 1.570796F;
        field_1287_a[1].field_1406_e = 4.712389F;
        field_1287_a[2].field_1406_e = 1.570796F;
        field_1287_a[3].field_1406_e = 3.141593F;
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        for(int i = 0; i < 5; i++)
        {
            field_1287_a[i].func_922_a(p_864_7_);
        }

    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }
}
