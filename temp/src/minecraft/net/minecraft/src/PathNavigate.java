// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Vec3D, MathHelper, World, PathEntity, 
//            EntityLiving, EntityMoveHelper, PathPoint, AxisAlignedBB, 
//            Block, Material

public class PathNavigate
{

    private EntityLiving field_46076_a;
    private World field_46074_b;
    private PathEntity field_46075_c;
    private float field_46073_d;
    private float field_48683_e;
    private boolean field_48681_f;
    private int field_48682_g;
    private int field_48688_h;
    private Vec3D field_48689_i;
    private boolean field_48686_j;
    private boolean field_48687_k;
    private boolean field_48684_l;
    private boolean field_48685_m;

    public PathNavigate(EntityLiving p_i1060_1_, World p_i1060_2_, float p_i1060_3_)
    {
        field_48681_f = false;
        field_48689_i = Vec3D.func_1260_a(0.0D, 0.0D, 0.0D);
        field_48686_j = true;
        field_48687_k = false;
        field_48684_l = false;
        field_48685_m = false;
        field_46076_a = p_i1060_1_;
        field_46074_b = p_i1060_2_;
        field_48683_e = p_i1060_3_;
    }

    public void func_48664_a(boolean p_48664_1_)
    {
        field_48684_l = p_48664_1_;
    }

    public boolean func_48658_a()
    {
        return field_48684_l;
    }

    public void func_48673_b(boolean p_48673_1_)
    {
        field_48687_k = p_48673_1_;
    }

    public void func_48663_c(boolean p_48663_1_)
    {
        field_48686_j = p_48663_1_;
    }

    public boolean func_48665_b()
    {
        return field_48687_k;
    }

    public void func_48680_d(boolean p_48680_1_)
    {
        field_48681_f = p_48680_1_;
    }

    public void func_48660_a(float p_48660_1_)
    {
        field_46073_d = p_48660_1_;
    }

    public void func_48669_e(boolean p_48669_1_)
    {
        field_48685_m = p_48669_1_;
    }

    public PathEntity func_48671_a(double p_48671_1_, double p_48671_3_, double p_48671_5_)
    {
        if(!func_48659_j())
        {
            return null;
        } else
        {
            return field_46074_b.func_48460_a(field_46076_a, MathHelper.func_1108_b(p_48671_1_), (int)p_48671_3_, MathHelper.func_1108_b(p_48671_5_), field_48683_e, field_48686_j, field_48687_k, field_48684_l, field_48685_m);
        }
    }

    public boolean func_48666_a(double p_48666_1_, double p_48666_3_, double p_48666_5_, float p_48666_7_)
    {
        PathEntity pathentity = func_48671_a(MathHelper.func_1108_b(p_48666_1_), (int)p_48666_3_, MathHelper.func_1108_b(p_48666_5_));
        return func_48678_a(pathentity, p_48666_7_);
    }

    public PathEntity func_48679_a(EntityLiving p_48679_1_)
    {
        if(!func_48659_j())
        {
            return null;
        } else
        {
            return field_46074_b.func_48463_a(field_46076_a, p_48679_1_, field_48683_e, field_48686_j, field_48687_k, field_48684_l, field_48685_m);
        }
    }

    public boolean func_48667_a(EntityLiving p_48667_1_, float p_48667_2_)
    {
        PathEntity pathentity = func_48679_a(p_48667_1_);
        if(pathentity != null)
        {
            return func_48678_a(pathentity, p_48667_2_);
        } else
        {
            return false;
        }
    }

    public boolean func_48678_a(PathEntity p_48678_1_, float p_48678_2_)
    {
        if(p_48678_1_ == null)
        {
            field_46075_c = null;
            return false;
        }
        if(!p_48678_1_.func_48647_a(field_46075_c))
        {
            field_46075_c = p_48678_1_;
        }
        if(field_48681_f)
        {
            func_48677_l();
        }
        if(field_46075_c.func_48644_d() == 0)
        {
            return false;
        } else
        {
            field_46073_d = p_48678_2_;
            Vec3D vec3d = func_48661_h();
            field_48688_h = field_48682_g;
            field_48689_i.field_1776_a = vec3d.field_1776_a;
            field_48689_i.field_1775_b = vec3d.field_1775_b;
            field_48689_i.field_1779_c = vec3d.field_1779_c;
            return true;
        }
    }

    public PathEntity func_48670_c()
    {
        return field_46075_c;
    }

