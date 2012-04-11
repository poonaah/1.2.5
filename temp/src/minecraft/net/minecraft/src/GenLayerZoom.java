// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerZoom extends GenLayer
{

    public GenLayerZoom(long p_i658_1_, GenLayer p_i658_3_)
    {
        super(p_i658_1_);
        super.field_35504_a = p_i658_3_;
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int i = p_35500_1_ >> 1;
        int j = p_35500_2_ >> 1;
        int k = (p_35500_3_ >> 1) + 3;
        int l = (p_35500_4_ >> 1) + 3;
        int ai[] = field_35504_a.func_35500_a(i, j, k, l);
        int ai1[] = IntCache.func_35267_a(k * 2 * (l * 2));
        int i1 = k << 1;
        for(int j1 = 0; j1 < l - 1; j1++)
        {
            int k1 = j1 << 1;
            int i2 = k1 * i1;
            int j2 = ai[0 + (j1 + 0) * k];
            int k2 = ai[0 + (j1 + 1) * k];
            for(int l2 = 0; l2 < k - 1; l2++)
            {
                func_35499_a(l2 + i << 1, j1 + j << 1);
                int i3 = ai[l2 + 1 + (j1 + 0) * k];
                int j3 = ai[l2 + 1 + (j1 + 1) * k];
                ai1[i2] = j2;
                ai1[i2++ + i1] = func_35516_a(j2, k2);
                ai1[i2] = func_35516_a(j2, i3);
                ai1[i2++ + i1] = func_35514_b(j2, i3, k2, j3);
                j2 = i3;
                k2 = j3;
            }

        }

        int ai2[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int l1 = 0; l1 < p_35500_4_; l1++)
        {
            System.arraycopy(ai1, (l1 + (p_35500_2_ & 1)) * (k << 1) + (p_35500_1_ & 1), ai2, l1 * p_35500_3_, p_35500_3_);
        }

        return ai2;
    }

    protected int func_35516_a(int p_35516_1_, int p_35516_2_)
    {
        return func_35498_a(2) != 0 ? p_35516_2_ : p_35516_1_;
    }

    protected int func_35514_b(int p_35514_1_, int p_35514_2_, int p_35514_3_, int p_35514_4_)
    {
        if(p_35514_2_ == p_35514_3_ && p_35514_3_ == p_35514_4_)
        {
            return p_35514_2_;
        }
        if(p_35514_1_ == p_35514_2_ && p_35514_1_ == p_35514_3_)
        {
            return p_35514_1_;
        }
        if(p_35514_1_ == p_35514_2_ && p_35514_1_ == p_35514_4_)
        {
            return p_35514_1_;
        }
        if(p_35514_1_ == p_35514_3_ && p_35514_1_ == p_35514_4_)
        {
            return p_35514_1_;
        }
        if(p_35514_1_ == p_35514_2_ && p_35514_3_ != p_35514_4_)
        {
            return p_35514_1_;
        }
        if(p_35514_1_ == p_35514_3_ && p_35514_2_ != p_35514_4_)
        {
            return p_35514_1_;
        }
        if(p_35514_1_ == p_35514_4_ && p_35514_2_ != p_35514_3_)
        {
            return p_35514_1_;
        }
        if(p_35514_2_ == p_35514_1_ && p_35514_3_ != p_35514_4_)
        {
            return p_35514_2_;
        }
        if(p_35514_2_ == p_35514_3_ && p_35514_1_ != p_35514_4_)
        {
            return p_35514_2_;
        }
        if(p_35514_2_ == p_35514_4_ && p_35514_1_ != p_35514_3_)
        {
            return p_35514_2_;
        }
        if(p_35514_3_ == p_35514_1_ && p_35514_2_ != p_35514_4_)
        {
            return p_35514_3_;
        }
        if(p_35514_3_ == p_35514_2_ && p_35514_1_ != p_35514_4_)
        {
            return p_35514_3_;
        }
        if(p_35514_3_ == p_35514_4_ && p_35514_1_ != p_35514_2_)
        {
            return p_35514_3_;
        }
        if(p_35514_4_ == p_35514_1_ && p_35514_2_ != p_35514_3_)
        {
            return p_35514_3_;
        }
        if(p_35514_4_ == p_35514_2_ && p_35514_1_ != p_35514_3_)
        {
            return p_35514_3_;
        }
        if(p_35514_4_ == p_35514_3_ && p_35514_1_ != p_35514_2_)
        {
            return p_35514_3_;
        }
        int i = func_35498_a(4);
        if(i == 0)
        {
            return p_35514_1_;
        }
        if(i == 1)
        {
            return p_35514_2_;
        }
        if(i == 2)
        {
            return p_35514_3_;
        } else
        {
            return p_35514_4_;
        }
    }

    public static GenLayer func_35515_a(long p_35515_0_, GenLayer p_35515_2_, int p_35515_3_)
    {
        Object obj = p_35515_2_;
        for(int i = 0; i < p_35515_3_; i++)
        {
            obj = new GenLayerZoom(p_35515_0_ + (long)i, ((GenLayer) (obj)));
        }

        return ((GenLayer) (obj));
    }
}
