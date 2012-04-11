// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityLiving, ModelBiped, ModelRenderer, 
//            ItemStack, Block, RenderBlocks, Item, 
//            RenderManager, ItemRenderer

public class RenderBiped extends RenderLiving
{

    protected ModelBiped field_4013_a;
    protected float field_40296_d;

    public RenderBiped(ModelBiped p_i605_1_, float p_i605_2_)
    {
        this(p_i605_1_, p_i605_2_, 1.0F);
        field_4013_a = p_i605_1_;
    }

    public RenderBiped(ModelBiped p_i606_1_, float p_i606_2_, float p_i606_3_)
    {
        super(p_i606_1_, p_i606_2_);
        field_4013_a = p_i606_1_;
        field_40296_d = p_i606_3_;
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        super.func_6331_b(p_6331_1_, p_6331_2_);
        ItemStack itemstack = p_6331_1_.func_4045_l();
        if(itemstack != null)
        {
            GL11.glPushMatrix();
            field_4013_a.field_1283_d.func_926_b(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            if(itemstack.field_1617_c < 256 && RenderBlocks.func_1219_a(Block.field_345_n[itemstack.field_1617_c].func_210_f()))
            {
                float f = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                f *= 0.75F;
                GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f, -f, f);
            } else
            if(itemstack.field_1617_c == Item.field_227_i.field_291_aS)
            {
                float f1 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
                GL11.glRotatef(-20F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f1, -f1, f1);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            if(Item.field_233_c[itemstack.field_1617_c].func_4017_a())
            {
                float f2 = 0.625F;
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(f2, -f2, f2);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            {
                float f3 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(f3, f3, f3);
                GL11.glRotatef(60F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
            }
            field_191_a.field_4236_f.func_4132_a(p_6331_1_, itemstack, 0);
            if(itemstack.func_1091_a().func_46058_c())
            {
                field_191_a.field_4236_f.func_4132_a(p_6331_1_, itemstack, 1);
            }
            GL11.glPopMatrix();
        }
    }
}
