// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Path, IntHashMap, PathPoint, Entity, 
//            AxisAlignedBB, MathHelper, IBlockAccess, Block, 
//            Material, PathEntity

public class PathFinder
{

    private IBlockAccess field_1674_a;
    private Path field_1673_b;
    private IntHashMap field_1676_c;
    private PathPoint field_1675_d[];
    private boolean field_48617_e;
    private boolean field_48615_f;
    private boolean field_48616_g;
    private boolean field_48618_h;

    public PathFinder(IBlockAccess p_i1089_1_, boolean p_i1089_2_, boolean p_i1089_3_, boolean p_i1089_4_, boolean p_i1089_5_)
    {
        field_1673_b = new Path();
        field_1676_c = new IntHashMap();
        field_1675_d = new PathPoint[32];
        field_1674_a = p_i1089_1_;
        field_48617_e = p_i1089_2_;
        field_48615_f = p_i1089_3_;
        field_48616_g = p_i1089_4_;
        field_48618_h = p_i1089_5_;
    }

    public PathEntity func_1137_a(Entity p_1137_1_, Entity p_1137_2_, float p_1137_3_)
    {
        return func_1130_a(p_1137_1_, p_1137_2_.field_611_ak, p_1137_2_.field_601_au.field_1697_b, p_1137_2_.field_609_am, p_1137_3_);
    }

    public PathEntity func_1131_a(Entity p_1131_1_, int p_1131_2_, int p_1131_3_, int p_1131_4_, float p_1131_5_)
    {
        return func_1130_a(p_1131_1_, (float)p_1131_2_ + 0.5F, (float)p_1131_3_ + 0.5F, (float)p_1131_4_ + 0.5F, p_1131_5_);
    }

    private PathEntity func_1130_a(Entity p_1130_1_, double p_1130_2_, double p_1130_4_, double p_1130_6_, 
            float p_1130_8_)
    {
        field_1673_b.func_1038_a();
        field_1676_c.func_1058_a();
        boolean flag = field_48616_g;
        int i = MathHelper.func_1108_b(p_1130_1_.field_601_au.field_1697_b + 0.5D);
        if(field_48618_h && p_1130_1_.func_27013_ag())
        {
            i = (int)p_1130_1_.field_601_au.field_1697_b;
            for(int j = field_1674_a.func_600_a(MathHelper.func_1108_b(p_1130_1_.field_611_ak), i, MathHelper.func_1108_b(p_1130_1_.field_609_am)); j == Block.field_401_B.field_376_bc || j == Block.field_399_C.field_376_bc; j = field_1674_a.func_600_a(MathHelper.func_1108_b(p_1130_1_.field_611_ak), i, MathHelper.func_1108_b(p_1130_1_.field_609_am)))
            {
                i++;
            }

            flag = field_48616_g;
            field_48616_g = false;
        } else
        {
            i = MathHelper.func_1108_b(p_1130_1_.field_601_au.field_1697_b + 0.5D);
        }
        PathPoint pathpoint = func_1136_a(MathHelper.func_1108_b(p_1130_1_.field_601_au.field_1698_a), i, MathHelper.func_1108_b(p_1130_1_.field_601_au.field_1704_c));
        PathPoint pathpoint1 = func_1136_a(MathHelper.func_1108_b(p_1130_2_ - (double)(p_1130_1_.field_644_aC / 2.0F)), MathHelper.func_1108_b(p_1130_4_), MathHelper.func_1108_b(p_1130_6_ - (double)(p_1130_1_.field_644_aC / 2.0F)));
        PathPoint pathpoint2 = new PathPoint(MathHelper.func_1110_d(p_1130_1_.field_644_aC + 1.0F), MathHelper.func_1110_d(p_1130_1_.field_643_aD + 1.0F), MathHelper.func_1110_d(p_1130_1_.field_644_aC + 1.0F));
        PathEntity pathentity = func_1129_a(p_1130_1_, pathpoint, pathpoint1, pathpoint2, p_1130_8_);
        field_48616_g = flag;
        return pathentity;
    }

