// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, ItemStack, Item, CraftingManager

public class RecipesIngots
{

    private Object field_1198_a[][];

    public RecipesIngots()
    {
        field_1198_a = (new Object[][] {
            new Object[] {
                Block.field_413_ai, new ItemStack(Item.field_222_n, 9)
            }, new Object[] {
                Block.field_412_aj, new ItemStack(Item.field_223_m, 9)
            }, new Object[] {
                Block.field_389_ay, new ItemStack(Item.field_224_l, 9)
            }, new Object[] {
                Block.field_9266_O, new ItemStack(Item.field_21021_aU, 9, 4)
            }
        });
    }

    public void func_810_a(CraftingManager p_810_1_)
    {
        for(int i = 0; i < field_1198_a.length; i++)
        {
            Block block = (Block)field_1198_a[i][0];
            ItemStack itemstack = (ItemStack)field_1198_a[i][1];
            p_810_1_.func_1121_a(new ItemStack(block), new Object[] {
                "###", "###", "###", Character.valueOf('#'), itemstack
            });
            p_810_1_.func_1121_a(itemstack, new Object[] {
                "#", Character.valueOf('#'), block
            });
        }

        p_810_1_.func_1121_a(new ItemStack(Item.field_222_n), new Object[] {
            "###", "###", "###", Character.valueOf('#'), Item.field_40419_bq
        });
        p_810_1_.func_1121_a(new ItemStack(Item.field_40419_bq, 9), new Object[] {
            "#", Character.valueOf('#'), Item.field_222_n
        });
    }
}
