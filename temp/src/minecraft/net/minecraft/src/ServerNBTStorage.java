// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound

public class ServerNBTStorage
{

    public String field_35795_a;
    public String field_35793_b;
    public String field_35794_c;
    public String field_35791_d;
    public long field_35792_e;
    public boolean field_35790_f;

    public ServerNBTStorage(String p_i489_1_, String p_i489_2_)
    {
        field_35790_f = false;
        field_35795_a = p_i489_1_;
        field_35793_b = p_i489_2_;
    }

    public NBTTagCompound func_35789_a()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.func_754_a("name", field_35795_a);
        nbttagcompound.func_754_a("ip", field_35793_b);
        return nbttagcompound;
    }

    public static ServerNBTStorage func_35788_a(NBTTagCompound p_35788_0_)
    {
        return new ServerNBTStorage(p_35788_0_.func_755_i("name"), p_35788_0_.func_755_i("ip"));
    }
}
