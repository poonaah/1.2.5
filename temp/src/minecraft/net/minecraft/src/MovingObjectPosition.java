// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EnumMovingObjectType, Vec3D, Entity

public class MovingObjectPosition
{

    public EnumMovingObjectType field_1167_a;
    public int field_1166_b;
    public int field_1172_c;
    public int field_1171_d;
    public int field_1170_e;
    public Vec3D field_1169_f;
    public Entity field_1168_g;

    public MovingObjectPosition(int p_i516_1_, int p_i516_2_, int p_i516_3_, int p_i516_4_, Vec3D p_i516_5_)
    {
        field_1167_a = EnumMovingObjectType.TILE;
        field_1166_b = p_i516_1_;
        field_1172_c = p_i516_2_;
        field_1171_d = p_i516_3_;
        field_1170_e = p_i516_4_;
        field_1169_f = Vec3D.func_1248_b(p_i516_5_.field_1776_a, p_i516_5_.field_1775_b, p_i516_5_.field_1779_c);
    }

    public MovingObjectPosition(Entity p_i517_1_)
    {
        field_1167_a = EnumMovingObjectType.ENTITY;
        field_1168_g = p_i517_1_;
        field_1169_f = Vec3D.func_1248_b(p_i517_1_.field_611_ak, p_i517_1_.field_610_al, p_i517_1_.field_609_am);
    }
}
