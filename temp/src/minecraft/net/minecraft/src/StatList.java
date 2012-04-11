// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            CraftingManager, IRecipe, ItemStack, FurnaceRecipes, 
//            StatBase, Item, StatCollector, StatCrafting, 
//            Block, BlockFlower, BlockGrass, StatBasic, 
//            AchievementList

public class StatList
{

    protected static Map field_25169_C = new HashMap();
    public static List field_25188_a = new ArrayList();
    public static List field_25187_b = new ArrayList();
    public static List field_25186_c = new ArrayList();
    public static List field_25185_d = new ArrayList();
    public static StatBase field_25184_e = (new StatBasic(1000, "stat.startGame")).func_27082_h().func_25068_c();
    public static StatBase field_25183_f = (new StatBasic(1001, "stat.createWorld")).func_27082_h().func_25068_c();
    public static StatBase field_25182_g = (new StatBasic(1002, "stat.loadWorld")).func_27082_h().func_25068_c();
    public static StatBase field_25181_h = (new StatBasic(1003, "stat.joinMultiplayer")).func_27082_h().func_25068_c();
    public static StatBase field_25180_i = (new StatBasic(1004, "stat.leaveGame")).func_27082_h().func_25068_c();
    public static StatBase field_25179_j;
    public static StatBase field_25178_k;
    public static StatBase field_25177_l;
    public static StatBase field_25176_m;
    public static StatBase field_25175_n;
    public static StatBase field_25174_o;
    public static StatBase field_25173_p;
    public static StatBase field_27364_r;
    public static StatBase field_27363_s;
    public static StatBase field_27362_t;
    public static StatBase field_25171_q = (new StatBasic(2010, "stat.jump")).func_27082_h().func_25068_c();
    public static StatBase field_25168_r = (new StatBasic(2011, "stat.drop")).func_27082_h().func_25068_c();
    public static StatBase field_25167_s = (new StatBasic(2020, "stat.damageDealt")).func_25068_c();
    public static StatBase field_25165_t = (new StatBasic(2021, "stat.damageTaken")).func_25068_c();
    public static StatBase field_25163_u = (new StatBasic(2022, "stat.deaths")).func_25068_c();
    public static StatBase field_25162_v = (new StatBasic(2023, "stat.mobKills")).func_25068_c();
    public static StatBase field_25161_w = (new StatBasic(2024, "stat.playerKills")).func_25068_c();
    public static StatBase field_25160_x = (new StatBasic(2025, "stat.fishCaught")).func_25068_c();
    public static StatBase field_25159_y[] = func_25153_a("stat.mineBlock", 0x1000000);
    public static StatBase field_25158_z[];
    public static StatBase field_25172_A[];
    public static StatBase field_25170_B[];
    private static boolean field_25166_D = false;
    private static boolean field_25164_E = false;

    public StatList()
    {
    }

    public static void func_27360_a()
    {
    }

    public static void func_25154_a()
    {
        field_25172_A = func_25155_a(field_25172_A, "stat.useItem", 0x1020000, 0, 256);
        field_25170_B = func_25149_b(field_25170_B, "stat.breakItem", 0x1030000, 0, 256);
        field_25166_D = true;
        func_25157_c();
    }

    public static void func_25151_b()
    {
        field_25172_A = func_25155_a(field_25172_A, "stat.useItem", 0x1020000, 256, 32000);
        field_25170_B = func_25149_b(field_25170_B, "stat.breakItem", 0x1030000, 256, 32000);
        field_25164_E = true;
        func_25157_c();
    }

