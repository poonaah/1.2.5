// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            StatBase, StatList, IStatType

public class StatBasic extends StatBase
{

    public StatBasic(int p_i581_1_, String p_i581_2_, IStatType p_i581_3_)
    {
        super(p_i581_1_, p_i581_2_, p_i581_3_);
    }

    public StatBasic(int p_i582_1_, String p_i582_2_)
    {
        super(p_i582_1_, p_i582_2_);
    }

    public StatBase func_25068_c()
    {
        super.func_25068_c();
        StatList.field_25187_b.add(this);
        return this;
    }
}
