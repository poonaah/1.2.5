// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Item, ItemStack, CraftingManager

public class RecipesTools
{

    private String field_1665_a[][] = {
        {
            "XXX", " # ", " # "
        }, {
            "X", "#", "#"
        }, {
            "XX", "X#", " #"
        }, {
            "XX", " #", " #"
        }
    };
    private Object field_1664_b[][];

    public RecipesTools()
    {
        field_1664_b = (new Object[][] {
            new Object[] {
                Block.field_334_y, Block.field_335_x, Item.field_223_m, Item.field_224_l, Item.field_222_n
            }, new Object[] {
                Item.field_218_r, Item.field_214_v, Item.field_231_e, Item.field_210_z, Item.field_257_G
            }, new Object[] {
                Item.field_219_q, Item.field_215_u, Item.field_232_d, Item.field_211_y, Item.field_259_F
            }, new Object[] {
                Item.field_217_s, Item.field_213_w, Item.field_230_f, Item.field_268_A, Item.field_255_H
            }, new Object[] {
                Item.field_249_L, Item.field_248_M, Item.field_247_N, Item.field_246_O, Item.field_245_P
            }
        });
    }

    public void func_1122_a(CraftingManager p_1122_1_)
    {
        for(int i = 0; i < field_1664_b[0].length; i++)
        {
            Object obj = field_1664_b[0][i];
            for(int j = 0; j < field_1664_b.length - 1; j++)
            {
                Item item = (Item)field_1664_b[j + 1][i];
                p_1122_1_.func_1121_a(new ItemStack(item), new Object[] {
                    field_1665_a[j], Character.valueOf('#'), Item.field_266_B, Character.valueOf('X'), obj
                });
            }

        }

        p_1122_1_.func_1121_a(new ItemStack(Item.field_31001_bc), new Object[] {
            " #", "# ", Character.valueOf('#'), Item.field_223_m
        });
    }
}
