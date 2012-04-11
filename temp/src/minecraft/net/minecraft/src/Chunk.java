// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ExtendedBlockStorage, Block, World, WorldProvider, 
//            Profiler, EnumSkyBlock, BlockContainer, TileEntity, 
//            Entity, MathHelper, ChunkPosition, AxisAlignedBB, 
//            IChunkProvider, Material, ChunkCoordIntPair, NibbleArray, 
//            WorldChunkManager, BiomeGenBase

public class Chunk
{

    public static boolean field_1540_a;
    private ExtendedBlockStorage field_48505_p[];
    private byte field_48504_q[];
    public int field_35845_c[];
    public boolean field_35844_d[];
    public boolean field_1538_c;
    public World field_1537_d;
    public int field_48501_f[];
    public final int field_1531_j;
    public final int field_1530_k;
    private boolean field_40741_v;
    public Map field_1529_l;
    public List field_48502_j[];
    public boolean field_1527_n;
    public boolean field_1526_o;
    public boolean field_1523_r;
    public long field_1522_s;
    public boolean field_50120_o;
    private int field_48503_s;
    boolean field_35846_u;

    public Chunk(World p_i13_1_, int p_i13_2_, int p_i13_3_)
    {
        field_48505_p = new ExtendedBlockStorage[16];
        field_48504_q = new byte[256];
        field_35845_c = new int[256];
        field_35844_d = new boolean[256];
        field_40741_v = false;
        field_1529_l = new HashMap();
        field_1527_n = false;
        field_1526_o = false;
        field_1523_r = false;
        field_1522_s = 0L;
        field_50120_o = false;
        field_48503_s = 4096;
        field_35846_u = false;
        field_48502_j = new List[16];
        field_1537_d = p_i13_1_;
        field_1531_j = p_i13_2_;
        field_1530_k = p_i13_3_;
        field_48501_f = new int[256];
        for(int i = 0; i < field_48502_j.length; i++)
        {
            field_48502_j[i] = new ArrayList();
        }

        Arrays.fill(field_35845_c, -999);
        Arrays.fill(field_48504_q, (byte)-1);
    }

    public Chunk(World p_i14_1_, byte p_i14_2_[], int p_i14_3_, int p_i14_4_)
    {
        this(p_i14_1_, p_i14_3_, p_i14_4_);
        int i = p_i14_2_.length / 256;
        for(int j = 0; j < 16; j++)
        {
            for(int k = 0; k < 16; k++)
            {
                for(int l = 0; l < i; l++)
                {
                    byte byte0 = p_i14_2_[j << 11 | k << 7 | l];
                    if(byte0 == 0)
                    {
                        continue;
                    }
                    int i1 = l >> 4;
                    if(field_48505_p[i1] == null)
                    {
                        field_48505_p[i1] = new ExtendedBlockStorage(i1 << 4);
                    }
                    field_48505_p[i1].func_48691_a(j, l & 0xf, k, byte0);
                }

            }

        }

    }

    public boolean func_1017_a(int p_1017_1_, int p_1017_2_)
    {
        return p_1017_1_ == field_1531_j && p_1017_2_ == field_1530_k;
    }

    public int func_999_b(int p_999_1_, int p_999_2_)
    {
        return field_48501_f[p_999_2_ << 4 | p_999_1_];
    }

    public int func_48498_h()
    {
        for(int i = field_48505_p.length - 1; i >= 0; i--)
        {
            if(field_48505_p[i] != null)
            {
                return field_48505_p[i].func_48707_c();
            }
        }

        return 0;
    }

    public ExtendedBlockStorage[] func_48495_i()
    {
        return field_48505_p;
    }

    public void func_1018_b()
    {
        int i = func_48498_h();
        for(int j = 0; j < 16; j++)
        {
label0:
            for(int k = 0; k < 16; k++)
            {
                field_35845_c[j + (k << 4)] = -999;
                int l = (i + 16) - 1;
                do
                {
                    if(l <= 0)
                    {
                        continue label0;
                    }
                    int i1 = func_1008_a(j, l - 1, k);
                    if(Block.field_341_r[i1] != 0)
                    {
                        field_48501_f[k << 4 | j] = l;
                        continue label0;
                    }
                    l--;
                } while(true);
            }

        }

        field_1526_o = true;
    }

