// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            VillageCollection, PathNavigate, VillageDoorInfo, Vec3D, 
//            RandomPositionGenerator, Village, PathEntity

public class EntityAIMoveThroughVillage extends EntityAIBase
{

    private EntityCreature field_48292_a;
    private float field_48290_b;
    private PathEntity field_48291_c;
    private VillageDoorInfo field_48288_d;
    private boolean field_48289_e;
    private List field_48287_f;

    public EntityAIMoveThroughVillage(EntityCreature p_i1019_1_, float p_i1019_2_, boolean p_i1019_3_)
    {
        field_48287_f = new ArrayList();
        field_48292_a = p_i1019_1_;
        field_48290_b = p_i1019_2_;
        field_48289_e = p_i1019_3_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        func_48286_h();
        if(field_48289_e && field_48292_a.field_615_ag.func_624_b())
        {
            return false;
        }
        Village village = field_48292_a.field_615_ag.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_48292_a.field_611_ak), MathHelper.func_1108_b(field_48292_a.field_610_al), MathHelper.func_1108_b(field_48292_a.field_609_am), 0);
        if(village == null)
        {
            return false;
        }
        field_48288_d = func_48284_a(village);
        if(field_48288_d == null)
        {
            return false;
        }
        boolean flag = field_48292_a.func_48084_aL().func_48665_b();
        field_48292_a.func_48084_aL().func_48673_b(false);
        field_48291_c = field_48292_a.func_48084_aL().func_48671_a(field_48288_d.field_48600_a, field_48288_d.field_48598_b, field_48288_d.field_48599_c);
        field_48292_a.func_48084_aL().func_48673_b(flag);
        if(field_48291_c != null)
        {
            return true;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48620_a(field_48292_a, 10, 7, Vec3D.func_1248_b(field_48288_d.field_48600_a, field_48288_d.field_48598_b, field_48288_d.field_48599_c));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48292_a.func_48084_aL().func_48673_b(false);
            field_48291_c = field_48292_a.func_48084_aL().func_48671_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c);
            field_48292_a.func_48084_aL().func_48673_b(flag);
            return field_48291_c != null;
        }
    }

    public boolean func_46084_g()
    {
        if(field_48292_a.func_48084_aL().func_46072_b())
        {
            return false;
        } else
        {
            float f = field_48292_a.field_644_aC + 4F;
            return field_48292_a.func_360_d(field_48288_d.field_48600_a, field_48288_d.field_48598_b, field_48288_d.field_48599_c) > (double)(f * f);
        }
    }

    public void func_46080_e()
    {
        field_48292_a.func_48084_aL().func_48678_a(field_48291_c, field_48290_b);
    }

    public void func_46077_d()
    {
        if(field_48292_a.func_48084_aL().func_46072_b() || field_48292_a.func_360_d(field_48288_d.field_48600_a, field_48288_d.field_48598_b, field_48288_d.field_48599_c) < 16D)
        {
            field_48287_f.add(field_48288_d);
        }
    }

    private VillageDoorInfo func_48284_a(Village p_48284_1_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        List list = p_48284_1_.func_48521_f();
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48588_a(MathHelper.func_1108_b(field_48292_a.field_611_ak), MathHelper.func_1108_b(field_48292_a.field_610_al), MathHelper.func_1108_b(field_48292_a.field_609_am));
            if(j < i && !func_48285_a(villagedoorinfo1))
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    private boolean func_48285_a(VillageDoorInfo p_48285_1_)
    {
        for(Iterator iterator = field_48287_f.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(p_48285_1_.field_48600_a == villagedoorinfo.field_48600_a && p_48285_1_.field_48598_b == villagedoorinfo.field_48598_b && p_48285_1_.field_48599_c == villagedoorinfo.field_48599_c)
            {
                return true;
            }
        }

        return false;
    }

    private void func_48286_h()
    {
        if(field_48287_f.size() > 15)
        {
            field_48287_f.remove(0);
        }
    }
}
