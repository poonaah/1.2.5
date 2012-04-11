// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WeightedRandomChoice

public class WeightedRandom
{

    public WeightedRandom()
    {
    }

    public static int func_35736_a(Collection p_35736_0_)
    {
        int i = 0;
        for(Iterator iterator = p_35736_0_.iterator(); iterator.hasNext();)
        {
            WeightedRandomChoice weightedrandomchoice = (WeightedRandomChoice)iterator.next();
            i += weightedrandomchoice.field_35590_d;
        }

        return i;
    }

    public static WeightedRandomChoice func_35734_a(Random p_35734_0_, Collection p_35734_1_, int p_35734_2_)
    {
        if(p_35734_2_ <= 0)
        {
            throw new IllegalArgumentException();
        }
        int i = p_35734_0_.nextInt(p_35734_2_);
        for(Iterator iterator = p_35734_1_.iterator(); iterator.hasNext();)
        {
            WeightedRandomChoice weightedrandomchoice = (WeightedRandomChoice)iterator.next();
            i -= weightedrandomchoice.field_35590_d;
            if(i < 0)
            {
                return weightedrandomchoice;
            }
        }

        return null;
    }

    public static WeightedRandomChoice func_35733_a(Random p_35733_0_, Collection p_35733_1_)
    {
        return func_35734_a(p_35733_0_, p_35733_1_, func_35736_a(p_35733_1_));
    }

    public static int func_35737_a(WeightedRandomChoice p_35737_0_[])
    {
        int i = 0;
        WeightedRandomChoice aweightedrandomchoice[] = p_35737_0_;
        int j = aweightedrandomchoice.length;
        for(int k = 0; k < j; k++)
        {
            WeightedRandomChoice weightedrandomchoice = aweightedrandomchoice[k];
            i += weightedrandomchoice.field_35590_d;
        }

        return i;
    }

    public static WeightedRandomChoice func_35732_a(Random p_35732_0_, WeightedRandomChoice p_35732_1_[], int p_35732_2_)
    {
        if(p_35732_2_ <= 0)
        {
            throw new IllegalArgumentException();
        }
        int i = p_35732_0_.nextInt(p_35732_2_);
        WeightedRandomChoice aweightedrandomchoice[] = p_35732_1_;
        int j = aweightedrandomchoice.length;
        for(int k = 0; k < j; k++)
        {
            WeightedRandomChoice weightedrandomchoice = aweightedrandomchoice[k];
            i -= weightedrandomchoice.field_35590_d;
            if(i < 0)
            {
                return weightedrandomchoice;
            }
        }

        return null;
    }

    public static WeightedRandomChoice func_35735_a(Random p_35735_0_, WeightedRandomChoice p_35735_1_[])
    {
        return func_35732_a(p_35735_0_, p_35735_1_, func_35737_a(p_35735_1_));
    }
}
