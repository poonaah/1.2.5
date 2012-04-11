// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer

public class ModelChest extends ModelBase
{

    public ModelRenderer field_35405_a;
    public ModelRenderer field_35403_b;
    public ModelRenderer field_35404_c;

    public ModelChest()
    {
        field_35405_a = (new ModelRenderer(this, 0, 0)).func_35968_a(64, 64);
        field_35405_a.func_923_a(0.0F, -5F, -14F, 14, 5, 14, 0.0F);
        field_35405_a.field_1410_a = 1.0F;
        field_35405_a.field_1409_b = 7F;
        field_35405_a.field_1408_c = 15F;
        field_35404_c = (new ModelRenderer(this, 0, 0)).func_35968_a(64, 64);
        field_35404_c.func_923_a(-1F, -2F, -15F, 2, 4, 1, 0.0F);
        field_35404_c.field_1410_a = 8F;
        field_35404_c.field_1409_b = 7F;
        field_35404_c.field_1408_c = 15F;
        field_35403_b = (new ModelRenderer(this, 0, 19)).func_35968_a(64, 64);
        field_35403_b.func_923_a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
        field_35403_b.field_1410_a = 1.0F;
        field_35403_b.field_1409_b = 6F;
        field_35403_b.field_1408_c = 1.0F;
    }

    public void func_35402_a()
    {
        field_35404_c.field_1407_d = field_35405_a.field_1407_d;
        field_35405_a.func_922_a(0.0625F);
        field_35404_c.func_922_a(0.0625F);
        field_35403_b.func_922_a(0.0625F);
    }
}
