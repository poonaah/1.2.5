// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            PlayerController, PlayerControllerCreative, EntityPlayer, World, 
//            EntityPlayerSP, ItemStack, Packet14BlockDig, NetClientHandler, 
//            Block, StepSound, SoundManager, GuiIngame, 
//            RenderGlobal, InventoryPlayer, Packet16BlockItemSwitch, Packet15Place, 
//            EntityClientPlayerMP, Packet7UseEntity, Entity, Container, 
//            Packet102WindowClick, Packet108EnchantItem, Packet107CreativeSetSlot

public class PlayerControllerMP extends PlayerController
{

    private int field_9445_c;
    private int field_9444_d;
    private int field_9443_e;
    private float field_9442_f;
    private float field_1080_g;
    private float field_9441_h;
    private int field_9440_i;
    private boolean field_9439_j;
    private boolean field_35649_k;
    private NetClientHandler field_9438_k;
    private int field_1075_l;

    public PlayerControllerMP(Minecraft p_i572_1_, NetClientHandler p_i572_2_)
    {
        super(p_i572_1_);
        field_9445_c = -1;
        field_9444_d = -1;
        field_9443_e = -1;
        field_9442_f = 0.0F;
        field_1080_g = 0.0F;
        field_9441_h = 0.0F;
        field_9440_i = 0;
        field_9439_j = false;
        field_1075_l = 0;
        field_9438_k = p_i572_2_;
    }

    public void func_35648_a(boolean p_35648_1_)
    {
        field_35649_k = p_35648_1_;
        if(field_35649_k)
        {
            PlayerControllerCreative.func_35646_d(field_1065_a.field_6322_g);
        } else
        {
            PlayerControllerCreative.func_35645_e(field_1065_a.field_6322_g);
        }
    }

    public void func_6476_a(EntityPlayer p_6476_1_)
    {
        p_6476_1_.field_605_aq = -180F;
    }

    public boolean func_6469_d()
    {
        return !field_35649_k;
    }

    public boolean func_729_b(int p_729_1_, int p_729_2_, int p_729_3_, int p_729_4_)
    {
        if(field_35649_k)
        {
            return super.func_729_b(p_729_1_, p_729_2_, p_729_3_, p_729_4_);
        }
        int i = field_1065_a.field_6324_e.func_600_a(p_729_1_, p_729_2_, p_729_3_);
        boolean flag = super.func_729_b(p_729_1_, p_729_2_, p_729_3_, p_729_4_);
        ItemStack itemstack = field_1065_a.field_6322_g.func_6416_v();
        if(itemstack != null)
        {
            itemstack.func_25191_a(i, p_729_1_, p_729_2_, p_729_3_, field_1065_a.field_6322_g);
            if(itemstack.field_1615_a == 0)
            {
                itemstack.func_1097_a(field_1065_a.field_6322_g);
                field_1065_a.field_6322_g.func_448_u();
            }
        }
        return flag;
    }

    public void func_719_a(int p_719_1_, int p_719_2_, int p_719_3_, int p_719_4_)
    {
        if(field_35649_k)
        {
            field_9438_k.func_847_a(new Packet14BlockDig(0, p_719_1_, p_719_2_, p_719_3_, p_719_4_));
            PlayerControllerCreative.func_35644_a(field_1065_a, this, p_719_1_, p_719_2_, p_719_3_, p_719_4_);
            field_9440_i = 5;
        } else
        if(!field_9439_j || p_719_1_ != field_9445_c || p_719_2_ != field_9444_d || p_719_3_ != field_9443_e)
        {
            field_9438_k.func_847_a(new Packet14BlockDig(0, p_719_1_, p_719_2_, p_719_3_, p_719_4_));
            int i = field_1065_a.field_6324_e.func_600_a(p_719_1_, p_719_2_, p_719_3_);
            if(i > 0 && field_9442_f == 0.0F)
            {
                Block.field_345_n[i].func_233_b(field_1065_a.field_6324_e, p_719_1_, p_719_2_, p_719_3_, field_1065_a.field_6322_g);
            }
            if(i > 0 && Block.field_345_n[i].func_225_a(field_1065_a.field_6322_g) >= 1.0F)
            {
                func_729_b(p_719_1_, p_719_2_, p_719_3_, p_719_4_);
            } else
            {
                field_9439_j = true;
                field_9445_c = p_719_1_;
                field_9444_d = p_719_2_;
                field_9443_e = p_719_3_;
                field_9442_f = 0.0F;
                field_1080_g = 0.0F;
                field_9441_h = 0.0F;
            }
        }
    }

