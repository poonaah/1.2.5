// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            AxisAlignedBB, RenderItem, Reflector, Chunk, 
//            ChunkCache, RenderBlocks, Tessellator, Block, 
//            TileEntityRenderer, Entity, ICamera, Config, 
//            World

public class WorldRenderer
{

    public World field_1763_a;
    private int field_1744_C;
    public static int field_1762_b = 0;
    public int field_1761_c;
    public int field_1760_d;
    public int field_1759_e;
    public int field_1755_i;
    public int field_1754_j;
    public int field_1753_k;
    public int field_1752_l;
    public int field_1751_m;
    public int field_1750_n;
    public boolean field_1749_o;
    public boolean field_1748_p[];
    public int field_1746_q;
    public int field_1743_r;
    public int field_1741_s;
    public boolean field_1738_u;
    public AxisAlignedBB field_1736_v;
    public int field_1735_w;
    public boolean field_1734_x;
    public boolean field_1733_y;
    public int field_1732_z;
    public boolean field_1747_A;
    private boolean field_1739_E;
    public List field_1745_B;
    private List field_1737_F;
    private int field_40590_G;
    public boolean isVisibleFromPosition;
    public double visibleFromX;
    public double visibleFromY;
    public double visibleFromZ;
    private boolean needsBoxUpdate;
    public boolean isInFrustrumFully;
    public static int globalChunkOffsetX = 0;
    public static int globalChunkOffsetZ = 0;

    public WorldRenderer(World p_i1030_1_, List p_i1030_2_, int p_i1030_3_, int p_i1030_4_, int p_i1030_5_, int p_i1030_6_)
    {
        isVisibleFromPosition = false;
        needsBoxUpdate = false;
        isInFrustrumFully = false;
        field_1744_C = -1;
        field_1749_o = false;
        field_1748_p = new boolean[2];
        field_1734_x = true;
        field_1739_E = false;
        field_1745_B = new ArrayList();
        field_1763_a = p_i1030_1_;
        field_1737_F = p_i1030_2_;
        field_1744_C = p_i1030_6_;
        field_1761_c = -999;
        func_1197_a(p_i1030_3_, p_i1030_4_, p_i1030_5_);
        field_1738_u = false;
    }

    public void func_1197_a(int p_1197_1_, int p_1197_2_, int p_1197_3_)
    {
        if(p_1197_1_ == field_1761_c && p_1197_2_ == field_1760_d && p_1197_3_ == field_1759_e)
        {
            return;
        } else
        {
            func_1195_b();
            field_1761_c = p_1197_1_;
            field_1760_d = p_1197_2_;
            field_1759_e = p_1197_3_;
            field_1746_q = p_1197_1_ + 8;
            field_1743_r = p_1197_2_ + 8;
            field_1741_s = p_1197_3_ + 8;
            field_1752_l = p_1197_1_ & 0x3ff;
            field_1751_m = p_1197_2_;
            field_1750_n = p_1197_3_ & 0x3ff;
            field_1755_i = p_1197_1_ - field_1752_l;
            field_1754_j = p_1197_2_ - field_1751_m;
            field_1753_k = p_1197_3_ - field_1750_n;
            float f = 0.0F;
            field_1736_v = AxisAlignedBB.func_1168_a((float)p_1197_1_ - f, (float)p_1197_2_ - f, (float)p_1197_3_ - f, (float)(p_1197_1_ + 16) + f, (float)(p_1197_2_ + 16) + f, (float)(p_1197_3_ + 16) + f);
            needsBoxUpdate = true;
            func_1194_f();
            isVisibleFromPosition = false;
            return;
        }
    }

    private void func_1203_g()
    {
        GL11.glTranslatef(field_1752_l, field_1751_m, field_1750_n);
    }

