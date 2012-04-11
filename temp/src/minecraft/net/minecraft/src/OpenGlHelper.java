// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.*;

public class OpenGlHelper
{

    public static int field_40457_a;
    public static int field_40455_b;
    private static boolean field_40456_c = false;

    public OpenGlHelper()
    {
    }

    public static void func_40453_a()
    {
        field_40456_c = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
        if(field_40456_c)
        {
            field_40457_a = 33984;
            field_40455_b = 33985;
        } else
        {
            field_40457_a = 33984;
            field_40455_b = 33985;
        }
    }

    public static void func_40452_a(int p_40452_0_)
    {
        if(field_40456_c)
        {
            ARBMultitexture.glActiveTextureARB(p_40452_0_);
        } else
        {
            GL13.glActiveTexture(p_40452_0_);
        }
    }

    public static void func_40451_b(int p_40451_0_)
    {
        if(field_40456_c)
        {
            ARBMultitexture.glClientActiveTextureARB(p_40451_0_);
        } else
        {
            GL13.glClientActiveTexture(p_40451_0_);
        }
    }

    public static void func_40454_a(int p_40454_0_, float p_40454_1_, float p_40454_2_)
    {
        if(field_40456_c)
        {
            ARBMultitexture.glMultiTexCoord2fARB(p_40454_0_, p_40454_1_, p_40454_2_);
        } else
        {
            GL13.glMultiTexCoord2f(p_40454_0_, p_40454_1_, p_40454_2_);
        }
    }

}
