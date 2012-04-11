// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, TextureOffset, ModelBox, GLAllocation, 
//            Tessellator

public class ModelRenderer
{

    public float field_35971_a;
    public float field_35970_b;
    private int field_1399_l;
    private int field_1398_m;
    public float field_1410_a;
    public float field_1409_b;
    public float field_1408_c;
    public float field_1407_d;
    public float field_1406_e;
    public float field_1405_f;
    private boolean field_1397_n;
    private int field_1396_o;
    public boolean field_1404_g;
    public boolean field_1403_h;
    public boolean field_1402_i;
    public List field_40606_l;
    public List field_40607_m;
    public final String field_40605_n;
    private ModelBase field_40608_s;

    public ModelRenderer(ModelBase p_i554_1_, String p_i554_2_)
    {
        field_35971_a = 64F;
        field_35970_b = 32F;
        field_1397_n = false;
        field_1396_o = 0;
        field_1404_g = false;
        field_1403_h = true;
        field_1402_i = false;
        field_40606_l = new ArrayList();
        field_40608_s = p_i554_1_;
        p_i554_1_.field_35394_j.add(this);
        field_40605_n = p_i554_2_;
        func_35968_a(p_i554_1_.field_40299_l, p_i554_1_.field_40300_m);
    }

    public ModelRenderer(ModelBase p_i555_1_)
    {
        this(p_i555_1_, null);
    }

    public ModelRenderer(ModelBase p_i556_1_, int p_i556_2_, int p_i556_3_)
    {
        this(p_i556_1_);
        func_40602_a(p_i556_2_, p_i556_3_);
    }

    public void func_35969_a(ModelRenderer p_35969_1_)
    {
        if(field_40607_m == null)
        {
            field_40607_m = new ArrayList();
        }
        field_40607_m.add(p_35969_1_);
    }

    public ModelRenderer func_40602_a(int p_40602_1_, int p_40602_2_)
    {
        field_1399_l = p_40602_1_;
        field_1398_m = p_40602_2_;
        return this;
    }

    public ModelRenderer func_40603_a(String p_40603_1_, float p_40603_2_, float p_40603_3_, float p_40603_4_, int p_40603_5_, int p_40603_6_, int p_40603_7_)
    {
        p_40603_1_ = (new StringBuilder()).append(field_40605_n).append(".").append(p_40603_1_).toString();
        TextureOffset textureoffset = field_40608_s.func_40297_a(p_40603_1_);
        func_40602_a(textureoffset.field_40734_a, textureoffset.field_40733_b);
        field_40606_l.add((new ModelBox(this, field_1399_l, field_1398_m, p_40603_2_, p_40603_3_, p_40603_4_, p_40603_5_, p_40603_6_, p_40603_7_, 0.0F)).func_40671_a(p_40603_1_));
        return this;
    }

    public ModelRenderer func_40604_a(float p_40604_1_, float p_40604_2_, float p_40604_3_, int p_40604_4_, int p_40604_5_, int p_40604_6_)
    {
        field_40606_l.add(new ModelBox(this, field_1399_l, field_1398_m, p_40604_1_, p_40604_2_, p_40604_3_, p_40604_4_, p_40604_5_, p_40604_6_, 0.0F));
        return this;
    }

    public void func_923_a(float p_923_1_, float p_923_2_, float p_923_3_, int p_923_4_, int p_923_5_, int p_923_6_, float p_923_7_)
    {
        field_40606_l.add(new ModelBox(this, field_1399_l, field_1398_m, p_923_1_, p_923_2_, p_923_3_, p_923_4_, p_923_5_, p_923_6_, p_923_7_));
    }

    public void func_925_a(float p_925_1_, float p_925_2_, float p_925_3_)
    {
        field_1410_a = p_925_1_;
        field_1409_b = p_925_2_;
        field_1408_c = p_925_3_;
    }

