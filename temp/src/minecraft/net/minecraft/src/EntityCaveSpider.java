// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntitySpider, EntityLiving, World, PotionEffect, 
//            Potion, Entity

public class EntityCaveSpider extends EntitySpider
{

    public EntityCaveSpider(World p_i324_1_)
    {
        super(p_i324_1_);
        field_9357_z = "/mob/cavespider.png";
        func_371_a(0.7F, 0.5F);
    }

    public int func_40117_c()
    {
        return 12;
    }

    public float func_35188_k_()
    {
        return 0.7F;
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        if(super.func_35175_b(p_35175_1_))
        {
            if(p_35175_1_ instanceof EntityLiving)
            {
                byte byte0 = 0;
                if(field_615_ag.field_1039_l > 1)
                {
                    if(field_615_ag.field_1039_l == 2)
                    {
                        byte0 = 7;
                    } else
                    if(field_615_ag.field_1039_l == 3)
                    {
                        byte0 = 15;
                    }
                }
                if(byte0 > 0)
                {
                    ((EntityLiving)p_35175_1_).func_35165_a(new PotionEffect(Potion.field_35689_u.field_35670_H, byte0 * 20, 0));
                }
            }
            return true;
        } else
        {
            return false;
        }
    }
}
