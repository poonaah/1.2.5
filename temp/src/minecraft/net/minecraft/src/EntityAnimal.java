// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAgeable, World, EntityPlayer, Entity, 
//            Block, BlockGrass, NBTTagCompound, AxisAlignedBB, 
//            MathHelper, ItemStack, Item, InventoryPlayer, 
//            PlayerCapabilities, DamageSource

public abstract class EntityAnimal extends EntityAgeable
{

    private int field_39004_a;
    private int field_39005_b;

    public EntityAnimal(World p_i239_1_)
    {
        super(p_i239_1_);
        field_39005_b = 0;
    }

    protected void func_48097_s_()
    {
        if(func_48123_at() != 0)
        {
            field_39004_a = 0;
        }
        super.func_48097_s_();
    }

    public void func_425_j()
    {
        super.func_425_j();
        if(func_48123_at() != 0)
        {
            field_39004_a = 0;
        }
        if(field_39004_a > 0)
        {
            field_39004_a--;
            String s = "heart";
            if(field_39004_a % 10 == 0)
            {
                double d = field_9312_bd.nextGaussian() * 0.02D;
                double d1 = field_9312_bd.nextGaussian() * 0.02D;
                double d2 = field_9312_bd.nextGaussian() * 0.02D;
                field_615_ag.func_694_a(s, (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + 0.5D + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
            }
        } else
        {
            field_39005_b = 0;
        }
    }

    protected void func_437_a(Entity p_437_1_, float p_437_2_)
    {
        if(p_437_1_ instanceof EntityPlayer)
        {
            if(p_437_2_ < 3F)
            {
                double d = p_437_1_.field_611_ak - field_611_ak;
                double d1 = p_437_1_.field_609_am - field_609_am;
                field_605_aq = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
                field_750_g = true;
            }
            EntityPlayer entityplayer = (EntityPlayer)p_437_1_;
            if(entityplayer.func_6416_v() == null || !func_40143_a(entityplayer.func_6416_v()))
            {
                field_751_f = null;
            }
        } else
        if(p_437_1_ instanceof EntityAnimal)
        {
            EntityAnimal entityanimal = (EntityAnimal)p_437_1_;
            if(func_48123_at() > 0 && entityanimal.func_48123_at() < 0)
            {
                if((double)p_437_2_ < 2.5D)
                {
                    field_750_g = true;
                }
            } else
            if(field_39004_a > 0 && entityanimal.field_39004_a > 0)
            {
                if(entityanimal.field_751_f == null)
                {
                    entityanimal.field_751_f = this;
                }
                if(entityanimal.field_751_f == this && (double)p_437_2_ < 3.5D)
                {
                    entityanimal.field_39004_a++;
                    field_39004_a++;
                    field_39005_b++;
                    if(field_39005_b % 4 == 0)
                    {
                        field_615_ag.func_694_a("heart", (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + 0.5D + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, 0.0D, 0.0D, 0.0D);
                    }
                    if(field_39005_b == 60)
                    {
                        func_40144_b((EntityAnimal)p_437_1_);
                    }
                } else
                {
                    field_39005_b = 0;
                }
            } else
            {
                field_39005_b = 0;
                field_751_f = null;
            }
        }
    }

    private void func_40144_b(EntityAnimal p_40144_1_)
    {
        EntityAnimal entityanimal = func_40145_a(p_40144_1_);
        if(entityanimal != null)
        {
            func_48122_d(6000);
            p_40144_1_.func_48122_d(6000);
            field_39004_a = 0;
            field_39005_b = 0;
            field_751_f = null;
            p_40144_1_.field_751_f = null;
            p_40144_1_.field_39005_b = 0;
            p_40144_1_.field_39004_a = 0;
            entityanimal.func_48122_d(-24000);
            entityanimal.func_365_c(field_611_ak, field_610_al, field_609_am, field_605_aq, field_604_ar);
            for(int i = 0; i < 7; i++)
            {
                double d = field_9312_bd.nextGaussian() * 0.02D;
                double d1 = field_9312_bd.nextGaussian() * 0.02D;
                double d2 = field_9312_bd.nextGaussian() * 0.02D;
                field_615_ag.func_694_a("heart", (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + 0.5D + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
            }

            field_615_ag.func_674_a(entityanimal);
        }
    }

    public abstract EntityAnimal func_40145_a(EntityAnimal entityanimal);

    protected void func_28022_b(Entity entity, float f)
    {
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        field_35174_at = 60;
        field_751_f = null;
        field_39004_a = 0;
        return super.func_396_a(p_396_1_, p_396_2_);
    }

    public float func_439_a(int p_439_1_, int p_439_2_, int p_439_3_)
    {
        if(field_615_ag.func_600_a(p_439_1_, p_439_2_ - 1, p_439_3_) == Block.field_337_v.field_376_bc)
        {
            return 10F;
        } else
        {
            return field_615_ag.func_598_c(p_439_1_, p_439_2_, p_439_3_) - 0.5F;
        }
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("InLove", field_39004_a);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        field_39004_a = p_357_1_.func_756_e("InLove");
    }

    protected Entity func_438_i()
    {
        if(field_35174_at > 0)
        {
            return null;
        }
        float f = 8F;
        if(field_39004_a > 0)
        {
            List list = field_615_ag.func_657_a(getClass(), field_601_au.func_1177_b(f, f, f));
            for(int i = 0; i < list.size(); i++)
            {
                EntityAnimal entityanimal = (EntityAnimal)list.get(i);
                if(entityanimal != this && entityanimal.field_39004_a > 0)
                {
                    return entityanimal;
                }
            }

        } else
        if(func_48123_at() == 0)
        {
            List list1 = field_615_ag.func_657_a(net.minecraft.src.EntityPlayer.class, field_601_au.func_1177_b(f, f, f));
            for(int j = 0; j < list1.size(); j++)
            {
                EntityPlayer entityplayer = (EntityPlayer)list1.get(j);
                if(entityplayer.func_6416_v() != null && func_40143_a(entityplayer.func_6416_v()))
                {
                    return entityplayer;
                }
            }

        } else
        if(func_48123_at() > 0)
        {
            List list2 = field_615_ag.func_657_a(getClass(), field_601_au.func_1177_b(f, f, f));
            for(int k = 0; k < list2.size(); k++)
            {
                EntityAnimal entityanimal1 = (EntityAnimal)list2.get(k);
                if(entityanimal1 != this && entityanimal1.func_48123_at() < 0)
                {
                    return entityanimal1;
                }
            }

        }
        return null;
    }

    public boolean func_433_a()
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_601_au.field_1697_b);
        int k = MathHelper.func_1108_b(field_609_am);
        return field_615_ag.func_600_a(i, j - 1, k) == Block.field_337_v.field_376_bc && field_615_ag.func_28104_m(i, j, k) > 8 && super.func_433_a();
    }

    public int func_421_b()
    {
        return 120;
    }

    protected boolean func_25023_u()
    {
        return false;
    }

    protected int func_36001_a(EntityPlayer p_36001_1_)
    {
        return 1 + field_615_ag.field_1037_n.nextInt(3);
    }

    public boolean func_40143_a(ItemStack p_40143_1_)
    {
        return p_40143_1_.field_1617_c == Item.field_243_R.field_291_aS;
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(itemstack != null && func_40143_a(itemstack) && func_48123_at() == 0)
        {
            if(!p_353_1_.field_35212_aW.field_35756_d)
            {
                itemstack.field_1615_a--;
                if(itemstack.field_1615_a <= 0)
                {
                    p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, null);
                }
            }
            field_39004_a = 600;
            field_751_f = null;
            for(int i = 0; i < 7; i++)
            {
                double d = field_9312_bd.nextGaussian() * 0.02D;
                double d1 = field_9312_bd.nextGaussian() * 0.02D;
                double d2 = field_9312_bd.nextGaussian() * 0.02D;
                field_615_ag.func_694_a("heart", (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + 0.5D + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
            }

            return true;
        } else
        {
            return super.func_353_a(p_353_1_);
        }
    }

    public boolean func_48136_o_()
    {
        return field_39004_a > 0;
    }

    public void func_48134_p_()
    {
        field_39004_a = 0;
    }

    public boolean func_48135_b(EntityAnimal p_48135_1_)
    {
        if(p_48135_1_ == this)
        {
            return false;
        }
        if(p_48135_1_.getClass() != getClass())
        {
            return false;
        } else
        {
            return func_48136_o_() && p_48135_1_.func_48136_o_();
        }
    }
}
