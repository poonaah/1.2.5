// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, StatCollector, ItemStack, EntityList, 
//            EntityEggInfo, World, Facing, Block, 
//            EntityPlayer, PlayerCapabilities, Entity, EntityLiving

public class ItemMonsterPlacer extends Item
{

    public ItemMonsterPlacer(int p_i25_1_)
    {
        super(p_i25_1_);
        func_21015_a(true);
    }

    public String func_40397_d(ItemStack p_40397_1_)
    {
        String s = (new StringBuilder()).append("").append(StatCollector.func_25200_a((new StringBuilder()).append(func_20009_a()).append(".name").toString())).toString().trim();
        String s1 = EntityList.func_44040_a(p_40397_1_.func_21181_i());
        if(s1 != null)
        {
            s = (new StringBuilder()).append(s).append(" ").append(StatCollector.func_25200_a((new StringBuilder()).append("entity.").append(s1).append(".name").toString())).toString();
        }
        return s;
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        EntityEggInfo entityegginfo = (EntityEggInfo)EntityList.field_44041_a.get(Integer.valueOf(p_27010_1_));
        if(entityegginfo != null)
        {
            if(p_27010_2_ == 0)
            {
                return entityegginfo.field_46061_b;
            } else
            {
                return entityegginfo.field_46062_c;
            }
        } else
        {
            return 0xffffff;
        }
    }

    public boolean func_46058_c()
    {
        return true;
    }

    public int func_46057_a(int p_46057_1_, int p_46057_2_)
    {
        if(p_46057_2_ > 0)
        {
            return super.func_46057_a(p_46057_1_, p_46057_2_) + 16;
        } else
        {
            return super.func_46057_a(p_46057_1_, p_46057_2_);
        }
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_3_.field_1026_y)
        {
            return true;
        }
        int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
        p_192_4_ += Facing.field_31056_b[p_192_7_];
        p_192_5_ += Facing.field_31059_c[p_192_7_];
        p_192_6_ += Facing.field_31058_d[p_192_7_];
        double d = 0.0D;
        if(p_192_7_ == 1 && i == Block.field_4057_ba.field_376_bc || i == Block.field_40207_bC.field_376_bc)
        {
            d = 0.5D;
        }
        if(func_48440_a(p_192_3_, p_192_1_.func_21181_i(), (double)p_192_4_ + 0.5D, (double)p_192_5_ + d, (double)p_192_6_ + 0.5D) && !p_192_2_.field_35212_aW.field_35756_d)
        {
            p_192_1_.field_1615_a--;
        }
        return true;
    }

    public static boolean func_48440_a(World p_48440_0_, int p_48440_1_, double p_48440_2_, double p_48440_4_, double p_48440_6_)
    {
        if(!EntityList.field_44041_a.containsKey(Integer.valueOf(p_48440_1_)))
        {
            return false;
        }
        Entity entity = EntityList.func_1084_a(p_48440_1_, p_48440_0_);
        if(entity != null)
        {
            entity.func_365_c(p_48440_2_, p_48440_4_, p_48440_6_, p_48440_0_.field_1037_n.nextFloat() * 360F, 0.0F);
            p_48440_0_.func_674_a(entity);
            ((EntityLiving)entity).func_22050_O();
        }
        return entity != null;
    }
}
