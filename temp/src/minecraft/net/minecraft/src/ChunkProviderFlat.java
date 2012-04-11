// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenVillage, Block, BlockGrass, 
//            Chunk, World, WorldChunkManager, BiomeGenBase, 
//            IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProviderFlat
    implements IChunkProvider
{

    private World field_46055_a;
    private Random field_46053_b;
    private final boolean field_46054_c;
    private MapGenVillage field_46052_d;

    public ChunkProviderFlat(World p_i696_1_, long p_i696_2_, boolean p_i696_4_)
    {
        field_46052_d = new MapGenVillage(1);
        field_46055_a = p_i696_1_;
        field_46054_c = p_i696_4_;
        field_46053_b = new Random(p_i696_2_);
    }

    private void func_46051_a(byte p_46051_1_[])
    {
        int i = p_46051_1_.length / 256;
        for(int j = 0; j < 16; j++)
        {
            for(int k = 0; k < 16; k++)
            {
                for(int l = 0; l < i; l++)
                {
                    int i1 = 0;
                    if(l == 0)
                    {
                        i1 = Block.field_403_A.field_376_bc;
                    } else
                    if(l <= 2)
                    {
                        i1 = Block.field_336_w.field_376_bc;
                    } else
                    if(l == 3)
                    {
                        i1 = Block.field_337_v.field_376_bc;
                    }
                    p_46051_1_[j << 11 | k << 7 | l] = (byte)i1;
                }

            }

        }

    }

    public Chunk func_538_d(int p_538_1_, int p_538_2_)
    {
        return func_533_b(p_538_1_, p_538_2_);
    }

    public Chunk func_533_b(int p_533_1_, int p_533_2_)
    {
        byte abyte0[] = new byte[32768];
        func_46051_a(abyte0);
        Chunk chunk = new Chunk(field_46055_a, abyte0, p_533_1_, p_533_2_);
        if(field_46054_c)
        {
            field_46052_d.func_867_a(this, field_46055_a, p_533_1_, p_533_2_, abyte0);
        }
        BiomeGenBase abiomegenbase[] = field_46055_a.func_4075_a().func_4070_a(null, p_533_1_ * 16, p_533_2_ * 16, 16, 16);
        byte abyte1[] = chunk.func_48493_m();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)abiomegenbase[i].field_35494_y;
        }

        chunk.func_1024_c();
        return chunk;
    }

    public boolean func_537_a(int p_537_1_, int p_537_2_)
    {
        return true;
    }

    public void func_534_a(IChunkProvider p_534_1_, int p_534_2_, int p_534_3_)
    {
        field_46053_b.setSeed(field_46055_a.func_22138_q());
        long l = (field_46053_b.nextLong() / 2L) * 2L + 1L;
        long l1 = (field_46053_b.nextLong() / 2L) * 2L + 1L;
        field_46053_b.setSeed((long)p_534_2_ * l + (long)p_534_3_ * l1 ^ field_46055_a.func_22138_q());
        if(field_46054_c)
        {
            field_46052_d.func_35629_a(field_46055_a, field_46053_b, p_534_2_, p_534_3_);
        }
    }

    public boolean func_535_a(boolean p_535_1_, IProgressUpdate p_535_2_)
    {
        return true;
    }

    public boolean func_532_a()
    {
        return false;
    }

    public boolean func_536_b()
    {
        return true;
    }

    public String func_21109_c()
    {
        return "FlatLevelSource";
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        BiomeGenBase biomegenbase = field_46055_a.func_48454_a(p_40377_2_, p_40377_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25063_a(p_40377_1_);
        }
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int i, int j)
    {
        return null;
    }
}
