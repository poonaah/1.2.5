// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerDispenser, StatCollector, FontRenderer, 
//            RenderEngine, InventoryPlayer, TileEntityDispenser

public class GuiDispenser extends GuiContainer
{

    public GuiDispenser(InventoryPlayer p_i314_1_, TileEntityDispenser p_i314_2_)
    {
        super(new ContainerDispenser(p_i314_1_, p_i314_2_));
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.dispenser"), 60, 6, 0x404040);
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.inventory"), 8, (field_974_h - 96) + 2, 0x404040);
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/trap.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
    }
}
