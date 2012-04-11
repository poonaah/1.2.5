// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound

public class TileEntitySign extends TileEntity
{

    public String field_826_a[] = {
        "", "", "", ""
    };
    public int field_825_b;
    private boolean field_25062_c;

    public TileEntitySign()
    {
        field_825_b = -1;
        field_25062_c = true;
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        p_481_1_.func_754_a("Text1", field_826_a[0]);
        p_481_1_.func_754_a("Text2", field_826_a[1]);
        p_481_1_.func_754_a("Text3", field_826_a[2]);
        p_481_1_.func_754_a("Text4", field_826_a[3]);
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        field_25062_c = false;
        super.func_482_a(p_482_1_);
        for(int i = 0; i < 4; i++)
        {
            field_826_a[i] = p_482_1_.func_755_i((new StringBuilder()).append("Text").append(i + 1).toString());
            if(field_826_a[i].length() > 15)
            {
                field_826_a[i] = field_826_a[i].substring(0, 15);
            }
        }

    }

    public boolean func_50007_a()
    {
        return field_25062_c;
    }

    public void func_50006_a(boolean p_50006_1_)
    {
        field_25062_c = p_50006_1_;
    }
}
