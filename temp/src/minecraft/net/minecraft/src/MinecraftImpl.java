// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

// Referenced classes of package net.minecraft.src:
//            PanelCrashReport, UnexpectedThrowable

public final class MinecraftImpl extends Minecraft
{

    final Frame field_20919_a; /* synthetic field */

    public MinecraftImpl(Component p_i361_1_, Canvas p_i361_2_, MinecraftApplet p_i361_3_, int p_i361_4_, int p_i361_5_, boolean p_i361_6_, Frame p_i361_7_)
    {
        field_20919_a = p_i361_7_;
        super(p_i361_1_, p_i361_2_, p_i361_3_, p_i361_4_, p_i361_5_, p_i361_6_);
    }

    public void func_4007_a(UnexpectedThrowable p_4007_1_)
    {
        field_20919_a.removeAll();
        field_20919_a.add(new PanelCrashReport(p_4007_1_), "Center");
        field_20919_a.validate();
    }
}
