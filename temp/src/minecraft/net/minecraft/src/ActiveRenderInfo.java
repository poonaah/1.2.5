// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.src:
//            EntityPlayer, MathHelper, EntityLiving, Vec3D, 
//            ChunkPosition, World, Block, Material, 
//            BlockFluid, GLAllocation

public class ActiveRenderInfo
{

    public static float field_41074_a = 0.0F;
    public static float field_41072_b = 0.0F;
    public static float field_41073_c = 0.0F;
    private static IntBuffer field_41079_i = GLAllocation.func_1125_c(16);
    private static FloatBuffer field_41076_j = GLAllocation.func_1123_d(16);
    private static FloatBuffer field_41077_k = GLAllocation.func_1123_d(16);
    private static FloatBuffer field_41075_l = GLAllocation.func_1123_d(3);
    public static float field_41070_d;
    public static float field_41071_e;
    public static float field_41068_f;
    public static float field_41069_g;
    public static float field_41078_h;

    public ActiveRenderInfo()
    {
    }

    public static void func_41067_a(EntityPlayer p_41067_0_, boolean p_41067_1_)
    {
        GL11.glGetFloat(2982, field_41076_j);
        GL11.glGetFloat(2983, field_41077_k);
        GL11.glGetInteger(2978, field_41079_i);
        float f = (field_41079_i.get(0) + field_41079_i.get(2)) / 2;
        float f1 = (field_41079_i.get(1) + field_41079_i.get(3)) / 2;
        GLU.gluUnProject(f, f1, 0.0F, field_41076_j, field_41077_k, field_41079_i, field_41075_l);
        field_41074_a = field_41075_l.get(0);
        field_41072_b = field_41075_l.get(1);
        field_41073_c = field_41075_l.get(2);
        int i = p_41067_1_ ? 1 : 0;
        float f2 = p_41067_0_.field_604_ar;
        float f3 = p_41067_0_.field_605_aq;
        field_41070_d = MathHelper.func_1114_b((f3 * 3.141593F) / 180F) * (float)(1 - i * 2);
        field_41068_f = MathHelper.func_1106_a((f3 * 3.141593F) / 180F) * (float)(1 - i * 2);
        field_41069_g = -field_41068_f * MathHelper.func_1106_a((f2 * 3.141593F) / 180F) * (float)(1 - i * 2);
        field_41078_h = field_41070_d * MathHelper.func_1106_a((f2 * 3.141593F) / 180F) * (float)(1 - i * 2);
        field_41071_e = MathHelper.func_1114_b((f2 * 3.141593F) / 180F);
    }

    public static Vec3D func_41065_a(EntityLiving p_41065_0_, double p_41065_1_)
    {
        double d = p_41065_0_.field_9285_at + (p_41065_0_.field_611_ak - p_41065_0_.field_9285_at) * p_41065_1_;
        double d1 = p_41065_0_.field_9284_au + (p_41065_0_.field_610_al - p_41065_0_.field_9284_au) * p_41065_1_ + (double)p_41065_0_.func_373_s();
        double d2 = p_41065_0_.field_9283_av + (p_41065_0_.field_609_am - p_41065_0_.field_9283_av) * p_41065_1_;
        double d3 = d + (double)(field_41074_a * 1.0F);
        double d4 = d1 + (double)(field_41072_b * 1.0F);
        double d5 = d2 + (double)(field_41073_c * 1.0F);
        return Vec3D.func_1248_b(d3, d4, d5);
    }

    public static int func_41066_a(World p_41066_0_, EntityLiving p_41066_1_, float p_41066_2_)
    {
        Vec3D vec3d = func_41065_a(p_41066_1_, p_41066_2_);
        ChunkPosition chunkposition = new ChunkPosition(vec3d);
        int i = p_41066_0_.func_600_a(chunkposition.field_1111_a, chunkposition.field_1110_b, chunkposition.field_1112_c);
        if(i != 0 && Block.field_345_n[i].field_356_bn.func_879_d())
        {
            float f = BlockFluid.func_288_b(p_41066_0_.func_602_e(chunkposition.field_1111_a, chunkposition.field_1110_b, chunkposition.field_1112_c)) - 0.1111111F;
            float f1 = (float)(chunkposition.field_1110_b + 1) - f;
            if(vec3d.field_1775_b >= (double)f1)
            {
                i = p_41066_0_.func_600_a(chunkposition.field_1111_a, chunkposition.field_1110_b + 1, chunkposition.field_1112_c);
            }
        }
        return i;
    }

}
