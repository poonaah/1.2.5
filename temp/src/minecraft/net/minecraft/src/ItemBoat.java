// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, Vec3D, MathHelper, 
//            World, AxisAlignedBB, Entity, MovingObjectPosition, 
//            EnumMovingObjectType, Block, EntityBoat, PlayerCapabilities, 
//            ItemStack

public class ItemBoat extends Item
{

    public ItemBoat(int p_i160_1_)
    {
        super(p_i160_1_);
        field_290_aT = 1;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        float f = 1.0F;
        float f1 = p_193_3_.field_602_at + (p_193_3_.field_604_ar - p_193_3_.field_602_at) * f;
        float f2 = p_193_3_.field_603_as + (p_193_3_.field_605_aq - p_193_3_.field_603_as) * f;
        double d = p_193_3_.field_9285_at + (p_193_3_.field_611_ak - p_193_3_.field_9285_at) * (double)f;
        double d1 = (p_193_3_.field_9284_au + (p_193_3_.field_610_al - p_193_3_.field_9284_au) * (double)f + 1.6200000000000001D) - (double)p_193_3_.field_9292_aO;
        double d2 = p_193_3_.field_9283_av + (p_193_3_.field_609_am - p_193_3_.field_9283_av) * (double)f;
        Vec3D vec3d = Vec3D.func_1248_b(d, d1, d2);
        float f3 = MathHelper.func_1114_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.func_1106_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.func_1114_b(-f1 * 0.01745329F);
        float f6 = MathHelper.func_1106_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3D vec3d1 = vec3d.func_1257_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = p_193_2_.func_642_a(vec3d, vec3d1, true);
        if(movingobjectposition == null)
        {
            return p_193_1_;
        }
        Vec3D vec3d2 = p_193_3_.func_430_f(f);
        boolean flag = false;
        float f10 = 1.0F;
        List list = p_193_2_.func_659_b(p_193_3_, p_193_3_.field_601_au.func_1170_a(vec3d2.field_1776_a * d3, vec3d2.field_1775_b * d3, vec3d2.field_1779_c * d3).func_1177_b(f10, f10, f10));
        for(int l = 0; l < list.size(); l++)
        {
            Entity entity = (Entity)list.get(l);
            if(!entity.func_401_c_())
            {
                continue;
            }
            float f11 = entity.func_4035_j_();
            AxisAlignedBB axisalignedbb = entity.field_601_au.func_1177_b(f11, f11, f11);
            if(axisalignedbb.func_4150_a(vec3d))
            {
                flag = true;
            }
        }

        if(flag)
        {
            return p_193_1_;
        }
        if(movingobjectposition.field_1167_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_1166_b;
            int j = movingobjectposition.field_1172_c;
            int k = movingobjectposition.field_1171_d;
            if(!p_193_2_.field_1026_y)
            {
                if(p_193_2_.func_600_a(i, j, k) == Block.field_428_aT.field_376_bc)
                {
                    j--;
                }
                p_193_2_.func_674_a(new EntityBoat(p_193_2_, (float)i + 0.5F, (float)j + 1.0F, (float)k + 0.5F));
            }
            if(!p_193_3_.field_35212_aW.field_35756_d)
            {
                p_193_1_.field_1615_a--;
            }
        }
        return p_193_1_;
    }
}