    public void func_1024_c()
    {
        int i = func_48498_h();
        for(int j = 0; j < 16; j++)
        {
            for(int l = 0; l < 16; l++)
            {
                field_35845_c[j + (l << 4)] = -999;
                int j1 = (i + 16) - 1;
                do
                {
                    if(j1 <= 0)
                    {
                        break;
                    }
                    if(func_48499_b(j, j1 - 1, l) != 0)
                    {
                        field_48501_f[l << 4 | j] = j1;
                        break;
                    }
                    j1--;
                } while(true);
                if(field_1537_d.field_4209_q.field_6478_e)
                {
                    continue;
                }
                j1 = 15;
                int k1 = (i + 16) - 1;
                do
                {
                    j1 -= func_48499_b(j, k1, l);
                    if(j1 > 0)
                    {
                        ExtendedBlockStorage extendedblockstorage = field_48505_p[k1 >> 4];
                        if(extendedblockstorage != null)
                        {
                            extendedblockstorage.func_48702_c(j, k1 & 0xf, l, j1);
                            field_1537_d.func_48464_p((field_1531_j << 4) + j, k1, (field_1530_k << 4) + l);
                        }
                    }
                } while(--k1 > 0 && j1 > 0);
            }

        }

        field_1526_o = true;
        for(int k = 0; k < 16; k++)
        {
            for(int i1 = 0; i1 < 16; i1++)
            {
                func_996_c(k, i1);
            }

        }

    }

    public void func_4143_d()
    {
    }

    private void func_996_c(int p_996_1_, int p_996_2_)
    {
        field_35844_d[p_996_1_ + p_996_2_ * 16] = true;
        field_40741_v = true;
    }

    private void func_35839_k()
    {
        Profiler.func_40663_a("recheckGaps");
        if(field_1537_d.func_21117_a(field_1531_j * 16 + 8, 0, field_1530_k * 16 + 8, 16))
        {
            for(int i = 0; i < 16; i++)
            {
                for(int j = 0; j < 16; j++)
                {
                    if(!field_35844_d[i + j * 16])
                    {
                        continue;
                    }
                    field_35844_d[i + j * 16] = false;
                    int k = func_999_b(i, j);
                    int l = field_1531_j * 16 + i;
                    int i1 = field_1530_k * 16 + j;
                    int j1 = field_1537_d.func_666_c(l - 1, i1);
                    int k1 = field_1537_d.func_666_c(l + 1, i1);
                    int l1 = field_1537_d.func_666_c(l, i1 - 1);
                    int i2 = field_1537_d.func_666_c(l, i1 + 1);
                    if(k1 < j1)
                    {
                        j1 = k1;
                    }
                    if(l1 < j1)
                    {
                        j1 = l1;
                    }
                    if(i2 < j1)
                    {
                        j1 = i2;
                    }
                    func_1020_f(l, i1, j1);
                    func_1020_f(l - 1, i1, k);
                    func_1020_f(l + 1, i1, k);
                    func_1020_f(l, i1 - 1, k);
                    func_1020_f(l, i1 + 1, k);
                }

            }

            field_40741_v = false;
        }
        Profiler.func_40662_b();
    }

    private void func_1020_f(int p_1020_1_, int p_1020_2_, int p_1020_3_)
    {
        int i = field_1537_d.func_666_c(p_1020_1_, p_1020_2_);
        if(i > p_1020_3_)
        {
            func_35842_d(p_1020_1_, p_1020_2_, p_1020_3_, i + 1);
        } else
        if(i < p_1020_3_)
        {
            func_35842_d(p_1020_1_, p_1020_2_, i, p_1020_3_ + 1);
        }
    }

    private void func_35842_d(int p_35842_1_, int p_35842_2_, int p_35842_3_, int p_35842_4_)
    {
        if(p_35842_4_ > p_35842_3_ && field_1537_d.func_21117_a(p_35842_1_, 0, p_35842_2_, 16))
        {
            for(int i = p_35842_3_; i < p_35842_4_; i++)
            {
                field_1537_d.func_35459_c(EnumSkyBlock.Sky, p_35842_1_, i, p_35842_2_);
            }

            field_1526_o = true;
        }
    }

