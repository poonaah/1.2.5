// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySpecialRenderer, ModelBook, TileEntityEnchantmentTable, MathHelper, 
//            TileEntity

public class RenderEnchantmentTable extends TileEntitySpecialRenderer
{

    private ModelBook field_40450_a;

    public RenderEnchantmentTable()
    {
        field_40450_a = new ModelBook();
    }

    public void func_40449_a(TileEntityEnchantmentTable p_40449_1_, double p_40449_2_, double p_40449_4_, double p_40449_6_, 
            float p_40449_8_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_40449_2_ + 0.5F, (float)p_40449_4_ + 0.75F, (float)p_40449_6_ + 0.5F);
        float f = (float)p_40449_1_.field_40068_a + p_40449_8_;
        GL11.glTranslatef(0.0F, 0.1F + MathHelper.func_1106_a(f * 0.1F) * 0.01F, 0.0F);
        float f1;
        for(f1 = p_40449_1_.field_40069_h - p_40449_1_.field_40067_p; f1 >= 3.141593F; f1 -= 6.283185F) { }
        for(; f1 < -3.141593F; f1 += 6.283185F) { }
        float f2 = p_40449_1_.field_40067_p + f1 * p_40449_8_;
        GL11.glRotatef((-f2 * 180F) / 3.141593F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(80F, 0.0F, 0.0F, 1.0F);
        func_6507_a("/item/book.png");
        float f3 = p_40449_1_.field_40065_c + (p_40449_1_.field_40063_b - p_40449_1_.field_40065_c) * p_40449_8_ + 0.25F;
        float f4 = p_40449_1_.field_40065_c + (p_40449_1_.field_40063_b - p_40449_1_.field_40065_c) * p_40449_8_ + 0.75F;
        f3 = (f3 - (float)MathHelper.func_40346_b(f3)) * 1.6F - 0.3F;
        f4 = (f4 - (float)MathHelper.func_40346_b(f4)) * 1.6F - 0.3F;
        if(f3 < 0.0F)
        {
            f3 = 0.0F;
        }
        if(f4 < 0.0F)
        {
            f4 = 0.0F;
        }
        if(f3 > 1.0F)
        {
            f3 = 1.0F;
        }
        if(f4 > 1.0F)
        {
            f4 = 1.0F;
        }
        float f5 = p_40449_1_.field_40060_g + (p_40449_1_.field_40059_f - p_40449_1_.field_40060_g) * p_40449_8_;
        field_40450_a.func_864_b(null, f, f3, f4, f5, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_930_a(TileEntity p_930_1_, double p_930_2_, double p_930_4_, double p_930_6_, 
            float p_930_8_)
    {
        func_40449_a((TileEntityEnchantmentTable)p_930_1_, p_930_2_, p_930_4_, p_930_6_, p_930_8_);
    }
}