    private PathEntity func_1129_a(Entity p_1129_1_, PathPoint p_1129_2_, PathPoint p_1129_3_, PathPoint p_1129_4_, float p_1129_5_)
    {
        p_1129_2_.field_1713_f = 0.0F;
        p_1129_2_.field_1712_g = p_1129_2_.func_1180_a(p_1129_3_);
        p_1129_2_.field_1711_h = p_1129_2_.field_1712_g;
        field_1673_b.func_1038_a();
        field_1673_b.func_1034_a(p_1129_2_);
        PathPoint pathpoint = p_1129_2_;
        while(!field_1673_b.func_1039_c()) 
        {
            PathPoint pathpoint1 = field_1673_b.func_1036_b();
            if(pathpoint1.equals(p_1129_3_))
            {
                return func_1134_a(p_1129_2_, p_1129_3_);
            }
            if(pathpoint1.func_1180_a(p_1129_3_) < pathpoint.func_1180_a(p_1129_3_))
            {
                pathpoint = pathpoint1;
            }
            pathpoint1.field_1709_j = true;
            int i = func_1133_b(p_1129_1_, pathpoint1, p_1129_4_, p_1129_3_, p_1129_5_);
            int j = 0;
            while(j < i) 
            {
                PathPoint pathpoint2 = field_1675_d[j];
                float f = pathpoint1.field_1713_f + pathpoint1.func_1180_a(pathpoint2);
                if(!pathpoint2.func_1179_a() || f < pathpoint2.field_1713_f)
                {
                    pathpoint2.field_1710_i = pathpoint1;
                    pathpoint2.field_1713_f = f;
                    pathpoint2.field_1712_g = pathpoint2.func_1180_a(p_1129_3_);
                    if(pathpoint2.func_1179_a())
                    {
                        field_1673_b.func_1035_a(pathpoint2, pathpoint2.field_1713_f + pathpoint2.field_1712_g);
                    } else
                    {
                        pathpoint2.field_1711_h = pathpoint2.field_1713_f + pathpoint2.field_1712_g;
                        field_1673_b.func_1034_a(pathpoint2);
                    }
                }
                j++;
            }
        }
        if(pathpoint == p_1129_2_)
        {
            return null;
        } else
        {
            return func_1134_a(p_1129_2_, pathpoint);
        }
    }

    private int func_1133_b(Entity p_1133_1_, PathPoint p_1133_2_, PathPoint p_1133_3_, PathPoint p_1133_4_, float p_1133_5_)
    {
        int i = 0;
        int j = 0;
        if(func_1132_a(p_1133_1_, p_1133_2_.field_1718_a, p_1133_2_.field_1717_b + 1, p_1133_2_.field_1716_c, p_1133_3_) == 1)
        {
            j = 1;
        }
        PathPoint pathpoint = func_1135_a(p_1133_1_, p_1133_2_.field_1718_a, p_1133_2_.field_1717_b, p_1133_2_.field_1716_c + 1, p_1133_3_, j);
        PathPoint pathpoint1 = func_1135_a(p_1133_1_, p_1133_2_.field_1718_a - 1, p_1133_2_.field_1717_b, p_1133_2_.field_1716_c, p_1133_3_, j);
        PathPoint pathpoint2 = func_1135_a(p_1133_1_, p_1133_2_.field_1718_a + 1, p_1133_2_.field_1717_b, p_1133_2_.field_1716_c, p_1133_3_, j);
        PathPoint pathpoint3 = func_1135_a(p_1133_1_, p_1133_2_.field_1718_a, p_1133_2_.field_1717_b, p_1133_2_.field_1716_c - 1, p_1133_3_, j);
        if(pathpoint != null && !pathpoint.field_1709_j && pathpoint.func_1180_a(p_1133_4_) < p_1133_5_)
        {
            field_1675_d[i++] = pathpoint;
        }
        if(pathpoint1 != null && !pathpoint1.field_1709_j && pathpoint1.func_1180_a(p_1133_4_) < p_1133_5_)
        {
            field_1675_d[i++] = pathpoint1;
        }
        if(pathpoint2 != null && !pathpoint2.field_1709_j && pathpoint2.func_1180_a(p_1133_4_) < p_1133_5_)
        {
            field_1675_d[i++] = pathpoint2;
        }
        if(pathpoint3 != null && !pathpoint3.field_1709_j && pathpoint3.func_1180_a(p_1133_4_) < p_1133_5_)
        {
            field_1675_d[i++] = pathpoint3;
        }
        return i;
    }

