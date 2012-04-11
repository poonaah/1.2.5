// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelVillager extends ModelBase
{

    public ModelRenderer field_40340_a;
    public ModelRenderer field_40338_b;
    public ModelRenderer field_40339_c;
    public ModelRenderer field_40336_d;
    public ModelRenderer field_40337_e;

    public ModelVillager(float p_i638_1_)
    {
        this(p_i638_1_, 0.0F);
    }

    public ModelVillager(float p_i639_1_, float p_i639_2_)
    {
        byte byte0 = 64;
        byte byte1 = 64;
        field_40340_a = (new ModelRenderer(this)).func_35968_a(byte0, byte1);
        field_40340_a.func_925_a(0.0F, 0.0F + p_i639_2_, 0.0F);
        field_40340_a.func_40602_a(0, 0).func_923_a(-4F, -10F, -4F, 8, 10, 8, p_i639_1_);
        field_40340_a.func_40602_a(24, 0).func_923_a(-1F, -3F, -6F, 2, 4, 2, p_i639_1_);
        field_40338_b = (new ModelRenderer(this)).func_35968_a(byte0, byte1);
        field_40338_b.func_925_a(0.0F, 0.0F + p_i639_2_, 0.0F);
        field_40338_b.func_40602_a(16, 20).func_923_a(-4F, 0.0F, -3F, 8, 12, 6, p_i639_1_);
        field_40338_b.func_40602_a(0, 38).func_923_a(-4F, 0.0F, -3F, 8, 18, 6, p_i639_1_ + 0.5F);
        field_40339_c = (new ModelRenderer(this)).func_35968_a(byte0, byte1);
        field_40339_c.func_925_a(0.0F, 0.0F + p_i639_2_ + 2.0F, 0.0F);
        field_40339_c.func_40602_a(44, 22).func_923_a(-8F, -2F, -2F, 4, 8, 4, p_i639_1_);
        field_40339_c.func_40602_a(44, 22).func_923_a(4F, -2F, -2F, 4, 8, 4, p_i639_1_);
        field_40339_c.func_40602_a(40, 38).func_923_a(-4F, 2.0F, -2F, 8, 4, 4, p_i639_1_);
        field_40336_d = (new ModelRenderer(this, 0, 22)).func_35968_a(byte0, byte1);
        field_40336_d.func_925_a(-2F, 12F + p_i639_2_, 0.0F);
        field_40336_d.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, p_i639_1_);
        field_40337_e = (new ModelRenderer(this, 0, 22)).func_35968_a(byte0, byte1);
        field_40337_e.field_1404_g = true;
        field_40337_e.func_925_a(2.0F, 12F + p_i639_2_, 0.0F);
        field_40337_e.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, p_i639_1_);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_40340_a.func_922_a(p_864_7_);
        field_40338_b.func_922_a(p_864_7_);
        field_40336_d.func_922_a(p_864_7_);
        field_40337_e.func_922_a(p_864_7_);
        field_40339_c.func_922_a(p_864_7_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_40340_a.field_1406_e = p_863_4_ / 57.29578F;
        field_40340_a.field_1407_d = p_863_5_ / 57.29578F;
        field_40339_c.field_1409_b = 3F;
        field_40339_c.field_1408_c = -1F;
        field_40339_c.field_1407_d = -0.75F;
        field_40336_d.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.4F * p_863_2_ * 0.5F;
        field_40337_e.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.4F * p_863_2_ * 0.5F;
        field_40336_d.field_1406_e = 0.0F;
        field_40337_e.field_1406_e = 0.0F;
    }
}
