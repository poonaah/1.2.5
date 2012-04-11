// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            Block, World, ItemStack, EntityPlayer, 
//            InventoryPlayer, PlayerControllerCreative, EntityPlayerSP, WorldProvider, 
//            Container, Entity

public abstract class PlayerController
{

    protected final Minecraft field_1065_a;
    public boolean field_1064_b;

    public PlayerController(Minecraft p_i411_1_)
    {
        field_1064_b = false;
        field_1065_a = p_i411_1_;
    }

    public void func_717_a(World world)
    {
    }

    public abstract void func_719_a(int i, int j, int k, int l);

    public boolean func_729_b(int p_729_1_, int p_729_2_, int p_729_3_, int p_729_4_)
    {
        World world = field_1065_a.field_6324_e;
        Block block = Block.field_345_n[world.func_600_a(p_729_1_, p_729_2_, p_729_3_)];
        if(block == null)
        {
            return false;
        }
        world.func_28106_e(2001, p_729_1_, p_729_2_, p_729_3_, block.field_376_bc + (world.func_602_e(p_729_1_, p_729_2_, p_729_3_) << 12));
        int i = world.func_602_e(p_729_1_, p_729_2_, p_729_3_);
        boolean flag = world.func_690_d(p_729_1_, p_729_2_, p_729_3_, 0);
        if(flag)
        {
            block.func_252_b(world, p_729_1_, p_729_2_, p_729_3_, i);
        }
        return flag;
    }

    public abstract void func_6470_c(int i, int j, int k, int l);

    public abstract void func_6468_a();

    public void func_6467_a(float f)
    {
    }

    public abstract float func_727_b();

    public boolean func_6471_a(EntityPlayer p_6471_1_, World p_6471_2_, ItemStack p_6471_3_)
    {
        int i = p_6471_3_.field_1615_a;
        ItemStack itemstack = p_6471_3_.func_1093_a(p_6471_2_, p_6471_1_);
        if(itemstack != p_6471_3_ || itemstack != null && itemstack.field_1615_a != i)
        {
            p_6471_1_.field_778_b.field_843_a[p_6471_1_.field_778_b.field_847_d] = itemstack;
            if(itemstack.field_1615_a == 0)
            {
                p_6471_1_.field_778_b.field_843_a[p_6471_1_.field_778_b.field_847_d] = null;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void func_6476_a(EntityPlayer entityplayer)
    {
    }

    public void func_6474_c()
    {
    }

    public abstract boolean func_6469_d();

    public void func_6473_b(EntityPlayer p_6473_1_)
    {
        PlayerControllerCreative.func_35645_e(p_6473_1_);
    }

    public abstract boolean func_722_a(EntityPlayer entityplayer, World world, ItemStack itemstack, int i, int j, int k, int l);

    public EntityPlayer func_4087_b(World p_4087_1_)
    {
        return new EntityPlayerSP(field_1065_a, p_4087_1_, field_1065_a.field_6320_i, p_4087_1_.field_4209_q.field_4218_e);
    }

    public void func_6475_a(EntityPlayer p_6475_1_, Entity p_6475_2_)
    {
        p_6475_1_.func_6415_a_(p_6475_2_);
    }

    public void func_6472_b(EntityPlayer p_6472_1_, Entity p_6472_2_)
    {
        p_6472_1_.func_463_a(p_6472_2_);
    }

    public ItemStack func_27174_a(int p_27174_1_, int p_27174_2_, int p_27174_3_, boolean p_27174_4_, EntityPlayer p_27174_5_)
    {
        return p_27174_5_.field_20068_h.func_27280_a(p_27174_2_, p_27174_3_, p_27174_4_, p_27174_5_);
    }

    public void func_20086_a(int p_20086_1_, EntityPlayer p_20086_2_)
    {
        p_20086_2_.field_20068_h.func_1104_a(p_20086_2_);
        p_20086_2_.field_20068_h = p_20086_2_.field_20069_g;
    }

    public void func_40593_a(int i, int j)
    {
    }

    public boolean func_35643_e()
    {
        return false;
    }

    public void func_35638_c(EntityPlayer p_35638_1_)
    {
        p_35638_1_.func_35206_ab();
    }

    public boolean func_35642_f()
    {
        return false;
    }

    public boolean func_35641_g()
    {
        return true;
    }

    public boolean func_35640_h()
    {
        return false;
    }

    public boolean func_35636_i()
    {
        return false;
    }

    public void func_35637_a(ItemStack itemstack, int i)
    {
    }

    public void func_35639_a(ItemStack itemstack)
    {
    }
}
