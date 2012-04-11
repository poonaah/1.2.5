// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntityChest, TileEntityRenderer, Block

public class ChestItemRenderHelper
{

    public static ChestItemRenderHelper field_35611_a = new ChestItemRenderHelper();
    private TileEntityChest field_35610_b;

    public ChestItemRenderHelper()
    {
        field_35610_b = new TileEntityChest();
    }

    public void func_35609_a(Block p_35609_1_, int p_35609_2_, float p_35609_3_)
    {
        TileEntityRenderer.field_1554_a.func_1032_a(field_35610_b, 0.0D, 0.0D, 0.0D, 0.0F);
    }

}
