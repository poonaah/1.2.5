// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class GameWindowListener extends WindowAdapter
{

    final Minecraft field_1587_a; /* synthetic field */
    final Thread field_1586_b; /* synthetic field */

    public GameWindowListener(Minecraft p_i358_1_, Thread p_i358_2_)
    {
        field_1587_a = p_i358_1_;
        field_1586_b = p_i358_2_;
        super();
    }

    public void windowClosing(WindowEvent p_windowClosing_1_)
    {
        field_1587_a.func_6244_d();
        try
        {
            field_1586_b.join();
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        System.exit(0);
    }
}
