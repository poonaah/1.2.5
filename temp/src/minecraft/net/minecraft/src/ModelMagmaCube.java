// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, EntityMagmaCube, EntityLiving, 
//            Entity

public class ModelMagmaCube extends ModelBase
{

    ModelRenderer field_40345_a[];
    ModelRenderer field_40344_b;

    public ModelMagmaCube()
    {
        field_40345_a = new ModelRenderer[8];
        for(int i = 0; i < field_40345_a.length; i++)
        {
            byte byte0 = 0;
            int j = i;
            if(i == 2)
            {
                byte0 = 24;
                j = 10;
            } else
            if(i == 3)
            {
                byte0 = 24;
                j = 19;
            }
            field_40345_a[i] = new ModelRenderer(this, byte0, j);
            field_40345_a[i].func_40604_a(-4F, 16 + i, -4F, 8, 1, 8);
        }

        field_40344_b = new ModelRenderer(this, 0, 16);
        field_40344_b.func_40604_a(-2F, 18F, -2F, 4, 4, 4);
    }

    public int func_40343_a()
    {
        return 5;
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_25103_a(EntityLiving p_25103_1_, float p_25103_2_, float p_25103_3_, float p_25103_4_)
    {
        EntityMagmaCube entitymagmacube = (EntityMagmaCube)p_25103_1_;
        float f = entitymagmacube.field_767_b + (entitymagmacube.field_768_a - entitymagmacube.field_767_b) * p_25103_4_;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        for(int i = 0; i < field_40345_a.length; i++)
        {
            field_40345_a[i].field_1409_b = (float)(-(4 - i)) * f * 1.7F;
        }

    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_40344_b.func_922_a(p_864_7_);
        for(int i = 0; i < field_40345_a.length; i++)
        {
            field_40345_a[i].func_922_a(p_864_7_);
        }

    }
}
