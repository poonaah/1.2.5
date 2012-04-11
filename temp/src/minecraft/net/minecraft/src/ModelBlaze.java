// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelBlaze extends ModelBase
{

    private ModelRenderer field_40323_a[];
    private ModelRenderer field_40322_b;

    public ModelBlaze()
    {
        field_40323_a = new ModelRenderer[12];
        for(int i = 0; i < field_40323_a.length; i++)
        {
            field_40323_a[i] = new ModelRenderer(this, 0, 16);
            field_40323_a[i].func_40604_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
        }

        field_40322_b = new ModelRenderer(this, 0, 0);
        field_40322_b.func_40604_a(-4F, -4F, -4F, 8, 8, 8);
    }

    public int func_40321_a()
    {
        return 8;
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_40322_b.func_922_a(p_864_7_);
        for(int i = 0; i < field_40323_a.length; i++)
        {
            field_40323_a[i].func_922_a(p_864_7_);
        }

    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        float f = p_863_3_ * 3.141593F * -0.1F;
        for(int i = 0; i < 4; i++)
        {
            field_40323_a[i].field_1409_b = -2F + MathHelper.func_1114_b(((float)(i * 2) + p_863_3_) * 0.25F);
            field_40323_a[i].field_1410_a = MathHelper.func_1114_b(f) * 9F;
            field_40323_a[i].field_1408_c = MathHelper.func_1106_a(f) * 9F;
            f += 1.570796F;
        }

        f = 0.7853982F + p_863_3_ * 3.141593F * 0.03F;
        for(int j = 4; j < 8; j++)
        {
            field_40323_a[j].field_1409_b = 2.0F + MathHelper.func_1114_b(((float)(j * 2) + p_863_3_) * 0.25F);
            field_40323_a[j].field_1410_a = MathHelper.func_1114_b(f) * 7F;
            field_40323_a[j].field_1408_c = MathHelper.func_1106_a(f) * 7F;
            f += 1.570796F;
        }

        f = 0.4712389F + p_863_3_ * 3.141593F * -0.05F;
        for(int k = 8; k < 12; k++)
        {
            field_40323_a[k].field_1409_b = 11F + MathHelper.func_1114_b(((float)k * 1.5F + p_863_3_) * 0.5F);
            field_40323_a[k].field_1410_a = MathHelper.func_1114_b(f) * 5F;
            field_40323_a[k].field_1408_c = MathHelper.func_1106_a(f) * 5F;
            f += 1.570796F;
        }

        field_40322_b.field_1406_e = p_863_4_ / 57.29578F;
        field_40322_b.field_1407_d = p_863_5_ / 57.29578F;
    }
}
