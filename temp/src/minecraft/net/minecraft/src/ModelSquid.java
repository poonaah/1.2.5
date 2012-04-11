// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, Entity

public class ModelSquid extends ModelBase
{

    ModelRenderer field_21123_a;
    ModelRenderer field_21122_b[];

    public ModelSquid()
    {
        field_21122_b = new ModelRenderer[8];
        byte byte0 = -16;
        field_21123_a = new ModelRenderer(this, 0, 0);
        field_21123_a.func_40604_a(-6F, -8F, -6F, 12, 16, 12);
        field_21123_a.field_1409_b += 24 + byte0;
        for(int i = 0; i < field_21122_b.length; i++)
        {
            field_21122_b[i] = new ModelRenderer(this, 48, 0);
            double d = ((double)i * 3.1415926535897931D * 2D) / (double)field_21122_b.length;
            float f = (float)Math.cos(d) * 5F;
            float f1 = (float)Math.sin(d) * 5F;
            field_21122_b[i].func_40604_a(-1F, 0.0F, -1F, 2, 18, 2);
            field_21122_b[i].field_1410_a = f;
            field_21122_b[i].field_1408_c = f1;
            field_21122_b[i].field_1409_b = 31 + byte0;
            d = ((double)i * 3.1415926535897931D * -2D) / (double)field_21122_b.length + 1.5707963267948966D;
            field_21122_b[i].field_1406_e = (float)d;
        }

    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        ModelRenderer amodelrenderer[] = field_21122_b;
        int i = amodelrenderer.length;
        for(int j = 0; j < i; j++)
        {
            ModelRenderer modelrenderer = amodelrenderer[j];
            modelrenderer.field_1407_d = p_863_3_;
        }

    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_21123_a.func_922_a(p_864_7_);
        for(int i = 0; i < field_21122_b.length; i++)
        {
            field_21122_b[i].func_922_a(p_864_7_);
        }

    }
}
