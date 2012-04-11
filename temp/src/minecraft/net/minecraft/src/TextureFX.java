// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderEngine

public class TextureFX
{

    public byte field_1127_a[];
    public int field_1126_b;
    public boolean field_1131_c;
    public int field_1130_d;
    public int field_1129_e;
    public int field_1128_f;

    public TextureFX(int p_i616_1_)
    {
        field_1127_a = new byte[1024];
        field_1131_c = false;
        field_1130_d = 0;
        field_1129_e = 1;
        field_1128_f = 0;
        field_1126_b = p_i616_1_;
    }

    public void func_783_a()
    {
    }

    public void func_782_a(RenderEngine p_782_1_)
    {
        if(field_1128_f == 0)
        {
            GL11.glBindTexture(3553, p_782_1_.func_1070_a("/terrain.png"));
        } else
        if(field_1128_f == 1)
        {
            GL11.glBindTexture(3553, p_782_1_.func_1070_a("/gui/items.png"));
        }
    }
}