    private void func_1003_g(int p_1003_1_, int p_1003_2_, int p_1003_3_)
    {
        int i = field_48501_f[p_1003_3_ << 4 | p_1003_1_] & 0xff;
        int j = i;
        if(p_1003_2_ > i)
        {
            j = p_1003_2_;
        }
        for(; j > 0 && func_48499_b(p_1003_1_, j - 1, p_1003_3_) == 0; j--) { }
        if(j == i)
        {
            return;
        }
        field_1537_d.func_680_f(p_1003_1_, p_1003_3_, j, i);
        field_48501_f[p_1003_3_ << 4 | p_1003_1_] = j;
        int k = field_1531_j * 16 + p_1003_1_;
        int l = field_1530_k * 16 + p_1003_3_;
        if(!field_1537_d.field_4209_q.field_6478_e)
        {
            if(j < i)
            {
                for(int i1 = j; i1 < i; i1++)
                {
                    ExtendedBlockStorage extendedblockstorage = field_48505_p[i1 >> 4];
                    if(extendedblockstorage != null)
                    {
                        extendedblockstorage.func_48702_c(p_1003_1_, i1 & 0xf, p_1003_3_, 15);
                        field_1537_d.func_48464_p((field_1531_j << 4) + p_1003_1_, i1, (field_1530_k << 4) + p_1003_3_);
                    }
                }

            } else
            {
                for(int j1 = i; j1 < j; j1++)
                {
                    ExtendedBlockStorage extendedblockstorage1 = field_48505_p[j1 >> 4];
                    if(extendedblockstorage1 != null)
                    {
                        extendedblockstorage1.func_48702_c(p_1003_1_, j1 & 0xf, p_1003_3_, 0);
                        field_1537_d.func_48464_p((field_1531_j << 4) + p_1003_1_, j1, (field_1530_k << 4) + p_1003_3_);
                    }
                }

            }
            int k1 = 15;
            do
            {
                if(j <= 0 || k1 <= 0)
                {
                    break;
                }
                j--;
                int i2 = func_48499_b(p_1003_1_, j, p_1003_3_);
                if(i2 == 0)
                {
                    i2 = 1;
                }
                k1 -= i2;
                if(k1 < 0)
                {
                    k1 = 0;
                }
                ExtendedBlockStorage extendedblockstorage2 = field_48505_p[j >> 4];
                if(extendedblockstorage2 != null)
                {
                    extendedblockstorage2.func_48702_c(p_1003_1_, j & 0xf, p_1003_3_, k1);
                }
            } while(true);
        }
        int l1 = field_48501_f[p_1003_3_ << 4 | p_1003_1_];
        int j2 = i;
        int k2 = l1;
        if(k2 < j2)
        {
            int l2 = j2;
            j2 = k2;
            k2 = l2;
        }
        if(!field_1537_d.field_4209_q.field_6478_e)
        {
            func_35842_d(k - 1, l, j2, k2);
            func_35842_d(k + 1, l, j2, k2);
            func_35842_d(k, l - 1, j2, k2);
            func_35842_d(k, l + 1, j2, k2);
            func_35842_d(k, l, j2, k2);
        }
        field_1526_o = true;
    }

    public int func_48499_b(int p_48499_1_, int p_48499_2_, int p_48499_3_)
    {
        return Block.field_341_r[func_1008_a(p_48499_1_, p_48499_2_, p_48499_3_)];
    }

