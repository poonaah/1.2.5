// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerBrewingStand, StatCollector, FontRenderer, 
//            RenderEngine, TileEntityBrewingStand, InventoryPlayer

public class GuiBrewingStand extends GuiContainer
{

    private TileEntityBrewingStand field_40217_h;

    public GuiBrewingStand(InventoryPlayer p_i354_1_, TileEntityBrewingStand p_i354_2_)
    {
        super(new ContainerBrewingStand(p_i354_1_, p_i354_2_));
        field_40217_h = p_i354_2_;
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.brewing"), 56, 6, 0x404040);
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.inventory"), 8, (field_974_h - 96) + 2, 0x404040);
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/alchemy.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
        int l = field_40217_h.func_40053_g();
        if(l > 0)
        {
            int i1 = (int)(28F * (1.0F - (float)l / 400F));
            if(i1 > 0)
            {
                func_550_b(j + 97, k + 16, 176, 0, 9, i1);
            }
            int j1 = (l / 2) % 7;
            switch(j1)
            {
            case 6: // '\006'
                i1 = 0;
                break;

            case 5: // '\005'
                i1 = 6;
                break;

            case 4: // '\004'
                i1 = 11;
                break;

            case 3: // '\003'
                i1 = 16;
                break;

            case 2: // '\002'
                i1 = 20;
                break;

            case 1: // '\001'
                i1 = 24;
                break;

            case 0: // '\0'
                i1 = 29;
                break;
            }
            if(i1 > 0)
            {
                func_550_b(j + 65, (k + 14 + 29) - i1, 185, 29 - i1, 12, i1);
            }
        }
    }
}
