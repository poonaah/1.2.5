// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound

public class TileEntityRecordPlayer extends TileEntity
{

    public int field_28017_a;

    public TileEntityRecordPlayer()
    {
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        field_28017_a = p_482_1_.func_756_e("Record");
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        if(field_28017_a > 0)
        {
            p_481_1_.func_758_a("Record", field_28017_a);
        }
    }
}
