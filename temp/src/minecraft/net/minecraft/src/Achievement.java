// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            StatBase, ItemStack, AchievementList, StatCollector, 
//            IStatStringFormat, Item, Block

public class Achievement extends StatBase
{

    public final int field_25075_a;
    public final int field_25074_b;
    public final Achievement field_25076_c;
    private final String field_27096_l;
    private IStatStringFormat field_27095_m;
    public final ItemStack field_27097_d;
    private boolean field_27098_n;

    public Achievement(int p_i55_1_, String p_i55_2_, int p_i55_3_, int p_i55_4_, Item p_i55_5_, Achievement p_i55_6_)
    {
        this(p_i55_1_, p_i55_2_, p_i55_3_, p_i55_4_, new ItemStack(p_i55_5_), p_i55_6_);
    }

    public Achievement(int p_i56_1_, String p_i56_2_, int p_i56_3_, int p_i56_4_, Block p_i56_5_, Achievement p_i56_6_)
    {
        this(p_i56_1_, p_i56_2_, p_i56_3_, p_i56_4_, new ItemStack(p_i56_5_), p_i56_6_);
    }

    public Achievement(int p_i57_1_, String p_i57_2_, int p_i57_3_, int p_i57_4_, ItemStack p_i57_5_, Achievement p_i57_6_)
    {
        super(0x500000 + p_i57_1_, (new StringBuilder()).append("achievement.").append(p_i57_2_).toString());
        field_27097_d = p_i57_5_;
        field_27096_l = (new StringBuilder()).append("achievement.").append(p_i57_2_).append(".desc").toString();
        field_25075_a = p_i57_3_;
        field_25074_b = p_i57_4_;
        if(p_i57_3_ < AchievementList.field_27392_a)
        {
            AchievementList.field_27392_a = p_i57_3_;
        }
        if(p_i57_4_ < AchievementList.field_27391_b)
        {
            AchievementList.field_27391_b = p_i57_4_;
        }
        if(p_i57_3_ > AchievementList.field_27390_c)
        {
            AchievementList.field_27390_c = p_i57_3_;
        }
        if(p_i57_4_ > AchievementList.field_27389_d)
        {
            AchievementList.field_27389_d = p_i57_4_;
        }
        field_25076_c = p_i57_6_;
    }

    public Achievement func_27089_a()
    {
        field_27088_g = true;
        return this;
    }

    public Achievement func_27094_b()
    {
        field_27098_n = true;
        return this;
    }

    public Achievement func_27091_c()
    {
        super.func_25068_c();
        AchievementList.field_27388_e.add(this);
        return this;
    }

    public boolean func_25067_a()
    {
        return true;
    }

    public String func_27090_e()
    {
        if(field_27095_m != null)
        {
            return field_27095_m.func_27343_a(StatCollector.func_25200_a(field_27096_l));
        } else
        {
            return StatCollector.func_25200_a(field_27096_l);
        }
    }

    public Achievement func_27092_a(IStatStringFormat p_27092_1_)
    {
        field_27095_m = p_27092_1_;
        return this;
    }

    public boolean func_27093_f()
    {
        return field_27098_n;
    }

    public StatBase func_25068_c()
    {
        return func_27091_c();
    }

    public StatBase func_27082_h()
    {
        return func_27089_a();
    }
}
