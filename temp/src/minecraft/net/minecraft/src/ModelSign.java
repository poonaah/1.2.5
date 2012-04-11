// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer

public class ModelSign extends ModelBase
{

    public ModelRenderer field_1346_a;
    public ModelRenderer field_1345_b;

    public ModelSign()
    {
        field_1346_a = new ModelRenderer(this, 0, 0);
        field_1346_a.func_923_a(-12F, -14F, -1F, 24, 12, 2, 0.0F);
        field_1345_b = new ModelRenderer(this, 0, 14);
        field_1345_b.func_923_a(-1F, -2F, -1F, 2, 14, 2, 0.0F);
    }

    public void func_887_a()
    {
        field_1346_a.func_922_a(0.0625F);
        field_1345_b.func_922_a(0.0625F);
    }
}
