// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, ChunkCoordinates, Vec3D, 
//            RandomPositionGenerator, PathNavigate

public class EntityAIMoveTwardsRestriction extends EntityAIBase
{

    private EntityCreature field_48355_a;
    private double field_48353_b;
    private double field_48354_c;
    private double field_48351_d;
    private float field_48352_e;

    public EntityAIMoveTwardsRestriction(EntityCreature p_i1079_1_, float p_i1079_2_)
    {
        field_48355_a = p_i1079_1_;
        field_48352_e = p_i1079_2_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_48355_a.func_48093_aT())
        {
            return false;
        }
        ChunkCoordinates chunkcoordinates = field_48355_a.func_48091_aU();
        Vec3D vec3d = RandomPositionGenerator.func_48620_a(field_48355_a, 16, 7, Vec3D.func_1248_b(chunkcoordinates.field_22395_a, chunkcoordinates.field_22394_b, chunkcoordinates.field_22396_c));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48353_b = vec3d.field_1776_a;
            field_48354_c = vec3d.field_1775_b;
            field_48351_d = vec3d.field_1779_c;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return !field_48355_a.func_48084_aL().func_46072_b();
    }

    public void func_46080_e()
    {
        field_48355_a.func_48084_aL().func_48666_a(field_48353_b, field_48354_c, field_48351_d, field_48352_e);
    }
}
