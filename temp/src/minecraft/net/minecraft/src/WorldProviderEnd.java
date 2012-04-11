// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldProvider, WorldChunkManagerHell, BiomeGenBase, ChunkProviderEnd, 
//            World, MathHelper, Vec3D, Block, 
//            Material, ChunkCoordinates, IChunkProvider

public class WorldProviderEnd extends WorldProvider
{

    public WorldProviderEnd()
    {
    }

    public void func_4098_a()
    {
        field_4215_b = new WorldChunkManagerHell(BiomeGenBase.field_28057_m, 0.5F, 0.0F);
        field_4218_e = 1;
        field_6478_e = true;
    }

    public IChunkProvider func_4094_c()
    {
        return new ChunkProviderEnd(field_4216_a, field_4216_a.func_22138_q());
    }

    public float func_4100_a(long p_4100_1_, float p_4100_3_)
    {
        return 0.0F;
    }

    public float[] func_4097_b(float p_4097_1_, float p_4097_2_)
    {
        return null;
    }

    public Vec3D func_4096_a(float p_4096_1_, float p_4096_2_)
    {
        int i = 0x8080a0;
        float f = MathHelper.func_1114_b(p_4096_1_ * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        float f1 = (float)(i >> 16 & 0xff) / 255F;
        float f2 = (float)(i >> 8 & 0xff) / 255F;
        float f3 = (float)(i & 0xff) / 255F;
        f1 *= f * 0.0F + 0.15F;
        f2 *= f * 0.0F + 0.15F;
        f3 *= f * 0.0F + 0.15F;
        return Vec3D.func_1248_b(f1, f2, f3);
    }

    public boolean func_28112_c()
    {
        return false;
    }

    public boolean func_6477_d()
    {
        return false;
    }

    public boolean func_48217_e()
    {
        return false;
    }

    public float func_28111_d()
    {
        return 8F;
    }

    public boolean func_4102_a(int p_4102_1_, int p_4102_2_)
    {
        int i = field_4216_a.func_614_g(p_4102_1_, p_4102_2_);
        if(i == 0)
        {
            return false;
        } else
        {
            return Block.field_345_n[i].field_356_bn.func_880_c();
        }
    }

    public ChunkCoordinates func_40469_f()
    {
        return new ChunkCoordinates(100, 50, 0);
    }

    public int func_46066_g()
    {
        return 50;
    }

    public boolean func_48218_b(int p_48218_1_, int p_48218_2_)
    {
        return true;
    }
}
