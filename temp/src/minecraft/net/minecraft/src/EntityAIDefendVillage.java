// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityIronGolem, Village, EntityLiving

public class EntityAIDefendVillage extends EntityAITarget
{

    EntityIronGolem field_48385_a;
    EntityLiving field_48384_b;

    public EntityAIDefendVillage(EntityIronGolem p_i1040_1_)
    {
        super(p_i1040_1_, 16F, false, true);
        field_48385_a = p_i1040_1_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        Village village = field_48385_a.func_48113_aa();
        if(village == null)
        {
            return false;
        } else
        {
            field_48384_b = village.func_48537_b(field_48385_a);
            return func_48376_a(field_48384_b, false);
        }
    }

    public void func_46080_e()
    {
        field_48385_a.func_48092_c(field_48384_b);
        super.func_46080_e();
    }
}
