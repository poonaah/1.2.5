// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityNote, 
//            EntityPlayer, TileEntity

public class BlockNote extends BlockContainer
{

    public BlockNote(int p_i88_1_)
    {
        super(p_i88_1_, 74, Material.field_1335_c);
    }

    public int func_218_a(int p_218_1_)
    {
        return field_378_bb;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(p_226_5_ > 0)
        {
            boolean flag = p_226_1_.func_625_o(p_226_2_, p_226_3_, p_226_4_);
            TileEntityNote tileentitynote = (TileEntityNote)p_226_1_.func_603_b(p_226_2_, p_226_3_, p_226_4_);
            if(tileentitynote != null && tileentitynote.field_21096_b != flag)
            {
                if(flag)
                {
                    tileentitynote.func_21094_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
                }
                tileentitynote.field_21096_b = flag;
            }
        }
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        TileEntityNote tileentitynote = (TileEntityNote)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_);
        if(tileentitynote != null)
        {
            tileentitynote.func_21095_a();
            tileentitynote.func_21094_a(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        }
        return true;
    }

    public void func_233_b(World p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_, EntityPlayer p_233_5_)
    {
        if(p_233_1_.field_1026_y)
        {
            return;
        }
        TileEntityNote tileentitynote = (TileEntityNote)p_233_1_.func_603_b(p_233_2_, p_233_3_, p_233_4_);
        if(tileentitynote != null)
        {
            tileentitynote.func_21094_a(p_233_1_, p_233_2_, p_233_3_, p_233_4_);
        }
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityNote();
    }

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        float f = (float)Math.pow(2D, (double)(p_21024_6_ - 12) / 12D);
        String s = "harp";
        if(p_21024_5_ == 1)
        {
            s = "bd";
        }
        if(p_21024_5_ == 2)
        {
            s = "snare";
        }
        if(p_21024_5_ == 3)
        {
            s = "hat";
        }
        if(p_21024_5_ == 4)
        {
            s = "bassattack";
        }
        p_21024_1_.func_684_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, (new StringBuilder()).append("note.").append(s).toString(), 3F, f);
        p_21024_1_.func_694_a("note", (double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 1.2D, (double)p_21024_4_ + 0.5D, (double)p_21024_6_ / 24D, 0.0D, 0.0D);
    }
}
