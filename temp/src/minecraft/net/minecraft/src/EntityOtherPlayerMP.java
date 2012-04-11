// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityPlayer, MathHelper, InventoryPlayer, Item, 
//            ItemStack, World, DamageSource

public class EntityOtherPlayerMP extends EntityPlayer
{

    private boolean field_35218_b;
    private int field_785_bg;
    private double field_784_bh;
    private double field_783_bi;
    private double field_782_bj;
    private double field_780_bk;
    private double field_786_bl;

    public EntityOtherPlayerMP(World p_i580_1_, String p_i580_2_)
    {
        super(p_i580_1_);
        field_35218_b = false;
        field_771_i = p_i580_2_;
        field_9292_aO = 0.0F;
        field_9286_aZ = 0.0F;
        if(p_i580_2_ != null && p_i580_2_.length() > 0)
        {
            field_20047_bv = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(p_i580_2_).append(".png").toString();
        }
        field_9314_ba = true;
        field_22062_y = 0.25F;
        field_619_ac = 10D;
    }

    protected void func_22058_C()
    {
        field_9292_aO = 0.0F;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        return true;
    }

    public void func_378_a(double p_378_1_, double p_378_3_, double p_378_5_, float p_378_7_, 
            float p_378_8_, int p_378_9_)
    {
        field_784_bh = p_378_1_;
        field_783_bi = p_378_3_;
        field_782_bj = p_378_5_;
        field_780_bk = p_378_7_;
        field_786_bl = p_378_8_;
        field_785_bg = p_378_9_;
    }

    public void func_370_e_()
    {
        field_22062_y = 0.0F;
        super.func_370_e_();
        field_705_Q = field_704_R;
        double d = field_611_ak - field_9285_at;
        double d1 = field_609_am - field_9283_av;
        float f = MathHelper.func_1109_a(d * d + d1 * d1) * 4F;
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        field_704_R += (f - field_704_R) * 0.4F;
        field_703_S += field_704_R;
        if(!field_35218_b && func_35114_R() && field_778_b.field_843_a[field_778_b.field_847_d] != null)
        {
            ItemStack itemstack = field_778_b.field_843_a[field_778_b.field_847_d];
            func_35199_b(field_778_b.field_843_a[field_778_b.field_847_d], Item.field_233_c[itemstack.field_1617_c].func_35411_c(itemstack));
            field_35218_b = true;
        } else
        if(field_35218_b && !func_35114_R())
        {
            func_35207_ac();
            field_35218_b = false;
        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_425_j()
    {
        super.func_418_b_();
        if(field_785_bg > 0)
        {
            double d = field_611_ak + (field_784_bh - field_611_ak) / (double)field_785_bg;
            double d1 = field_610_al + (field_783_bi - field_610_al) / (double)field_785_bg;
            double d2 = field_609_am + (field_782_bj - field_609_am) / (double)field_785_bg;
            double d3;
            for(d3 = field_780_bk - (double)field_605_aq; d3 < -180D; d3 += 360D) { }
            for(; d3 >= 180D; d3 -= 360D) { }
            field_605_aq += d3 / (double)field_785_bg;
            field_604_ar += (field_786_bl - (double)field_604_ar) / (double)field_785_bg;
            field_785_bg--;
            func_347_a(d, d1, d2);
            func_376_c(field_605_aq, field_604_ar);
        }
        field_775_e = field_774_f;
        float f = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
        float f1 = (float)Math.atan(-field_607_ao * 0.20000000298023224D) * 15F;
        if(f > 0.1F)
        {
            f = 0.1F;
        }
        if(!field_9298_aH || func_40114_aH() <= 0)
        {
            f = 0.0F;
        }
        if(field_9298_aH || func_40114_aH() <= 0)
        {
            f1 = 0.0F;
        }
        field_774_f += (f - field_774_f) * 0.4F;
        field_9328_R += (f1 - field_9328_R) * 0.8F;
    }

    public void func_20045_c(int p_20045_1_, int p_20045_2_, int p_20045_3_)
    {
        ItemStack itemstack = null;
        if(p_20045_2_ >= 0)
        {
            itemstack = new ItemStack(p_20045_2_, 1, p_20045_3_);
        }
        if(p_20045_1_ == 0)
        {
            field_778_b.field_843_a[field_778_b.field_847_d] = itemstack;
        } else
        {
            field_778_b.field_842_b[p_20045_1_ - 1] = itemstack;
        }
    }

    public void func_6420_o()
    {
    }

    public float func_373_s()
    {
        return 1.82F;
    }
}
