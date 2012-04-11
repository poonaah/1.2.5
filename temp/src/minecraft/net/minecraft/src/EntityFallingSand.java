// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Block, 
//            BlockPistonMoving, BlockSand, NBTTagCompound

public class EntityFallingSand extends Entity
{

    public int field_799_a;
    public int field_798_b;

    public EntityFallingSand(World p_i763_1_)
    {
        super(p_i763_1_);
        field_798_b = 0;
    }

    public EntityFallingSand(World p_i764_1_, double p_i764_2_, double p_i764_4_, double p_i764_6_, 
            int p_i764_8_)
    {
        super(p_i764_1_);
        field_798_b = 0;
        field_799_a = p_i764_8_;
        field_618_ad = true;
        func_371_a(0.98F, 0.98F);
        field_9292_aO = field_643_aD / 2.0F;
        func_347_a(p_i764_2_, p_i764_4_, p_i764_6_);
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        field_9285_at = p_i764_2_;
        field_9284_au = p_i764_4_;
        field_9283_av = p_i764_6_;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected void func_21057_b()
    {
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_370_e_()
    {
        if(field_799_a == 0)
        {
            func_395_F();
            return;
        }
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_798_b++;
        field_607_ao -= 0.039999999105930328D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_610_al);
        int k = MathHelper.func_1108_b(field_609_am);
        if(field_798_b == 1 && field_615_ag.func_600_a(i, j, k) == field_799_a)
        {
            field_615_ag.func_690_d(i, j, k, 0);
        } else
        if(!field_615_ag.field_1026_y && field_798_b == 1)
        {
            func_395_F();
        }
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
            field_607_ao *= -0.5D;
            if(field_615_ag.func_600_a(i, j, k) != Block.field_9268_ac.field_376_bc)
            {
                func_395_F();
                if((!field_615_ag.func_695_a(field_799_a, i, j, k, true, 1) || BlockSand.func_316_a_(field_615_ag, i, j - 1, k) || !field_615_ag.func_690_d(i, j, k, field_799_a)) && !field_615_ag.field_1026_y)
                {
                    func_367_b(field_799_a, 1);
                }
            }
        } else
        if(field_798_b > 100 && !field_615_ag.field_1026_y && (j < 1 || j > 256) || field_798_b > 600)
        {
            func_367_b(field_799_a, 1);
            func_395_F();
        }
    }

    protected void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_761_a("Tile", (byte)field_799_a);
    }

    protected void func_357_b(NBTTagCompound p_357_1_)
    {
        field_799_a = p_357_1_.func_746_c("Tile") & 0xff;
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public World func_465_i()
    {
        return field_615_ag;
    }
}
