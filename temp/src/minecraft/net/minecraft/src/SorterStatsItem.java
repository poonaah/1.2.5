// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            StatCrafting, GuiSlotStatsItem, StatList, GuiStats, 
//            StatFileWriter

class SorterStatsItem
    implements Comparator
{

    final GuiStats field_27373_a; /* synthetic field */
    final GuiSlotStatsItem field_27372_b; /* synthetic field */

    SorterStatsItem(GuiSlotStatsItem p_i309_1_, GuiStats p_i309_2_)
    {
        field_27372_b = p_i309_1_;
        field_27373_a = p_i309_2_;
        super();
    }

    public int func_27371_a(StatCrafting p_27371_1_, StatCrafting p_27371_2_)
    {
        int i = p_27371_1_.func_25072_b();
        int j = p_27371_2_.func_25072_b();
        StatBase statbase = null;
        StatBase statbase1 = null;
        if(field_27372_b.field_27271_e == 0)
        {
            statbase = StatList.field_25170_B[i];
            statbase1 = StatList.field_25170_B[j];
        } else
        if(field_27372_b.field_27271_e == 1)
        {
            statbase = StatList.field_25158_z[i];
            statbase1 = StatList.field_25158_z[j];
        } else
        if(field_27372_b.field_27271_e == 2)
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
            int k = GuiStats.func_27142_c(field_27372_b.field_27275_a).func_27184_a(statbase);
            int l = GuiStats.func_27142_c(field_27372_b.field_27275_a).func_27184_a(statbase1);
            if(k != l)
            {
                return (k - l) * field_27372_b.field_27270_f;
            }
        }
        return i - j;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_27371_a((StatCrafting)p_compare_1_, (StatCrafting)p_compare_2_);
    }
}
