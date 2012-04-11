// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelQuadruped, ModelRenderer, EntitySheep, EntityLiving

public class ModelSheep1 extends ModelQuadruped
{

    private float field_44016_o;

    public ModelSheep1()
    {
        super(12, 0.0F);
        field_1266_d = new ModelRenderer(this, 0, 0);
        field_1266_d.func_923_a(-3F, -4F, -4F, 6, 6, 6, 0.6F);
        field_1266_d.func_925_a(0.0F, 6F, -8F);
        field_1265_e = new ModelRenderer(this, 28, 8);
        field_1265_e.func_923_a(-4F, -10F, -7F, 8, 16, 6, 1.75F);
        field_1265_e.func_925_a(0.0F, 5F, 2.0F);
        float f = 0.5F;
        field_1264_f = new ModelRenderer(this, 0, 16);
        field_1264_f.func_923_a(-2F, 0.0F, -2F, 4, 6, 4, f);
        field_1264_f.func_925_a(-3F, 12F, 7F);
        field_1263_g = new ModelRenderer(this, 0, 16);
        field_1263_g.func_923_a(-2F, 0.0F, -2F, 4, 6, 4, f);
        field_1263_g.func_925_a(3F, 12F, 7F);
        field_1262_h = new ModelRenderer(this, 0, 16);
        field_1262_h.func_923_a(-2F, 0.0F, -2F, 4, 6, 4, f);
        field_1262_h.func_925_a(-3F, 12F, -5F);
        field_1261_i = new ModelRenderer(this, 0, 16);
        field_1261_i.func_923_a(-2F, 0.0F, -2F, 4, 6, 4, f);
        field_1261_i.func_925_a(3F, 12F, -5F);
    }

    public void func_25103_a(EntityLiving p_25103_1_, float p_25103_2_, float p_25103_3_, float p_25103_4_)
    {
        super.func_25103_a(p_25103_1_, p_25103_2_, p_25103_3_, p_25103_4_);
        field_1266_d.field_1409_b = 6F + ((EntitySheep)p_25103_1_).func_44003_c(p_25103_4_) * 9F;
        field_44016_o = ((EntitySheep)p_25103_1_).func_44002_d(p_25103_4_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        super.func_863_a(p_863_1_, p_863_2_, p_863_3_, p_863_4_, p_863_5_, p_863_6_);
        field_1266_d.field_1407_d = field_44016_o;
    }
}
