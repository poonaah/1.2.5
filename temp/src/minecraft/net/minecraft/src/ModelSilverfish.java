// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelSilverfish extends ModelBase
{

    private ModelRenderer field_35400_a[];
    private ModelRenderer field_35398_b[];
    private float field_35399_c[];
    private static final int field_35396_d[][] = {
        {
            3, 2, 2
        }, {
            4, 3, 2
        }, {
            6, 4, 3
        }, {
            3, 3, 3
        }, {
            2, 2, 3
        }, {
            2, 1, 2
        }, {
            1, 1, 2
        }
    };
    private static final int field_35397_e[][] = {
        {
            0, 0
        }, {
            0, 4
        }, {
            0, 9
        }, {
            0, 16
        }, {
            0, 22
        }, {
            11, 0
        }, {
            13, 4
        }
    };

    public ModelSilverfish()
    {
        field_35399_c = new float[7];
        field_35400_a = new ModelRenderer[7];
        float f = -3.5F;
        for(int i = 0; i < field_35400_a.length; i++)
        {
            field_35400_a[i] = new ModelRenderer(this, field_35397_e[i][0], field_35397_e[i][1]);
            field_35400_a[i].func_40604_a((float)field_35396_d[i][0] * -0.5F, 0.0F, (float)field_35396_d[i][2] * -0.5F, field_35396_d[i][0], field_35396_d[i][1], field_35396_d[i][2]);
            field_35400_a[i].func_925_a(0.0F, 24 - field_35396_d[i][1], f);
            field_35399_c[i] = f;
            if(i < field_35400_a.length - 1)
            {
                f += (float)(field_35396_d[i][2] + field_35396_d[i + 1][2]) * 0.5F;
            }
        }

        field_35398_b = new ModelRenderer[3];
        field_35398_b[0] = new ModelRenderer(this, 20, 0);
        field_35398_b[0].func_40604_a(-5F, 0.0F, (float)field_35396_d[2][2] * -0.5F, 10, 8, field_35396_d[2][2]);
        field_35398_b[0].func_925_a(0.0F, 16F, field_35399_c[2]);
        field_35398_b[1] = new ModelRenderer(this, 20, 11);
        field_35398_b[1].func_40604_a(-3F, 0.0F, (float)field_35396_d[4][2] * -0.5F, 6, 4, field_35396_d[4][2]);
        field_35398_b[1].func_925_a(0.0F, 20F, field_35399_c[4]);
        field_35398_b[2] = new ModelRenderer(this, 20, 18);
        field_35398_b[2].func_40604_a(-3F, 0.0F, (float)field_35396_d[4][2] * -0.5F, 6, 5, field_35396_d[1][2]);
        field_35398_b[2].func_925_a(0.0F, 19F, field_35399_c[1]);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        for(int i = 0; i < field_35400_a.length; i++)
        {
            field_35400_a[i].func_922_a(p_864_7_);
        }

        for(int j = 0; j < field_35398_b.length; j++)
        {
            field_35398_b[j].func_922_a(p_864_7_);
        }

    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        for(int i = 0; i < field_35400_a.length; i++)
        {
            field_35400_a[i].field_1406_e = MathHelper.func_1114_b(p_863_3_ * 0.9F + (float)i * 0.15F * 3.141593F) * 3.141593F * 0.05F * (float)(1 + Math.abs(i - 2));
            field_35400_a[i].field_1410_a = MathHelper.func_1106_a(p_863_3_ * 0.9F + (float)i * 0.15F * 3.141593F) * 3.141593F * 0.2F * (float)Math.abs(i - 2);
        }

        field_35398_b[0].field_1406_e = field_35400_a[2].field_1406_e;
        field_35398_b[1].field_1406_e = field_35400_a[4].field_1406_e;
        field_35398_b[1].field_1410_a = field_35400_a[4].field_1410_a;
        field_35398_b[2].field_1406_e = field_35400_a[1].field_1406_e;
        field_35398_b[2].field_1410_a = field_35400_a[1].field_1410_a;
    }

}