    public void func_1198_a()
    {
        if(field_1763_a == null)
        {
            return;
        }
        if(!field_1738_u)
        {
            return;
        }
        if(needsBoxUpdate)
        {
            float f = 0.0F;
            GL11.glNewList(field_1744_C + 2, 4864);
            RenderItem.func_142_a(AxisAlignedBB.func_1161_b((float)field_1752_l - f, (float)field_1751_m - f, (float)field_1750_n - f, (float)(field_1752_l + 16) + f, (float)(field_1751_m + 16) + f, (float)(field_1750_n + 16) + f));
            GL11.glEndList();
            needsBoxUpdate = false;
        }
        field_1734_x = true;
        isVisibleFromPosition = false;
        field_1738_u = false;
        int i = field_1761_c;
        int j = field_1760_d;
        int k = field_1759_e;
        int l = field_1761_c + 16;
        int i1 = field_1760_d + 16;
        int j1 = field_1759_e + 16;
        for(int k1 = 0; k1 < 2; k1++)
        {
            field_1748_p[k1] = true;
        }

        if(Reflector.hasClass(3))
        {
            Object obj = Reflector.getFieldValue(30);
            Reflector.callVoid(obj, 30, new Object[0]);
            Reflector.callVoid(40, new Object[0]);
        }
        Chunk.field_1540_a = false;
        HashSet hashset = new HashSet();
        hashset.addAll(field_1745_B);
        field_1745_B.clear();
        int l1 = 1;
        ChunkCache chunkcache = new ChunkCache(field_1763_a, i - l1, j - l1, k - l1, l + l1, i1 + l1, j1 + l1);
        if(!chunkcache.func_48452_a())
        {
            field_1762_b++;
            RenderBlocks renderblocks = new RenderBlocks(chunkcache);
            field_40590_G = 0;
            Tessellator tessellator = Tessellator.field_1512_a;
            boolean flag = Reflector.hasClass(1);
            int i2 = 0;
            do
            {
                if(i2 >= 2)
                {
                    break;
                }
                boolean flag1 = false;
                boolean flag2 = false;
                boolean flag3 = false;
                for(int j2 = j; j2 < i1; j2++)
                {
                    for(int k2 = k; k2 < j1; k2++)
                    {
                        for(int l2 = i; l2 < l; l2++)
                        {
                            int i3 = chunkcache.func_600_a(l2, j2, k2);
                            if(i3 <= 0)
                            {
                                continue;
                            }
                            if(!flag3)
                            {
                                flag3 = true;
                                GL11.glNewList(field_1744_C + i2, 4864);
                                tessellator.setRenderingChunk(true);
                                if(flag)
                                {
                                    Reflector.callVoid(13, new Object[] {
                                        Integer.valueOf(i2)
                                    });
                                }
                                tessellator.func_977_b();
                                tessellator.func_984_b(-globalChunkOffsetX, 0.0D, -globalChunkOffsetZ);
                            }
                            Block block = Block.field_345_n[i3];
                            if(i2 == 0 && block.func_48205_p())
                            {
                                TileEntity tileentity = chunkcache.func_603_b(l2, j2, k2);
                                if(TileEntityRenderer.field_1554_a.func_1028_a(tileentity))
                                {
                                    field_1745_B.add(tileentity);
                                }
                            }
                            int j3 = block.func_234_g();
                            boolean flag4 = true;
                            if(j3 != i2)
                            {
                                flag1 = true;
                                flag4 = false;
                            }
                            if(flag)
                            {
                                flag4 = Reflector.callBoolean(11, new Object[] {
                                    block, Integer.valueOf(i2)
                                });
                            }
                            if(!flag4)
                            {
                                continue;
                            }
                            if(flag)
                            {
                                Reflector.callVoid(15, new Object[] {
                                    block, renderblocks
                                });
                            }
                            flag2 |= renderblocks.func_1234_a(block, l2, j2, k2);
                            if(flag)
                            {
                                Reflector.callVoid(16, new Object[] {
                                    block, renderblocks
                                });
                            }
                        }

                    }

                }

                if(flag3)
                {
                    if(flag)
                    {
                        Reflector.callVoid(14, new Object[] {
                            Integer.valueOf(i2)
                        });
                    }
                    field_40590_G += tessellator.func_982_a();
                    GL11.glEndList();
                    tessellator.setRenderingChunk(false);
                    tessellator.func_984_b(0.0D, 0.0D, 0.0D);
                } else
                {
                    flag2 = false;
                }
                if(flag2)
                {
                    field_1748_p[i2] = false;
                }
                if(!flag1)
                {
                    break;
                }
                i2++;
            } while(true);
        }
        HashSet hashset1 = new HashSet();
        hashset1.addAll(field_1745_B);
        hashset1.removeAll(hashset);
        field_1737_F.addAll(hashset1);
        hashset.removeAll(field_1745_B);
        field_1737_F.removeAll(hashset);
        field_1747_A = Chunk.field_1540_a;
        field_1739_E = true;
    }

    public float func_1202_a(Entity p_1202_1_)
    {
        float f = (float)(p_1202_1_.field_611_ak - (double)field_1746_q);
        float f1 = (float)(p_1202_1_.field_610_al - (double)field_1743_r);
        float f2 = (float)(p_1202_1_.field_609_am - (double)field_1741_s);
        return f * f + f1 * f1 + f2 * f2;
    }

    public void func_1195_b()
    {
        for(int i = 0; i < 2; i++)
        {
            field_1748_p[i] = true;
        }

        field_1749_o = false;
        field_1739_E = false;
    }

    public void func_1204_c()
    {
        func_1195_b();
        field_1763_a = null;
    }

    public int func_1200_a(int p_1200_1_)
    {
        if(!field_1749_o)
        {
            return -1;
        }
        if(!field_1748_p[p_1200_1_])
        {
            return field_1744_C + p_1200_1_;
        } else
        {
            return -1;
        }
    }

    public void func_1199_a(ICamera p_1199_1_)
    {
        field_1749_o = p_1199_1_.func_342_a(field_1736_v);
        if(field_1749_o && Config.isOcclusionEnabled() && Config.isOcclusionFancy())
        {
            isInFrustrumFully = p_1199_1_.isBoundingBoxInFrustumFully(field_1736_v);
        } else
        {
            isInFrustrumFully = false;
        }
    }

    public void func_1201_d()
    {
        GL11.glCallList(field_1744_C + 2);
    }

    public boolean func_1196_e()
    {
        if(!field_1739_E)
        {
            return false;
        } else
        {
            return field_1748_p[0] && field_1748_p[1];
        }
    }

    public void func_1194_f()
    {
        field_1738_u = true;
    }

}
