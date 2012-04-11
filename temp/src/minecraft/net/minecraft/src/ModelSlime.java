// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, Entity

public class ModelSlime extends ModelBase
{

    ModelRenderer field_1258_a;
    ModelRenderer field_1257_b;
    ModelRenderer field_1260_c;
    ModelRenderer field_1259_d;

    public ModelSlime(int p_i45_1_)
    {
        field_1258_a = new ModelRenderer(this, 0, p_i45_1_);
        field_1258_a.func_40604_a(-4F, 16F, -4F, 8, 8, 8);
        if(p_i45_1_ > 0)
        {
            field_1258_a = new ModelRenderer(this, 0, p_i45_1_);
            field_1258_a.func_40604_a(-3F, 17F, -3F, 6, 6, 6);
            field_1257_b = new ModelRenderer(this, 32, 0);
            field_1257_b.func_40604_a(-3.25F, 18F, -3.5F, 2, 2, 2);
            field_1260_c = new ModelRenderer(this, 32, 4);
            field_1260_c.func_40604_a(1.25F, 18F, -3.5F, 2, 2, 2);
            field_1259_d = new ModelRenderer(this, 32, 8);
            field_1259_d.func_40604_a(0.0F, 21F, -3.5F, 1, 1, 1);
        }
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_1258_a.func_922_a(p_864_7_);
        if(field_1257_b != null)
        {
            field_1257_b.func_922_a(p_864_7_);
            field_1260_c.func_922_a(p_864_7_);
            field_1259_d.func_922_a(p_864_7_);
        }
    }
}
