// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PlayerUsageSnooper, PostHttp

class PlayerUsageSnooperThread extends Thread
{

    final PlayerUsageSnooper field_52012_a; /* synthetic field */

    PlayerUsageSnooperThread(PlayerUsageSnooper p_i1050_1_, String p_i1050_2_)
    {
        field_52012_a = p_i1050_1_;
        super(p_i1050_2_);
    }

    public void run()
    {
        PostHttp.func_52018_a(PlayerUsageSnooper.func_52023_a(field_52012_a), PlayerUsageSnooper.func_52020_b(field_52012_a), true);
    }
}
