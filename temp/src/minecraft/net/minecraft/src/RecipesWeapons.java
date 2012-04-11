// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Item, ItemStack, CraftingManager

public class RecipesWeapons
{

    private String field_1100_a[][] = {
        {
            "X", "X", "#"
        }
    };
    private Object field_1099_b[][];

    public RecipesWeapons()
    {
        field_1099_b = (new Object[][] {
            new Object[] {
                Block.field_334_y, Block.field_335_x, Item.field_223_m, Item.field_224_l, Item.field_222_n
            }, new Object[] {
                Item.field_220_p, Item.field_216_t, Item.field_221_o, Item.field_212_x, Item.field_261_E
            }
        });
    }

    public void func_766_a(CraftingManager p_766_1_)
    {
        for(int i = 0; i < field_1099_b[0].length; i++)
        {
            Object obj = field_1099_b[0][i];
            for(int j = 0; j < field_1099_b.length - 1; j++)
            {
                Item item = (Item)field_1099_b[j + 1][i];
                p_766_1_.func_1121_a(new ItemStack(item), new Object[] {
                    field_1100_a[j], Character.valueOf('#'), Item.field_266_B, Character.valueOf('X'), obj
                });
            }

        }

        p_766_1_.func_1121_a(new ItemStack(Item.field_227_i, 1), new Object[] {
            " #X", "# X", " #X", Character.valueOf('X'), Item.field_253_I, Character.valueOf('#'), Item.field_266_B
        });
        p_766_1_.func_1121_a(new ItemStack(Item.field_226_j, 4), new Object[] {
            "X", "#", "Y", Character.valueOf('Y'), Item.field_251_J, Character.valueOf('X'), Item.field_273_an, Character.valueOf('#'), Item.field_266_B
        });
    }
}
