// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.io.InputStream;
import net.minecraft.client.Minecraft;

public abstract class TexturePackBase
{

    public String field_6487_a;
    public String field_6486_b;
    public String field_6489_c;
    public String field_6488_d;

    public TexturePackBase()
    {
    }

    public void func_6482_a()
    {
    }

    public void func_6480_b()
    {
    }

    public void func_6485_a(Minecraft minecraft)
        throws IOException
    {
    }

    public void func_6484_b(Minecraft minecraft)
    {
    }

    public void func_6483_c(Minecraft minecraft)
    {
    }

    public InputStream func_6481_a(String p_6481_1_)
    {
        return (net.minecraft.src.TexturePackBase.class).getResourceAsStream(p_6481_1_);
    }
}
