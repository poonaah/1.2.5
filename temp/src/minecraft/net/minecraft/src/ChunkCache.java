// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IBlockAccess, World, Chunk, WorldProvider, 
//            EnumSkyBlock, Block, Material, TileEntity, 
//            BiomeGenBase

public class ChunkCache
    implements IBlockAccess
{

    private int field_1060_a;
    private int field_1059_b;
    private Chunk field_1062_c[][];
    private boolean field_48467_d;
    private World field_1061_d;

    public ChunkCache(World p_i291_1_, int p_i291_2_, int p_i291_3_, int p_i291_4_, int p_i291_5_, int p_i291_6_, int p_i291_7_)
    {
        field_1061_d = p_i291_1_;
        field_1060_a = p_i291_2_ >> 4;
        field_1059_b = p_i291_4_ >> 4;
        int i = p_i291_5_ >> 4;
        int j = p_i291_7_ >> 4;
        field_1062_c = new Chunk[(i - field_1060_a) + 1][(j - field_1059_b) + 1];
        field_48467_d = true;
        for(int k = field_1060_a; k <= i; k++)
        {
            for(int l = field_1059_b; l <= j; l++)
            {
                Chunk chunk = p_i291_1_.func_704_b(k, l);
                if(chunk == null)
                {
                    continue;
                }
                field_1062_c[k - field_1060_a][l - field_1059_b] = chunk;
                if(!chunk.func_48492_c(p_i291_3_, p_i291_6_))
                {
                    field_48467_d = false;
                }
            }

        }

    }

    public boolean func_48452_a()
    {
        return field_48467_d;
    }

    public int func_600_a(int p_600_1_, int p_600_2_, int p_600_3_)
    {
        if(p_600_2_ < 0)
        {
            return 0;
        }
        if(p_600_2_ >= 256)
        {
            return 0;
        }
        int i = (p_600_1_ >> 4) - field_1060_a;
        int j = (p_600_3_ >> 4) - field_1059_b;
        if(i < 0 || i >= field_1062_c.length || j < 0 || j >= field_1062_c[i].length)
        {
            return 0;
        }
        Chunk chunk = field_1062_c[i][j];
        if(chunk == null)
        {
            return 0;
        } else
        {
            return chunk.func_1008_a(p_600_1_ & 0xf, p_600_2_, p_600_3_ & 0xf);
        }
    }

    public TileEntity func_603_b(int p_603_1_, int p_603_2_, int p_603_3_)
    {
        int i = (p_603_1_ >> 4) - field_1060_a;
        int j = (p_603_3_ >> 4) - field_1059_b;
        return field_1062_c[i][j].func_1002_d(p_603_1_ & 0xf, p_603_2_, p_603_3_ & 0xf);
    }

    public float func_28099_a(int p_28099_1_, int p_28099_2_, int p_28099_3_, int p_28099_4_)
    {
        int i = func_4086_d(p_28099_1_, p_28099_2_, p_28099_3_);
        if(i < p_28099_4_)
        {
            i = p_28099_4_;
        }
        return field_1061_d.field_4209_q.field_4219_d[i];
    }

    public int func_35451_b(int p_35451_1_, int p_35451_2_, int p_35451_3_, int p_35451_4_)
    {
        int i = func_35454_a(EnumSkyBlock.Sky, p_35451_1_, p_35451_2_, p_35451_3_);
        int j = func_35454_a(EnumSkyBlock.Block, p_35451_1_, p_35451_2_, p_35451_3_);
        if(j < p_35451_4_)
        {
            j = p_35451_4_;
        }
        return i << 20 | j << 4;
    }

    public float func_598_c(int p_598_1_, int p_598_2_, int p_598_3_)
    {
        return field_1061_d.field_4209_q.field_4219_d[func_4086_d(p_598_1_, p_598_2_, p_598_3_)];
    }

    public int func_4086_d(int p_4086_1_, int p_4086_2_, int p_4086_3_)
    {
        return func_716_a(p_4086_1_, p_4086_2_, p_4086_3_, true);
    }

    public int func_716_a(int p_716_1_, int p_716_2_, int p_716_3_, boolean p_716_4_)
    {
        if(p_716_1_ < 0xfe363c80 || p_716_3_ < 0xfe363c80 || p_716_1_ >= 0x1c9c380 || p_716_3_ > 0x1c9c380)
        {
            return 15;
        }
        if(p_716_4_)
        {
            int i = func_600_a(p_716_1_, p_716_2_, p_716_3_);
            if(i == Block.field_410_al.field_376_bc || i == Block.field_446_aB.field_376_bc || i == Block.field_4059_au.field_376_bc || i == Block.field_4069_aI.field_376_bc)
            {
                int l = func_716_a(p_716_1_, p_716_2_ + 1, p_716_3_, false);
                int j1 = func_716_a(p_716_1_ + 1, p_716_2_, p_716_3_, false);
                int k1 = func_716_a(p_716_1_ - 1, p_716_2_, p_716_3_, false);
                int l1 = func_716_a(p_716_1_, p_716_2_, p_716_3_ + 1, false);
                int i2 = func_716_a(p_716_1_, p_716_2_, p_716_3_ - 1, false);
                if(j1 > l)
                {
                    l = j1;
                }
                if(k1 > l)
                {
                    l = k1;
                }
                if(l1 > l)
                {
                    l = l1;
                }
                if(i2 > l)
                {
                    l = i2;
                }
                return l;
            }
        }
        if(p_716_2_ < 0)
        {
            return 0;
        }
        if(p_716_2_ >= 256)
        {
            int j = 15 - field_1061_d.field_1046_e;
            if(j < 0)
            {
                j = 0;
            }
            return j;
        } else
        {
            int k = (p_716_1_ >> 4) - field_1060_a;
            int i1 = (p_716_3_ >> 4) - field_1059_b;
            return field_1062_c[k][i1].func_1019_c(p_716_1_ & 0xf, p_716_2_, p_716_3_ & 0xf, field_1061_d.field_1046_e);
        }
    }

    public int func_602_e(int p_602_1_, int p_602_2_, int p_602_3_)
    {
        if(p_602_2_ < 0)
        {
            return 0;
        }
        if(p_602_2_ >= 256)
        {
            return 0;
        } else
        {
            int i = (p_602_1_ >> 4) - field_1060_a;
            int j = (p_602_3_ >> 4) - field_1059_b;
            return field_1062_c[i][j].func_1021_b(p_602_1_ & 0xf, p_602_2_, p_602_3_ & 0xf);
        }
    }

    public Material func_599_f(int p_599_1_, int p_599_2_, int p_599_3_)
    {
        int i = func_600_a(p_599_1_, p_599_2_, p_599_3_);
        if(i == 0)
        {
            return Material.field_1337_a;
        } else
        {
            return Block.field_345_n[i].field_356_bn;
        }
    }

    public BiomeGenBase func_48454_a(int p_48454_1_, int p_48454_2_)
    {
        return field_1061_d.func_48454_a(p_48454_1_, p_48454_2_);
    }

    public boolean func_601_g(int p_601_1_, int p_601_2_, int p_601_3_)
    {
        Block block = Block.field_345_n[func_600_a(p_601_1_, p_601_2_, p_601_3_)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.func_217_b();
        }
    }

    public boolean func_28100_h(int p_28100_1_, int p_28100_2_, int p_28100_3_)
    {
        Block block = Block.field_345_n[func_600_a(p_28100_1_, p_28100_2_, p_28100_3_)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.field_356_bn.func_880_c() && block.func_242_c();
        }
    }

    public boolean func_20084_d(int p_20084_1_, int p_20084_2_, int p_20084_3_)
    {
        Block block = Block.field_345_n[func_600_a(p_20084_1_, p_20084_2_, p_20084_3_)];
        return block == null;
    }

    public int func_35454_a(EnumSkyBlock p_35454_1_, int p_35454_2_, int p_35454_3_, int p_35454_4_)
    {
        if(p_35454_3_ < 0)
        {
            p_35454_3_ = 0;
        }
        if(p_35454_3_ >= 256)
        {
            p_35454_3_ = 255;
        }
        if(p_35454_3_ < 0 || p_35454_3_ >= 256 || p_35454_2_ < 0xfe363c80 || p_35454_4_ < 0xfe363c80 || p_35454_2_ >= 0x1c9c380 || p_35454_4_ > 0x1c9c380)
        {
            return p_35454_1_.field_1722_c;
        }
        if(Block.field_40201_bL[func_600_a(p_35454_2_, p_35454_3_, p_35454_4_)])
        {
            int i = func_35453_b(p_35454_1_, p_35454_2_, p_35454_3_ + 1, p_35454_4_);
            int k = func_35453_b(p_35454_1_, p_35454_2_ + 1, p_35454_3_, p_35454_4_);
            int i1 = func_35453_b(p_35454_1_, p_35454_2_ - 1, p_35454_3_, p_35454_4_);
            int j1 = func_35453_b(p_35454_1_, p_35454_2_, p_35454_3_, p_35454_4_ + 1);
            int k1 = func_35453_b(p_35454_1_, p_35454_2_, p_35454_3_, p_35454_4_ - 1);
            if(k > i)
            {
                i = k;
            }
            if(i1 > i)
            {
                i = i1;
            }
            if(j1 > i)
            {
                i = j1;
            }
            if(k1 > i)
            {
                i = k1;
            }
            return i;
        } else
        {
            int j = (p_35454_2_ >> 4) - field_1060_a;
            int l = (p_35454_4_ >> 4) - field_1059_b;
            return field_1062_c[j][l].func_1025_a(p_35454_1_, p_35454_2_ & 0xf, p_35454_3_, p_35454_4_ & 0xf);
        }
    }

    public int func_35453_b(EnumSkyBlock p_35453_1_, int p_35453_2_, int p_35453_3_, int p_35453_4_)
    {
        if(p_35453_3_ < 0)
        {
            p_35453_3_ = 0;
        }
        if(p_35453_3_ >= 256)
        {
            p_35453_3_ = 255;
        }
        if(p_35453_3_ < 0 || p_35453_3_ >= 256 || p_35453_2_ < 0xfe363c80 || p_35453_4_ < 0xfe363c80 || p_35453_2_ >= 0x1c9c380 || p_35453_4_ > 0x1c9c380)
        {
            return p_35453_1_.field_1722_c;
        } else
        {
            int i = (p_35453_2_ >> 4) - field_1060_a;
            int j = (p_35453_4_ >> 4) - field_1059_b;
            return field_1062_c[i][j].func_1025_a(p_35453_1_, p_35453_2_ & 0xf, p_35453_3_, p_35453_4_ & 0xf);
        }
    }

    public int func_48453_b()
    {
        return 256;
    }
}
