// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelQuadruped, ModelRenderer, EntitySheep, EntityLiving

public class ModelSheep2 extends ModelQuadruped
{

    private float field_44017_o;

    public ModelSheep2()
    {
        super(12, 0.0F);
        field_1266_d = new ModelRenderer(this, 0, 0);
        field_1266_d.func_923_a(-3F, -4F, -6F, 6, 6, 8, 0.0F);
        field_1266_d.func_925_a(0.0F, 6F, -8F);
        field_1265_e = new ModelRenderer(this, 28, 8);
        field_1265_e.func_923_a(-4F, -10F, -7F, 8, 16, 6, 0.0F);
        field_1265_e.func_925_a(0.0F, 5F, 2.0F);
    }

    public void func_25103_a(EntityLiving p_25103_1_, float p_25103_2_, float p_25103_3_, float p_25103_4_)
    {
        super.func_25103_a(p_25103_1_, p_25103_2_, p_25103_3_, p_25103_4_);
        field_1266_d.field_1409_b = 6F + ((EntitySheep)p_25103_1_).func_44003_c(p_25103_4_) * 9F;
        field_44017_o = ((EntitySheep)p_25103_1_).func_44002_d(p_25103_4_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        super.func_863_a(p_863_1_, p_863_2_, p_863_3_, p_863_4_, p_863_5_, p_863_6_);
        field_1266_d.field_1407_d = field_44017_o;
    }
}
