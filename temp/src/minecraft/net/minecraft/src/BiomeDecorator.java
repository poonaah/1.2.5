// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenClay, WorldGenSand, Block, WorldGenMinable, 
//            WorldGenFlowers, BlockFlower, WorldGenBigMushroom, WorldGenReed, 
//            WorldGenCactus, WorldGenWaterlily, World, WorldGenerator, 
//            BiomeGenBase, WorldGenDeadBush, BlockDeadBush, WorldGenPumpkin, 
//            WorldGenLiquids

public class BiomeDecorator
{

    protected World field_35889_B;
    protected Random field_35890_C;
    protected int field_35885_D;
    protected int field_35886_E;
    protected BiomeGenBase field_35887_F;
    protected WorldGenerator field_35897_a;
    protected WorldGenerator field_35895_b;
    protected WorldGenerator field_35896_c;
    protected WorldGenerator field_35893_d;
    protected WorldGenerator field_35894_e;
    protected WorldGenerator field_35891_f;
    protected WorldGenerator field_35892_g;
    protected WorldGenerator field_35904_h;
    protected WorldGenerator field_35905_i;
    protected WorldGenerator field_35902_j;
    protected WorldGenerator field_35903_k;
    protected WorldGenerator field_35900_l;
    protected WorldGenerator field_35901_m;
    protected WorldGenerator field_35898_n;
    protected WorldGenerator field_35899_o;
    protected WorldGenerator field_40720_u;
    protected WorldGenerator field_35913_p;
    protected WorldGenerator field_35912_q;
    protected WorldGenerator field_40722_x;
    protected int field_40721_y;
    protected int field_35911_r;
    protected int field_35910_s;
    protected int field_35909_t;
    protected int field_35908_u;
    protected int field_35907_v;
    protected int field_35906_w;
    protected int field_35916_x;
    protected int field_35915_y;
    protected int field_35914_z;
    protected int field_35888_A;
    protected int field_40718_J;
    public boolean field_40719_K;

    public BiomeDecorator(BiomeGenBase p_i695_1_)
    {
        field_35897_a = new WorldGenClay(4);
        field_35895_b = new WorldGenSand(7, Block.field_393_F.field_376_bc);
        field_35896_c = new WorldGenSand(6, Block.field_392_G.field_376_bc);
        field_35893_d = new WorldGenMinable(Block.field_336_w.field_376_bc, 32);
        field_35894_e = new WorldGenMinable(Block.field_392_G.field_376_bc, 32);
        field_35891_f = new WorldGenMinable(Block.field_386_J.field_376_bc, 16);
        field_35892_g = new WorldGenMinable(Block.field_388_I.field_376_bc, 8);
        field_35904_h = new WorldGenMinable(Block.field_390_H.field_376_bc, 8);
        field_35905_i = new WorldGenMinable(Block.field_433_aO.field_376_bc, 7);
        field_35902_j = new WorldGenMinable(Block.field_391_ax.field_376_bc, 7);
        field_35903_k = new WorldGenMinable(Block.field_9267_N.field_376_bc, 6);
        field_35900_l = new WorldGenFlowers(Block.field_417_ae.field_376_bc);
        field_35901_m = new WorldGenFlowers(Block.field_416_af.field_376_bc);
        field_35898_n = new WorldGenFlowers(Block.field_415_ag.field_376_bc);
        field_35899_o = new WorldGenFlowers(Block.field_414_ah.field_376_bc);
        field_40720_u = new WorldGenBigMushroom();
        field_35913_p = new WorldGenReed();
        field_35912_q = new WorldGenCactus();
        field_40722_x = new WorldGenWaterlily();
        field_40721_y = 0;
        field_35911_r = 0;
        field_35910_s = 2;
        field_35909_t = 1;
        field_35908_u = 0;
        field_35907_v = 0;
        field_35906_w = 0;
        field_35916_x = 0;
        field_35915_y = 1;
        field_35914_z = 3;
        field_35888_A = 1;
        field_40718_J = 0;
        field_40719_K = true;
        field_35887_F = p_i695_1_;
    }

    public void func_35881_a(World p_35881_1_, Random p_35881_2_, int p_35881_3_, int p_35881_4_)
    {
        if(field_35889_B != null)
        {
            throw new RuntimeException("Already decorating!!");
        } else
        {
            field_35889_B = p_35881_1_;
            field_35890_C = p_35881_2_;
            field_35885_D = p_35881_3_;
            field_35886_E = p_35881_4_;
            func_35882_b();
            field_35889_B = null;
            field_35890_C = null;
            return;
        }
    }

