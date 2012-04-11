// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound

public class PlayerCapabilities
{

    public boolean field_35759_a;
    public boolean field_35757_b;
    public boolean field_35758_c;
    public boolean field_35756_d;

    public PlayerCapabilities()
    {
        field_35759_a = false;
        field_35757_b = false;
        field_35758_c = false;
        field_35756_d = false;
    }

    public void func_40601_a(NBTTagCompound p_40601_1_)
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.func_748_a("invulnerable", field_35759_a);
        nbttagcompound.func_748_a("flying", field_35757_b);
        nbttagcompound.func_748_a("mayfly", field_35758_c);
        nbttagcompound.func_748_a("instabuild", field_35756_d);
        p_40601_1_.func_762_a("abilities", nbttagcompound);
    }

    public void func_40600_b(NBTTagCompound p_40600_1_)
    {
        if(p_40600_1_.func_751_b("abilities"))
        {
            NBTTagCompound nbttagcompound = p_40600_1_.func_743_k("abilities");
            field_35759_a = nbttagcompound.func_760_m("invulnerable");
            field_35757_b = nbttagcompound.func_760_m("flying");
            field_35758_c = nbttagcompound.func_760_m("mayfly");
            field_35756_d = nbttagcompound.func_760_m("instabuild");
        }
    }
}
