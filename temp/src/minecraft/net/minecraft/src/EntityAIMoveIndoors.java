// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, WorldProvider, 
//            MathHelper, VillageCollection, Village, PathNavigate, 
//            VillageDoorInfo, Vec3D, RandomPositionGenerator

public class EntityAIMoveIndoors extends EntityAIBase
{

    private EntityCreature field_48256_a;
    private VillageDoorInfo field_48254_b;
    private int field_48255_c;
    private int field_48253_d;

    public EntityAIMoveIndoors(EntityCreature p_i1027_1_)
    {
        field_48255_c = -1;
        field_48253_d = -1;
        field_48256_a = p_i1027_1_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_48256_a.field_615_ag.func_624_b() && !field_48256_a.field_615_ag.func_27161_C() || field_48256_a.field_615_ag.field_4209_q.field_6478_e)
        {
            return false;
        }
        if(field_48256_a.func_46004_aK().nextInt(50) != 0)
        {
            return false;
        }
        if(field_48255_c != -1 && field_48256_a.func_360_d(field_48255_c, field_48256_a.field_610_al, field_48253_d) < 4D)
        {
            return false;
        }
        Village village = field_48256_a.field_615_ag.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_48256_a.field_611_ak), MathHelper.func_1108_b(field_48256_a.field_610_al), MathHelper.func_1108_b(field_48256_a.field_609_am), 14);
        if(village == null)
        {
            return false;
        } else
        {
            field_48254_b = village.func_48540_c(MathHelper.func_1108_b(field_48256_a.field_611_ak), MathHelper.func_1108_b(field_48256_a.field_610_al), MathHelper.func_1108_b(field_48256_a.field_609_am));
            return field_48254_b != null;
        }
    }

    public boolean func_46084_g()
    {
        return !field_48256_a.func_48084_aL().func_46072_b();
    }

    public void func_46080_e()
    {
        field_48255_c = -1;
        if(field_48256_a.func_360_d(field_48254_b.func_48590_a(), field_48254_b.field_48598_b, field_48254_b.func_48591_c()) > 256D)
        {
            Vec3D vec3d = RandomPositionGenerator.func_48620_a(field_48256_a, 14, 3, Vec3D.func_1248_b((double)field_48254_b.func_48590_a() + 0.5D, field_48254_b.func_48592_b(), (double)field_48254_b.func_48591_c() + 0.5D));
            if(vec3d != null)
            {
                field_48256_a.func_48084_aL().func_48666_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c, 0.3F);
            }
        } else
        {
            field_48256_a.func_48084_aL().func_48666_a((double)field_48254_b.func_48590_a() + 0.5D, field_48254_b.func_48592_b(), (double)field_48254_b.func_48591_c() + 0.5D, 0.3F);
        }
    }

    public void func_46077_d()
    {
        field_48255_c = field_48254_b.func_48590_a();
        field_48253_d = field_48254_b.func_48591_c();
        field_48254_b = null;
    }
}