    protected void func_35882_b()
    {
        func_35880_a();
        for(int i = 0; i < field_35914_z; i++)
        {
            int i1 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k5 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35895_b.func_516_a(field_35889_B, field_35890_C, i1, field_35889_B.func_4083_e(i1, k5), k5);
        }

        for(int j = 0; j < field_35888_A; j++)
        {
            int j1 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int l5 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35897_a.func_516_a(field_35889_B, field_35890_C, j1, field_35889_B.func_4083_e(j1, l5), l5);
        }

        for(int k = 0; k < field_35915_y; k++)
        {
            int k1 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int i6 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35895_b.func_516_a(field_35889_B, field_35890_C, k1, field_35889_B.func_4083_e(k1, i6), i6);
        }

        int l = field_35911_r;
        if(field_35890_C.nextInt(10) == 0)
        {
            l++;
        }
        for(int l1 = 0; l1 < l; l1++)
        {
            int j6 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k10 = field_35886_E + field_35890_C.nextInt(16) + 8;
            WorldGenerator worldgenerator = field_35887_F.func_21107_a(field_35890_C);
            worldgenerator.func_517_a(1.0D, 1.0D, 1.0D);
            worldgenerator.func_516_a(field_35889_B, field_35890_C, j6, field_35889_B.func_666_c(j6, k10), k10);
        }

        for(int i2 = 0; i2 < field_40718_J; i2++)
        {
            int k6 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int l10 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_40720_u.func_516_a(field_35889_B, field_35890_C, k6, field_35889_B.func_666_c(k6, l10), l10);
        }

        for(int j2 = 0; j2 < field_35910_s; j2++)
        {
            int l6 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int i11 = field_35890_C.nextInt(128);
            int l14 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35900_l.func_516_a(field_35889_B, field_35890_C, l6, i11, l14);
            if(field_35890_C.nextInt(4) == 0)
            {
                int i7 = field_35885_D + field_35890_C.nextInt(16) + 8;
                int j11 = field_35890_C.nextInt(128);
                int i15 = field_35886_E + field_35890_C.nextInt(16) + 8;
                field_35901_m.func_516_a(field_35889_B, field_35890_C, i7, j11, i15);
            }
        }

        for(int k2 = 0; k2 < field_35909_t; k2++)
        {
            int j7 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k11 = field_35890_C.nextInt(128);
            int j15 = field_35886_E + field_35890_C.nextInt(16) + 8;
            WorldGenerator worldgenerator1 = field_35887_F.func_48410_b(field_35890_C);
            worldgenerator1.func_516_a(field_35889_B, field_35890_C, j7, k11, j15);
        }

        for(int l2 = 0; l2 < field_35908_u; l2++)
        {
            int k7 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int l11 = field_35890_C.nextInt(128);
            int k15 = field_35886_E + field_35890_C.nextInt(16) + 8;
            (new WorldGenDeadBush(Block.field_9256_Y.field_376_bc)).func_516_a(field_35889_B, field_35890_C, k7, l11, k15);
        }

        for(int i3 = 0; i3 < field_40721_y; i3++)
        {
            int l7 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int i12 = field_35886_E + field_35890_C.nextInt(16) + 8;
            int l15;
            for(l15 = field_35890_C.nextInt(128); l15 > 0 && field_35889_B.func_600_a(l7, l15 - 1, i12) == 0; l15--) { }
            field_40722_x.func_516_a(field_35889_B, field_35890_C, l7, l15, i12);
        }

        for(int j3 = 0; j3 < field_35907_v; j3++)
        {
            if(field_35890_C.nextInt(4) == 0)
            {
                int i8 = field_35885_D + field_35890_C.nextInt(16) + 8;
                int j12 = field_35886_E + field_35890_C.nextInt(16) + 8;
                int i16 = field_35889_B.func_666_c(i8, j12);
                field_35898_n.func_516_a(field_35889_B, field_35890_C, i8, i16, j12);
            }
            if(field_35890_C.nextInt(8) == 0)
            {
                int j8 = field_35885_D + field_35890_C.nextInt(16) + 8;
                int k12 = field_35886_E + field_35890_C.nextInt(16) + 8;
                int j16 = field_35890_C.nextInt(128);
                field_35899_o.func_516_a(field_35889_B, field_35890_C, j8, j16, k12);
            }
        }

        if(field_35890_C.nextInt(4) == 0)
        {
            int k3 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k8 = field_35890_C.nextInt(128);
            int l12 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35898_n.func_516_a(field_35889_B, field_35890_C, k3, k8, l12);
        }
        if(field_35890_C.nextInt(8) == 0)
        {
            int l3 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int l8 = field_35890_C.nextInt(128);
            int i13 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35899_o.func_516_a(field_35889_B, field_35890_C, l3, l8, i13);
        }
        for(int i4 = 0; i4 < field_35906_w; i4++)
        {
            int i9 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int j13 = field_35886_E + field_35890_C.nextInt(16) + 8;
            int k16 = field_35890_C.nextInt(128);
            field_35913_p.func_516_a(field_35889_B, field_35890_C, i9, k16, j13);
        }

        for(int j4 = 0; j4 < 10; j4++)
        {
            int j9 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k13 = field_35890_C.nextInt(128);
            int l16 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35913_p.func_516_a(field_35889_B, field_35890_C, j9, k13, l16);
        }

        if(field_35890_C.nextInt(32) == 0)
        {
            int k4 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int k9 = field_35890_C.nextInt(128);
            int l13 = field_35886_E + field_35890_C.nextInt(16) + 8;
            (new WorldGenPumpkin()).func_516_a(field_35889_B, field_35890_C, k4, k9, l13);
        }
        for(int l4 = 0; l4 < field_35916_x; l4++)
        {
            int l9 = field_35885_D + field_35890_C.nextInt(16) + 8;
            int i14 = field_35890_C.nextInt(128);
            int i17 = field_35886_E + field_35890_C.nextInt(16) + 8;
            field_35912_q.func_516_a(field_35889_B, field_35890_C, l9, i14, i17);
        }

        if(field_40719_K)
        {
            for(int i5 = 0; i5 < 50; i5++)
            {
                int i10 = field_35885_D + field_35890_C.nextInt(16) + 8;
                int j14 = field_35890_C.nextInt(field_35890_C.nextInt(120) + 8);
                int j17 = field_35886_E + field_35890_C.nextInt(16) + 8;
                (new WorldGenLiquids(Block.field_401_B.field_376_bc)).func_516_a(field_35889_B, field_35890_C, i10, j14, j17);
            }

            for(int j5 = 0; j5 < 20; j5++)
            {
                int j10 = field_35885_D + field_35890_C.nextInt(16) + 8;
                int k14 = field_35890_C.nextInt(field_35890_C.nextInt(field_35890_C.nextInt(112) + 8) + 8);
                int k17 = field_35886_E + field_35890_C.nextInt(16) + 8;
                (new WorldGenLiquids(Block.field_397_D.field_376_bc)).func_516_a(field_35889_B, field_35890_C, j10, k14, k17);
            }

        }
    }

