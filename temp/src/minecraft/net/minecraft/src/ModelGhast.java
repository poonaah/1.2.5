// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelGhast extends ModelBase
{

    ModelRenderer field_4258_a;
    ModelRenderer field_4257_b[];

    public ModelGhast()
    {
        field_4257_b = new ModelRenderer[9];
        byte byte0 = -16;
        field_4258_a = new ModelRenderer(this, 0, 0);
        field_4258_a.func_40604_a(-8F, -8F, -8F, 16, 16, 16);
        field_4258_a.field_1409_b += 24 + byte0;
        Random random = new Random(1660L);
        for(int i = 0; i < field_4257_b.length; i++)
        {
            field_4257_b[i] = new ModelRenderer(this, 0, 0);
            float f = (((((float)(i % 3) - (float)((i / 3) % 2) * 0.5F) + 0.25F) / 2.0F) * 2.0F - 1.0F) * 5F;
            float f1 = (((float)(i / 3) / 2.0F) * 2.0F - 1.0F) * 5F;
            int j = random.nextInt(7) + 8;
            field_4257_b[i].func_40604_a(-1F, 0.0F, -1F, 2, j, 2);
            field_4257_b[i].field_1410_a = f;
            field_4257_b[i].field_1408_c = f1;
            field_4257_b[i].field_1409_b = 31 + byte0;
        }

    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        for(int i = 0; i < field_4257_b.length; i++)
        {
            field_4257_b[i].field_1407_d = 0.2F * MathHelper.func_1106_a(p_863_3_ * 0.3F + (float)i) + 0.4F;
        }

    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.6F, 0.0F);
        field_4258_a.func_922_a(p_864_7_);
        ModelRenderer amodelrenderer[] = field_4257_b;
        int i = amodelrenderer.length;
        for(int j = 0; j < i; j++)
        {
            ModelRenderer modelrenderer = amodelrenderer[j];
            modelrenderer.func_922_a(p_864_7_);
        }

        GL11.glPopMatrix();
    }
}
