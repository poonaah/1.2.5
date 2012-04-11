// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.text.NumberFormat;

// Referenced classes of package net.minecraft.src:
//            IStatType, StatBase

final class StatTypeSimple
    implements IStatType
{

    StatTypeSimple()
    {
    }

    public String func_27192_a(int p_27192_1_)
    {
        return StatBase.func_27083_i().format(p_27192_1_);
    }
}