    public void func_6468_a()
    {
        field_9442_f = 0.0F;
        field_9439_j = false;
    }

    public void func_6470_c(int p_6470_1_, int p_6470_2_, int p_6470_3_, int p_6470_4_)
    {
        func_730_e();
        if(field_9440_i > 0)
        {
            field_9440_i--;
            return;
        }
        if(field_35649_k)
        {
            field_9440_i = 5;
            field_9438_k.func_847_a(new Packet14BlockDig(0, p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_));
            PlayerControllerCreative.func_35644_a(field_1065_a, this, p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_);
            return;
        }
        if(p_6470_1_ == field_9445_c && p_6470_2_ == field_9444_d && p_6470_3_ == field_9443_e)
        {
            int i = field_1065_a.field_6324_e.func_600_a(p_6470_1_, p_6470_2_, p_6470_3_);
            if(i == 0)
            {
                field_9439_j = false;
                return;
            }
            Block block = Block.field_345_n[i];
            field_9442_f += block.func_225_a(field_1065_a.field_6322_g);
            if(field_9441_h % 4F == 0.0F && block != null)
            {
                field_1065_a.field_6301_A.func_336_b(block.field_358_bl.func_1145_d(), (float)p_6470_1_ + 0.5F, (float)p_6470_2_ + 0.5F, (float)p_6470_3_ + 0.5F, (block.field_358_bl.func_1147_b() + 1.0F) / 8F, block.field_358_bl.func_1144_c() * 0.5F);
            }
            field_9441_h++;
            if(field_9442_f >= 1.0F)
            {
                field_9439_j = false;
                field_9438_k.func_847_a(new Packet14BlockDig(2, p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_));
                func_729_b(p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_);
                field_9442_f = 0.0F;
                field_1080_g = 0.0F;
                field_9441_h = 0.0F;
                field_9440_i = 5;
            }
        } else
        {
            func_719_a(p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_);
        }
    }

    public void func_6467_a(float p_6467_1_)
    {
        if(field_9442_f <= 0.0F)
        {
            field_1065_a.field_6308_u.field_6446_b = 0.0F;
            field_1065_a.field_6323_f.field_1450_i = 0.0F;
        } else
        {
            float f = field_1080_g + (field_9442_f - field_1080_g) * p_6467_1_;
            field_1065_a.field_6308_u.field_6446_b = f;
            field_1065_a.field_6323_f.field_1450_i = f;
        }
    }

    public float func_727_b()
    {
        return !field_35649_k ? 4.5F : 5F;
    }

    public void func_717_a(World p_717_1_)
    {
        super.func_717_a(p_717_1_);
    }

    public void func_6474_c()
    {
        func_730_e();
        field_1080_g = field_9442_f;
        field_1065_a.field_6301_A.func_4033_c();
    }

    private void func_730_e()
    {
        int i = field_1065_a.field_6322_g.field_778_b.field_847_d;
        if(i != field_1075_l)
        {
            field_1075_l = i;
            field_9438_k.func_847_a(new Packet16BlockItemSwitch(field_1075_l));
        }
    }

