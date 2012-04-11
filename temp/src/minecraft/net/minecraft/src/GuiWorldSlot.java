// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            GuiSlot, GuiSelectWorld, GuiButton, SaveFormatComparator, 
//            MathHelper, StatCollector, Tessellator

class GuiWorldSlot extends GuiSlot
{

    final GuiSelectWorld field_22266_a; /* synthetic field */

    public GuiWorldSlot(GuiSelectWorld p_i383_1_)
    {
        field_22266_a = p_i383_1_;
        super(p_i383_1_.field_945_b, p_i383_1_.field_951_c, p_i383_1_.field_950_d, 32, p_i383_1_.field_950_d - 64, 36);
    }

    protected int func_22249_a()
    {
        return GuiSelectWorld.func_22090_a(field_22266_a).size();
    }

    protected void func_22247_a(int p_22247_1_, boolean p_22247_2_)
    {
        GuiSelectWorld.func_22089_a(field_22266_a, p_22247_1_);
        boolean flag = GuiSelectWorld.func_22086_b(field_22266_a) >= 0 && GuiSelectWorld.func_22086_b(field_22266_a) < func_22249_a();
        GuiSelectWorld.func_22083_c(field_22266_a).field_937_g = flag;
        GuiSelectWorld.func_22085_d(field_22266_a).field_937_g = flag;
        GuiSelectWorld.func_22092_e(field_22266_a).field_937_g = flag;
        if(p_22247_2_ && flag)
        {
            field_22266_a.func_584_c(p_22247_1_);
        }
    }

    protected boolean func_22246_a(int p_22246_1_)
    {
        return p_22246_1_ == GuiSelectWorld.func_22086_b(field_22266_a);
    }

    protected int func_22245_b()
    {
        return GuiSelectWorld.func_22090_a(field_22266_a).size() * 36;
    }

    protected void func_22248_c()
    {
        field_22266_a.func_578_i();
    }

    protected void func_22242_a(int p_22242_1_, int p_22242_2_, int p_22242_3_, int p_22242_4_, Tessellator p_22242_5_)
    {
        SaveFormatComparator saveformatcomparator = (SaveFormatComparator)GuiSelectWorld.func_22090_a(field_22266_a).get(p_22242_1_);
        String s = saveformatcomparator.func_22162_b();
        if(s == null || MathHelper.func_22282_a(s))
        {
            s = (new StringBuilder()).append(GuiSelectWorld.func_22087_f(field_22266_a)).append(" ").append(p_22242_1_ + 1).toString();
        }
        String s1 = saveformatcomparator.func_22164_a();
        s1 = (new StringBuilder()).append(s1).append(" (").append(GuiSelectWorld.func_22093_g(field_22266_a).format(new Date(saveformatcomparator.func_22163_e()))).toString();
        s1 = (new StringBuilder()).append(s1).append(")").toString();
        String s2 = "";
        if(saveformatcomparator.func_22161_d())
        {
            s2 = (new StringBuilder()).append(GuiSelectWorld.func_22088_h(field_22266_a)).append(" ").append(s2).toString();
        } else
        {
            s2 = GuiSelectWorld.func_35315_i(field_22266_a)[saveformatcomparator.func_35719_f()];
            if(saveformatcomparator.func_40594_g())
            {
                s2 = (new StringBuilder()).append("\2474").append(StatCollector.func_25200_a("gameMode.hardcore")).append("\2478").toString();
            }
        }
        field_22266_a.func_547_b(field_22266_a.field_6451_g, s, p_22242_2_ + 2, p_22242_3_ + 1, 0xffffff);
        field_22266_a.func_547_b(field_22266_a.field_6451_g, s1, p_22242_2_ + 2, p_22242_3_ + 12, 0x808080);
        field_22266_a.func_547_b(field_22266_a.field_6451_g, s2, p_22242_2_ + 2, p_22242_3_ + 12 + 10, 0x808080);
    }
}
