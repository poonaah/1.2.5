// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, EntityIronGolem, Entity, 
//            EntityLiving

public class ModelIronGolem extends ModelBase
{

    public ModelRenderer field_48234_a;
    public ModelRenderer field_48232_b;
    public ModelRenderer field_48233_c;
    public ModelRenderer field_48230_d;
    public ModelRenderer field_48231_e;
    public ModelRenderer field_48229_f;

    public ModelIronGolem()
    {
        this(0.0F);
    }

    public ModelIronGolem(float p_i1067_1_)
    {
        this(p_i1067_1_, -7F);
    }

    public ModelIronGolem(float p_i1068_1_, float p_i1068_2_)
    {
        char c = '\200';
        char c1 = '\200';
        field_48234_a = (new ModelRenderer(this)).func_35968_a(c, c1);
        field_48234_a.func_925_a(0.0F, 0.0F + p_i1068_2_, -2F);
        field_48234_a.func_40602_a(0, 0).func_923_a(-4F, -12F, -5.5F, 8, 10, 8, p_i1068_1_);
        field_48234_a.func_40602_a(24, 0).func_923_a(-1F, -5F, -7.5F, 2, 4, 2, p_i1068_1_);
        field_48232_b = (new ModelRenderer(this)).func_35968_a(c, c1);
        field_48232_b.func_925_a(0.0F, 0.0F + p_i1068_2_, 0.0F);
        field_48232_b.func_40602_a(0, 40).func_923_a(-9F, -2F, -6F, 18, 12, 11, p_i1068_1_);
        field_48232_b.func_40602_a(0, 70).func_923_a(-4.5F, 10F, -3F, 9, 5, 6, p_i1068_1_ + 0.5F);
        field_48233_c = (new ModelRenderer(this)).func_35968_a(c, c1);
        field_48233_c.func_925_a(0.0F, -7F, 0.0F);
        field_48233_c.func_40602_a(60, 21).func_923_a(-13F, -2.5F, -3F, 4, 30, 6, p_i1068_1_);
        field_48230_d = (new ModelRenderer(this)).func_35968_a(c, c1);
        field_48230_d.func_925_a(0.0F, -7F, 0.0F);
        field_48230_d.func_40602_a(60, 58).func_923_a(9F, -2.5F, -3F, 4, 30, 6, p_i1068_1_);
        field_48231_e = (new ModelRenderer(this, 0, 22)).func_35968_a(c, c1);
        field_48231_e.func_925_a(-4F, 18F + p_i1068_2_, 0.0F);
        field_48231_e.func_40602_a(37, 0).func_923_a(-3.5F, -3F, -3F, 6, 16, 5, p_i1068_1_);
        field_48229_f = (new ModelRenderer(this, 0, 22)).func_35968_a(c, c1);
        field_48229_f.field_1404_g = true;
        field_48229_f.func_40602_a(60, 0).func_925_a(5F, 18F + p_i1068_2_, 0.0F);
        field_48229_f.func_923_a(-3.5F, -3F, -3F, 6, 16, 5, p_i1068_1_);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_48234_a.func_922_a(p_864_7_);
        field_48232_b.func_922_a(p_864_7_);
        field_48231_e.func_922_a(p_864_7_);
        field_48229_f.func_922_a(p_864_7_);
        field_48233_c.func_922_a(p_864_7_);
        field_48230_d.func_922_a(p_864_7_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_48234_a.field_1406_e = p_863_4_ / 57.29578F;
        field_48234_a.field_1407_d = p_863_5_ / 57.29578F;
        field_48231_e.field_1407_d = -1.5F * func_48228_a(p_863_1_, 13F) * p_863_2_;
        field_48229_f.field_1407_d = 1.5F * func_48228_a(p_863_1_, 13F) * p_863_2_;
        field_48231_e.field_1406_e = 0.0F;
        field_48229_f.field_1406_e = 0.0F;
    }

    public void func_25103_a(EntityLiving p_25103_1_, float p_25103_2_, float p_25103_3_, float p_25103_4_)
    {
        EntityIronGolem entityirongolem = (EntityIronGolem)p_25103_1_;
        int i = entityirongolem.func_48114_ab();
        if(i > 0)
        {
            field_48233_c.field_1407_d = -2F + 1.5F * func_48228_a((float)i - p_25103_4_, 10F);
            field_48230_d.field_1407_d = -2F + 1.5F * func_48228_a((float)i - p_25103_4_, 10F);
        } else
        {
            int j = entityirongolem.func_48117_D_();
            if(j > 0)
            {
                field_48233_c.field_1407_d = -0.8F + 0.025F * func_48228_a(j, 70F);
                field_48230_d.field_1407_d = 0.0F;
            } else
            {
                field_48233_c.field_1407_d = (-0.2F + 1.5F * func_48228_a(p_25103_2_, 13F)) * p_25103_3_;
                field_48230_d.field_1407_d = (-0.2F - 1.5F * func_48228_a(p_25103_2_, 13F)) * p_25103_3_;
            }
        }
    }

    private float func_48228_a(float p_48228_1_, float p_48228_2_)
    {
        return (Math.abs(p_48228_1_ % p_48228_2_ - p_48228_2_ * 0.5F) - p_48228_2_ * 0.25F) / (p_48228_2_ * 0.25F);
    }
}
