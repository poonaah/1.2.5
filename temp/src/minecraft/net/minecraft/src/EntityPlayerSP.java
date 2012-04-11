// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            EntityPlayer, MouseFilter, Session, MovementInput, 
//            PlayerController, AchievementList, StatFileWriter, GuiAchievement, 
//            World, SoundManager, Potion, PotionEffect, 
//            AxisAlignedBB, FoodStats, PlayerCapabilities, GuiWinGame, 
//            ItemStack, Item, NBTTagCompound, GuiEditSign, 
//            GuiChest, GuiCrafting, GuiEnchantment, GuiFurnace, 
//            GuiBrewingStand, GuiDispenser, EntityCrit2FX, EffectRenderer, 
//            EntityPickupFX, DamageSource, GuiIngame, StatBase, 
//            Achievement, MathHelper, TileEntitySign, IInventory, 
//            TileEntityFurnace, TileEntityBrewingStand, TileEntityDispenser, Entity

public class EntityPlayerSP extends EntityPlayer
{

    public MovementInput field_787_a;
    protected Minecraft field_788_bg;
    protected int field_35224_c;
    public int field_35221_d;
    public float field_35222_e;
    public float field_35223_ap;
    public float field_35226_aq;
    public float field_35225_ar;
    private MouseFilter field_21903_bJ;
    private MouseFilter field_21904_bK;
    private MouseFilter field_21902_bL;

    public EntityPlayerSP(Minecraft p_i650_1_, World p_i650_2_, Session p_i650_3_, int p_i650_4_)
    {
        super(p_i650_2_);
        field_35224_c = 0;
        field_35221_d = 0;
        field_21903_bJ = new MouseFilter();
        field_21904_bK = new MouseFilter();
        field_21902_bL = new MouseFilter();
        field_788_bg = p_i650_1_;
        field_4129_m = p_i650_4_;
        if(p_i650_3_ != null && p_i650_3_.field_1666_b != null && p_i650_3_.field_1666_b.length() > 0)
        {
            field_20047_bv = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(p_i650_3_.field_1666_b).append(".png").toString();
        }
        field_771_i = p_i650_3_.field_1666_b;
    }

    public void func_349_c(double p_349_1_, double p_349_3_, double p_349_5_)
    {
        super.func_349_c(p_349_1_, p_349_3_, p_349_5_);
    }

    public void func_418_b_()
    {
        super.func_418_b_();
        field_9342_ah = field_787_a.field_1174_a;
        field_9340_ai = field_787_a.field_1173_b;
        field_9336_ak = field_787_a.field_1176_d;
        field_35226_aq = field_35222_e;
        field_35225_ar = field_35223_ap;
        field_35223_ap += (double)(field_604_ar - field_35223_ap) * 0.5D;
        field_35222_e += (double)(field_605_aq - field_35222_e) * 0.5D;
    }

    protected boolean func_44001_ad()
    {
        return true;
    }

