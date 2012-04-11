// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerFurnace, StatCollector, FontRenderer, 
//            RenderEngine, TileEntityFurnace, InventoryPlayer

public class GuiFurnace extends GuiContainer
{

    private TileEntityFurnace field_978_j;

    public GuiFurnace(InventoryPlayer p_i422_1_, TileEntityFurnace p_i422_2_)
    {
        super(new ContainerFurnace(p_i422_1_, p_i422_2_));
        field_978_j = p_i422_2_;
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.furnace"), 60, 6, 0x404040);
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.inventory"), 8, (field_974_h - 96) + 2, 0x404040);
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/furnace.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
        if(field_978_j.func_485_a())
        {
            int l = field_978_j.func_489_b(12);
            func_550_b(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        int i1 = field_978_j.func_490_a(24);
        func_550_b(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }
}
