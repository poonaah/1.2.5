// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, Chunk, World, IChunkLoader, 
//            IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProviderLoadOrGenerate
    implements IChunkProvider
{

    private Chunk field_897_c;
    private IChunkProvider field_896_d;
    private IChunkLoader field_895_e;
    private Chunk field_894_f[];
    private World field_893_g;
    int field_891_a;
    int field_890_b;
    private Chunk field_892_h;
    private int field_21113_i;
    private int field_21112_j;

    public void func_21110_c(int p_21110_1_, int p_21110_2_)
    {
        field_21113_i = p_21110_1_;
        field_21112_j = p_21110_2_;
    }

    public boolean func_21111_d(int p_21111_1_, int p_21111_2_)
    {
        byte byte0 = 15;
        return p_21111_1_ >= field_21113_i - byte0 && p_21111_2_ >= field_21112_j - byte0 && p_21111_1_ <= field_21113_i + byte0 && p_21111_2_ <= field_21112_j + byte0;
    }

    public boolean func_537_a(int p_537_1_, int p_537_2_)
    {
        if(!func_21111_d(p_537_1_, p_537_2_))
        {
            return false;
        }
        if(p_537_1_ == field_891_a && p_537_2_ == field_890_b && field_892_h != null)
        {
            return true;
        } else
        {
            int i = p_537_1_ & 0x1f;
            int j = p_537_2_ & 0x1f;
            int k = i + j * 32;
            return field_894_f[k] != null && (field_894_f[k] == field_897_c || field_894_f[k].func_1017_a(p_537_1_, p_537_2_));
        }
    }

    public Chunk func_538_d(int p_538_1_, int p_538_2_)
    {
        return func_533_b(p_538_1_, p_538_2_);
    }

    public Chunk func_533_b(int p_533_1_, int p_533_2_)
    {
        if(p_533_1_ == field_891_a && p_533_2_ == field_890_b && field_892_h != null)
        {
            return field_892_h;
        }
        if(!field_893_g.field_9430_x && !func_21111_d(p_533_1_, p_533_2_))
        {
            return field_897_c;
        }
        int i = p_533_1_ & 0x1f;
        int j = p_533_2_ & 0x1f;
        int k = i + j * 32;
        if(!func_537_a(p_533_1_, p_533_2_))
        {
            if(field_894_f[k] != null)
            {
                field_894_f[k].func_998_e();
                func_540_b(field_894_f[k]);
                func_541_a(field_894_f[k]);
            }
            Chunk chunk = func_542_c(p_533_1_, p_533_2_);
            if(chunk == null)
            {
                if(field_896_d == null)
                {
                    chunk = field_897_c;
                } else
                {
                    chunk = field_896_d.func_533_b(p_533_1_, p_533_2_);
                    chunk.func_25124_i();
                }
            }
            field_894_f[k] = chunk;
            chunk.func_4143_d();
            if(field_894_f[k] != null)
            {
                field_894_f[k].func_995_d();
            }
            field_894_f[k].func_35843_a(this, this, p_533_1_, p_533_2_);
        }
        field_891_a = p_533_1_;
        field_890_b = p_533_2_;
        field_892_h = field_894_f[k];
        return field_894_f[k];
    }

    private Chunk func_542_c(int p_542_1_, int p_542_2_)
    {
        if(field_895_e == null)
        {
            return field_897_c;
        }
        try
        {
            Chunk chunk = field_895_e.func_813_a(field_893_g, p_542_1_, p_542_2_);
            if(chunk != null)
            {
                chunk.field_1522_s = field_893_g.func_22139_r();
            }
            return chunk;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return field_897_c;
    }

    private void func_541_a(Chunk p_541_1_)
    {
        if(field_895_e == null)
        {
            return;
        }
        try
        {
            field_895_e.func_815_b(field_893_g, p_541_1_);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_540_b(Chunk p_540_1_)
    {
        if(field_895_e == null)
        {
            return;
        }
        try
        {
            p_540_1_.field_1522_s = field_893_g.func_22139_r();
            field_895_e.func_812_a(field_893_g, p_540_1_);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_534_a(IChunkProvider p_534_1_, int p_534_2_, int p_534_3_)
    {
        Chunk chunk = func_533_b(p_534_2_, p_534_3_);
        if(!chunk.field_1527_n)
        {
            chunk.field_1527_n = true;
            if(field_896_d != null)
            {
                field_896_d.func_534_a(p_534_1_, p_534_2_, p_534_3_);
                chunk.func_1006_f();
            }
        }
    }

    public boolean func_535_a(boolean p_535_1_, IProgressUpdate p_535_2_)
    {
        int i = 0;
        int j = 0;
        if(p_535_2_ != null)
        {
            for(int k = 0; k < field_894_f.length; k++)
            {
                if(field_894_f[k] != null && field_894_f[k].func_1012_a(p_535_1_))
                {
                    j++;
                }
            }

        }
        int l = 0;
        for(int i1 = 0; i1 < field_894_f.length; i1++)
        {
            if(field_894_f[i1] == null)
            {
                continue;
            }
            if(p_535_1_)
            {
                func_541_a(field_894_f[i1]);
            }
            if(!field_894_f[i1].func_1012_a(p_535_1_))
            {
                continue;
            }
            func_540_b(field_894_f[i1]);
            field_894_f[i1].field_1526_o = false;
            if(++i == 2 && !p_535_1_)
            {
                return false;
            }
            if(p_535_2_ != null && ++l % 10 == 0)
            {
                p_535_2_.func_593_a((l * 100) / j);
            }
        }

        if(p_535_1_)
        {
            if(field_895_e == null)
            {
                return true;
            }
            field_895_e.func_811_b();
        }
        return true;
    }

    public boolean func_532_a()
    {
        if(field_895_e != null)
        {
            field_895_e.func_814_a();
        }
        return field_896_d.func_532_a();
    }

    public boolean func_536_b()
    {
        return true;
    }

    public String func_21109_c()
    {
        return (new StringBuilder()).append("ChunkCache: ").append(field_894_f.length).toString();
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        return field_896_d.func_40377_a(p_40377_1_, p_40377_2_, p_40377_3_, p_40377_4_);
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int p_40376_4_, int p_40376_5_)
    {
        return field_896_d.func_40376_a(p_40376_1_, p_40376_2_, p_40376_3_, p_40376_4_, p_40376_5_);
    }
}
