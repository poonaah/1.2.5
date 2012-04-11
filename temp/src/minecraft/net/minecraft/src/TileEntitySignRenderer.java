// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySpecialRenderer, ModelSign, TileEntitySign, Block, 
//            ModelRenderer, FontRenderer, TileEntity

public class TileEntitySignRenderer extends TileEntitySpecialRenderer
{

    private ModelSign field_1413_b;

    public TileEntitySignRenderer()
    {
        field_1413_b = new ModelSign();
    }

    public void func_932_a(TileEntitySign p_932_1_, double p_932_2_, double p_932_4_, double p_932_6_, 
            float p_932_8_)
    {
        Block block = p_932_1_.func_478_g();
        GL11.glPushMatrix();
        float f = 0.6666667F;
        if(block == Block.field_443_aE)
        {
            GL11.glTranslatef((float)p_932_2_ + 0.5F, (float)p_932_4_ + 0.75F * f, (float)p_932_6_ + 0.5F);
            float f1 = (float)(p_932_1_.func_479_f() * 360) / 16F;
            GL11.glRotatef(-f1, 0.0F, 1.0F, 0.0F);
            field_1413_b.field_1345_b.field_1403_h = true;
        } else
        {
            int i = p_932_1_.func_479_f();
            float f2 = 0.0F;
            if(i == 2)
            {
                f2 = 180F;
            }
            if(i == 4)
            {
                f2 = 90F;
            }
            if(i == 5)
            {
                f2 = -90F;
            }
            GL11.glTranslatef((float)p_932_2_ + 0.5F, (float)p_932_4_ + 0.75F * f, (float)p_932_6_ + 0.5F);
            GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
            field_1413_b.field_1345_b.field_1403_h = false;
        }
        func_6507_a("/item/sign.png");
        GL11.glPushMatrix();
        GL11.glScalef(f, -f, -f);
        field_1413_b.func_887_a();
        GL11.glPopMatrix();
        FontRenderer fontrenderer = func_6508_a();
        float f3 = 0.01666667F * f;
        GL11.glTranslatef(0.0F, 0.5F * f, 0.07F * f);
        GL11.glScalef(f3, -f3, f3);
        GL11.glNormal3f(0.0F, 0.0F, -1F * f3);
        GL11.glDepthMask(false);
        int j = 0;
        for(int k = 0; k < p_932_1_.field_826_a.length; k++)
        {
            String s = p_932_1_.field_826_a[k];
            if(k == p_932_1_.field_825_b)
            {
                s = (new StringBuilder()).append("> ").append(s).append(" <").toString();
                fontrenderer.func_873_b(s, -fontrenderer.func_871_a(s) / 2, k * 10 - p_932_1_.field_826_a.length * 5, j);
            } else
            {
                fontrenderer.func_873_b(s, -fontrenderer.func_871_a(s) / 2, k * 10 - p_932_1_.field_826_a.length * 5, j);
            }
        }

        GL11.glDepthMask(true);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }

    public void func_930_a(TileEntity p_930_1_, double p_930_2_, double p_930_4_, double p_930_6_, 
            float p_930_8_)
    {
        func_932_a((TileEntitySign)p_930_1_, p_930_2_, p_930_4_, p_930_6_, p_930_8_);
    }
}