    private PathPoint func_1135_a(Entity p_1135_1_, int p_1135_2_, int p_1135_3_, int p_1135_4_, PathPoint p_1135_5_, int p_1135_6_)
    {
        PathPoint pathpoint = null;
        int i = func_1132_a(p_1135_1_, p_1135_2_, p_1135_3_, p_1135_4_, p_1135_5_);
        if(i == 2)
        {
            return func_1136_a(p_1135_2_, p_1135_3_, p_1135_4_);
        }
        if(i == 1)
        {
            pathpoint = func_1136_a(p_1135_2_, p_1135_3_, p_1135_4_);
        }
        if(pathpoint == null && p_1135_6_ > 0 && i != -3 && i != -4 && func_1132_a(p_1135_1_, p_1135_2_, p_1135_3_ + p_1135_6_, p_1135_4_, p_1135_5_) == 1)
        {
            pathpoint = func_1136_a(p_1135_2_, p_1135_3_ + p_1135_6_, p_1135_4_);
            p_1135_3_ += p_1135_6_;
        }
        if(pathpoint != null)
        {
            int j = 0;
            int k = 0;
            do
            {
                if(p_1135_3_ <= 0)
                {
                    break;
                }
                k = func_1132_a(p_1135_1_, p_1135_2_, p_1135_3_ - 1, p_1135_4_, p_1135_5_);
                if(field_48616_g && k == -1)
                {
                    return null;
                }
                if(k != 1)
                {
                    break;
                }
                if(++j >= 4)
                {
                    return null;
                }
                if(--p_1135_3_ > 0)
                {
                    pathpoint = func_1136_a(p_1135_2_, p_1135_3_, p_1135_4_);
                }
            } while(true);
            if(k == -2)
            {
                return null;
            }
        }
        return pathpoint;
    }

    private final PathPoint func_1136_a(int p_1136_1_, int p_1136_2_, int p_1136_3_)
    {
        int i = PathPoint.func_22329_a(p_1136_1_, p_1136_2_, p_1136_3_);
        PathPoint pathpoint = (PathPoint)field_1676_c.func_1057_a(i);
        if(pathpoint == null)
        {
            pathpoint = new PathPoint(p_1136_1_, p_1136_2_, p_1136_3_);
            field_1676_c.func_1061_a(i, pathpoint);
        }
        return pathpoint;
    }

    private int func_1132_a(Entity p_1132_1_, int p_1132_2_, int p_1132_3_, int p_1132_4_, PathPoint p_1132_5_)
    {
        boolean flag = false;
        for(int i = p_1132_2_; i < p_1132_2_ + p_1132_5_.field_1718_a; i++)
        {
            for(int j = p_1132_3_; j < p_1132_3_ + p_1132_5_.field_1717_b; j++)
            {
                for(int k = p_1132_4_; k < p_1132_4_ + p_1132_5_.field_1716_c; k++)
                {
                    int l = field_1674_a.func_600_a(i, j, k);
                    if(l <= 0)
                    {
                        continue;
                    }
                    if(l == Block.field_28033_bl.field_376_bc)
                    {
                        flag = true;
                    } else
                    if(l == Block.field_401_B.field_376_bc || l == Block.field_399_C.field_376_bc)
                    {
                        if(!field_48616_g)
                        {
                            flag = true;
                        } else
                        {
                            return -1;
                        }
                    } else
                    if(!field_48617_e && l == Block.field_442_aF.field_376_bc)
                    {
                        return 0;
                    }
                    Block block = Block.field_345_n[l];
                    if(block.func_48204_b(field_1674_a, i, j, k) || field_48615_f && l == Block.field_442_aF.field_376_bc)
                    {
                        continue;
                    }
                    if(l == Block.field_4057_ba.field_376_bc || l == Block.field_35277_bw.field_376_bc)
                    {
                        return -3;
                    }
                    if(l == Block.field_28033_bl.field_376_bc)
                    {
                        return -4;
                    }
                    Material material = block.field_356_bn;
                    if(material == Material.field_1331_g)
                    {
                        if(!p_1132_1_.func_359_G())
                        {
                            return -2;
                        }
                    } else
                    {
                        return 0;
                    }
                }

            }

        }

        return flag ? 2 : 1;
    }

    private PathEntity func_1134_a(PathPoint p_1134_1_, PathPoint p_1134_2_)
    {
        int i = 1;
        for(PathPoint pathpoint = p_1134_2_; pathpoint.field_1710_i != null; pathpoint = pathpoint.field_1710_i)
        {
            i++;
        }

        PathPoint apathpoint[] = new PathPoint[i];
        PathPoint pathpoint1 = p_1134_2_;
        for(apathpoint[--i] = pathpoint1; pathpoint1.field_1710_i != null; apathpoint[--i] = pathpoint1)
        {
            pathpoint1 = pathpoint1.field_1710_i;
        }

        return new PathEntity(apathpoint);
    }
}
