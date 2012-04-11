// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAIEatGrass, PathNavigate, EntityAISwimming, 
//            EntityAITasks, EntityAIPanic, EntityAIMate, EntityAITempt, 
//            Item, EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, 
//            EntityPlayer, EntityAILookIdle, World, DataWatcher, 
//            ItemStack, Block, MathHelper, InventoryPlayer, 
//            ItemShears, EntityItem, NBTTagCompound

public class EntitySheep extends EntityAnimal
{

    public static final float field_21075_a[][] = {
        {
            1.0F, 1.0F, 1.0F
        }, {
            0.95F, 0.7F, 0.2F
        }, {
            0.9F, 0.5F, 0.85F
        }, {
            0.6F, 0.7F, 0.95F
        }, {
            0.9F, 0.9F, 0.2F
        }, {
            0.5F, 0.8F, 0.1F
        }, {
            0.95F, 0.7F, 0.8F
        }, {
            0.3F, 0.3F, 0.3F
        }, {
            0.6F, 0.6F, 0.6F
        }, {
            0.3F, 0.6F, 0.7F
        }, {
            0.7F, 0.4F, 0.9F
        }, {
            0.2F, 0.4F, 0.8F
        }, {
            0.5F, 0.4F, 0.3F
        }, {
            0.4F, 0.5F, 0.2F
        }, {
            0.8F, 0.3F, 0.3F
        }, {
            0.1F, 0.1F, 0.1F
        }
    };
    private int field_44004_b;
    private EntityAIEatGrass field_48137_c;

    public EntitySheep(World p_i272_1_)
    {
        super(p_i272_1_);
        field_48137_c = new EntityAIEatGrass(this);
        field_9357_z = "/mob/sheep.png";
        func_371_a(0.9F, 1.3F);
        float f = 0.23F;
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIPanic(this, 0.38F));
        field_46019_bU.func_46118_a(2, new EntityAIMate(this, f));
        field_46019_bU.func_46118_a(3, new EntityAITempt(this, 0.25F, Item.field_243_R.field_291_aS, false));
        field_46019_bU.func_46118_a(4, new EntityAIFollowParent(this, 0.25F));
        field_46019_bU.func_46118_a(5, field_48137_c);
        field_46019_bU.func_46118_a(6, new EntityAIWander(this, f));
        field_46019_bU.func_46118_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46019_bU.func_46118_a(8, new EntityAILookIdle(this));
    }

    protected boolean func_46006_aR()
    {
        return true;
    }

    protected void func_46014_aS()
    {
        field_44004_b = field_48137_c.func_48396_h();
        super.func_46014_aS();
    }

    public void func_425_j()
    {
        if(field_615_ag.field_1026_y)
        {
            field_44004_b = Math.max(0, field_44004_b - 1);
        }
        super.func_425_j();
    }

    public int func_40117_c()
    {
        return 8;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Byte((byte)0));
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        if(!func_21072_p())
        {
            func_21058_a(new ItemStack(Block.field_419_ac.field_376_bc, 1, func_21074_p_()), 0.0F);
        }
    }

    protected int func_422_g()
    {
        return Block.field_419_ac.field_376_bc;
    }

    public void func_9282_a(byte p_9282_1_)
    {
        if(p_9282_1_ == 10)
        {
            field_44004_b = 40;
        } else
        {
            super.func_9282_a(p_9282_1_);
        }
    }

    public float func_44003_c(float p_44003_1_)
    {
        if(field_44004_b <= 0)
        {
            return 0.0F;
        }
        if(field_44004_b >= 4 && field_44004_b <= 36)
        {
            return 1.0F;
        }
        if(field_44004_b < 4)
        {
            return ((float)field_44004_b - p_44003_1_) / 4F;
        } else
        {
            return -((float)(field_44004_b - 40) - p_44003_1_) / 4F;
        }
    }

    public float func_44002_d(float p_44002_1_)
    {
        if(field_44004_b > 4 && field_44004_b <= 36)
        {
            float f = ((float)(field_44004_b - 4) - p_44002_1_) / 32F;
            return 0.6283185F + 0.2199115F * MathHelper.func_1106_a(f * 28.7F);
        }
        if(field_44004_b > 0)
        {
            return 0.6283185F;
        } else
        {
            return field_604_ar / 57.29578F;
        }
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(itemstack != null && itemstack.field_1617_c == Item.field_31001_bc.field_291_aS && !func_21072_p() && !func_40127_l())
        {
            if(!field_615_ag.field_1026_y)
            {
                func_21073_a(true);
                int i = 1 + field_9312_bd.nextInt(3);
                for(int j = 0; j < i; j++)
                {
                    EntityItem entityitem = func_21058_a(new ItemStack(Block.field_419_ac.field_376_bc, 1, func_21074_p_()), 1.0F);
                    entityitem.field_607_ao += field_9312_bd.nextFloat() * 0.05F;
                    entityitem.field_608_an += (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.1F;
                    entityitem.field_606_ap += (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.1F;
                }

            }
            itemstack.func_25190_a(1, p_353_1_);
        }
        return super.func_353_a(p_353_1_);
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_748_a("Sheared", func_21072_p());
        p_352_1_.func_761_a("Color", (byte)func_21074_p_());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_21073_a(p_357_1_.func_760_m("Sheared"));
        func_21071_b_(p_357_1_.func_746_c("Color"));
    }

    protected String func_6389_d()
    {
        return "mob.sheep";
    }

    protected String func_6394_f_()
    {
        return "mob.sheep";
    }

    protected String func_6390_f()
    {
        return "mob.sheep";
    }

    public int func_21074_p_()
    {
        return field_21064_bx.func_21130_a(16) & 0xf;
    }

    public void func_21071_b_(int p_21071_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & 0xf0 | p_21071_1_ & 0xf)));
    }

    public boolean func_21072_p()
    {
        return (field_21064_bx.func_21130_a(16) & 0x10) != 0;
    }

    public void func_21073_a(boolean p_21073_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_21073_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 | 0x10)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & 0xffffffef)));
        }
    }

    public static int func_21070_a(Random p_21070_0_)
    {
        int i = p_21070_0_.nextInt(100);
        if(i < 5)
        {
            return 15;
        }
        if(i < 10)
        {
            return 7;
        }
        if(i < 15)
        {
            return 8;
        }
        if(i < 18)
        {
            return 12;
        }
        return p_21070_0_.nextInt(500) != 0 ? 0 : 6;
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        EntitySheep entitysheep = (EntitySheep)p_40145_1_;
        EntitySheep entitysheep1 = new EntitySheep(field_615_ag);
        if(field_9312_bd.nextBoolean())
        {
            entitysheep1.func_21071_b_(func_21074_p_());
        } else
        {
            entitysheep1.func_21071_b_(entitysheep.func_21074_p_());
        }
        return entitysheep1;
    }

    public void func_48095_u()
    {
        func_21073_a(false);
        if(func_40127_l())
        {
            int i = func_48123_at() + 1200;
            if(i > 0)
            {
                i = 0;
            }
            func_48122_d(i);
        }
    }

}
