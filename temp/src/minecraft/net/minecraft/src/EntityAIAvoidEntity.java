// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, EntityPlayer, EntityTameable, 
//            World, AxisAlignedBB, Entity, EntitySenses, 
//            Vec3D, RandomPositionGenerator, PathNavigate, PathEntity

public class EntityAIAvoidEntity extends EntityAIBase
{

    private EntityCreature field_48244_a;
    private float field_48242_b;
    private float field_48243_c;
    private Entity field_48240_d;
    private float field_48241_e;
    private PathEntity field_48238_f;
    private PathNavigate field_48239_g;
    private Class field_48245_h;

    public EntityAIAvoidEntity(EntityCreature p_i1032_1_, Class p_i1032_2_, float p_i1032_3_, float p_i1032_4_, float p_i1032_5_)
    {
        field_48244_a = p_i1032_1_;
        field_48245_h = p_i1032_2_;
        field_48241_e = p_i1032_3_;
        field_48242_b = p_i1032_4_;
        field_48243_c = p_i1032_5_;
        field_48239_g = p_i1032_1_.func_48084_aL();
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_48245_h == (net.minecraft.src.EntityPlayer.class))
        {
            if((field_48244_a instanceof EntityTameable) && ((EntityTameable)field_48244_a).func_48139_F_())
            {
                return false;
            }
            field_48240_d = field_48244_a.field_615_ag.func_609_a(field_48244_a, field_48241_e);
            if(field_48240_d == null)
            {
                return false;
            }
        } else
        {
            List list = field_48244_a.field_615_ag.func_657_a(field_48245_h, field_48244_a.field_601_au.func_1177_b(field_48241_e, 3D, field_48241_e));
            if(list.size() == 0)
            {
                return false;
            }
            field_48240_d = (Entity)list.get(0);
        }
        if(!field_48244_a.func_48090_aM().func_48480_a(field_48240_d))
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48623_b(field_48244_a, 16, 7, Vec3D.func_1248_b(field_48240_d.field_611_ak, field_48240_d.field_610_al, field_48240_d.field_609_am));
        if(vec3d == null)
        {
            return false;
        }
        if(field_48240_d.func_360_d(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c) < field_48240_d.func_387_e(field_48244_a))
        {
            return false;
        }
        field_48238_f = field_48239_g.func_48671_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c);
        if(field_48238_f == null)
        {
            return false;
        }
        return field_48238_f.func_48639_a(vec3d);
    }

    public boolean func_46084_g()
    {
        return !field_48239_g.func_46072_b();
    }

    public void func_46080_e()
    {
        field_48239_g.func_48678_a(field_48238_f, field_48242_b);
    }

    public void func_46077_d()
    {
        field_48240_d = null;
    }

    public void func_46081_b()
    {
        if(field_48244_a.func_387_e(field_48240_d) < 49D)
        {
            field_48244_a.func_48084_aL().func_48660_a(field_48243_c);
        } else
        {
            field_48244_a.func_48084_aL().func_48660_a(field_48242_b);
        }
    }
}
