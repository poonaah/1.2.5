// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiButton, GameSettings, EnumOptions

public class GuiSlider extends GuiButton
{

    public float field_944_i;
    public boolean field_943_j;
    private EnumOptions field_942_l;

    public GuiSlider(int p_i173_1_, int p_i173_2_, int p_i173_3_, EnumOptions p_i173_4_, String p_i173_5_, float p_i173_6_)
    {
        super(p_i173_1_, p_i173_2_, p_i173_3_, 150, 20, p_i173_5_);
        field_944_i = 1.0F;
        field_943_j = false;
        field_942_l = null;
        field_942_l = p_i173_4_;
        field_944_i = p_i173_6_;
    }

    protected int func_558_a(boolean p_558_1_)
    {
        return 0;
    }

    protected void func_560_b(Minecraft p_560_1_, int p_560_2_, int p_560_3_)
    {
        if(!field_936_h)
        {
            return;
        }
        if(field_943_j)
        {
            field_944_i = (float)(p_560_2_ - (field_941_c + 4)) / (float)(field_52008_a - 8);
            if(field_944_i < 0.0F)
            {
                field_944_i = 0.0F;
            }
            if(field_944_i > 1.0F)
            {
                field_944_i = 1.0F;
            }
            p_560_1_.field_6304_y.func_1048_a(field_942_l, field_944_i);
            field_939_e = p_560_1_.field_6304_y.func_1043_a(field_942_l);
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        func_550_b(field_941_c + (int)(field_944_i * (float)(field_52008_a - 8)), field_940_d, 0, 66, 4, 20);
        func_550_b(field_941_c + (int)(field_944_i * (float)(field_52008_a - 8)) + 4, field_940_d, 196, 66, 4, 20);
    }

    public boolean func_562_c(Minecraft p_562_1_, int p_562_2_, int p_562_3_)
    {
        if(super.func_562_c(p_562_1_, p_562_2_, p_562_3_))
        {
            field_944_i = (float)(p_562_2_ - (field_941_c + 4)) / (float)(field_52008_a - 8);
            if(field_944_i < 0.0F)
            {
                field_944_i = 0.0F;
            }
            if(field_944_i > 1.0F)
            {
                field_944_i = 1.0F;
            }
            p_562_1_.field_6304_y.func_1048_a(field_942_l, field_944_i);
            field_939_e = p_562_1_.field_6304_y.func_1043_a(field_942_l);
            field_943_j = true;
            return true;
        } else
        {
            return false;
        }
    }

    public void func_559_a(int p_559_1_, int p_559_2_)
    {
        field_943_j = false;
    }
}
