// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, World, EntityList, EntityLiving, 
//            AxisAlignedBB, NBTTagCompound

public class TileEntityMobSpawner extends TileEntity
{

    public int field_829_a;
    private String field_828_b;
    public double field_831_c;
    public double field_830_d;

    public TileEntityMobSpawner()
    {
        field_829_a = -1;
        field_830_d = 0.0D;
        field_828_b = "Pig";
        field_829_a = 20;
    }

    public String func_21099_a()
    {
        return field_828_b;
    }

    public void func_21098_a(String p_21098_1_)
    {
        field_828_b = p_21098_1_;
    }

    public boolean func_484_a()
    {
        return field_824_e.func_683_a((double)field_823_f + 0.5D, (double)field_822_g + 0.5D, (double)field_821_h + 0.5D, 16D) != null;
    }

    public void func_475_b()
    {
        field_830_d = field_831_c;
        if(!func_484_a())
        {
            return;
        }
        double d = (float)field_823_f + field_824_e.field_1037_n.nextFloat();
        double d1 = (float)field_822_g + field_824_e.field_1037_n.nextFloat();
        double d2 = (float)field_821_h + field_824_e.field_1037_n.nextFloat();
        field_824_e.func_694_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
        field_824_e.func_694_a("flame", d, d1, d2, 0.0D, 0.0D, 0.0D);
        for(field_831_c += 1000F / ((float)field_829_a + 200F); field_831_c > 360D;)
        {
            field_831_c -= 360D;
            field_830_d -= 360D;
        }

        if(!field_824_e.field_1026_y)
        {
            if(field_829_a == -1)
            {
                func_483_c();
            }
            if(field_829_a > 0)
            {
                field_829_a--;
                return;
            }
            byte byte0 = 4;
            for(int i = 0; i < byte0; i++)
            {
                EntityLiving entityliving = (EntityLiving)EntityList.func_1079_a(field_828_b, field_824_e);
                if(entityliving == null)
                {
                    return;
                }
                int j = field_824_e.func_657_a(entityliving.getClass(), AxisAlignedBB.func_1161_b(field_823_f, field_822_g, field_821_h, field_823_f + 1, field_822_g + 1, field_821_h + 1).func_1177_b(8D, 4D, 8D)).size();
                if(j >= 6)
                {
                    func_483_c();
                    return;
                }
                if(entityliving == null)
                {
                    continue;
                }
                double d3 = (double)field_823_f + (field_824_e.field_1037_n.nextDouble() - field_824_e.field_1037_n.nextDouble()) * 4D;
                double d4 = (field_822_g + field_824_e.field_1037_n.nextInt(3)) - 1;
                double d5 = (double)field_821_h + (field_824_e.field_1037_n.nextDouble() - field_824_e.field_1037_n.nextDouble()) * 4D;
                entityliving.func_365_c(d3, d4, d5, field_824_e.field_1037_n.nextFloat() * 360F, 0.0F);
                if(entityliving.func_433_a())
                {
                    field_824_e.func_674_a(entityliving);
                    field_824_e.func_28106_e(2004, field_823_f, field_822_g, field_821_h, 0);
                    entityliving.func_415_z();
                    func_483_c();
                }
            }

        }
        super.func_475_b();
    }

    private void func_483_c()
    {
        field_829_a = 200 + field_824_e.field_1037_n.nextInt(600);
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        field_828_b = p_482_1_.func_755_i("EntityId");
        field_829_a = p_482_1_.func_745_d("Delay");
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        p_481_1_.func_754_a("EntityId", field_828_b);
        p_481_1_.func_749_a("Delay", (short)field_829_a);
    }
}