    public static void func_25157_c()
    {
        if(!field_25166_D || !field_25164_E)
        {
            return;
        }
        HashSet hashset = new HashSet();
        IRecipe irecipe;
        for(Iterator iterator = CraftingManager.func_1120_a().func_25193_b().iterator(); iterator.hasNext(); hashset.add(Integer.valueOf(irecipe.func_25117_b().field_1617_c)))
        {
            irecipe = (IRecipe)iterator.next();
        }

        ItemStack itemstack;
        for(Iterator iterator1 = FurnaceRecipes.func_21200_a().func_25194_b().values().iterator(); iterator1.hasNext(); hashset.add(Integer.valueOf(itemstack.field_1617_c)))
        {
            itemstack = (ItemStack)iterator1.next();
        }

        field_25158_z = new StatBase[32000];
        Iterator iterator2 = hashset.iterator();
        do
        {
            if(!iterator2.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator2.next();
            if(Item.field_233_c[integer.intValue()] != null)
            {
                String s = StatCollector.func_25199_a("stat.craftItem", new Object[] {
                    Item.field_233_c[integer.intValue()].func_25009_k()
                });
                field_25158_z[integer.intValue()] = (new StatCrafting(0x1010000 + integer.intValue(), s, integer.intValue())).func_25068_c();
            }
        } while(true);
        func_25150_a(field_25158_z);
    }

    private static StatBase[] func_25153_a(String p_25153_0_, int p_25153_1_)
    {
        StatBase astatbase[] = new StatBase[256];
        for(int i = 0; i < 256; i++)
        {
            if(Block.field_345_n[i] != null && Block.field_345_n[i].func_27033_k())
            {
                String s = StatCollector.func_25199_a(p_25153_0_, new Object[] {
                    Block.field_345_n[i].func_25016_i()
                });
                astatbase[i] = (new StatCrafting(p_25153_1_ + i, s, i)).func_25068_c();
                field_25185_d.add((StatCrafting)astatbase[i]);
            }
        }

        func_25150_a(astatbase);
        return astatbase;
    }

    private static StatBase[] func_25155_a(StatBase p_25155_0_[], String p_25155_1_, int p_25155_2_, int p_25155_3_, int p_25155_4_)
    {
        if(p_25155_0_ == null)
        {
            p_25155_0_ = new StatBase[32000];
        }
        for(int i = p_25155_3_; i < p_25155_4_; i++)
        {
            if(Item.field_233_c[i] == null)
            {
                continue;
            }
            String s = StatCollector.func_25199_a(p_25155_1_, new Object[] {
                Item.field_233_c[i].func_25009_k()
            });
            p_25155_0_[i] = (new StatCrafting(p_25155_2_ + i, s, i)).func_25068_c();
            if(i >= 256)
            {
                field_25186_c.add((StatCrafting)p_25155_0_[i]);
            }
        }

        func_25150_a(p_25155_0_);
        return p_25155_0_;
    }

    private static StatBase[] func_25149_b(StatBase p_25149_0_[], String p_25149_1_, int p_25149_2_, int p_25149_3_, int p_25149_4_)
    {
        if(p_25149_0_ == null)
        {
            p_25149_0_ = new StatBase[32000];
        }
        for(int i = p_25149_3_; i < p_25149_4_; i++)
        {
            if(Item.field_233_c[i] != null && Item.field_233_c[i].func_25007_g())
            {
                String s = StatCollector.func_25199_a(p_25149_1_, new Object[] {
                    Item.field_233_c[i].func_25009_k()
                });
                p_25149_0_[i] = (new StatCrafting(p_25149_2_ + i, s, i)).func_25068_c();
            }
        }

        func_25150_a(p_25149_0_);
        return p_25149_0_;
    }

    private static void func_25150_a(StatBase p_25150_0_[])
    {
        func_25156_a(p_25150_0_, Block.field_399_C.field_376_bc, Block.field_401_B.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_395_E.field_376_bc, Block.field_395_E.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_4045_bg.field_376_bc, Block.field_4055_bb.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_444_aD.field_376_bc, Block.field_445_aC.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_432_aP.field_376_bc, Block.field_433_aO.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_22020_bi.field_376_bc, Block.field_22021_bh.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_430_aR.field_376_bc, Block.field_431_aQ.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_414_ah.field_376_bc, Block.field_415_ag.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_411_ak.field_376_bc, Block.field_410_al.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_337_v.field_376_bc, Block.field_336_w.field_376_bc);
        func_25156_a(p_25150_0_, Block.field_446_aB.field_376_bc, Block.field_336_w.field_376_bc);
    }

    private static void func_25156_a(StatBase p_25156_0_[], int p_25156_1_, int p_25156_2_)
    {
        if(p_25156_0_[p_25156_1_] != null && p_25156_0_[p_25156_2_] == null)
        {
            p_25156_0_[p_25156_2_] = p_25156_0_[p_25156_1_];
            return;
        } else
        {
            field_25188_a.remove(p_25156_0_[p_25156_1_]);
            field_25185_d.remove(p_25156_0_[p_25156_1_]);
            field_25187_b.remove(p_25156_0_[p_25156_1_]);
            p_25156_0_[p_25156_1_] = p_25156_0_[p_25156_2_];
            return;
        }
    }

    public static StatBase func_27361_a(int p_27361_0_)
    {
        return (StatBase)field_25169_C.get(Integer.valueOf(p_27361_0_));
    }

    static 
    {
        field_25179_j = (new StatBasic(1100, "stat.playOneMinute", StatBase.field_27086_j)).func_27082_h().func_25068_c();
        field_25178_k = (new StatBasic(2000, "stat.walkOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_25177_l = (new StatBasic(2001, "stat.swimOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_25176_m = (new StatBasic(2002, "stat.fallOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_25175_n = (new StatBasic(2003, "stat.climbOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_25174_o = (new StatBasic(2004, "stat.flyOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_25173_p = (new StatBasic(2005, "stat.diveOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_27364_r = (new StatBasic(2006, "stat.minecartOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_27363_s = (new StatBasic(2007, "stat.boatOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        field_27362_t = (new StatBasic(2008, "stat.pigOneCm", StatBase.field_27085_k)).func_27082_h().func_25068_c();
        AchievementList.func_27374_a();
    }
}
