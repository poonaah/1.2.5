// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RecipesTools, RecipesWeapons, RecipesIngots, RecipesFood, 
//            RecipesCrafting, RecipesArmor, RecipesDyes, ItemStack, 
//            Item, Block, RecipeSorter, ShapedRecipes, 
//            ShapelessRecipes, InventoryCrafting, IRecipe

public class CraftingManager
{

    private static final CraftingManager field_6541_a = new CraftingManager();
    private List field_1662_b;

    public static final CraftingManager func_1120_a()
    {
        return field_6541_a;
    }

    private CraftingManager()
    {
        field_1662_b = new ArrayList();
        (new RecipesTools()).func_1122_a(this);
        (new RecipesWeapons()).func_766_a(this);
        (new RecipesIngots()).func_810_a(this);
        (new RecipesFood()).func_976_a(this);
        (new RecipesCrafting()).func_1051_a(this);
        (new RecipesArmor()).func_1148_a(this);
        (new RecipesDyes()).func_21157_a(this);
        func_1121_a(new ItemStack(Item.field_4029_aI, 3), new Object[] {
            "###", Character.valueOf('#'), Item.field_302_aH
        });
        func_1121_a(new ItemStack(Item.field_4028_aJ, 1), new Object[] {
            "#", "#", "#", Character.valueOf('#'), Item.field_4029_aI
        });
        func_1121_a(new ItemStack(Block.field_4057_ba, 2), new Object[] {
            "###", "###", Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Block.field_40207_bC, 6), new Object[] {
            "###", "###", Character.valueOf('#'), Block.field_40206_bB
        });
        func_1121_a(new ItemStack(Block.field_35277_bw, 1), new Object[] {
            "#W#", "#W#", Character.valueOf('#'), Item.field_266_B, Character.valueOf('W'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_422_aZ, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.field_334_y, Character.valueOf('X'), Item.field_224_l
        });
        func_1121_a(new ItemStack(Block.field_9263_R, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.field_334_y, Character.valueOf('X'), Item.field_309_aA
        });
        func_1121_a(new ItemStack(Block.field_407_ao, 1), new Object[] {
            "###", "XXX", "###", Character.valueOf('#'), Block.field_334_y, Character.valueOf('X'), Item.field_4028_aJ
        });
        func_1121_a(new ItemStack(Block.field_426_aV, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_308_aB
        });
        func_1121_a(new ItemStack(Block.field_424_aX, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_303_aG
        });
        func_1121_a(new ItemStack(Block.field_409_am, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_4030_aF
        });
        func_1121_a(new ItemStack(Block.field_4049_be, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_4022_aR
        });
        func_1121_a(new ItemStack(Block.field_419_ac, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.field_253_I
        });
        func_1121_a(new ItemStack(Block.field_408_an, 1), new Object[] {
            "X#X", "#X#", "X#X", Character.valueOf('X'), Item.field_250_K, Character.valueOf('#'), Block.field_393_F
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 3), new Object[] {
            "###", Character.valueOf('#'), Block.field_335_x
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 0), new Object[] {
            "###", Character.valueOf('#'), Block.field_338_u
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 1), new Object[] {
            "###", Character.valueOf('#'), Block.field_9264_Q
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 2), new Object[] {
            "###", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 4), new Object[] {
            "###", Character.valueOf('#'), Block.field_409_am
        });
        func_1121_a(new ItemStack(Block.field_410_al, 6, 5), new Object[] {
            "###", Character.valueOf('#'), Block.field_35285_bn
        });
        func_1121_a(new ItemStack(Block.field_441_aG, 3), new Object[] {
            "# #", "###", "# #", Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Item.field_265_at, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_28033_bl, 2), new Object[] {
            "###", "###", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Item.field_252_az, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Item.field_223_m
        });
        func_1121_a(new ItemStack(Item.field_267_as, 1), new Object[] {
            "###", "###", " X ", Character.valueOf('#'), Block.field_334_y, Character.valueOf('X'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Item.field_21022_aX, 1), new Object[] {
            "AAA", "BEB", "CCC", Character.valueOf('A'), Item.field_305_aE, Character.valueOf('B'), Item.field_21019_aW, Character.valueOf('C'), Item.field_243_R, Character.valueOf('E'), 
            Item.field_296_aN
        });
        func_1121_a(new ItemStack(Item.field_21019_aW, 1), new Object[] {
            "#", Character.valueOf('#'), Item.field_302_aH
        });
        func_1121_a(new ItemStack(Block.field_334_y, 4, 0), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_385_K, 1, 0)
        });
        func_1121_a(new ItemStack(Block.field_334_y, 4, 1), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_385_K, 1, 1)
        });
        func_1121_a(new ItemStack(Block.field_334_y, 4, 2), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_385_K, 1, 2)
        });
        func_1121_a(new ItemStack(Block.field_334_y, 4, 3), new Object[] {
            "#", Character.valueOf('#'), new ItemStack(Block.field_385_K, 1, 3)
        });
        func_1121_a(new ItemStack(Item.field_266_B, 4), new Object[] {
            "#", "#", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_404_ar, 4), new Object[] {
            "X", "#", Character.valueOf('X'), Item.field_225_k, Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Block.field_404_ar, 4), new Object[] {
            "X", "#", Character.valueOf('X'), new ItemStack(Item.field_225_k, 1, 1), Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Item.field_264_C, 4), new Object[] {
            "# #", " # ", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Item.field_40416_bt, 3), new Object[] {
            "# #", " # ", Character.valueOf('#'), Block.field_382_N
        });
        func_1121_a(new ItemStack(Block.field_440_aH, 16), new Object[] {
            "X X", "X#X", "X X", Character.valueOf('X'), Item.field_223_m, Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Block.field_9261_T, 6), new Object[] {
            "X X", "X#X", "XRX", Character.valueOf('X'), Item.field_222_n, Character.valueOf('R'), Item.field_309_aA, Character.valueOf('#'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Block.field_9260_U, 6), new Object[] {
            "X X", "X#X", "XRX", Character.valueOf('X'), Item.field_223_m, Character.valueOf('R'), Item.field_309_aA, Character.valueOf('#'), Block.field_4066_aL
        });
        func_1121_a(new ItemStack(Item.field_256_ax, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Item.field_223_m
        });
        func_1121_a(new ItemStack(Item.field_40408_bz, 1), new Object[] {
            "# #", "# #", "###", Character.valueOf('#'), Item.field_223_m
        });
        func_1121_a(new ItemStack(Item.field_40411_by, 1), new Object[] {
            " B ", "###", Character.valueOf('#'), Block.field_335_x, Character.valueOf('B'), Item.field_40417_bo
        });
        func_1121_a(new ItemStack(Block.field_4045_bg, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_4055_bb, Character.valueOf('B'), Block.field_404_ar
        });
        func_1121_a(new ItemStack(Item.field_4027_aL, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_396_av, Character.valueOf('B'), Item.field_256_ax
        });
        func_1121_a(new ItemStack(Item.field_4026_aM, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.field_445_aC, Character.valueOf('B'), Item.field_256_ax
        });
        func_1121_a(new ItemStack(Item.field_4031_aC, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Item.field_262_au, 1), new Object[] {
            "# #", " # ", Character.valueOf('#'), Item.field_223_m
        });
        func_1121_a(new ItemStack(Item.field_4014_g, 1), new Object[] {
            "A ", " B", Character.valueOf('A'), Item.field_223_m, Character.valueOf('B'), Item.field_273_an
        });
        func_1121_a(new ItemStack(Item.field_242_S, 1), new Object[] {
            "###", Character.valueOf('#'), Item.field_243_R
        });
        func_1121_a(new ItemStack(Block.field_4059_au, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Item.field_4024_aP, 1), new Object[] {
            "  #", " #X", "# X", Character.valueOf('#'), Item.field_266_B, Character.valueOf('X'), Item.field_253_I
        });
        func_1121_a(new ItemStack(Block.field_4069_aI, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_335_x
        });
        func_1121_a(new ItemStack(Block.field_35280_bx, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_409_am
        });
        func_1121_a(new ItemStack(Block.field_35279_by, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_35285_bn
        });
        func_1121_a(new ItemStack(Block.field_40204_bD, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.field_40206_bB
        });
        func_1121_a(new ItemStack(Item.field_270_aq, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_266_B, Character.valueOf('X'), Block.field_419_ac
        });
        func_1121_a(new ItemStack(Item.field_269_ar, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_40419_bq, Character.valueOf('X'), Item.field_228_h
        });
        func_1121_a(new ItemStack(Block.field_4067_aK, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Block.field_335_x, Character.valueOf('X'), Item.field_266_B
        });
        func_1121_a(new ItemStack(Block.field_430_aR, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Item.field_266_B, Character.valueOf('X'), Item.field_309_aA
        });
        func_1121_a(new ItemStack(Item.field_22018_aZ, 1), new Object[] {
            "#X#", "III", Character.valueOf('#'), Block.field_430_aR, Character.valueOf('X'), Item.field_309_aA, Character.valueOf('I'), Block.field_338_u
        });
        func_1121_a(new ItemStack(Item.field_4023_aQ, 1), new Object[] {
            " # ", "#X#", " # ", Character.valueOf('#'), Item.field_222_n, Character.valueOf('X'), Item.field_309_aA
        });
        func_1121_a(new ItemStack(Item.field_4025_aO, 1), new Object[] {
            " # ", "#X#", " # ", Character.valueOf('#'), Item.field_223_m, Character.valueOf('X'), Item.field_309_aA
        });
        func_1121_a(new ItemStack(Item.field_28010_bb, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.field_4029_aI, Character.valueOf('X'), Item.field_4025_aO
        });
        func_1121_a(new ItemStack(Block.field_4064_aS, 1), new Object[] {
            "#", "#", Character.valueOf('#'), Block.field_338_u
        });
        func_1121_a(new ItemStack(Block.field_4066_aL, 1), new Object[] {
            "##", Character.valueOf('#'), Block.field_338_u
        });
        func_1121_a(new ItemStack(Block.field_4065_aN, 1), new Object[] {
            "##", Character.valueOf('#'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_9265_P, 1), new Object[] {
            "###", "#X#", "#R#", Character.valueOf('#'), Block.field_335_x, Character.valueOf('X'), Item.field_227_i, Character.valueOf('R'), Item.field_309_aA
        });
        func_1121_a(new ItemStack(Block.field_9255_Z, 1), new Object[] {
            "TTT", "#X#", "#R#", Character.valueOf('#'), Block.field_335_x, Character.valueOf('X'), Item.field_223_m, Character.valueOf('R'), Item.field_309_aA, Character.valueOf('T'), 
            Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_9259_V, 1), new Object[] {
            "S", "P", Character.valueOf('S'), Item.field_299_aK, Character.valueOf('P'), Block.field_9255_Z
        });
        func_1121_a(new ItemStack(Item.field_22019_aY, 1), new Object[] {
            "###", "XXX", Character.valueOf('#'), Block.field_419_ac, Character.valueOf('X'), Block.field_334_y
        });
        func_1121_a(new ItemStack(Block.field_40210_bF, 1), new Object[] {
            " B ", "D#D", "###", Character.valueOf('#'), Block.field_405_aq, Character.valueOf('B'), Item.field_4028_aJ, Character.valueOf('D'), Item.field_224_l
        });
        func_21187_b(new ItemStack(Item.field_40420_bA, 1), new Object[] {
            Item.field_35416_bo, Item.field_40409_bw
        });
        func_21187_b(new ItemStack(Item.field_48439_bE, 3), new Object[] {
            Item.field_250_K, Item.field_40409_bw, Item.field_225_k
        });
        func_21187_b(new ItemStack(Item.field_48439_bE, 3), new Object[] {
            Item.field_250_K, Item.field_40409_bw, new ItemStack(Item.field_225_k, 1, 1)
        });
        Collections.sort(field_1662_b, new RecipeSorter(this));
        System.out.println((new StringBuilder()).append(field_1662_b.size()).append(" recipes").toString());
    }

    void func_1121_a(ItemStack p_1121_1_, Object p_1121_2_[])
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if(p_1121_2_[i] instanceof String[])
        {
            String as[] = (String[])p_1121_2_[i++];
            for(int l = 0; l < as.length; l++)
            {
                String s2 = as[l];
                k++;
                j = s2.length();
                s = (new StringBuilder()).append(s).append(s2).toString();
            }

        } else
        {
            while(p_1121_2_[i] instanceof String) 
            {
                String s1 = (String)p_1121_2_[i++];
                k++;
                j = s1.length();
                s = (new StringBuilder()).append(s).append(s1).toString();
            }
        }
        HashMap hashmap = new HashMap();
        for(; i < p_1121_2_.length; i += 2)
        {
            Character character = (Character)p_1121_2_[i];
            ItemStack itemstack = null;
            if(p_1121_2_[i + 1] instanceof Item)
            {
                itemstack = new ItemStack((Item)p_1121_2_[i + 1]);
            } else
            if(p_1121_2_[i + 1] instanceof Block)
            {
                itemstack = new ItemStack((Block)p_1121_2_[i + 1], 1, -1);
            } else
            if(p_1121_2_[i + 1] instanceof ItemStack)
            {
                itemstack = (ItemStack)p_1121_2_[i + 1];
            }
            hashmap.put(character, itemstack);
        }

        ItemStack aitemstack[] = new ItemStack[j * k];
        for(int i1 = 0; i1 < j * k; i1++)
        {
            char c = s.charAt(i1);
            if(hashmap.containsKey(Character.valueOf(c)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c))).func_1102_e();
            } else
            {
                aitemstack[i1] = null;
            }
        }

        field_1662_b.add(new ShapedRecipes(j, k, aitemstack, p_1121_1_));
    }

    void func_21187_b(ItemStack p_21187_1_, Object p_21187_2_[])
    {
        ArrayList arraylist = new ArrayList();
        Object aobj[] = p_21187_2_;
        int i = aobj.length;
        for(int j = 0; j < i; j++)
        {
            Object obj = aobj[j];
            if(obj instanceof ItemStack)
            {
                arraylist.add(((ItemStack)obj).func_1102_e());
                continue;
            }
            if(obj instanceof Item)
            {
                arraylist.add(new ItemStack((Item)obj));
                continue;
            }
            if(obj instanceof Block)
            {
                arraylist.add(new ItemStack((Block)obj));
            } else
            {
                throw new RuntimeException("Invalid shapeless recipy!");
            }
        }

        field_1662_b.add(new ShapelessRecipes(p_21187_1_, arraylist));
    }

    public ItemStack func_21188_a(InventoryCrafting p_21188_1_)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        for(int j = 0; j < p_21188_1_.func_469_c(); j++)
        {
            ItemStack itemstack2 = p_21188_1_.func_468_c(j);
            if(itemstack2 == null)
            {
                continue;
            }
            if(i == 0)
            {
                itemstack = itemstack2;
            }
            if(i == 1)
            {
                itemstack1 = itemstack2;
            }
            i++;
        }

        if(i == 2 && itemstack.field_1617_c == itemstack1.field_1617_c && itemstack.field_1615_a == 1 && itemstack1.field_1615_a == 1 && Item.field_233_c[itemstack.field_1617_c].func_25007_g())
        {
            Item item = Item.field_233_c[itemstack.field_1617_c];
            int l = item.func_197_c() - itemstack.func_21179_h();
            int i1 = item.func_197_c() - itemstack1.func_21179_h();
            int j1 = l + i1 + (item.func_197_c() * 10) / 100;
            int k1 = item.func_197_c() - j1;
            if(k1 < 0)
            {
                k1 = 0;
            }
            return new ItemStack(itemstack.field_1617_c, 1, k1);
        }
        for(int k = 0; k < field_1662_b.size(); k++)
        {
            IRecipe irecipe = (IRecipe)field_1662_b.get(k);
            if(irecipe.func_21135_a(p_21188_1_))
            {
                return irecipe.func_21136_b(p_21188_1_);
            }
        }

        return null;
    }

    public List func_25193_b()
    {
        return field_1662_b;
    }

}
