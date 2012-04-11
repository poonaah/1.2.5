// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            StatCrafting, GuiSlotStatsBlock, StatList, GuiStats, 
//            StatFileWriter

class SorterStatsBlock
    implements Comparator
{

    final GuiStats field_27299_a; /* synthetic field */
    final GuiSlotStatsBlock field_27298_b; /* synthetic field */

    SorterStatsBlock(GuiSlotStatsBlock p_i87_1_, GuiStats p_i87_2_)
    {
        field_27298_b = p_i87_1_;
        field_27299_a = p_i87_2_;
        super();
    }

    public int func_27297_a(StatCrafting p_27297_1_, StatCrafting p_27297_2_)
    {
        int i = p_27297_1_.func_25072_b();
        int j = p_27297_2_.func_25072_b();
        StatBase statbase = null;
        StatBase statbase1 = null;
        if(field_27298_b.field_27271_e == 2)
        {
            statbase = StatList.field_25159_y[i];
            statbase1 = StatList.field_25159_y[j];
        } else
        if(field_27298_b.field_27271_e == 0)
        {
            statbase = StatList.field_25158_z[i];
            statbase1 = StatList.field_25158_z[j];
        } else
        if(field_27298_b.field_27271_e == 1)
        {
            statbase = StatList.field_25172_A[i];
            statbase1 = StatList.field_25172_A[j];
        }
        if(statbase != null || statbase1 != null)
        {
            if(statbase == null)
            {
                return 1;
            }
            if(statbase1 == null)
            {
                return -1;
            }
            int k = GuiStats.func_27142_c(field_27298_b.field_27274_a).func_27184_a(statbase);
            int l = GuiStats.func_27142_c(field_27298_b.field_27274_a).func_27184_a(statbase1);
            if(k != l)
            {
                return (k - l) * field_27298_b.field_27270_f;
            }
        }
        return i - j;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_27297_a((StatCrafting)p_compare_1_, (StatCrafting)p_compare_2_);
    }
}