    public void func_425_j()
    {
        if(field_35221_d > 0)
        {
            field_35221_d--;
            if(field_35221_d == 0)
            {
                func_35113_c(false);
            }
        }
        if(field_35224_c > 0)
        {
            field_35224_c--;
        }
        if(field_788_bg.field_6327_b.func_35643_e())
        {
            field_611_ak = field_609_am = 0.5D;
            field_611_ak = 0.0D;
            field_609_am = 0.0D;
            field_605_aq = (float)field_9311_be / 12F;
            field_604_ar = 10F;
            field_610_al = 68.5D;
            return;
        }
        if(!field_788_bg.field_25001_G.func_27183_a(AchievementList.field_25195_b))
        {
            field_788_bg.field_25002_t.func_27101_b(AchievementList.field_25195_b);
        }
        field_28025_B = field_28026_A;
        if(field_28023_z)
        {
            if(!field_615_ag.field_1026_y && field_616_af != null)
            {
                func_6377_h(null);
            }
            if(field_788_bg.field_6313_p != null)
            {
                field_788_bg.func_6272_a(null);
            }
            if(field_28026_A == 0.0F)
            {
                field_788_bg.field_6301_A.func_337_a("portal.trigger", 1.0F, field_9312_bd.nextFloat() * 0.4F + 0.8F);
            }
            field_28026_A += 0.0125F;
            if(field_28026_A >= 1.0F)
            {
                field_28026_A = 1.0F;
                if(!field_615_ag.field_1026_y)
                {
                    field_28024_y = 10;
                    field_788_bg.field_6301_A.func_337_a("portal.travel", 1.0F, field_9312_bd.nextFloat() * 0.4F + 0.8F);
                    byte byte0 = 0;
                    if(field_4129_m == -1)
                    {
                        byte0 = 0;
                    } else
                    {
                        byte0 = -1;
                    }
                    field_788_bg.func_6237_k(byte0);
                    func_27026_a(AchievementList.field_40467_x);
                }
            }
            field_28023_z = false;
        } else
        if(func_35160_a(Potion.field_35684_k) && func_35167_b(Potion.field_35684_k).func_35802_b() > 60)
        {
            field_28026_A += 0.006666667F;
            if(field_28026_A > 1.0F)
            {
                field_28026_A = 1.0F;
            }
        } else
        {
            if(field_28026_A > 0.0F)
            {
                field_28026_A -= 0.05F;
            }
            if(field_28026_A < 0.0F)
            {
                field_28026_A = 0.0F;
            }
        }
        if(field_28024_y > 0)
        {
            field_28024_y--;
        }
        boolean flag = field_787_a.field_1176_d;
        float f = 0.8F;
        boolean flag1 = field_787_a.field_1173_b >= f;
        field_787_a.func_52013_a();
        if(func_35196_Z())
        {
            field_787_a.field_1174_a *= 0.2F;
            field_787_a.field_1173_b *= 0.2F;
            field_35224_c = 0;
        }
        if(field_787_a.field_1175_e && field_9287_aY < 0.2F)
        {
            field_9287_aY = 0.2F;
        }
        func_28014_c(field_611_ak - (double)field_644_aC * 0.34999999999999998D, field_601_au.field_1697_b + 0.5D, field_609_am + (double)field_644_aC * 0.34999999999999998D);
        func_28014_c(field_611_ak - (double)field_644_aC * 0.34999999999999998D, field_601_au.field_1697_b + 0.5D, field_609_am - (double)field_644_aC * 0.34999999999999998D);
        func_28014_c(field_611_ak + (double)field_644_aC * 0.34999999999999998D, field_601_au.field_1697_b + 0.5D, field_609_am - (double)field_644_aC * 0.34999999999999998D);
        func_28014_c(field_611_ak + (double)field_644_aC * 0.34999999999999998D, field_601_au.field_1697_b + 0.5D, field_609_am + (double)field_644_aC * 0.34999999999999998D);
        boolean flag2 = (float)func_35191_at().func_35765_a() > 6F;
        if(field_9298_aH && !flag1 && field_787_a.field_1173_b >= f && !func_35117_Q() && flag2 && !func_35196_Z() && !func_35160_a(Potion.field_35693_q))
        {
            if(field_35224_c == 0)
            {
                field_35224_c = 7;
            } else
            {
                func_35113_c(true);
                field_35224_c = 0;
            }
        }
        if(func_381_o())
        {
            field_35224_c = 0;
        }
        if(func_35117_Q() && (field_787_a.field_1173_b < f || field_9297_aI || !flag2))
        {
            func_35113_c(false);
        }
        if(field_35212_aW.field_35758_c && !flag && field_787_a.field_1176_d)
        {
            if(field_35216_aw == 0)
            {
                field_35216_aw = 7;
            } else
            {
                field_35212_aW.field_35757_b = !field_35212_aW.field_35757_b;
                func_50009_aI();
                field_35216_aw = 0;
            }
        }
        if(field_35212_aW.field_35757_b)
        {
            if(field_787_a.field_1175_e)
            {
                field_607_ao -= 0.14999999999999999D;
            }
            if(field_787_a.field_1176_d)
            {
                field_607_ao += 0.14999999999999999D;
            }
        }
        super.func_425_j();
        if(field_9298_aH && field_35212_aW.field_35757_b)
        {
            field_35212_aW.field_35757_b = false;
            func_50009_aI();
        }
    }

