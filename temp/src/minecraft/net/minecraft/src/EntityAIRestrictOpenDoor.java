// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            VillageCollection, Village, VillageDoorInfo, PathNavigate

public class EntityAIRestrictOpenDoor extends EntityAIBase
{

    private EntityCreature field_48365_a;
    private VillageDoorInfo field_48364_b;

    public EntityAIRestrictOpenDoor(EntityCreature p_i1070_1_)
    {
        field_48365_a = p_i1070_1_;
    }

    public boolean func_46082_a()
    {
        if(field_48365_a.field_615_ag.func_624_b())
        {
            return false;
        }
        Village village = field_48365_a.field_615_ag.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_48365_a.field_611_ak), MathHelper.func_1108_b(field_48365_a.field_610_al), MathHelper.func_1108_b(field_48365_a.field_609_am), 16);
        if(village == null)
        {
            return false;
        }
        field_48364_b = village.func_48527_b(MathHelper.func_1108_b(field_48365_a.field_611_ak), MathHelper.func_1108_b(field_48365_a.field_610_al), MathHelper.func_1108_b(field_48365_a.field_609_am));
        if(field_48364_b == null)
        {
            return false;
        } else
        {
            return (double)field_48364_b.func_48593_b(MathHelper.func_1108_b(field_48365_a.field_611_ak), MathHelper.func_1108_b(field_48365_a.field_610_al), MathHelper.func_1108_b(field_48365_a.field_609_am)) < 2.25D;
        }
    }

    public boolean func_46084_g()
    {
        if(field_48365_a.field_615_ag.func_624_b())
        {
            return false;
        } else
        {
            return !field_48364_b.field_48595_g && field_48364_b.func_48586_a(MathHelper.func_1108_b(field_48365_a.field_611_ak), MathHelper.func_1108_b(field_48365_a.field_609_am));
        }
    }

    public void func_46080_e()
    {
        field_48365_a.func_48084_aL().func_48673_b(false);
        field_48365_a.func_48084_aL().func_48663_c(false);
    }

    public void func_46077_d()
    {
        field_48365_a.func_48084_aL().func_48673_b(true);
        field_48365_a.func_48084_aL().func_48663_c(true);
        field_48364_b = null;
    }

    public void func_46081_b()
    {
        field_48364_b.func_48589_e();
    }
}
