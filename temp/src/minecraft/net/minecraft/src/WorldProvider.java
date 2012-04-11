// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            World, WorldInfo, WorldType, Block, 
//            BlockGrass, MathHelper, Vec3D, WorldProviderHell, 
//            WorldProviderSurface, WorldProviderEnd, WorldChunkManager, IChunkProvider, 
//            ChunkCoordinates

public abstract class WorldProvider
{

    public World field_4216_a;
    public WorldType field_46067_b;
    public WorldChunkManager field_4215_b;
    public boolean field_6479_d;
    public boolean field_6478_e;
    public float field_4219_d[];
    public int field_4218_e;
    private float field_4217_f[];

    public WorldProvider()
    {
        field_6479_d = false;
        field_6478_e = false;
        field_4219_d = new float[16];
        field_4218_e = 0;
        field_4217_f = new float[4];
    }

    public final void func_4095_a(World p_4095_1_)
    {
        field_4216_a = p_4095_1_;
        field_46067_b = p_4095_1_.func_22144_v().func_46133_t();
        func_4098_a();
        func_4093_b();
    }

    protected void func_4093_b()
    {
        float f = 0.0F;
        for(int i = 0; i <= 15; i++)
        {
            float f1 = 1.0F - (float)i / 15F;
            field_4219_d[i] = ((1.0F - f1) / (f1 * 3F + 1.0F)) * (1.0F - f) + f;
        }

    }

    protected void func_4098_a()
    {
        field_4215_b = field_46067_b.getChunkManager(field_4216_a);
    }

    public IChunkProvider func_4094_c()
    {
        return field_46067_b.getChunkGenerator(field_4216_a);
    }

    public boolean func_4102_a(int p_4102_1_, int p_4102_2_)
    {
        int i = field_4216_a.func_614_g(p_4102_1_, p_4102_2_);
        return i == Block.field_337_v.field_376_bc;
    }

    public float func_4100_a(long p_4100_1_, float p_4100_3_)
    {
        int i = (int)(p_4100_1_ % 24000L);
        float f = ((float)i + p_4100_3_) / 24000F - 0.25F;
        if(f < 0.0F)
        {
            f++;
        }
        if(f > 1.0F)
        {
            f--;
        }
        float f1 = f;
        f = 1.0F - (float)((Math.cos((double)f * 3.1415926535897931D) + 1.0D) / 2D);
        f = f1 + (f - f1) / 3F;
        return f;
    }

    public int func_40470_b(long p_40470_1_, float p_40470_3_)
    {
        return (int)(p_40470_1_ / 24000L) % 8;
    }

    public boolean func_48217_e()
    {
        return true;
    }

    public float[] func_4097_b(float p_4097_1_, float p_4097_2_)
    {
        float f = 0.4F;
        float f1 = MathHelper.func_1114_b(p_4097_1_ * 3.141593F * 2.0F) - 0.0F;
        float f2 = -0F;
        if(f1 >= f2 - f && f1 <= f2 + f)
        {
            float f3 = ((f1 - f2) / f) * 0.5F + 0.5F;
            float f4 = 1.0F - (1.0F - MathHelper.func_1106_a(f3 * 3.141593F)) * 0.99F;
            f4 *= f4;
            field_4217_f[0] = f3 * 0.3F + 0.7F;
            field_4217_f[1] = f3 * f3 * 0.7F + 0.2F;
            field_4217_f[2] = f3 * f3 * 0.0F + 0.2F;
            field_4217_f[3] = f4;
            return field_4217_f;
        } else
        {
            return null;
        }
    }

    public Vec3D func_4096_a(float p_4096_1_, float p_4096_2_)
    {
        float f = MathHelper.func_1114_b(p_4096_1_ * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        float f1 = 0.7529412F;
        float f2 = 0.8470588F;
        float f3 = 1.0F;
        f1 *= f * 0.94F + 0.06F;
        f2 *= f * 0.94F + 0.06F;
        f3 *= f * 0.91F + 0.09F;
        return Vec3D.func_1248_b(f1, f2, f3);
    }

    public boolean func_6477_d()
    {
        return true;
    }

    public static WorldProvider func_4101_a(int p_4101_0_)
    {
        return ((WorldProvider) (p_4101_0_ != -1 ? p_4101_0_ != 0 ? p_4101_0_ != 1 ? null : new WorldProviderEnd() : new WorldProviderSurface() : new WorldProviderHell()));
    }

    public float func_28111_d()
    {
        return 128F;
    }

    public boolean func_28112_c()
    {
        return true;
    }

    public ChunkCoordinates func_40469_f()
    {
        return null;
    }

    public int func_46066_g()
    {
        return field_46067_b.getSeaLevel(field_4216_a);
    }

    public boolean func_46064_i()
    {
        return field_46067_b.hasVoidParticles(field_6478_e);
    }

    public double func_46065_j()
    {
        return field_46067_b.voidFadeMagnitude();
    }

    public boolean func_48218_b(int p_48218_1_, int p_48218_2_)
    {
        return false;
    }
}
