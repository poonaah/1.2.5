// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldProvider, WorldChunkManagerHell, BiomeGenBase, Vec3D, 
//            ChunkProviderHell, World, IChunkProvider

public class WorldProviderHell extends WorldProvider
{

    public WorldProviderHell()
    {
    }

    public void func_4098_a()
    {
        field_4215_b = new WorldChunkManagerHell(BiomeGenBase.field_4245_l, 1.0F, 0.0F);
        field_6479_d = true;
        field_6478_e = true;
        field_4218_e = -1;
    }

    public Vec3D func_4096_a(float p_4096_1_, float p_4096_2_)
    {
        return Vec3D.func_1248_b(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
    }

    protected void func_4093_b()
    {
        float f = 0.1F;
        for(int i = 0; i <= 15; i++)
        {
            float f1 = 1.0F - (float)i / 15F;
            field_4219_d[i] = ((1.0F - f1) / (f1 * 3F + 1.0F)) * (1.0F - f) + f;
        }

    }

    public IChunkProvider func_4094_c()
    {
        return new ChunkProviderHell(field_4216_a, field_4216_a.func_22138_q());
    }

    public boolean func_48217_e()
    {
        return false;
    }

    public boolean func_4102_a(int p_4102_1_, int p_4102_2_)
    {
        return false;
    }

    public float func_4100_a(long p_4100_1_, float p_4100_3_)
    {
        return 0.5F;
    }

    public boolean func_6477_d()
    {
        return false;
    }

    public boolean func_48218_b(int p_48218_1_, int p_48218_2_)
    {
        return true;
    }
}
