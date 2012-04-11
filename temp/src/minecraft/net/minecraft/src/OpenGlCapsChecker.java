// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;

public class OpenGlCapsChecker
{

    private static boolean field_1770_a = true;

    public OpenGlCapsChecker()
    {
    }

    public static boolean func_1213_a()
    {
        return field_1770_a && GLContext.getCapabilities().GL_ARB_occlusion_query;
    }

}