    public boolean func_722_a(EntityPlayer p_722_1_, World p_722_2_, ItemStack p_722_3_, int p_722_4_, int p_722_5_, int p_722_6_, int p_722_7_)
    {
        func_730_e();
        field_9438_k.func_847_a(new Packet15Place(p_722_4_, p_722_5_, p_722_6_, p_722_7_, p_722_1_.field_778_b.func_494_a()));
        int i = p_722_2_.func_600_a(p_722_4_, p_722_5_, p_722_6_);
        if(i > 0 && Block.field_345_n[i].func_250_a(p_722_2_, p_722_4_, p_722_5_, p_722_6_, p_722_1_))
        {
            return true;
        }
        if(p_722_3_ == null)
        {
            return false;
        }
        if(field_35649_k)
        {
            int j = p_722_3_.func_21181_i();
            int k = p_722_3_.field_1615_a;
            boolean flag = p_722_3_.func_1090_a(p_722_1_, p_722_2_, p_722_4_, p_722_5_, p_722_6_, p_722_7_);
            p_722_3_.func_28156_b(j);
            p_722_3_.field_1615_a = k;
            return flag;
        } else
        {
            return p_722_3_.func_1090_a(p_722_1_, p_722_2_, p_722_4_, p_722_5_, p_722_6_, p_722_7_);
        }
    }

    public boolean func_6471_a(EntityPlayer p_6471_1_, World p_6471_2_, ItemStack p_6471_3_)
    {
        func_730_e();
        field_9438_k.func_847_a(new Packet15Place(-1, -1, -1, 255, p_6471_1_.field_778_b.func_494_a()));
        boolean flag = super.func_6471_a(p_6471_1_, p_6471_2_, p_6471_3_);
        return flag;
    }

    public EntityPlayer func_4087_b(World p_4087_1_)
    {
        return new EntityClientPlayerMP(field_1065_a, p_4087_1_, field_1065_a.field_6320_i, field_9438_k);
    }

    public void func_6472_b(EntityPlayer p_6472_1_, Entity p_6472_2_)
    {
        func_730_e();
        field_9438_k.func_847_a(new Packet7UseEntity(p_6472_1_.field_620_ab, p_6472_2_.field_620_ab, 1));
        p_6472_1_.func_463_a(p_6472_2_);
    }

    public void func_6475_a(EntityPlayer p_6475_1_, Entity p_6475_2_)
    {
        func_730_e();
        field_9438_k.func_847_a(new Packet7UseEntity(p_6475_1_.field_620_ab, p_6475_2_.field_620_ab, 0));
        p_6475_1_.func_6415_a_(p_6475_2_);
    }

    public ItemStack func_27174_a(int p_27174_1_, int p_27174_2_, int p_27174_3_, boolean p_27174_4_, EntityPlayer p_27174_5_)
    {
        short word0 = p_27174_5_.field_20068_h.func_20111_a(p_27174_5_.field_778_b);
        ItemStack itemstack = super.func_27174_a(p_27174_1_, p_27174_2_, p_27174_3_, p_27174_4_, p_27174_5_);
        field_9438_k.func_847_a(new Packet102WindowClick(p_27174_1_, p_27174_2_, p_27174_3_, p_27174_4_, itemstack, word0));
        return itemstack;
    }

    public void func_40593_a(int p_40593_1_, int p_40593_2_)
    {
        field_9438_k.func_847_a(new Packet108EnchantItem(p_40593_1_, p_40593_2_));
    }

    public void func_35637_a(ItemStack p_35637_1_, int p_35637_2_)
    {
        if(field_35649_k)
        {
            field_9438_k.func_847_a(new Packet107CreativeSetSlot(p_35637_2_, p_35637_1_));
        }
    }

    public void func_35639_a(ItemStack p_35639_1_)
    {
        if(field_35649_k && p_35639_1_ != null)
        {
            field_9438_k.func_847_a(new Packet107CreativeSetSlot(-1, p_35639_1_));
        }
    }

    public void func_20086_a(int p_20086_1_, EntityPlayer p_20086_2_)
    {
        if(p_20086_1_ == -9999)
        {
            return;
        } else
        {
            return;
        }
    }

    public void func_35638_c(EntityPlayer p_35638_1_)
    {
        func_730_e();
        field_9438_k.func_847_a(new Packet14BlockDig(5, 0, 0, 0, 255));
        super.func_35638_c(p_35638_1_);
    }

    public boolean func_35642_f()
    {
        return true;
    }

    public boolean func_35641_g()
    {
        return !field_35649_k;
    }

    public boolean func_35640_h()
    {
        return field_35649_k;
    }

    public boolean func_35636_i()
    {
        return field_35649_k;
    }
}
