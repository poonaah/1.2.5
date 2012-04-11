// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, ItemStack, CraftingManager

public class RecipesArmor
{

    private String field_1681_a[][] = {
        {
            "XXX", "X X"
        }, {
            "X X", "XXX", "XXX"
        }, {
            "XXX", "X X", "X X"
        }, {
            "X X", "X X"
        }
    };
    private Object field_1680_b[][];

    public RecipesArmor()
    {
        field_1680_b = (new Object[][] {
            new Object[] {
                Item.field_306_aD, Block.field_402_as, Item.field_223_m, Item.field_224_l, Item.field_222_n
            }, new Object[] {
                Item.field_241_T, Item.field_237_X, Item.field_285_ab, Item.field_281_af, Item.field_277_aj
            }, new Object[] {
                Item.field_240_U, Item.field_236_Y, Item.field_284_ac, Item.field_280_ag, Item.field_276_ak
            }, new Object[] {
                Item.field_239_V, Item.field_235_Z, Item.field_283_ad, Item.field_279_ah, Item.field_275_al
            }, new Object[] {
                Item.field_238_W, Item.field_286_aa, Item.field_282_ae, Item.field_278_ai, Item.field_274_am
            }
        });
    }

    public void func_1148_a(CraftingManager p_1148_1_)
    {
        for(int i = 0; i < field_1680_b[0].length; i++)
        {
            Object obj = field_1680_b[0][i];
            for(int j = 0; j < field_1680_b.length - 1; j++)
            {
                Item item = (Item)field_1680_b[j + 1][i];
                p_1148_1_.func_1121_a(new ItemStack(item), new Object[] {
                    field_1681_a[j], Character.valueOf('X'), obj
                });
            }

        }

    }
}