    protected void func_35884_a(int p_35884_1_, WorldGenerator p_35884_2_, int p_35884_3_, int p_35884_4_)
    {
        for(int i = 0; i < p_35884_1_; i++)
        {
            int j = field_35885_D + field_35890_C.nextInt(16);
            int k = field_35890_C.nextInt(p_35884_4_ - p_35884_3_) + p_35884_3_;
            int l = field_35886_E + field_35890_C.nextInt(16);
            p_35884_2_.func_516_a(field_35889_B, field_35890_C, j, k, l);
        }

    }

    protected void func_35883_b(int p_35883_1_, WorldGenerator p_35883_2_, int p_35883_3_, int p_35883_4_)
    {
        for(int i = 0; i < p_35883_1_; i++)
        {
            int j = field_35885_D + field_35890_C.nextInt(16);
            int k = field_35890_C.nextInt(p_35883_4_) + field_35890_C.nextInt(p_35883_4_) + (p_35883_3_ - p_35883_4_);
            int l = field_35886_E + field_35890_C.nextInt(16);
            p_35883_2_.func_516_a(field_35889_B, field_35890_C, j, k, l);
        }

    }

    protected void func_35880_a()
    {
        func_35884_a(20, field_35893_d, 0, 128);
        func_35884_a(10, field_35894_e, 0, 128);
        func_35884_a(20, field_35891_f, 0, 128);
        func_35884_a(20, field_35892_g, 0, 64);
        func_35884_a(2, field_35904_h, 0, 32);
        func_35884_a(8, field_35905_i, 0, 16);
        func_35884_a(1, field_35902_j, 0, 16);
        func_35883_b(1, field_35903_k, 16, 16);
    }
}
