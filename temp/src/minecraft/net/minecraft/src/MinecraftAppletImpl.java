// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

// Referenced classes of package net.minecraft.src:
//            PanelCrashReport, UnexpectedThrowable

public class MinecraftAppletImpl extends Minecraft
{

    final MinecraftApplet field_186_a; /* synthetic field */

    public MinecraftAppletImpl(MinecraftApplet p_i485_1_, Component p_i485_2_, Canvas p_i485_3_, MinecraftApplet p_i485_4_, int p_i485_5_, int p_i485_6_, boolean p_i485_7_)
    {
        field_186_a = p_i485_1_;
        super(p_i485_2_, p_i485_3_, p_i485_4_, p_i485_5_, p_i485_6_, p_i485_7_);
    }

    public void func_4007_a(UnexpectedThrowable p_4007_1_)
    {
        field_186_a.removeAll();
        field_186_a.setLayout(new BorderLayout());
        field_186_a.add(new PanelCrashReport(p_4007_1_), "Center");
        field_186_a.validate();
    }
}