    public void func_46069_a()
    {
        field_48682_g++;
        if(func_46072_b())
        {
            return;
        }
        if(func_48659_j())
        {
            func_48674_g();
        }
        if(func_46072_b())
        {
            return;
        }
        Vec3D vec3d = field_46075_c.func_48640_a(field_46076_a);
        if(vec3d == null)
        {
            return;
        } else
        {
            field_46076_a.func_46009_aH().func_48187_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c, field_46073_d);
            return;
        }
    }

    private void func_48674_g()
    {
        Vec3D vec3d = func_48661_h();
        int i = field_46075_c.func_48644_d();
        float f = field_46075_c.func_48643_e();
        do
        {
            if(f >= field_46075_c.func_48644_d())
            {
                break;
            }
            if(field_46075_c.func_48648_a(f).field_1717_b != (int)vec3d.field_1775_b)
            {
                i = f;
                break;
            }
            f++;
        } while(true);
        f = field_46076_a.field_644_aC * field_46076_a.field_644_aC;
        for(int j = field_46075_c.func_48643_e(); j < i; j++)
        {
            if(vec3d.func_1261_d(field_46075_c.func_48646_a(field_46076_a, j)) < (double)f)
            {
                field_46075_c.func_48642_c(j + 1);
            }
        }

        int k = (int)Math.ceil(field_46076_a.field_644_aC);
        int l = (int)field_46076_a.field_643_aD + 1;
        int i1 = k;
        int j1 = i - 1;
        do
        {
            if(j1 < field_46075_c.func_48643_e())
            {
                break;
            }
            if(func_48662_a(vec3d, field_46075_c.func_48646_a(field_46076_a, j1), k, l, i1))
            {
                field_46075_c.func_48642_c(j1);
                break;
            }
            j1--;
        } while(true);
        if(field_48682_g - field_48688_h > 100)
        {
            if(vec3d.func_1261_d(field_48689_i) < 2.25D)
            {
                func_48672_f();
            }
            field_48688_h = field_48682_g;
            field_48689_i.field_1776_a = vec3d.field_1776_a;
            field_48689_i.field_1775_b = vec3d.field_1775_b;
            field_48689_i.field_1779_c = vec3d.field_1779_c;
        }
    }

    public boolean func_46072_b()
    {
        return field_46075_c == null || field_46075_c.func_1207_b();
    }

    public void func_48672_f()
    {
        field_46075_c = null;
    }

    private Vec3D func_48661_h()
    {
        return Vec3D.func_1248_b(field_46076_a.field_611_ak, func_48668_i(), field_46076_a.field_609_am);
    }

    private int func_48668_i()
    {
        if(!field_46076_a.func_27013_ag() || !field_48685_m)
        {
            return (int)(field_46076_a.field_601_au.field_1697_b + 0.5D);
        }
        int i = (int)field_46076_a.field_601_au.field_1697_b;
        int j = field_46074_b.func_600_a(MathHelper.func_1108_b(field_46076_a.field_611_ak), i, MathHelper.func_1108_b(field_46076_a.field_609_am));
        int k = 0;
        while(j == Block.field_401_B.field_376_bc || j == Block.field_399_C.field_376_bc) 
        {
            i++;
            j = field_46074_b.func_600_a(MathHelper.func_1108_b(field_46076_a.field_611_ak), i, MathHelper.func_1108_b(field_46076_a.field_609_am));
            if(++k > 16)
            {
                return (int)field_46076_a.field_601_au.field_1697_b;
            }
        }
        return i;
    }

    private boolean func_48659_j()
    {
        return field_46076_a.field_9298_aH || field_48685_m && func_48657_k();
    }

    private boolean func_48657_k()
    {
        return field_46076_a.func_27013_ag() || field_46076_a.func_359_G();
    }

    private void func_48677_l()
    {
        if(field_46074_b.func_647_i(MathHelper.func_1108_b(field_46076_a.field_611_ak), (int)(field_46076_a.field_601_au.field_1697_b + 0.5D), MathHelper.func_1108_b(field_46076_a.field_609_am)))
        {
            return;
        }
        for(int i = 0; i < field_46075_c.func_48644_d(); i++)
        {
            PathPoint pathpoint = field_46075_c.func_48648_a(i);
            if(field_46074_b.func_647_i(pathpoint.field_1718_a, pathpoint.field_1717_b, pathpoint.field_1716_c))
            {
                field_46075_c.func_48641_b(i - 1);
                return;
            }
        }

    }

    private boolean func_48662_a(Vec3D p_48662_1_, Vec3D p_48662_2_, int p_48662_3_, int p_48662_4_, int p_48662_5_)
    {
        int i = MathHelper.func_1108_b(p_48662_1_.field_1776_a);
        int j = MathHelper.func_1108_b(p_48662_1_.field_1779_c);
        double d = p_48662_2_.field_1776_a - p_48662_1_.field_1776_a;
        double d1 = p_48662_2_.field_1779_c - p_48662_1_.field_1779_c;
        double d2 = d * d + d1 * d1;
        if(d2 < 1E-008D)
        {
            return false;
        }
        double d3 = 1.0D / Math.sqrt(d2);
        d *= d3;
        d1 *= d3;
        p_48662_3_ += 2;
        p_48662_5_ += 2;
        if(!func_48675_a(i, (int)p_48662_1_.field_1775_b, j, p_48662_3_, p_48662_4_, p_48662_5_, p_48662_1_, d, d1))
        {
            return false;
        }
        p_48662_3_ -= 2;
        p_48662_5_ -= 2;
        double d4 = 1.0D / Math.abs(d);
        double d5 = 1.0D / Math.abs(d1);
        double d6 = (double)(i * 1) - p_48662_1_.field_1776_a;
        double d7 = (double)(j * 1) - p_48662_1_.field_1779_c;
        if(d >= 0.0D)
        {
            d6++;
        }
        if(d1 >= 0.0D)
        {
            d7++;
        }
        d6 /= d;
        d7 /= d1;
        byte byte0 = ((byte)(d >= 0.0D ? 1 : -1));
        byte byte1 = ((byte)(d1 >= 0.0D ? 1 : -1));
        int k = MathHelper.func_1108_b(p_48662_2_.field_1776_a);
        int l = MathHelper.func_1108_b(p_48662_2_.field_1779_c);
        int i1 = k - i;
        for(int j1 = l - j; i1 * byte0 > 0 || j1 * byte1 > 0;)
        {
            if(d6 < d7)
            {
                d6 += d4;
                i += byte0;
                i1 = k - i;
            } else
            {
                d7 += d5;
                j += byte1;
                j1 = l - j;
            }
            if(!func_48675_a(i, (int)p_48662_1_.field_1775_b, j, p_48662_3_, p_48662_4_, p_48662_5_, p_48662_1_, d, d1))
            {
                return false;
            }
        }

        return true;
    }

    private boolean func_48675_a(int p_48675_1_, int p_48675_2_, int p_48675_3_, int p_48675_4_, int p_48675_5_, int p_48675_6_, Vec3D p_48675_7_, 
            double p_48675_8_, double p_48675_10_)
    {
        int i = p_48675_1_ - p_48675_4_ / 2;
        int j = p_48675_3_ - p_48675_6_ / 2;
        if(!func_48676_b(i, p_48675_2_, j, p_48675_4_, p_48675_5_, p_48675_6_, p_48675_7_, p_48675_8_, p_48675_10_))
        {
            return false;
        }
        for(int k = i; k < i + p_48675_4_; k++)
        {
            for(int l = j; l < j + p_48675_6_; l++)
            {
                double d = ((double)k + 0.5D) - p_48675_7_.field_1776_a;
                double d1 = ((double)l + 0.5D) - p_48675_7_.field_1779_c;
                if(d * p_48675_8_ + d1 * p_48675_10_ < 0.0D)
                {
                    continue;
                }
                int i1 = field_46074_b.func_600_a(k, p_48675_2_ - 1, l);
                if(i1 <= 0)
                {
                    return false;
                }
                Material material = Block.field_345_n[i1].field_356_bn;
                if(material == Material.field_1332_f && !field_46076_a.func_27013_ag())
                {
                    return false;
                }
                if(material == Material.field_1331_g)
                {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean func_48676_b(int p_48676_1_, int p_48676_2_, int p_48676_3_, int p_48676_4_, int p_48676_5_, int p_48676_6_, Vec3D p_48676_7_, 
            double p_48676_8_, double p_48676_10_)
    {
        for(int i = p_48676_1_; i < p_48676_1_ + p_48676_4_; i++)
        {
            for(int j = p_48676_2_; j < p_48676_2_ + p_48676_5_; j++)
            {
                for(int k = p_48676_3_; k < p_48676_3_ + p_48676_6_; k++)
                {
                    double d = ((double)i + 0.5D) - p_48676_7_.field_1776_a;
                    double d1 = ((double)k + 0.5D) - p_48676_7_.field_1779_c;
                    if(d * p_48676_8_ + d1 * p_48676_10_ < 0.0D)
                    {
                        continue;
                    }
                    int l = field_46074_b.func_600_a(i, j, k);
                    if(l > 0 && !Block.field_345_n[l].func_48204_b(field_46074_b, i, j, k))
                    {
                        return false;
                    }
                }

            }

        }

        return true;
    }
}
