// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySpecialRenderer, ModelChest, ModelLargeChest, TileEntityChest, 
//            BlockChest, ModelRenderer, TileEntity

public class TileEntityChestRenderer extends TileEntitySpecialRenderer
{

    private ModelChest field_35377_b;
    private ModelChest field_35378_c;

    public TileEntityChestRenderer()
    {
        field_35377_b = new ModelChest();
        field_35378_c = new ModelLargeChest();
    }

    public void func_35376_a(TileEntityChest p_35376_1_, double p_35376_2_, double p_35376_4_, double p_35376_6_, 
            float p_35376_8_)
    {
        int i;
        if(p_35376_1_.field_824_e == null)
        {
            i = 0;
        } else
        {
            Block block = p_35376_1_.func_478_g();
            i = p_35376_1_.func_479_f();
            if(block != null && i == 0)
            {
                ((BlockChest)block).func_35306_h(p_35376_1_.field_824_e, p_35376_1_.field_823_f, p_35376_1_.field_822_g, p_35376_1_.field_821_h);
                i = p_35376_1_.func_479_f();
            }
            p_35376_1_.func_35147_g();
        }
        if(p_35376_1_.field_35152_b != null || p_35376_1_.field_35150_d != null)
        {
            return;
        }
        ModelChest modelchest;
        if(p_35376_1_.field_35153_c != null || p_35376_1_.field_35151_e != null)
        {
            modelchest = field_35378_c;
            func_6507_a("/item/largechest.png");
        } else
        {
            modelchest = field_35377_b;
            func_6507_a("/item/chest.png");
        }
        GL11.glPushMatrix();
        GL11.glEnable(32826);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float)p_35376_2_, (float)p_35376_4_ + 1.0F, (float)p_35376_6_ + 1.0F);
        GL11.glScalef(1.0F, -1F, -1F);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        int j = 0;
        if(i == 2)
        {
            j = 180;
        }
        if(i == 3)
        {
            j = 0;
        }
        if(i == 4)
        {
            j = 90;
        }
        if(i == 5)
        {
            j = -90;
        }
        if(i == 2 && p_35376_1_.field_35153_c != null)
        {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        }
        if(i == 5 && p_35376_1_.field_35151_e != null)
        {
            GL11.glTranslatef(0.0F, 0.0F, -1F);
        }
        GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        float f = p_35376_1_.field_35149_g + (p_35376_1_.field_35148_f - p_35376_1_.field_35149_g) * p_35376_8_;
        if(p_35376_1_.field_35152_b != null)
        {
            float f1 = p_35376_1_.field_35152_b.field_35149_g + (p_35376_1_.field_35152_b.field_35148_f - p_35376_1_.field_35152_b.field_35149_g) * p_35376_8_;
            if(f1 > f)
            {
                f = f1;
            }
        }
        if(p_35376_1_.field_35150_d != null)
        {
            float f2 = p_35376_1_.field_35150_d.field_35149_g + (p_35376_1_.field_35150_d.field_35148_f - p_35376_1_.field_35150_d.field_35149_g) * p_35376_8_;
            if(f2 > f)
            {
                f = f2;
            }
        }
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        modelchest.field_35405_a.field_1407_d = -((f * 3.141593F) / 2.0F);
        modelchest.func_35402_a();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_930_a(TileEntity p_930_1_, double p_930_2_, double p_930_4_, double p_930_6_, 
            float p_930_8_)
    {
        func_35376_a((TileEntityChest)p_930_1_, p_930_2_, p_930_4_, p_930_6_, p_930_8_);
    }
}
