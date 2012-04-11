// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, NBTTagCompound, World, Material

public class TileEntityNote extends TileEntity
{

    public byte field_21097_a;
    public boolean field_21096_b;

    public TileEntityNote()
    {
        field_21097_a = 0;
        field_21096_b = false;
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        p_481_1_.func_761_a("note", field_21097_a);
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        field_21097_a = p_482_1_.func_746_c("note");
        if(field_21097_a < 0)
        {
            field_21097_a = 0;
        }
        if(field_21097_a > 24)
        {
            field_21097_a = 24;
        }
    }

    public void func_21095_a()
    {
        field_21097_a = (byte)((field_21097_a + 1) % 25);
        func_474_j_();
    }

    public void func_21094_a(World p_21094_1_, int p_21094_2_, int p_21094_3_, int p_21094_4_)
    {
        if(p_21094_1_.func_599_f(p_21094_2_, p_21094_3_ + 1, p_21094_4_) != Material.field_1337_a)
        {
            return;
        }
        Material material = p_21094_1_.func_599_f(p_21094_2_, p_21094_3_ - 1, p_21094_4_);
        byte byte0 = 0;
        if(material == Material.field_1334_d)
        {
            byte0 = 1;
        }
        if(material == Material.field_1325_m)
        {
            byte0 = 2;
        }
        if(material == Material.field_4263_o)
        {
            byte0 = 3;
        }
        if(material == Material.field_1335_c)
        {
            byte0 = 4;
        }
        p_21094_1_.func_21116_c(p_21094_2_, p_21094_3_, p_21094_4_, byte0, field_21097_a);
    }
}