    public int func_1008_a(int p_1008_1_, int p_1008_2_, int p_1008_3_)
    {
        if(p_1008_2_ >> 4 >= field_48505_p.length)
        {
            return 0;
        }
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1008_2_ >> 4];
        if(extendedblockstorage != null)
        {
            return extendedblockstorage.func_48703_a(p_1008_1_, p_1008_2_ & 0xf, p_1008_3_);
        } else
        {
            return 0;
        }
    }

    public int func_1021_b(int p_1021_1_, int p_1021_2_, int p_1021_3_)
    {
        if(p_1021_2_ >> 4 >= field_48505_p.length)
        {
            return 0;
        }
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1021_2_ >> 4];
        if(extendedblockstorage != null)
        {
            return extendedblockstorage.func_48694_b(p_1021_1_, p_1021_2_ & 0xf, p_1021_3_);
        } else
        {
            return 0;
        }
    }

    public boolean func_1022_a(int p_1022_1_, int p_1022_2_, int p_1022_3_, int p_1022_4_)
    {
        return func_1010_a(p_1022_1_, p_1022_2_, p_1022_3_, p_1022_4_, 0);
    }

    public boolean func_1010_a(int p_1010_1_, int p_1010_2_, int p_1010_3_, int p_1010_4_, int p_1010_5_)
    {
        int i = p_1010_3_ << 4 | p_1010_1_;
        if(p_1010_2_ >= field_35845_c[i] - 1)
        {
            field_35845_c[i] = -999;
        }
        int j = field_48501_f[i];
        int k = func_1008_a(p_1010_1_, p_1010_2_, p_1010_3_);
        if(k == p_1010_4_ && func_1021_b(p_1010_1_, p_1010_2_, p_1010_3_) == p_1010_5_)
        {
            return false;
        }
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1010_2_ >> 4];
        boolean flag = false;
        if(extendedblockstorage == null)
        {
            if(p_1010_4_ == 0)
            {
                return false;
            }
            extendedblockstorage = field_48505_p[p_1010_2_ >> 4] = new ExtendedBlockStorage((p_1010_2_ >> 4) << 4);
            flag = p_1010_2_ >= j;
        }
        extendedblockstorage.func_48691_a(p_1010_1_, p_1010_2_ & 0xf, p_1010_3_, p_1010_4_);
        int l = field_1531_j * 16 + p_1010_1_;
        int i1 = field_1530_k * 16 + p_1010_3_;
        if(k != 0)
        {
            if(!field_1537_d.field_1026_y)
            {
                Block.field_345_n[k].func_214_b(field_1537_d, l, p_1010_2_, i1);
            } else
            if((Block.field_345_n[k] instanceof BlockContainer) && k != p_1010_4_)
            {
                field_1537_d.func_692_l(l, p_1010_2_, i1);
            }
        }
        if(extendedblockstorage.func_48703_a(p_1010_1_, p_1010_2_ & 0xf, p_1010_3_) != p_1010_4_)
        {
            return false;
        }
        extendedblockstorage.func_48690_b(p_1010_1_, p_1010_2_ & 0xf, p_1010_3_, p_1010_5_);
        if(flag)
        {
            func_1024_c();
        } else
        {
            if(Block.field_341_r[p_1010_4_ & 0xfff] > 0)
            {
                if(p_1010_2_ >= j)
                {
                    func_1003_g(p_1010_1_, p_1010_2_ + 1, p_1010_3_);
                }
            } else
            if(p_1010_2_ == j - 1)
            {
                func_1003_g(p_1010_1_, p_1010_2_, p_1010_3_);
            }
            func_996_c(p_1010_1_, p_1010_3_);
        }
        if(p_1010_4_ != 0)
        {
            if(!field_1537_d.field_1026_y)
            {
                Block.field_345_n[p_1010_4_].func_235_e(field_1537_d, l, p_1010_2_, i1);
            }
            if(Block.field_345_n[p_1010_4_] instanceof BlockContainer)
            {
                TileEntity tileentity = func_1002_d(p_1010_1_, p_1010_2_, p_1010_3_);
                if(tileentity == null)
                {
                    tileentity = ((BlockContainer)Block.field_345_n[p_1010_4_]).func_283_a_();
                    field_1537_d.func_654_a(l, p_1010_2_, i1, tileentity);
                }
                if(tileentity != null)
                {
                    tileentity.func_35144_b();
                }
            }
        } else
        if(k > 0 && (Block.field_345_n[k] instanceof BlockContainer))
        {
            TileEntity tileentity1 = func_1002_d(p_1010_1_, p_1010_2_, p_1010_3_);
            if(tileentity1 != null)
            {
                tileentity1.func_35144_b();
            }
        }
        field_1526_o = true;
        return true;
    }

    public boolean func_1009_b(int p_1009_1_, int p_1009_2_, int p_1009_3_, int p_1009_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1009_2_ >> 4];
        if(extendedblockstorage == null)
        {
            return false;
        }
        int i = extendedblockstorage.func_48694_b(p_1009_1_, p_1009_2_ & 0xf, p_1009_3_);
        if(i == p_1009_4_)
        {
            return false;
        }
        field_1526_o = true;
        extendedblockstorage.func_48690_b(p_1009_1_, p_1009_2_ & 0xf, p_1009_3_, p_1009_4_);
        int j = extendedblockstorage.func_48703_a(p_1009_1_, p_1009_2_ & 0xf, p_1009_3_);
        if(j > 0 && (Block.field_345_n[j] instanceof BlockContainer))
        {
            TileEntity tileentity = func_1002_d(p_1009_1_, p_1009_2_, p_1009_3_);
            if(tileentity != null)
            {
                tileentity.func_35144_b();
                tileentity.field_35145_n = p_1009_4_;
            }
        }
        return true;
    }

    public int func_1025_a(EnumSkyBlock p_1025_1_, int p_1025_2_, int p_1025_3_, int p_1025_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1025_3_ >> 4];
        if(extendedblockstorage == null)
        {
            return p_1025_1_.field_1722_c;
        }
        if(p_1025_1_ == EnumSkyBlock.Sky)
        {
            return extendedblockstorage.func_48709_c(p_1025_2_, p_1025_3_ & 0xf, p_1025_4_);
        }
        if(p_1025_1_ == EnumSkyBlock.Block)
        {
            return extendedblockstorage.func_48712_d(p_1025_2_, p_1025_3_ & 0xf, p_1025_4_);
        } else
        {
            return p_1025_1_.field_1722_c;
        }
    }

    public void func_1011_a(EnumSkyBlock p_1011_1_, int p_1011_2_, int p_1011_3_, int p_1011_4_, int p_1011_5_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1011_3_ >> 4];
        if(extendedblockstorage == null)
        {
            extendedblockstorage = field_48505_p[p_1011_3_ >> 4] = new ExtendedBlockStorage((p_1011_3_ >> 4) << 4);
            func_1024_c();
        }
        field_1526_o = true;
        if(p_1011_1_ == EnumSkyBlock.Sky)
        {
            if(!field_1537_d.field_4209_q.field_6478_e)
            {
                extendedblockstorage.func_48702_c(p_1011_2_, p_1011_3_ & 0xf, p_1011_4_, p_1011_5_);
            }
        } else
        if(p_1011_1_ == EnumSkyBlock.Block)
        {
            extendedblockstorage.func_48699_d(p_1011_2_, p_1011_3_ & 0xf, p_1011_4_, p_1011_5_);
        } else
        {
            return;
        }
    }

    public int func_1019_c(int p_1019_1_, int p_1019_2_, int p_1019_3_, int p_1019_4_)
    {
        ExtendedBlockStorage extendedblockstorage = field_48505_p[p_1019_2_ >> 4];
        if(extendedblockstorage == null)
        {
            if(!field_1537_d.field_4209_q.field_6478_e && p_1019_4_ < EnumSkyBlock.Sky.field_1722_c)
            {
                return EnumSkyBlock.Sky.field_1722_c - p_1019_4_;
            } else
            {
                return 0;
            }
        }
        int i = field_1537_d.field_4209_q.field_6478_e ? 0 : extendedblockstorage.func_48709_c(p_1019_1_, p_1019_2_ & 0xf, p_1019_3_);
        if(i > 0)
        {
            field_1540_a = true;
        }
        i -= p_1019_4_;
        int j = extendedblockstorage.func_48712_d(p_1019_1_, p_1019_2_ & 0xf, p_1019_3_);
        if(j > i)
        {
            i = j;
        }
        return i;
    }

    public void func_1000_a(Entity p_1000_1_)
    {
        field_1523_r = true;
        int i = MathHelper.func_1108_b(p_1000_1_.field_611_ak / 16D);
        int j = MathHelper.func_1108_b(p_1000_1_.field_609_am / 16D);
        if(i != field_1531_j || j != field_1530_k)
        {
            System.out.println((new StringBuilder()).append("Wrong location! ").append(p_1000_1_).toString());
            Thread.dumpStack();
        }
        int k = MathHelper.func_1108_b(p_1000_1_.field_610_al / 16D);
        if(k < 0)
        {
            k = 0;
        }
        if(k >= field_48502_j.length)
        {
            k = field_48502_j.length - 1;
        }
        p_1000_1_.field_621_aZ = true;
        p_1000_1_.field_657_ba = field_1531_j;
        p_1000_1_.field_656_bb = k;
        p_1000_1_.field_654_bc = field_1530_k;
        field_48502_j[k].add(p_1000_1_);
    }

    public void func_1015_b(Entity p_1015_1_)
    {
        func_1016_a(p_1015_1_, p_1015_1_.field_656_bb);
    }

    public void func_1016_a(Entity p_1016_1_, int p_1016_2_)
    {
        if(p_1016_2_ < 0)
        {
            p_1016_2_ = 0;
        }
        if(p_1016_2_ >= field_48502_j.length)
        {
            p_1016_2_ = field_48502_j.length - 1;
        }
        field_48502_j[p_1016_2_].remove(p_1016_1_);
    }

    public boolean func_1007_c(int p_1007_1_, int p_1007_2_, int p_1007_3_)
    {
        return p_1007_2_ >= field_48501_f[p_1007_3_ << 4 | p_1007_1_];
    }

    public TileEntity func_1002_d(int p_1002_1_, int p_1002_2_, int p_1002_3_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_1002_1_, p_1002_2_, p_1002_3_);
        TileEntity tileentity = (TileEntity)field_1529_l.get(chunkposition);
        if(tileentity == null)
        {
            int i = func_1008_a(p_1002_1_, p_1002_2_, p_1002_3_);
            if(i <= 0 || !Block.field_345_n[i].func_48205_p())
            {
                return null;
            }
            if(tileentity == null)
            {
                tileentity = ((BlockContainer)Block.field_345_n[i]).func_283_a_();
                field_1537_d.func_654_a(field_1531_j * 16 + p_1002_1_, p_1002_2_, field_1530_k * 16 + p_1002_3_, tileentity);
            }
            tileentity = (TileEntity)field_1529_l.get(chunkposition);
        }
        if(tileentity != null && tileentity.func_31006_g())
        {
            field_1529_l.remove(chunkposition);
            return null;
        } else
        {
            return tileentity;
        }
    }

    public void func_1001_a(TileEntity p_1001_1_)
    {
        int i = p_1001_1_.field_823_f - field_1531_j * 16;
        int j = p_1001_1_.field_822_g;
        int k = p_1001_1_.field_821_h - field_1530_k * 16;
        func_1005_a(i, j, k, p_1001_1_);
        if(field_1538_c)
        {
            field_1537_d.field_1049_b.add(p_1001_1_);
        }
    }

    public void func_1005_a(int p_1005_1_, int p_1005_2_, int p_1005_3_, TileEntity p_1005_4_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_1005_1_, p_1005_2_, p_1005_3_);
        p_1005_4_.field_824_e = field_1537_d;
        p_1005_4_.field_823_f = field_1531_j * 16 + p_1005_1_;
        p_1005_4_.field_822_g = p_1005_2_;
        p_1005_4_.field_821_h = field_1530_k * 16 + p_1005_3_;
        if(func_1008_a(p_1005_1_, p_1005_2_, p_1005_3_) == 0 || !(Block.field_345_n[func_1008_a(p_1005_1_, p_1005_2_, p_1005_3_)] instanceof BlockContainer))
        {
            return;
        } else
        {
            p_1005_4_.func_31004_j();
            field_1529_l.put(chunkposition, p_1005_4_);
            return;
        }
    }

    public void func_1023_e(int p_1023_1_, int p_1023_2_, int p_1023_3_)
    {
        ChunkPosition chunkposition = new ChunkPosition(p_1023_1_, p_1023_2_, p_1023_3_);
        if(field_1538_c)
        {
            TileEntity tileentity = (TileEntity)field_1529_l.remove(chunkposition);
            if(tileentity != null)
            {
                tileentity.func_31005_i();
            }
        }
    }

    public void func_995_d()
    {
        field_1538_c = true;
        field_1537_d.func_31054_a(field_1529_l.values());
        for(int i = 0; i < field_48502_j.length; i++)
        {
            field_1537_d.func_636_a(field_48502_j[i]);
        }

    }

    public void func_998_e()
    {
        field_1538_c = false;
        TileEntity tileentity;
        for(Iterator iterator = field_1529_l.values().iterator(); iterator.hasNext(); field_1537_d.func_35455_a(tileentity))
        {
            tileentity = (TileEntity)iterator.next();
        }

        for(int i = 0; i < field_48502_j.length; i++)
        {
            field_1537_d.func_632_b(field_48502_j[i]);
        }

    }

    public void func_1006_f()
    {
        field_1526_o = true;
    }

    public void func_994_a(Entity p_994_1_, AxisAlignedBB p_994_2_, List p_994_3_)
    {
        int i = MathHelper.func_1108_b((p_994_2_.field_1697_b - 2D) / 16D);
        int j = MathHelper.func_1108_b((p_994_2_.field_1702_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        }
        if(j >= field_48502_j.length)
        {
            j = field_48502_j.length - 1;
        }
        for(int k = i; k <= j; k++)
        {
            List list = field_48502_j[k];
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                if(entity == p_994_1_ || !entity.field_601_au.func_1178_a(p_994_2_))
                {
                    continue;
                }
                p_994_3_.add(entity);
                Entity aentity[] = entity.func_40048_X();
                if(aentity == null)
                {
                    continue;
                }
                for(int i1 = 0; i1 < aentity.length; i1++)
                {
                    Entity entity1 = aentity[i1];
                    if(entity1 != p_994_1_ && entity1.field_601_au.func_1178_a(p_994_2_))
                    {
                        p_994_3_.add(entity1);
                    }
                }

            }

        }

    }

    public void func_1013_a(Class p_1013_1_, AxisAlignedBB p_1013_2_, List p_1013_3_)
    {
        int i = MathHelper.func_1108_b((p_1013_2_.field_1697_b - 2D) / 16D);
        int j = MathHelper.func_1108_b((p_1013_2_.field_1702_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        } else
        if(i >= field_48502_j.length)
        {
            i = field_48502_j.length - 1;
        }
        if(j >= field_48502_j.length)
        {
            j = field_48502_j.length - 1;
        } else
        if(j < 0)
        {
            j = 0;
        }
        for(int k = i; k <= j; k++)
        {
            List list = field_48502_j[k];
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                if(p_1013_1_.isAssignableFrom(entity.getClass()) && entity.field_601_au.func_1178_a(p_1013_2_))
                {
                    p_1013_3_.add(entity);
                }
            }

        }

    }

    public boolean func_1012_a(boolean p_1012_1_)
    {
        if(p_1012_1_)
        {
            if(field_1523_r && field_1537_d.func_22139_r() != field_1522_s)
            {
                return true;
            }
        } else
        if(field_1523_r && field_1537_d.func_22139_r() >= field_1522_s + 600L)
        {
            return true;
        }
        return field_1526_o;
    }

    public Random func_997_a(long p_997_1_)
    {
        return new Random(field_1537_d.func_22138_q() + (long)(field_1531_j * field_1531_j * 0x4c1906) + (long)(field_1531_j * 0x5ac0db) + (long)(field_1530_k * field_1530_k) * 0x4307a7L + (long)(field_1530_k * 0x5f24f) ^ p_997_1_);
    }

    public boolean func_21167_h()
    {
        return false;
    }

    public void func_25124_i()
    {
        ExtendedBlockStorage aextendedblockstorage[] = field_48505_p;
        int i = aextendedblockstorage.length;
        for(int j = 0; j < i; j++)
        {
            ExtendedBlockStorage extendedblockstorage = aextendedblockstorage[j];
            if(extendedblockstorage != null)
            {
                extendedblockstorage.func_48711_e();
            }
        }

    }

    public void func_35843_a(IChunkProvider p_35843_1_, IChunkProvider p_35843_2_, int p_35843_3_, int p_35843_4_)
    {
        if(!field_1527_n && p_35843_1_.func_537_a(p_35843_3_ + 1, p_35843_4_ + 1) && p_35843_1_.func_537_a(p_35843_3_, p_35843_4_ + 1) && p_35843_1_.func_537_a(p_35843_3_ + 1, p_35843_4_))
        {
            p_35843_1_.func_534_a(p_35843_2_, p_35843_3_, p_35843_4_);
        }
        if(p_35843_1_.func_537_a(p_35843_3_ - 1, p_35843_4_) && !p_35843_1_.func_533_b(p_35843_3_ - 1, p_35843_4_).field_1527_n && p_35843_1_.func_537_a(p_35843_3_ - 1, p_35843_4_ + 1) && p_35843_1_.func_537_a(p_35843_3_, p_35843_4_ + 1) && p_35843_1_.func_537_a(p_35843_3_ - 1, p_35843_4_ + 1))
        {
            p_35843_1_.func_534_a(p_35843_2_, p_35843_3_ - 1, p_35843_4_);
        }
        if(p_35843_1_.func_537_a(p_35843_3_, p_35843_4_ - 1) && !p_35843_1_.func_533_b(p_35843_3_, p_35843_4_ - 1).field_1527_n && p_35843_1_.func_537_a(p_35843_3_ + 1, p_35843_4_ - 1) && p_35843_1_.func_537_a(p_35843_3_ + 1, p_35843_4_ - 1) && p_35843_1_.func_537_a(p_35843_3_ + 1, p_35843_4_))
        {
            p_35843_1_.func_534_a(p_35843_2_, p_35843_3_, p_35843_4_ - 1);
        }
        if(p_35843_1_.func_537_a(p_35843_3_ - 1, p_35843_4_ - 1) && !p_35843_1_.func_533_b(p_35843_3_ - 1, p_35843_4_ - 1).field_1527_n && p_35843_1_.func_537_a(p_35843_3_, p_35843_4_ - 1) && p_35843_1_.func_537_a(p_35843_3_ - 1, p_35843_4_))
        {
            p_35843_1_.func_534_a(p_35843_2_, p_35843_3_ - 1, p_35843_4_ - 1);
        }
    }

    public int func_35840_c(int p_35840_1_, int p_35840_2_)
    {
        int i = p_35840_1_ | p_35840_2_ << 4;
        int j = field_35845_c[i];
        if(j == -999)
        {
            int k = func_48498_h() + 15;
            for(j = -1; k > 0 && j == -1;)
            {
                int l = func_1008_a(p_35840_1_, k, p_35840_2_);
                Material material = l != 0 ? Block.field_345_n[l].field_356_bn : Material.field_1337_a;
                if(!material.func_880_c() && !material.func_879_d())
                {
                    k--;
                } else
                {
                    j = k + 1;
                }
            }

            field_35845_c[i] = j;
        }
        return j;
    }

    public void func_35841_j()
    {
        if(field_40741_v && !field_1537_d.field_4209_q.field_6478_e)
        {
            func_35839_k();
        }
    }

    public ChunkCoordIntPair func_40740_k()
    {
        return new ChunkCoordIntPair(field_1531_j, field_1530_k);
    }

    public boolean func_48492_c(int p_48492_1_, int p_48492_2_)
    {
        if(p_48492_1_ < 0)
        {
            p_48492_1_ = 0;
        }
        if(p_48492_2_ >= 256)
        {
            p_48492_2_ = 255;
        }
        for(int i = p_48492_1_; i <= p_48492_2_; i += 16)
        {
            ExtendedBlockStorage extendedblockstorage = field_48505_p[i >> 4];
            if(extendedblockstorage != null && !extendedblockstorage.func_48693_a())
            {
                return false;
            }
        }

        return true;
    }

    public void func_48500_a(ExtendedBlockStorage p_48500_1_[])
    {
        field_48505_p = p_48500_1_;
    }

    public void func_48494_a(byte p_48494_1_[], int p_48494_2_, int p_48494_3_, boolean p_48494_4_)
    {
        int i = 0;
        for(int j = 0; j < field_48505_p.length; j++)
        {
            if((p_48494_2_ & 1 << j) != 0)
            {
                if(field_48505_p[j] == null)
                {
                    field_48505_p[j] = new ExtendedBlockStorage(j << 4);
                }
                byte abyte0[] = field_48505_p[j].func_48692_g();
                System.arraycopy(p_48494_1_, i, abyte0, 0, abyte0.length);
                i += abyte0.length;
                continue;
            }
            if(p_48494_4_ && field_48505_p[j] != null)
            {
                field_48505_p[j] = null;
            }
        }

        for(int k = 0; k < field_48505_p.length; k++)
        {
            if((p_48494_2_ & 1 << k) != 0 && field_48505_p[k] != null)
            {
                NibbleArray nibblearray = field_48505_p[k].func_48697_j();
                System.arraycopy(p_48494_1_, i, nibblearray.field_1109_a, 0, nibblearray.field_1109_a.length);
                i += nibblearray.field_1109_a.length;
            }
        }

        for(int l = 0; l < field_48505_p.length; l++)
        {
            if((p_48494_2_ & 1 << l) != 0 && field_48505_p[l] != null)
            {
                NibbleArray nibblearray1 = field_48505_p[l].func_48705_k();
                System.arraycopy(p_48494_1_, i, nibblearray1.field_1109_a, 0, nibblearray1.field_1109_a.length);
                i += nibblearray1.field_1109_a.length;
            }
        }

        for(int i1 = 0; i1 < field_48505_p.length; i1++)
        {
            if((p_48494_2_ & 1 << i1) != 0 && field_48505_p[i1] != null)
            {
                NibbleArray nibblearray2 = field_48505_p[i1].func_48714_l();
                System.arraycopy(p_48494_1_, i, nibblearray2.field_1109_a, 0, nibblearray2.field_1109_a.length);
                i += nibblearray2.field_1109_a.length;
            }
        }

        for(int j1 = 0; j1 < field_48505_p.length; j1++)
        {
            if((p_48494_3_ & 1 << j1) != 0)
            {
                if(field_48505_p[j1] == null)
                {
                    i += 2048;
                    continue;
                }
                NibbleArray nibblearray3 = field_48505_p[j1].func_48704_i();
                if(nibblearray3 == null)
                {
                    nibblearray3 = field_48505_p[j1].func_48696_m();
                }
                System.arraycopy(p_48494_1_, i, nibblearray3.field_1109_a, 0, nibblearray3.field_1109_a.length);
                i += nibblearray3.field_1109_a.length;
                continue;
            }
            if(p_48494_4_ && field_48505_p[j1] != null && field_48505_p[j1].func_48704_i() != null)
            {
                field_48505_p[j1].func_48715_h();
            }
        }

        if(p_48494_4_)
        {
            System.arraycopy(p_48494_1_, i, field_48504_q, 0, field_48504_q.length);
            i += field_48504_q.length;
        }
        for(int k1 = 0; k1 < field_48505_p.length; k1++)
        {
            if(field_48505_p[k1] != null && (p_48494_2_ & 1 << k1) != 0)
            {
                field_48505_p[k1].func_48708_d();
            }
        }

        func_1018_b();
        TileEntity tileentity;
        for(Iterator iterator = field_1529_l.values().iterator(); iterator.hasNext(); tileentity.func_35144_b())
        {
            tileentity = (TileEntity)iterator.next();
        }

    }

    public BiomeGenBase func_48490_a(int p_48490_1_, int p_48490_2_, WorldChunkManager p_48490_3_)
    {
        int i = field_48504_q[p_48490_2_ << 4 | p_48490_1_] & 0xff;
        if(i == 255)
        {
            BiomeGenBase biomegenbase = p_48490_3_.func_4073_a((field_1531_j << 4) + p_48490_1_, (field_1530_k << 4) + p_48490_2_);
            i = biomegenbase.field_35494_y;
            field_48504_q[p_48490_2_ << 4 | p_48490_1_] = (byte)(i & 0xff);
        }
        if(BiomeGenBase.field_35486_a[i] == null)
        {
            return BiomeGenBase.field_35485_c;
        } else
        {
            return BiomeGenBase.field_35486_a[i];
        }
    }

    public byte[] func_48493_m()
    {
        return field_48504_q;
    }

    public void func_48497_a(byte p_48497_1_[])
    {
        field_48504_q = p_48497_1_;
    }

    public void func_48496_n()
    {
        field_48503_s = 0;
    }

    public void func_48491_o()
    {
        for(int i = 0; i < 8; i++)
        {
            if(field_48503_s >= 4096)
            {
                return;
            }
            int j = field_48503_s % 16;
            int k = (field_48503_s / 16) % 16;
            int l = field_48503_s / 256;
            field_48503_s++;
            int i1 = (field_1531_j << 4) + k;
            int j1 = (field_1530_k << 4) + l;
            for(int k1 = 0; k1 < 16; k1++)
            {
                int l1 = (j << 4) + k1;
                if((field_48505_p[j] != null || k1 != 0 && k1 != 15 && k != 0 && k != 15 && l != 0 && l != 15) && (field_48505_p[j] == null || field_48505_p[j].func_48703_a(k, k1, l) != 0))
                {
                    continue;
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1, l1 - 1, j1)] > 0)
                {
                    field_1537_d.func_35463_p(i1, l1 - 1, j1);
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1, l1 + 1, j1)] > 0)
                {
                    field_1537_d.func_35463_p(i1, l1 + 1, j1);
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1 - 1, l1, j1)] > 0)
                {
                    field_1537_d.func_35463_p(i1 - 1, l1, j1);
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1 + 1, l1, j1)] > 0)
                {
                    field_1537_d.func_35463_p(i1 + 1, l1, j1);
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1, l1, j1 - 1)] > 0)
                {
                    field_1537_d.func_35463_p(i1, l1, j1 - 1);
                }
                if(Block.field_339_t[field_1537_d.func_600_a(i1, l1, j1 + 1)] > 0)
                {
                    field_1537_d.func_35463_p(i1, l1, j1 + 1);
                }
                field_1537_d.func_35463_p(i1, l1, j1);
            }

        }

    }
}
