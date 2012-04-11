// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerChest, IInventory, StatCollector, 
//            FontRenderer, RenderEngine

public class GuiChest extends GuiContainer
{

    private IInventory field_982_j;
    private IInventory field_981_l;
    private int field_980_m;

    public GuiChest(IInventory p_i721_1_, IInventory p_i721_2_)
    {
        super(new ContainerChest(p_i721_1_, p_i721_2_));
        field_980_m = 0;
        field_982_j = p_i721_1_;
        field_981_l = p_i721_2_;
        field_948_f = false;
        char c = '\336';
        int i = c - 108;
        field_980_m = p_i721_2_.func_469_c() / 9;
        field_974_h = i + field_980_m * 18;
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a(field_981_l.func_471_d()), 8, 6, 0x404040);
        field_6451_g.func_873_b(StatCollector.func_25200_a(field_982_j.func_471_d()), 8, (field_974_h - 96) + 2, 0x404040);
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/container.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_980_m * 18 + 17);
        func_550_b(j, k + field_980_m * 18 + 17, 0, 126, field_971_a, 96);
    }
}
