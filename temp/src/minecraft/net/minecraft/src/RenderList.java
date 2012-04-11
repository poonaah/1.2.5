// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GLAllocation

public class RenderList
{

    private int field_1242_a;
    private int field_1241_b;
    private int field_1240_c;
    private double field_1239_d;
    private double field_1238_e;
    private double field_1237_f;
    private IntBuffer field_1236_g;
    private boolean field_1235_h;
    private boolean field_1234_i;

    public RenderList()
    {
        field_1236_g = GLAllocation.func_1125_c(0x10000);
        field_1235_h = false;
        field_1234_i = false;
    }

    public void func_861_a(int p_861_1_, int p_861_2_, int p_861_3_, double p_861_4_, double p_861_6_, 
            double p_861_8_)
    {
        field_1235_h = true;
        field_1236_g.clear();
        field_1242_a = p_861_1_;
        field_1241_b = p_861_2_;
        field_1240_c = p_861_3_;
        field_1239_d = p_861_4_;
        field_1238_e = p_861_6_;
        field_1237_f = p_861_8_;
    }

    public boolean func_862_a(int p_862_1_, int p_862_2_, int p_862_3_)
    {
        if(!field_1235_h)
        {
            return false;
        } else
        {
            return p_862_1_ == field_1242_a && p_862_2_ == field_1241_b && p_862_3_ == field_1240_c;
        }
    }

    public void func_858_a(int p_858_1_)
    {
        field_1236_g.put(p_858_1_);
        if(field_1236_g.remaining() == 0)
        {
            func_860_a();
        }
    }

    public void func_860_a()
    {
        if(!field_1235_h)
        {
            return;
        }
        if(!field_1234_i)
        {
            field_1236_g.flip();
            field_1234_i = true;
        }
        if(field_1236_g.remaining() > 0)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((double)field_1242_a - field_1239_d), (float)((double)field_1241_b - field_1238_e), (float)((double)field_1240_c - field_1237_f));
            GL11.glCallLists(field_1236_g);
            GL11.glPopMatrix();
        }
    }

    public void func_859_b()
    {
        field_1235_h = false;
        field_1234_i = false;
    }
}
