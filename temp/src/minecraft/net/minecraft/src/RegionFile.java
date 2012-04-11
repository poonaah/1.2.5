// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

// Referenced classes of package net.minecraft.src:
//            RegionFileChunkBuffer

public class RegionFile
{

    private static final byte field_22213_a[] = new byte[4096];
    private final File field_22212_b;
    private RandomAccessFile field_22219_c;
    private final int field_22218_d[] = new int[1024];
    private final int field_22217_e[] = new int[1024];
    private ArrayList field_22216_f;
    private int field_22215_g;
    private long field_22214_h;

    public RegionFile(File p_i442_1_)
    {
        field_22214_h = 0L;
        field_22212_b = p_i442_1_;
        func_22204_b((new StringBuilder()).append("REGION LOAD ").append(field_22212_b).toString());
        field_22215_g = 0;
        try
        {
            if(p_i442_1_.exists())
            {
                field_22214_h = p_i442_1_.lastModified();
            }
            field_22219_c = new RandomAccessFile(p_i442_1_, "rw");
            if(field_22219_c.length() < 4096L)
            {
                for(int i = 0; i < 1024; i++)
                {
                    field_22219_c.writeInt(0);
                }

                for(int j = 0; j < 1024; j++)
                {
                    field_22219_c.writeInt(0);
                }

                field_22215_g += 8192;
            }
            if((field_22219_c.length() & 4095L) != 0L)
            {
                for(int k = 0; (long)k < (field_22219_c.length() & 4095L); k++)
                {
                    field_22219_c.write(0);
                }

            }
            int l = (int)field_22219_c.length() / 4096;
            field_22216_f = new ArrayList(l);
            for(int i1 = 0; i1 < l; i1++)
            {
                field_22216_f.add(Boolean.valueOf(true));
            }

            field_22216_f.set(0, Boolean.valueOf(false));
            field_22216_f.set(1, Boolean.valueOf(false));
            field_22219_c.seek(0L);
            for(int j1 = 0; j1 < 1024; j1++)
            {
                int l1 = field_22219_c.readInt();
                field_22218_d[j1] = l1;
                if(l1 == 0 || (l1 >> 8) + (l1 & 0xff) > field_22216_f.size())
                {
                    continue;
                }
                for(int j2 = 0; j2 < (l1 & 0xff); j2++)
                {
                    field_22216_f.set((l1 >> 8) + j2, Boolean.valueOf(false));
                }

            }

            for(int k1 = 0; k1 < 1024; k1++)
            {
                int i2 = field_22219_c.readInt();
                field_22217_e[k1] = i2;
            }

        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_22211_a(String s)
    {
    }

    private void func_22204_b(String p_22204_1_)
    {
        func_22211_a((new StringBuilder()).append(p_22204_1_).append("\n").toString());
    }

    private void func_22199_a(String p_22199_1_, int p_22199_2_, int p_22199_3_, String p_22199_4_)
    {
        func_22211_a((new StringBuilder()).append("REGION ").append(p_22199_1_).append(" ").append(field_22212_b.getName()).append("[").append(p_22199_2_).append(",").append(p_22199_3_).append("] = ").append(p_22199_4_).toString());
    }

    private void func_22197_a(String p_22197_1_, int p_22197_2_, int p_22197_3_, int p_22197_4_, String p_22197_5_)
    {
        func_22211_a((new StringBuilder()).append("REGION ").append(p_22197_1_).append(" ").append(field_22212_b.getName()).append("[").append(p_22197_2_).append(",").append(p_22197_3_).append("] ").append(p_22197_4_).append("B = ").append(p_22197_5_).toString());
    }

    private void func_22201_b(String p_22201_1_, int p_22201_2_, int p_22201_3_, String p_22201_4_)
    {
        func_22199_a(p_22201_1_, p_22201_2_, p_22201_3_, (new StringBuilder()).append(p_22201_4_).append("\n").toString());
    }

    public synchronized DataInputStream func_22210_a(int p_22210_1_, int p_22210_2_)
    {
        if(func_22206_d(p_22210_1_, p_22210_2_))
        {
            func_22201_b("READ", p_22210_1_, p_22210_2_, "out of bounds");
            return null;
        }
        try
        {
            int i = func_22207_e(p_22210_1_, p_22210_2_);
            if(i == 0)
            {
                return null;
            }
            int j = i >> 8;
            int k = i & 0xff;
            if(j + k > field_22216_f.size())
            {
                func_22201_b("READ", p_22210_1_, p_22210_2_, "invalid sector");
                return null;
            }
            field_22219_c.seek(j * 4096);
            int l = field_22219_c.readInt();
            if(l > 4096 * k)
            {
                func_22201_b("READ", p_22210_1_, p_22210_2_, (new StringBuilder()).append("invalid length: ").append(l).append(" > 4096 * ").append(k).toString());
                return null;
            }
            if(l <= 0)
            {
                func_22201_b("READ", p_22210_1_, p_22210_2_, (new StringBuilder()).append("invalid length: ").append(l).append(" < 1").toString());
                return null;
            }
            byte byte0 = field_22219_c.readByte();
            if(byte0 == 1)
            {
                byte abyte0[] = new byte[l - 1];
                field_22219_c.read(abyte0);
                DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(abyte0))));
                return datainputstream;
            }
            if(byte0 == 2)
            {
                byte abyte1[] = new byte[l - 1];
                field_22219_c.read(abyte1);
                DataInputStream datainputstream1 = new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(abyte1))));
                return datainputstream1;
            } else
            {
                func_22201_b("READ", p_22210_1_, p_22210_2_, (new StringBuilder()).append("unknown version ").append(byte0).toString());
                return null;
            }
        }
        catch(IOException ioexception)
        {
            func_22201_b("READ", p_22210_1_, p_22210_2_, "exception");
        }
        return null;
    }

    public DataOutputStream func_22205_b(int p_22205_1_, int p_22205_2_)
    {
        if(func_22206_d(p_22205_1_, p_22205_2_))
        {
            return null;
        } else
        {
            return new DataOutputStream(new DeflaterOutputStream(new RegionFileChunkBuffer(this, p_22205_1_, p_22205_2_)));
        }
    }

    protected synchronized void func_22203_a(int p_22203_1_, int p_22203_2_, byte p_22203_3_[], int p_22203_4_)
    {
        try
        {
            int i = func_22207_e(p_22203_1_, p_22203_2_);
            int j = i >> 8;
            int i1 = i & 0xff;
            int j1 = (p_22203_4_ + 5) / 4096 + 1;
            if(j1 >= 256)
            {
                return;
            }
            if(j != 0 && i1 == j1)
            {
                func_22197_a("SAVE", p_22203_1_, p_22203_2_, p_22203_4_, "rewrite");
                func_22200_a(j, p_22203_3_, p_22203_4_);
            } else
            {
                for(int k1 = 0; k1 < i1; k1++)
                {
                    field_22216_f.set(j + k1, Boolean.valueOf(true));
                }

                int l1 = field_22216_f.indexOf(Boolean.valueOf(true));
                int i2 = 0;
                if(l1 != -1)
                {
                    int j2 = l1;
                    do
                    {
                        if(j2 >= field_22216_f.size())
                        {
                            break;
                        }
                        if(i2 != 0)
                        {
                            if(((Boolean)field_22216_f.get(j2)).booleanValue())
                            {
                                i2++;
                            } else
                            {
                                i2 = 0;
                            }
                        } else
                        if(((Boolean)field_22216_f.get(j2)).booleanValue())
                        {
                            l1 = j2;
                            i2 = 1;
                        }
                        if(i2 >= j1)
                        {
                            break;
                        }
                        j2++;
                    } while(true);
                }
                if(i2 >= j1)
                {
                    func_22197_a("SAVE", p_22203_1_, p_22203_2_, p_22203_4_, "reuse");
                    int k = l1;
                    func_22198_a(p_22203_1_, p_22203_2_, k << 8 | j1);
                    for(int k2 = 0; k2 < j1; k2++)
                    {
                        field_22216_f.set(k + k2, Boolean.valueOf(false));
                    }

                    func_22200_a(k, p_22203_3_, p_22203_4_);
                } else
                {
                    func_22197_a("SAVE", p_22203_1_, p_22203_2_, p_22203_4_, "grow");
                    field_22219_c.seek(field_22219_c.length());
                    int l = field_22216_f.size();
                    for(int l2 = 0; l2 < j1; l2++)
                    {
                        field_22219_c.write(field_22213_a);
                        field_22216_f.add(Boolean.valueOf(false));
                    }

                    field_22215_g += 4096 * j1;
                    func_22200_a(l, p_22203_3_, p_22203_4_);
                    func_22198_a(p_22203_1_, p_22203_2_, l << 8 | j1);
                }
            }
            func_22208_b(p_22203_1_, p_22203_2_, (int)(System.currentTimeMillis() / 1000L));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_22200_a(int p_22200_1_, byte p_22200_2_[], int p_22200_3_)
        throws IOException
    {
        func_22204_b((new StringBuilder()).append(" ").append(p_22200_1_).toString());
        field_22219_c.seek(p_22200_1_ * 4096);
        field_22219_c.writeInt(p_22200_3_ + 1);
        field_22219_c.writeByte(2);
        field_22219_c.write(p_22200_2_, 0, p_22200_3_);
    }

    private boolean func_22206_d(int p_22206_1_, int p_22206_2_)
    {
        return p_22206_1_ < 0 || p_22206_1_ >= 32 || p_22206_2_ < 0 || p_22206_2_ >= 32;
    }

    private int func_22207_e(int p_22207_1_, int p_22207_2_)
    {
        return field_22218_d[p_22207_1_ + p_22207_2_ * 32];
    }

    public boolean func_22202_c(int p_22202_1_, int p_22202_2_)
    {
        return func_22207_e(p_22202_1_, p_22202_2_) != 0;
    }

    private void func_22198_a(int p_22198_1_, int p_22198_2_, int p_22198_3_)
        throws IOException
    {
        field_22218_d[p_22198_1_ + p_22198_2_ * 32] = p_22198_3_;
        field_22219_c.seek((p_22198_1_ + p_22198_2_ * 32) * 4);
        field_22219_c.writeInt(p_22198_3_);
    }

    private void func_22208_b(int p_22208_1_, int p_22208_2_, int p_22208_3_)
        throws IOException
    {
        field_22217_e[p_22208_1_ + p_22208_2_ * 32] = p_22208_3_;
        field_22219_c.seek(4096 + (p_22208_1_ + p_22208_2_ * 32) * 4);
        field_22219_c.writeInt(p_22208_3_);
    }

    public void func_22196_b()
        throws IOException
    {
        field_22219_c.close();
    }

}
