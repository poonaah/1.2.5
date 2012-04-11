// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFireball, World, MovingObjectPosition, Entity, 
//            DamageSource, Block, BlockFire, EntityLiving

public class EntitySmallFireball extends EntityFireball
{

    public EntitySmallFireball(World p_i534_1_)
    {
        super(p_i534_1_);
        func_371_a(0.3125F, 0.3125F);
    }

    public EntitySmallFireball(World p_i535_1_, EntityLiving p_i535_2_, double p_i535_3_, double p_i535_5_, double p_i535_7_)
    {
        super(p_i535_1_, p_i535_2_, p_i535_3_, p_i535_5_, p_i535_7_);
        func_371_a(0.3125F, 0.3125F);
    }

    public EntitySmallFireball(World p_i536_1_, double p_i536_2_, double p_i536_4_, double p_i536_6_, 
            double p_i536_8_, double p_i536_10_, double p_i536_12_)
    {
        super(p_i536_1_, p_i536_2_, p_i536_4_, p_i536_6_, p_i536_8_, p_i536_10_, p_i536_12_);
        func_371_a(0.3125F, 0.3125F);
    }

    protected void func_40071_a(MovingObjectPosition p_40071_1_)
    {
        if(!field_615_ag.field_1026_y)
        {
            if(p_40071_1_.field_1168_g != null)
            {
                if(!p_40071_1_.field_1168_g.func_40047_D() && p_40071_1_.field_1168_g.func_396_a(DamageSource.func_35530_a(this, field_9397_j), 5))
                {
                    p_40071_1_.field_1168_g.func_40046_d(5);
                }
            } else
            {
                int i = p_40071_1_.field_1166_b;
                int j = p_40071_1_.field_1172_c;
                int k = p_40071_1_.field_1171_d;
                switch(p_40071_1_.field_1170_e)
                {
                case 1: // '\001'
                    j++;
                    break;

                case 0: // '\0'
                    j--;
                    break;

                case 2: // '\002'
                    k--;
                    break;

                case 3: // '\003'
                    k++;
                    break;

                case 5: // '\005'
                    i++;
                    break;

                case 4: // '\004'
                    i--;
                    break;
                }
                if(field_615_ag.func_20084_d(i, j, k))
                {
                    field_615_ag.func_690_d(i, j, k, Block.field_402_as.field_376_bc);
                }
            }
            func_395_F();
        }
    }

    public boolean func_401_c_()
    {
        return false;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        return false;
    }
}