    public void func_40182_b(int p_40182_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        if(field_4129_m == 1 && p_40182_1_ == 1)
        {
            func_27026_a(AchievementList.field_40463_C);
            field_788_bg.func_6272_a(new GuiWinGame());
        } else
        {
            func_27026_a(AchievementList.field_40462_B);
            field_788_bg.field_6301_A.func_337_a("portal.travel", 1.0F, field_9312_bd.nextFloat() * 0.4F + 0.8F);
            field_788_bg.func_6237_k(1);
        }
    }

    public float func_35220_u_()
    {
        float f = 1.0F;
        if(field_35212_aW.field_35757_b)
        {
            f *= 1.1F;
        }
        f *= ((field_35169_bv * func_35166_t_()) / field_35215_ba + 1.0F) / 2.0F;
        if(func_35196_Z() && func_35195_X().field_1617_c == Item.field_227_i.field_291_aS)
        {
            int i = func_35192_aa();
            float f1 = (float)i / 20F;
            if(f1 > 1.0F)
            {
                f1 = 1.0F;
            } else
            {
                f1 *= f1;
            }
            f *= 1.0F - f1 * 0.15F;
        }
        return f;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("Score", field_9370_g);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        field_9370_g = p_357_1_.func_756_e("Score");
    }

    public void func_20059_m()
    {
        super.func_20059_m();
        field_788_bg.func_6272_a(null);
    }

    public void func_4052_a(TileEntitySign p_4052_1_)
    {
        field_788_bg.func_6272_a(new GuiEditSign(p_4052_1_));
    }

    public void func_452_a(IInventory p_452_1_)
    {
        field_788_bg.func_6272_a(new GuiChest(field_778_b, p_452_1_));
    }

    public void func_445_l(int p_445_1_, int p_445_2_, int p_445_3_)
    {
        field_788_bg.func_6272_a(new GuiCrafting(field_778_b, field_615_ag, p_445_1_, p_445_2_, p_445_3_));
    }

    public void func_40181_c(int p_40181_1_, int p_40181_2_, int p_40181_3_)
    {
        field_788_bg.func_6272_a(new GuiEnchantment(field_778_b, field_615_ag, p_40181_1_, p_40181_2_, p_40181_3_));
    }

    public void func_453_a(TileEntityFurnace p_453_1_)
    {
        field_788_bg.func_6272_a(new GuiFurnace(field_778_b, p_453_1_));
    }

    public void func_40180_a(TileEntityBrewingStand p_40180_1_)
    {
        field_788_bg.func_6272_a(new GuiBrewingStand(field_778_b, p_40180_1_));
    }

    public void func_21092_a(TileEntityDispenser p_21092_1_)
    {
        field_788_bg.func_6272_a(new GuiDispenser(field_778_b, p_21092_1_));
    }

    public void func_35200_b(Entity p_35200_1_)
    {
        field_788_bg.field_6321_h.func_1192_a(new EntityCrit2FX(field_788_bg.field_6324_e, p_35200_1_));
    }

    public void func_40183_c(Entity p_40183_1_)
    {
        EntityCrit2FX entitycrit2fx = new EntityCrit2FX(field_788_bg.field_6324_e, p_40183_1_, "magicCrit");
        field_788_bg.field_6321_h.func_1192_a(entitycrit2fx);
    }

    public void func_443_a_(Entity p_443_1_, int p_443_2_)
    {
        field_788_bg.field_6321_h.func_1192_a(new EntityPickupFX(field_788_bg.field_6324_e, p_443_1_, this, -0.5F));
    }

    public void func_461_a(String s)
    {
    }

    public boolean func_381_o()
    {
        return field_787_a.field_1175_e && !field_21901_a;
    }

