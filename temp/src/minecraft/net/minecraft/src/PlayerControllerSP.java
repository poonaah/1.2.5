// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            PlayerController, EntityPlayer, World, EntityPlayerSP, 
//            Block, ItemStack, StepSound, SoundManager, 
//            GuiIngame, RenderGlobal

public class PlayerControllerSP extends PlayerController
{

    private int field_1074_c;
    private int field_1073_d;
    private int field_1072_e;
    private float field_1071_f;
    private float field_1070_g;
    private float field_1069_h;
    private int field_1068_i;

    public PlayerControllerSP(Minecraft p_i70_1_)
    {
        super(p_i70_1_);
        field_1074_c = -1;
        field_1073_d = -1;
        field_1072_e = -1;
        field_1071_f = 0.0F;
        field_1070_g = 0.0F;
        field_1069_h = 0.0F;
        field_1068_i = 0;
    }

    public void func_6476_a(EntityPlayer p_6476_1_)
    {
        p_6476_1_.field_605_aq = -180F;
    }

    public boolean func_6469_d()
    {
        return true;
    }

    public boolean func_729_b(int p_729_1_, int p_729_2_, int p_729_3_, int p_729_4_)
    {
        int i = field_1065_a.field_6324_e.func_600_a(p_729_1_, p_729_2_, p_729_3_);
        int j = field_1065_a.field_6324_e.func_602_e(p_729_1_, p_729_2_, p_729_3_);
        boolean flag = super.func_729_b(p_729_1_, p_729_2_, p_729_3_, p_729_4_);
        ItemStack itemstack = field_1065_a.field_6322_g.func_6416_v();
        boolean flag1 = field_1065_a.field_6322_g.func_454_b(Block.field_345_n[i]);
        if(itemstack != null)
        {
            itemstack.func_25191_a(i, p_729_1_, p_729_2_, p_729_3_, field_1065_a.field_6322_g);
            if(itemstack.field_1615_a == 0)
            {
                itemstack.func_1097_a(field_1065_a.field_6322_g);
                field_1065_a.field_6322_g.func_448_u();
            }
        }
        if(flag && flag1)
        {
            Block.field_345_n[i].func_220_a_(field_1065_a.field_6324_e, field_1065_a.field_6322_g, p_729_1_, p_729_2_, p_729_3_, j);
        }
        return flag;
    }

    public void func_719_a(int p_719_1_, int p_719_2_, int p_719_3_, int p_719_4_)
    {
        if(!field_1065_a.field_6322_g.func_35190_e(p_719_1_, p_719_2_, p_719_3_))
        {
            return;
        }
        field_1065_a.field_6324_e.func_48457_a(field_1065_a.field_6322_g, p_719_1_, p_719_2_, p_719_3_, p_719_4_);
        int i = field_1065_a.field_6324_e.func_600_a(p_719_1_, p_719_2_, p_719_3_);
        if(i > 0 && field_1071_f == 0.0F)
        {
            Block.field_345_n[i].func_233_b(field_1065_a.field_6324_e, p_719_1_, p_719_2_, p_719_3_, field_1065_a.field_6322_g);
        }
        if(i > 0 && Block.field_345_n[i].func_225_a(field_1065_a.field_6322_g) >= 1.0F)
        {
            func_729_b(p_719_1_, p_719_2_, p_719_3_, p_719_4_);
        }
    }

    public void func_6468_a()
    {
        field_1071_f = 0.0F;
        field_1068_i = 0;
    }

    public void func_6470_c(int p_6470_1_, int p_6470_2_, int p_6470_3_, int p_6470_4_)
    {
        if(field_1068_i > 0)
        {
            field_1068_i--;
            return;
        }
        if(p_6470_1_ == field_1074_c && p_6470_2_ == field_1073_d && p_6470_3_ == field_1072_e)
        {
            int i = field_1065_a.field_6324_e.func_600_a(p_6470_1_, p_6470_2_, p_6470_3_);
            if(!field_1065_a.field_6322_g.func_35190_e(p_6470_1_, p_6470_2_, p_6470_3_))
            {
                return;
            }
            if(i == 0)
            {
                return;
            }
            Block block = Block.field_345_n[i];
            field_1071_f += block.func_225_a(field_1065_a.field_6322_g);
            if(field_1069_h % 4F == 0.0F && block != null)
            {
                field_1065_a.field_6301_A.func_336_b(block.field_358_bl.func_1145_d(), (float)p_6470_1_ + 0.5F, (float)p_6470_2_ + 0.5F, (float)p_6470_3_ + 0.5F, (block.field_358_bl.func_1147_b() + 1.0F) / 8F, block.field_358_bl.func_1144_c() * 0.5F);
            }
            field_1069_h++;
            if(field_1071_f >= 1.0F)
            {
                func_729_b(p_6470_1_, p_6470_2_, p_6470_3_, p_6470_4_);
                field_1071_f = 0.0F;
                field_1070_g = 0.0F;
                field_1069_h = 0.0F;
                field_1068_i = 5;
            }
        } else
        {
            field_1071_f = 0.0F;
            field_1070_g = 0.0F;
            field_1069_h = 0.0F;
            field_1074_c = p_6470_1_;
            field_1073_d = p_6470_2_;
            field_1072_e = p_6470_3_;
        }
    }

    public void func_6467_a(float p_6467_1_)
    {
        if(field_1071_f <= 0.0F)
        {
            field_1065_a.field_6308_u.field_6446_b = 0.0F;
            field_1065_a.field_6323_f.field_1450_i = 0.0F;
        } else
        {
            float f = field_1070_g + (field_1071_f - field_1070_g) * p_6467_1_;
            field_1065_a.field_6308_u.field_6446_b = f;
            field_1065_a.field_6323_f.field_1450_i = f;
        }
    }

    public float func_727_b()
    {
        return 4F;
    }

    public void func_717_a(World p_717_1_)
    {
        super.func_717_a(p_717_1_);
    }

    public EntityPlayer func_4087_b(World p_4087_1_)
    {
        EntityPlayer entityplayer = super.func_4087_b(p_4087_1_);
        return entityplayer;
    }

    public void func_6474_c()
    {
        field_1070_g = field_1071_f;
        field_1065_a.field_6301_A.func_4033_c();
    }

    public boolean func_722_a(EntityPlayer p_722_1_, World p_722_2_, ItemStack p_722_3_, int p_722_4_, int p_722_5_, int p_722_6_, int p_722_7_)
    {
        int i = p_722_2_.func_600_a(p_722_4_, p_722_5_, p_722_6_);
        if(i > 0 && Block.field_345_n[i].func_250_a(p_722_2_, p_722_4_, p_722_5_, p_722_6_, p_722_1_))
        {
            return true;
        }
        if(p_722_3_ == null)
        {
            return false;
        } else
        {
            return p_722_3_.func_1090_a(p_722_1_, p_722_2_, p_722_4_, p_722_5_, p_722_6_, p_722_7_);
        }
    }

    public boolean func_35642_f()
    {
        return true;
    }
}
