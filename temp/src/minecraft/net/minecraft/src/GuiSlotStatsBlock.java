// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            GuiSlotStats, StatList, StatCrafting, GuiStats, 
//            StatFileWriter, SorterStatsBlock, Tessellator

class GuiSlotStatsBlock extends GuiSlotStats
{

    final GuiStats field_27274_a; /* synthetic field */

    public GuiSlotStatsBlock(GuiStats p_i307_1_)
    {
        field_27274_a = p_i307_1_;
        super(p_i307_1_);
        field_27273_c = new ArrayList();
        Iterator iterator = StatList.field_25185_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StatCrafting statcrafting = (StatCrafting)iterator.next();
            boolean flag = false;
            int i = statcrafting.func_25072_b();
            if(GuiStats.func_27142_c(p_i307_1_).func_27184_a(statcrafting) > 0)
            {
                flag = true;
            } else
            if(StatList.field_25172_A[i] != null && GuiStats.func_27142_c(p_i307_1_).func_27184_a(StatList.field_25172_A[i]) > 0)
            {
                flag = true;
            } else
            if(StatList.field_25158_z[i] != null && GuiStats.func_27142_c(p_i307_1_).func_27184_a(StatList.field_25158_z[i]) > 0)
            {
                flag = true;
            }
            if(flag)
            {
                field_27273_c.add(statcrafting);
            }
        } while(true);
        field_27272_d = new SorterStatsBlock(this, p_i307_1_);
    }

    protected void func_27260_a(int p_27260_1_, int p_27260_2_, Tessellator p_27260_3_)
    {
        super.func_27260_a(p_27260_1_, p_27260_2_, p_27260_3_);
        if(field_27268_b == 0)
        {
            GuiStats.func_27128_a(field_27274_a, ((p_27260_1_ + 115) - 18) + 1, p_27260_2_ + 1 + 1, 18, 18);
        } else
        {
            GuiStats.func_27128_a(field_27274_a, (p_27260_1_ + 115) - 18, p_27260_2_ + 1, 18, 18);
        }
        if(field_27268_b == 1)
        {
            GuiStats.func_27128_a(field_27274_a, ((p_27260_1_ + 165) - 18) + 1, p_27260_2_ + 1 + 1, 36, 18);
        } else
        {
            GuiStats.func_27128_a(field_27274_a, (p_27260_1_ + 165) - 18, p_27260_2_ + 1, 36, 18);
        }
        if(field_27268_b == 2)
        {
            GuiStats.func_27128_a(field_27274_a, ((p_27260_1_ + 215) - 18) + 1, p_27260_2_ + 1 + 1, 54, 18);
        } else
        {
            GuiStats.func_27128_a(field_27274_a, (p_27260_1_ + 215) - 18, p_27260_2_ + 1, 54, 18);
        }
    }

    protected void func_22242_a(int p_22242_1_, int p_22242_2_, int p_22242_3_, int p_22242_4_, Tessellator p_22242_5_)
    {
        StatCrafting statcrafting = func_27264_b(p_22242_1_);
        int i = statcrafting.func_25072_b();
        GuiStats.func_27148_a(field_27274_a, p_22242_2_ + 40, p_22242_3_, i);
        func_27265_a((StatCrafting)StatList.field_25158_z[i], p_22242_2_ + 115, p_22242_3_, p_22242_1_ % 2 == 0);
        func_27265_a((StatCrafting)StatList.field_25172_A[i], p_22242_2_ + 165, p_22242_3_, p_22242_1_ % 2 == 0);
        func_27265_a(statcrafting, p_22242_2_ + 215, p_22242_3_, p_22242_1_ % 2 == 0);
    }

    protected String func_27263_a(int p_27263_1_)
    {
        if(p_27263_1_ == 0)
        {
            return "stat.crafted";
        }
        if(p_27263_1_ == 1)
        {
            return "stat.used";
        } else
        {
            return "stat.mined";
        }
    }
}
