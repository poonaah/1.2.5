// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiChat, StringTranslate, GuiButton, GuiTextField, 
//            EntityPlayerSP, GuiIngame, EntityClientPlayerMP, Packet19EntityAction, 
//            NetClientHandler

public class GuiSleepMP extends GuiChat
{

    public GuiSleepMP()
    {
    }

    public void func_6448_a()
    {
        super.func_6448_a();
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d - 40, stringtranslate.func_20163_a("multiplayer.stopSleeping")));
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_2_ == 1)
        {
            func_22115_j();
        } else
        if(p_580_2_ == 28)
        {
            String s = field_50064_a.func_22071_a().trim();
            if(s.length() > 0)
            {
                field_945_b.field_6322_g.func_461_a(s);
            }
            field_50064_a.func_22068_a("");
            field_945_b.field_6308_u.func_50014_d();
        } else
        {
            super.func_580_a(p_580_1_, p_580_2_);
        }
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 1)
        {
            func_22115_j();
        } else
        {
            super.func_572_a(p_572_1_);
        }
    }

    private void func_22115_j()
    {
        if(field_945_b.field_6322_g instanceof EntityClientPlayerMP)
        {
            NetClientHandler netclienthandler = ((EntityClientPlayerMP)field_945_b.field_6322_g).field_797_bg;
            netclienthandler.func_847_a(new Packet19EntityAction(field_945_b.field_6322_g, 3));
        }
    }
}
