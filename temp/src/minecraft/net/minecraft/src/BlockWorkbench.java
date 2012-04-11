// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityPlayer

public class BlockWorkbench extends Block
{

    protected BlockWorkbench(int p_i298_1_)
    {
        super(p_i298_1_, Material.field_1335_c);
        field_378_bb = 59;
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb - 16;
        }
        if(p_218_1_ == 0)
        {
            return Block.field_334_y.func_218_a(0);
        }
        if(p_218_1_ == 2 || p_218_1_ == 4)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        } else
        {
            p_250_5_.func_445_l(p_250_2_, p_250_3_, p_250_4_);
            return true;
        }
    }
}