    public void func_9372_a_(int p_9372_1_)
    {
        int i = func_40114_aH() - p_9372_1_;
        if(i <= 0)
        {
            func_40121_k(p_9372_1_);
            if(i < 0)
            {
                field_9306_bj = field_9366_o / 2;
            }
        } else
        {
            field_9346_af = i;
            func_40121_k(func_40114_aH());
            field_9306_bj = field_9366_o;
            func_4044_a(DamageSource.field_35547_j, i);
            field_715_G = field_9332_M = 10;
        }
    }

    public void func_9367_r()
    {
        field_788_bg.func_6239_p(false, 0, false);
    }

    public void func_6420_o()
    {
    }

    public void func_22055_b(String p_22055_1_)
    {
        field_788_bg.field_6308_u.func_22064_c(p_22055_1_);
    }

    public void func_25058_a(StatBase p_25058_1_, int p_25058_2_)
    {
        if(p_25058_1_ == null)
        {
            return;
        }
        if(p_25058_1_.func_25067_a())
        {
            Achievement achievement = (Achievement)p_25058_1_;
            if(achievement.field_25076_c == null || field_788_bg.field_25001_G.func_27183_a(achievement.field_25076_c))
            {
                if(!field_788_bg.field_25001_G.func_27183_a(achievement))
                {
                    field_788_bg.field_25002_t.func_27102_a(achievement);
                }
                field_788_bg.field_25001_G.func_25100_a(p_25058_1_, p_25058_2_);
            }
        } else
        {
            field_788_bg.field_25001_G.func_25100_a(p_25058_1_, p_25058_2_);
        }
    }

    private boolean func_28027_d(int p_28027_1_, int p_28027_2_, int p_28027_3_)
    {
        return field_615_ag.func_28100_h(p_28027_1_, p_28027_2_, p_28027_3_);
    }

    protected boolean func_28014_c(double p_28014_1_, double p_28014_3_, double p_28014_5_)
    {
        int i = MathHelper.func_1108_b(p_28014_1_);
        int j = MathHelper.func_1108_b(p_28014_3_);
        int k = MathHelper.func_1108_b(p_28014_5_);
        double d = p_28014_1_ - (double)i;
        double d1 = p_28014_5_ - (double)k;
        if(func_28027_d(i, j, k) || func_28027_d(i, j + 1, k))
        {
            boolean flag = !func_28027_d(i - 1, j, k) && !func_28027_d(i - 1, j + 1, k);
            boolean flag1 = !func_28027_d(i + 1, j, k) && !func_28027_d(i + 1, j + 1, k);
            boolean flag2 = !func_28027_d(i, j, k - 1) && !func_28027_d(i, j + 1, k - 1);
            boolean flag3 = !func_28027_d(i, j, k + 1) && !func_28027_d(i, j + 1, k + 1);
            byte byte0 = -1;
            double d2 = 9999D;
            if(flag && d < d2)
            {
                d2 = d;
                byte0 = 0;
            }
            if(flag1 && 1.0D - d < d2)
            {
                d2 = 1.0D - d;
                byte0 = 1;
            }
            if(flag2 && d1 < d2)
            {
                d2 = d1;
                byte0 = 4;
            }
            if(flag3 && 1.0D - d1 < d2)
            {
                double d3 = 1.0D - d1;
                byte0 = 5;
            }
            float f = 0.1F;
            if(byte0 == 0)
            {
                field_608_an = -f;
            }
            if(byte0 == 1)
            {
                field_608_an = f;
            }
            if(byte0 == 4)
            {
                field_606_ap = -f;
            }
            if(byte0 == 5)
            {
                field_606_ap = f;
            }
        }
        return false;
    }

    public void func_35113_c(boolean p_35113_1_)
    {
        super.func_35113_c(p_35113_1_);
        field_35221_d = p_35113_1_ ? 600 : 0;
    }

    public void func_35219_c(float p_35219_1_, int p_35219_2_, int p_35219_3_)
    {
        field_35211_aX = p_35219_1_;
        field_35209_aZ = p_35219_2_;
        field_35210_aY = p_35219_3_;
    }
}
