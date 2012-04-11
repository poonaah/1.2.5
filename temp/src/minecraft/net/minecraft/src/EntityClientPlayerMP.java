// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            EntityPlayerSP, MathHelper, World, Packet19EntityAction, 
//            NetClientHandler, AxisAlignedBB, Packet11PlayerPosition, Packet13PlayerLookMove, 
//            Packet12PlayerLook, Packet10Flying, Packet14BlockDig, GuiIngame, 
//            Packet3Chat, Packet18Animation, Packet9Respawn, WorldInfo, 
//            Packet101CloseWindow, Container, InventoryPlayer, StatBase, 
//            Packet202PlayerAbilities, Session, DamageSource, EntityItem

public class EntityClientPlayerMP extends EntityPlayerSP
{

    public NetClientHandler field_797_bg;
    private int field_9380_bx;
    private double field_9379_by;
    private double field_9378_bz;
    private double field_9377_bA;
    private double field_9376_bB;
    private float field_9385_bC;
    private float field_9384_bD;
    private boolean field_9382_bF;
    private boolean field_35227_cs;
    private boolean field_9381_bG;
    private int field_12242_bI;
    private boolean field_21093_bH;

    public EntityClientPlayerMP(Minecraft p_i132_1_, World p_i132_2_, Session p_i132_3_, NetClientHandler p_i132_4_)
    {
        super(p_i132_1_, p_i132_2_, p_i132_3_, 0);
        field_9380_bx = 0;
        field_9382_bF = false;
        field_35227_cs = false;
        field_9381_bG = false;
        field_12242_bI = 0;
        field_21093_bH = false;
        field_797_bg = p_i132_4_;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        return false;
    }

    public void func_432_b(int i)
    {
    }

    public void func_370_e_()
    {
        if(!field_615_ag.func_630_d(MathHelper.func_1108_b(field_611_ak), 0, MathHelper.func_1108_b(field_609_am)))
        {
            return;
        } else
        {
            super.func_370_e_();
            func_4056_N();
            return;
        }
    }

    public void func_4056_N()
    {
        if(field_9380_bx++ == 20)
        {
            field_9380_bx = 0;
        }
        boolean flag = func_35117_Q();
        if(flag != field_9381_bG)
        {
            if(flag)
            {
                field_797_bg.func_847_a(new Packet19EntityAction(this, 4));
            } else
            {
                field_797_bg.func_847_a(new Packet19EntityAction(this, 5));
            }
            field_9381_bG = flag;
        }
        boolean flag1 = func_381_o();
        if(flag1 != field_35227_cs)
        {
            if(flag1)
            {
                field_797_bg.func_847_a(new Packet19EntityAction(this, 1));
            } else
            {
                field_797_bg.func_847_a(new Packet19EntityAction(this, 2));
            }
            field_35227_cs = flag1;
        }
        double d = field_611_ak - field_9379_by;
        double d1 = field_601_au.field_1697_b - field_9378_bz;
        double d2 = field_610_al - field_9377_bA;
        double d3 = field_609_am - field_9376_bB;
        double d4 = field_605_aq - field_9385_bC;
        double d5 = field_604_ar - field_9384_bD;
        boolean flag2 = d1 != 0.0D || d2 != 0.0D || d != 0.0D || d3 != 0.0D;
        boolean flag3 = d4 != 0.0D || d5 != 0.0D;
        if(field_616_af != null)
        {
            if(flag3)
            {
                field_797_bg.func_847_a(new Packet11PlayerPosition(field_608_an, -999D, -999D, field_606_ap, field_9298_aH));
            } else
            {
                field_797_bg.func_847_a(new Packet13PlayerLookMove(field_608_an, -999D, -999D, field_606_ap, field_605_aq, field_604_ar, field_9298_aH));
            }
            flag2 = false;
        } else
        if(flag2 && flag3)
        {
            field_797_bg.func_847_a(new Packet13PlayerLookMove(field_611_ak, field_601_au.field_1697_b, field_610_al, field_609_am, field_605_aq, field_604_ar, field_9298_aH));
            field_12242_bI = 0;
        } else
        if(flag2)
        {
            field_797_bg.func_847_a(new Packet11PlayerPosition(field_611_ak, field_601_au.field_1697_b, field_610_al, field_609_am, field_9298_aH));
            field_12242_bI = 0;
        } else
        if(flag3)
        {
            field_797_bg.func_847_a(new Packet12PlayerLook(field_605_aq, field_604_ar, field_9298_aH));
            field_12242_bI = 0;
        } else
        {
            field_797_bg.func_847_a(new Packet10Flying(field_9298_aH));
            if(field_9382_bF != field_9298_aH || field_12242_bI > 200)
            {
                field_12242_bI = 0;
            } else
            {
                field_12242_bI++;
            }
        }
        field_9382_bF = field_9298_aH;
        if(flag2)
        {
            field_9379_by = field_611_ak;
            field_9378_bz = field_601_au.field_1697_b;
            field_9377_bA = field_610_al;
            field_9376_bB = field_609_am;
        }
        if(flag3)
        {
            field_9385_bC = field_605_aq;
            field_9384_bD = field_604_ar;
        }
    }

    public EntityItem func_48152_as()
    {
        field_797_bg.func_847_a(new Packet14BlockDig(4, 0, 0, 0, 0));
        return null;
    }

    protected void func_446_a(EntityItem entityitem)
    {
    }

    public void func_461_a(String p_461_1_)
    {
        if(field_788_bg.field_6308_u.func_50013_c().size() == 0 || !((String)field_788_bg.field_6308_u.func_50013_c().get(field_788_bg.field_6308_u.func_50013_c().size() - 1)).equals(p_461_1_))
        {
            field_788_bg.field_6308_u.func_50013_c().add(p_461_1_);
        }
        field_797_bg.func_847_a(new Packet3Chat(p_461_1_));
    }

    public void func_457_w()
    {
        super.func_457_w();
        field_797_bg.func_847_a(new Packet18Animation(this, 1));
    }

    public void func_9367_r()
    {
        field_797_bg.func_847_a(new Packet9Respawn(field_4129_m, (byte)field_615_ag.field_1039_l, field_615_ag.func_22144_v().func_46133_t(), field_615_ag.func_48453_b(), 0));
    }

    protected void func_4044_a(DamageSource p_4044_1_, int p_4044_2_)
    {
        func_40121_k(func_40114_aH() - p_4044_2_);
    }

    public void func_20059_m()
    {
        field_797_bg.func_847_a(new Packet101CloseWindow(field_20068_h.field_1618_c));
        field_778_b.func_20076_b(null);
        super.func_20059_m();
    }

    public void func_9372_a_(int p_9372_1_)
    {
        if(field_21093_bH)
        {
            super.func_9372_a_(p_9372_1_);
        } else
        {
            func_40121_k(p_9372_1_);
            field_21093_bH = true;
        }
    }

    public void func_25058_a(StatBase p_25058_1_, int p_25058_2_)
    {
        if(p_25058_1_ == null)
        {
            return;
        }
        if(p_25058_1_.field_27088_g)
        {
            super.func_25058_a(p_25058_1_, p_25058_2_);
        }
    }

    public void func_27027_b(StatBase p_27027_1_, int p_27027_2_)
    {
        if(p_27027_1_ == null)
        {
            return;
        }
        if(!p_27027_1_.field_27088_g)
        {
            super.func_25058_a(p_27027_1_, p_27027_2_);
        }
    }

    public void func_50009_aI()
    {
        field_797_bg.func_847_a(new Packet202PlayerAbilities(field_35212_aW));
    }
}