    public void func_922_a(float p_922_1_)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!field_1397_n)
        {
            func_924_c(p_922_1_);
        }
        if(field_1407_d != 0.0F || field_1406_e != 0.0F || field_1405_f != 0.0F)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(field_1410_a * p_922_1_, field_1409_b * p_922_1_, field_1408_c * p_922_1_);
            if(field_1405_f != 0.0F)
            {
                GL11.glRotatef(field_1405_f * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(field_1406_e != 0.0F)
            {
                GL11.glRotatef(field_1406_e * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(field_1407_d != 0.0F)
            {
                GL11.glRotatef(field_1407_d * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
            GL11.glCallList(field_1396_o);
            if(field_40607_m != null)
            {
                for(int i = 0; i < field_40607_m.size(); i++)
                {
                    ((ModelRenderer)field_40607_m.get(i)).func_922_a(p_922_1_);
                }

            }
            GL11.glPopMatrix();
        } else
        if(field_1410_a != 0.0F || field_1409_b != 0.0F || field_1408_c != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * p_922_1_, field_1409_b * p_922_1_, field_1408_c * p_922_1_);
            GL11.glCallList(field_1396_o);
            if(field_40607_m != null)
            {
                for(int j = 0; j < field_40607_m.size(); j++)
                {
                    ((ModelRenderer)field_40607_m.get(j)).func_922_a(p_922_1_);
                }

            }
            GL11.glTranslatef(-field_1410_a * p_922_1_, -field_1409_b * p_922_1_, -field_1408_c * p_922_1_);
        } else
        {
            GL11.glCallList(field_1396_o);
            if(field_40607_m != null)
            {
                for(int k = 0; k < field_40607_m.size(); k++)
                {
                    ((ModelRenderer)field_40607_m.get(k)).func_922_a(p_922_1_);
                }

            }
        }
    }

    public void func_25122_b(float p_25122_1_)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!field_1397_n)
        {
            func_924_c(p_25122_1_);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(field_1410_a * p_25122_1_, field_1409_b * p_25122_1_, field_1408_c * p_25122_1_);
        if(field_1406_e != 0.0F)
        {
            GL11.glRotatef(field_1406_e * 57.29578F, 0.0F, 1.0F, 0.0F);
        }
        if(field_1407_d != 0.0F)
        {
            GL11.glRotatef(field_1407_d * 57.29578F, 1.0F, 0.0F, 0.0F);
        }
        if(field_1405_f != 0.0F)
        {
            GL11.glRotatef(field_1405_f * 57.29578F, 0.0F, 0.0F, 1.0F);
        }
        GL11.glCallList(field_1396_o);
        GL11.glPopMatrix();
    }

    public void func_926_b(float p_926_1_)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!field_1397_n)
        {
            func_924_c(p_926_1_);
        }
        if(field_1407_d != 0.0F || field_1406_e != 0.0F || field_1405_f != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * p_926_1_, field_1409_b * p_926_1_, field_1408_c * p_926_1_);
            if(field_1405_f != 0.0F)
            {
                GL11.glRotatef(field_1405_f * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(field_1406_e != 0.0F)
            {
                GL11.glRotatef(field_1406_e * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(field_1407_d != 0.0F)
            {
                GL11.glRotatef(field_1407_d * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
        } else
        if(field_1410_a != 0.0F || field_1409_b != 0.0F || field_1408_c != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * p_926_1_, field_1409_b * p_926_1_, field_1408_c * p_926_1_);
        }
    }

    private void func_924_c(float p_924_1_)
    {
        field_1396_o = GLAllocation.func_1124_a(1);
        GL11.glNewList(field_1396_o, 4864);
        Tessellator tessellator = Tessellator.field_1512_a;
        for(int i = 0; i < field_40606_l.size(); i++)
        {
            ((ModelBox)field_40606_l.get(i)).func_40670_a(tessellator, p_924_1_);
        }

        GL11.glEndList();
        field_1397_n = true;
    }

    public ModelRenderer func_35968_a(int p_35968_1_, int p_35968_2_)
    {
        field_35971_a = p_35968_1_;
        field_35970_b = p_35968_2_;
        return this;
    }
}
