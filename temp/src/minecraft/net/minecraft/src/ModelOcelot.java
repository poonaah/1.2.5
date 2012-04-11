// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, EntityOcelot, 
//            Entity, EntityLiving

public class ModelOcelot extends ModelBase
{

    ModelRenderer field_48225_a;
    ModelRenderer field_48223_b;
    ModelRenderer field_48224_c;
    ModelRenderer field_48221_d;
    ModelRenderer field_48222_e;
    ModelRenderer field_48219_f;
    ModelRenderer field_48220_g;
    ModelRenderer field_48226_n;
    int field_48227_o;

    public ModelOcelot()
    {
        field_48227_o = 1;
        func_40298_a("head.main", 0, 0);
        func_40298_a("head.nose", 0, 24);
        func_40298_a("head.ear1", 0, 10);
        func_40298_a("head.ear2", 6, 10);
        field_48220_g = new ModelRenderer(this, "head");
        field_48220_g.func_40603_a("main", -2.5F, -2F, -3F, 5, 4, 5);
        field_48220_g.func_40603_a("nose", -1.5F, 0.0F, -4F, 3, 2, 2);
        field_48220_g.func_40603_a("ear1", -2F, -3F, 0.0F, 1, 1, 2);
        field_48220_g.func_40603_a("ear2", 1.0F, -3F, 0.0F, 1, 1, 2);
        field_48220_g.func_925_a(0.0F, 15F, -9F);
        field_48226_n = new ModelRenderer(this, 20, 0);
        field_48226_n.func_923_a(-2F, 3F, -8F, 4, 16, 6, 0.0F);
        field_48226_n.func_925_a(0.0F, 12F, -10F);
        field_48222_e = new ModelRenderer(this, 0, 15);
        field_48222_e.func_40604_a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
        field_48222_e.field_1407_d = 0.9F;
        field_48222_e.func_925_a(0.0F, 15F, 8F);
        field_48219_f = new ModelRenderer(this, 4, 15);
        field_48219_f.func_40604_a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
        field_48219_f.func_925_a(0.0F, 20F, 14F);
        field_48225_a = new ModelRenderer(this, 8, 13);
        field_48225_a.func_40604_a(-1F, 0.0F, 1.0F, 2, 6, 2);
        field_48225_a.func_925_a(1.1F, 18F, 5F);
        field_48223_b = new ModelRenderer(this, 8, 13);
        field_48223_b.func_40604_a(-1F, 0.0F, 1.0F, 2, 6, 2);
        field_48223_b.func_925_a(-1.1F, 18F, 5F);
        field_48224_c = new ModelRenderer(this, 40, 0);
        field_48224_c.func_40604_a(-1F, 0.0F, 0.0F, 2, 10, 2);
        field_48224_c.func_925_a(1.2F, 13.8F, -5F);
        field_48221_d = new ModelRenderer(this, 40, 0);
        field_48221_d.func_40604_a(-1F, 0.0F, 0.0F, 2, 10, 2);
        field_48221_d.func_925_a(-1.2F, 13.8F, -5F);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        if(field_40301_k)
        {
            float f = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f, 1.5F / f, 1.5F / f);
            GL11.glTranslatef(0.0F, 10F * p_864_7_, 4F * p_864_7_);
            field_48220_g.func_922_a(p_864_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
            GL11.glTranslatef(0.0F, 24F * p_864_7_, 0.0F);
            field_48226_n.func_922_a(p_864_7_);
            field_48225_a.func_922_a(p_864_7_);
            field_48223_b.func_922_a(p_864_7_);
            field_48224_c.func_922_a(p_864_7_);
            field_48221_d.func_922_a(p_864_7_);
            field_48222_e.func_922_a(p_864_7_);
            field_48219_f.func_922_a(p_864_7_);
            GL11.glPopMatrix();
        } else
        {
            field_48220_g.func_922_a(p_864_7_);
            field_48226_n.func_922_a(p_864_7_);
            field_48222_e.func_922_a(p_864_7_);
            field_48219_f.func_922_a(p_864_7_);
            field_48225_a.func_922_a(p_864_7_);
            field_48223_b.func_922_a(p_864_7_);
            field_48224_c.func_922_a(p_864_7_);
            field_48221_d.func_922_a(p_864_7_);
        }
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_48220_g.field_1407_d = p_863_5_ / 57.29578F;
        field_48220_g.field_1406_e = p_863_4_ / 57.29578F;
        if(field_48227_o != 3)
        {
            field_48226_n.field_1407_d = 1.570796F;
            if(field_48227_o == 2)
            {
                field_48225_a.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.0F * p_863_2_;
                field_48223_b.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 0.3F) * 1.0F * p_863_2_;
                field_48224_c.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F + 0.3F) * 1.0F * p_863_2_;
                field_48221_d.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.0F * p_863_2_;
                field_48219_f.field_1407_d = 1.727876F + 0.3141593F * MathHelper.func_1114_b(p_863_1_) * p_863_2_;
            } else
            {
                field_48225_a.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.0F * p_863_2_;
                field_48223_b.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.0F * p_863_2_;
                field_48224_c.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.0F * p_863_2_;
                field_48221_d.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.0F * p_863_2_;
                if(field_48227_o == 1)
                {
                    field_48219_f.field_1407_d = 1.727876F + 0.7853982F * MathHelper.func_1114_b(p_863_1_) * p_863_2_;
                } else
                {
                    field_48219_f.field_1407_d = 1.727876F + 0.4712389F * MathHelper.func_1114_b(p_863_1_) * p_863_2_;
                }
            }
        }
    }

    public void func_25103_a(EntityLiving p_25103_1_, float p_25103_2_, float p_25103_3_, float p_25103_4_)
    {
        EntityOcelot entityocelot = (EntityOcelot)p_25103_1_;
        field_48226_n.field_1409_b = 12F;
        field_48226_n.field_1408_c = -10F;
        field_48220_g.field_1409_b = 15F;
        field_48220_g.field_1408_c = -9F;
        field_48222_e.field_1409_b = 15F;
        field_48222_e.field_1408_c = 8F;
        field_48219_f.field_1409_b = 20F;
        field_48219_f.field_1408_c = 14F;
        field_48224_c.field_1409_b = field_48221_d.field_1409_b = 13.8F;
        field_48224_c.field_1408_c = field_48221_d.field_1408_c = -5F;
        field_48225_a.field_1409_b = field_48223_b.field_1409_b = 18F;
        field_48225_a.field_1408_c = field_48223_b.field_1408_c = 5F;
        field_48222_e.field_1407_d = 0.9F;
        if(entityocelot.func_381_o())
        {
            field_48226_n.field_1409_b++;
            field_48220_g.field_1409_b += 2.0F;
            field_48222_e.field_1409_b++;
            field_48219_f.field_1409_b += -4F;
            field_48219_f.field_1408_c += 2.0F;
            field_48222_e.field_1407_d = 1.570796F;
            field_48219_f.field_1407_d = 1.570796F;
            field_48227_o = 0;
        } else
        if(entityocelot.func_35117_Q())
        {
            field_48219_f.field_1409_b = field_48222_e.field_1409_b;
            field_48219_f.field_1408_c += 2.0F;
            field_48222_e.field_1407_d = 1.570796F;
            field_48219_f.field_1407_d = 1.570796F;
            field_48227_o = 2;
        } else
        if(entityocelot.func_48141_af())
        {
            field_48226_n.field_1407_d = 0.7853982F;
            field_48226_n.field_1409_b += -4F;
            field_48226_n.field_1408_c += 5F;
            field_48220_g.field_1409_b += -3.3F;
            field_48220_g.field_1408_c++;
            field_48222_e.field_1409_b += 8F;
            field_48222_e.field_1408_c += -2F;
            field_48219_f.field_1409_b += 2.0F;
            field_48219_f.field_1408_c += -0.8F;
            field_48222_e.field_1407_d = 1.727876F;
            field_48219_f.field_1407_d = 2.670354F;
            field_48224_c.field_1407_d = field_48221_d.field_1407_d = -0.1570796F;
            field_48224_c.field_1409_b = field_48221_d.field_1409_b = 15.8F;
            field_48224_c.field_1408_c = field_48221_d.field_1408_c = -7F;
            field_48225_a.field_1407_d = field_48223_b.field_1407_d = -1.570796F;
            field_48225_a.field_1409_b = field_48223_b.field_1409_b = 21F;
            field_48225_a.field_1408_c = field_48223_b.field_1408_c = 1.0F;
            field_48227_o = 3;
        } else
        {
            field_48227_o = 1;
        }
    }
}
