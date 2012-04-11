// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PositionTextureVertex, Vec3D, Tessellator

public class TexturedQuad
{

    public PositionTextureVertex field_1195_a[];
    public int field_1194_b;
    private boolean field_1196_c;

    public TexturedQuad(PositionTextureVertex p_i496_1_[])
    {
        field_1194_b = 0;
        field_1196_c = false;
        field_1195_a = p_i496_1_;
        field_1194_b = p_i496_1_.length;
    }

    public TexturedQuad(PositionTextureVertex p_i497_1_[], int p_i497_2_, int p_i497_3_, int p_i497_4_, int p_i497_5_, float p_i497_6_, float p_i497_7_)
    {
        this(p_i497_1_);
        float f = 0.0F / p_i497_6_;
        float f1 = 0.0F / p_i497_7_;
        p_i497_1_[0] = p_i497_1_[0].func_1115_a((float)p_i497_4_ / p_i497_6_ - f, (float)p_i497_3_ / p_i497_7_ + f1);
        p_i497_1_[1] = p_i497_1_[1].func_1115_a((float)p_i497_2_ / p_i497_6_ + f, (float)p_i497_3_ / p_i497_7_ + f1);
        p_i497_1_[2] = p_i497_1_[2].func_1115_a((float)p_i497_2_ / p_i497_6_ + f, (float)p_i497_5_ / p_i497_7_ - f1);
        p_i497_1_[3] = p_i497_1_[3].func_1115_a((float)p_i497_4_ / p_i497_6_ - f, (float)p_i497_5_ / p_i497_7_ - f1);
    }

    public void func_809_a()
    {
        PositionTextureVertex apositiontexturevertex[] = new PositionTextureVertex[field_1195_a.length];
        for(int i = 0; i < field_1195_a.length; i++)
        {
            apositiontexturevertex[i] = field_1195_a[field_1195_a.length - i - 1];
        }

        field_1195_a = apositiontexturevertex;
    }

    public void func_808_a(Tessellator p_808_1_, float p_808_2_)
    {
        Vec3D vec3d = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[0].field_1655_a);
        Vec3D vec3d1 = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[2].field_1655_a);
        Vec3D vec3d2 = vec3d1.func_1246_b(vec3d).func_1252_b();
        p_808_1_.func_977_b();
        if(field_1196_c)
        {
            p_808_1_.func_980_b(-(float)vec3d2.field_1776_a, -(float)vec3d2.field_1775_b, -(float)vec3d2.field_1779_c);
        } else
        {
            p_808_1_.func_980_b((float)vec3d2.field_1776_a, (float)vec3d2.field_1775_b, (float)vec3d2.field_1779_c);
        }
        for(int i = 0; i < 4; i++)
        {
            PositionTextureVertex positiontexturevertex = field_1195_a[i];
            p_808_1_.func_983_a((float)positiontexturevertex.field_1655_a.field_1776_a * p_808_2_, (float)positiontexturevertex.field_1655_a.field_1775_b * p_808_2_, (float)positiontexturevertex.field_1655_a.field_1779_c * p_808_2_, positiontexturevertex.field_1654_b, positiontexturevertex.field_1656_c);
        }

        p_808_1_.func_982_a();
    }
}
