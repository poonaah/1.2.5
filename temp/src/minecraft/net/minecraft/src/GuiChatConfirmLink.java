// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GuiConfirmOpenLink, ChatClickData, GuiChat, GuiScreen

class GuiChatConfirmLink extends GuiConfirmOpenLink
{

    final ChatClickData field_50056_a; /* synthetic field */
    final GuiChat field_50055_b; /* synthetic field */

    GuiChatConfirmLink(GuiChat p_i1202_1_, GuiScreen p_i1202_2_, String p_i1202_3_, int p_i1202_4_, ChatClickData p_i1202_5_)
    {
        field_50055_b = p_i1202_1_;
        field_50056_a = p_i1202_5_;
        super(p_i1202_2_, p_i1202_3_, p_i1202_4_);
    }

    public void func_50052_d()
    {
        func_50050_a(field_50056_a.func_50088_a());
    }
}
