// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, EntityAISwimming, EntityAITasks, EntityAIPanic, 
//            EntityAIMate, EntityAITempt, Item, EntityAIFollowParent, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            World, NBTTagCompound

public class EntityChicken extends EntityAnimal
{

    public boolean field_753_a;
    public float field_752_b;
    public float field_758_c;
    public float field_757_d;
    public float field_756_e;
    public float field_755_h;
    public int field_754_i;

    public EntityChicken(World p_i566_1_)
    {
        super(p_i566_1_);
        field_753_a = false;
        field_752_b = 0.0F;
        field_758_c = 0.0F;
        field_755_h = 1.0F;
        field_9357_z = "/mob/chicken.png";
        func_371_a(0.3F, 0.7F);
        field_754_i = field_9312_bd.nextInt(6000) + 6000;
        float f = 0.25F;
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIPanic(this, 0.38F));
        field_46019_bU.func_46118_a(2, new EntityAIMate(this, f));
        field_46019_bU.func_46118_a(3, new EntityAITempt(this, 0.25F, Item.field_243_R.field_291_aS, false));
        field_46019_bU.func_46118_a(4, new EntityAIFollowParent(this, 0.28F));
        field_46019_bU.func_46118_a(5, new EntityAIWander(this, f));
        field_46019_bU.func_46118_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46019_bU.func_46118_a(7, new EntityAILookIdle(this));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public int func_40117_c()
    {
        return 4;
    }

    public void func_425_j()
    {
        super.func_425_j();
        field_756_e = field_752_b;
        field_757_d = field_758_c;
        field_758_c += (double)(field_9298_aH ? -1 : 4) * 0.29999999999999999D;
        if(field_758_c < 0.0F)
        {
            field_758_c = 0.0F;
        }
        if(field_758_c > 1.0F)
        {
            field_758_c = 1.0F;
        }
        if(!field_9298_aH && field_755_h < 1.0F)
        {
            field_755_h = 1.0F;
        }
        field_755_h *= 0.90000000000000002D;
        if(!field_9298_aH && field_607_ao < 0.0D)
        {
            field_607_ao *= 0.59999999999999998D;
        }
        field_752_b += field_755_h * 2.0F;
        if(!func_40127_l() && !field_615_ag.field_1026_y && --field_754_i <= 0)
        {
            field_615_ag.func_623_a(this, "mob.chickenplop", 1.0F, (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F);
            func_367_b(Item.field_296_aN.field_291_aS, 1);
            field_754_i = field_9312_bd.nextInt(6000) + 6000;
        }
    }

    protected void func_400_c(float f)
    {
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
    }

    protected String func_6389_d()
    {
        return "mob.chicken";
    }

    protected String func_6394_f_()
    {
        return "mob.chickenhurt";
    }

    protected String func_6390_f()
    {
        return "mob.chickenhurt";
    }

    protected int func_422_g()
    {
        return Item.field_251_J.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(3) + field_9312_bd.nextInt(1 + p_21066_2_);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_251_J.field_291_aS, 1);
        }

        if(func_21062_U())
        {
            func_367_b(Item.field_35420_bm.field_291_aS, 1);
        } else
        {
            func_367_b(Item.field_35419_bl.field_291_aS, 1);
        }
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        return new EntityChicken(field_615_ag);
    }
}
