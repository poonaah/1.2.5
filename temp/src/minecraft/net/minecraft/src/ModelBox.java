// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PositionTextureVertex, TexturedQuad, ModelRenderer, Tessellator

public class ModelBox
{

    private PositionTextureVertex field_40679_h[];
    private TexturedQuad field_40680_i[];
    public final float field_40678_a;
    public final float field_40676_b;
    public final float field_40677_c;
    public final float field_40674_d;
    public final float field_40675_e;
    public final float field_40672_f;
    public String field_40673_g;

    public ModelBox(ModelRenderer p_i435_1_, int p_i435_2_, int p_i435_3_, float p_i435_4_, float p_i435_5_, float p_i435_6_, int p_i435_7_, 
            int p_i435_8_, int p_i435_9_, float p_i435_10_)
    {
        field_40678_a = p_i435_4_;
        field_40676_b = p_i435_5_;
        field_40677_c = p_i435_6_;
        field_40674_d = p_i435_4_ + (float)p_i435_7_;
        field_40675_e = p_i435_5_ + (float)p_i435_8_;
        field_40672_f = p_i435_6_ + (float)p_i435_9_;
        field_40679_h = new PositionTextureVertex[8];
        field_40680_i = new TexturedQuad[6];
        float f = p_i435_4_ + (float)p_i435_7_;
        float f1 = p_i435_5_ + (float)p_i435_8_;
        float f2 = p_i435_6_ + (float)p_i435_9_;
        p_i435_4_ -= p_i435_10_;
        p_i435_5_ -= p_i435_10_;
        p_i435_6_ -= p_i435_10_;
        f += p_i435_10_;
        f1 += p_i435_10_;
        f2 += p_i435_10_;
        if(p_i435_1_.field_1404_g)
        {
            float f3 = f;
            f = p_i435_4_;
            p_i435_4_ = f3;
        }
        PositionTextureVertex positiontexturevertex = new PositionTextureVertex(p_i435_4_, p_i435_5_, p_i435_6_, 0.0F, 0.0F);
        PositionTextureVertex positiontexturevertex1 = new PositionTextureVertex(f, p_i435_5_, p_i435_6_, 0.0F, 8F);
        PositionTextureVertex positiontexturevertex2 = new PositionTextureVertex(f, f1, p_i435_6_, 8F, 8F);
        PositionTextureVertex positiontexturevertex3 = new PositionTextureVertex(p_i435_4_, f1, p_i435_6_, 8F, 0.0F);
        PositionTextureVertex positiontexturevertex4 = new PositionTextureVertex(p_i435_4_, p_i435_5_, f2, 0.0F, 0.0F);
        PositionTextureVertex positiontexturevertex5 = new PositionTextureVertex(f, p_i435_5_, f2, 0.0F, 8F);
        PositionTextureVertex positiontexturevertex6 = new PositionTextureVertex(f, f1, f2, 8F, 8F);
        PositionTextureVertex positiontexturevertex7 = new PositionTextureVertex(p_i435_4_, f1, f2, 8F, 0.0F);
        field_40679_h[0] = positiontexturevertex;
        field_40679_h[1] = positiontexturevertex1;
        field_40679_h[2] = positiontexturevertex2;
        field_40679_h[3] = positiontexturevertex3;
        field_40679_h[4] = positiontexturevertex4;
        field_40679_h[5] = positiontexturevertex5;
        field_40679_h[6] = positiontexturevertex6;
        field_40679_h[7] = positiontexturevertex7;
        field_40680_i[0] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex5, positiontexturevertex1, positiontexturevertex2, positiontexturevertex6
        }, p_i435_2_ + p_i435_9_ + p_i435_7_, p_i435_3_ + p_i435_9_, p_i435_2_ + p_i435_9_ + p_i435_7_ + p_i435_9_, p_i435_3_ + p_i435_9_ + p_i435_8_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        field_40680_i[1] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex, positiontexturevertex4, positiontexturevertex7, positiontexturevertex3
        }, p_i435_2_, p_i435_3_ + p_i435_9_, p_i435_2_ + p_i435_9_, p_i435_3_ + p_i435_9_ + p_i435_8_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        field_40680_i[2] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex5, positiontexturevertex4, positiontexturevertex, positiontexturevertex1
        }, p_i435_2_ + p_i435_9_, p_i435_3_, p_i435_2_ + p_i435_9_ + p_i435_7_, p_i435_3_ + p_i435_9_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        field_40680_i[3] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex2, positiontexturevertex3, positiontexturevertex7, positiontexturevertex6
        }, p_i435_2_ + p_i435_9_ + p_i435_7_, p_i435_3_ + p_i435_9_, p_i435_2_ + p_i435_9_ + p_i435_7_ + p_i435_7_, p_i435_3_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        field_40680_i[4] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex1, positiontexturevertex, positiontexturevertex3, positiontexturevertex2
        }, p_i435_2_ + p_i435_9_, p_i435_3_ + p_i435_9_, p_i435_2_ + p_i435_9_ + p_i435_7_, p_i435_3_ + p_i435_9_ + p_i435_8_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        field_40680_i[5] = new TexturedQuad(new PositionTextureVertex[] {
            positiontexturevertex4, positiontexturevertex5, positiontexturevertex6, positiontexturevertex7
        }, p_i435_2_ + p_i435_9_ + p_i435_7_ + p_i435_9_, p_i435_3_ + p_i435_9_, p_i435_2_ + p_i435_9_ + p_i435_7_ + p_i435_9_ + p_i435_7_, p_i435_3_ + p_i435_9_ + p_i435_8_, p_i435_1_.field_35971_a, p_i435_1_.field_35970_b);
        if(p_i435_1_.field_1404_g)
        {
            for(int i = 0; i < field_40680_i.length; i++)
            {
                field_40680_i[i].func_809_a();
            }

        }
    }

    public void func_40670_a(Tessellator p_40670_1_, float p_40670_2_)
    {
        for(int i = 0; i < field_40680_i.length; i++)
        {
            field_40680_i[i].func_808_a(p_40670_1_, p_40670_2_);
        }

    }

    public ModelBox func_40671_a(String p_40671_1_)
    {
        field_40673_g = p_40671_1_;
        return this;
    }
}
