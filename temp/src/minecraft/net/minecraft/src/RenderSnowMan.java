// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelSnowMan, ItemStack, Block, 
//            Item, ModelRenderer, RenderBlocks, RenderManager, 
//            ItemRenderer, EntitySnowman, EntityLiving

public class RenderSnowMan extends RenderLiving
{

    private ModelSnowMan field_40289_c;

    public RenderSnowMan()
    {
        super(new ModelSnowMan(), 0.5F);
        field_40289_c = (ModelSnowMan)super.field_20920_e;
        func_4013_a(field_40289_c);
    }

    protected void func_40288_a(EntitySnowman p_40288_1_, float p_40288_2_)
    {
        super.func_6331_b(p_40288_1_, p_40288_2_);
        ItemStack itemstack = new ItemStack(Block.field_4055_bb, 1);
        if(itemstack != null && itemstack.func_1091_a().field_291_aS < 256)
        {
            GL11.glPushMatrix();
            field_40289_c.field_40305_c.func_926_b(0.0625F);
            if(RenderBlocks.func_1219_a(Block.field_345_n[itemstack.field_1617_c].func_210_f()))
            {
                float f = 0.625F;
                GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
                GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f, -f, f);
            }
            field_191_a.field_4236_f.func_4132_a(p_40288_1_, itemstack, 0);
            GL11.glPopMatrix();
        }
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_40288_a((EntitySnowman)p_6331_1_, p_6331_2_);
    }
}
