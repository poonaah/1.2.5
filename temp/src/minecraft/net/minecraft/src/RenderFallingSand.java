// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, RenderBlocks, Block, EntityFallingSand, 
//            Tessellator, MathHelper, Entity

public class RenderFallingSand extends Render
{

    private RenderBlocks field_197_d;

    public RenderFallingSand()
    {
        field_197_d = new RenderBlocks();
        field_9246_c = 0.5F;
    }

    public void func_156_a(EntityFallingSand p_156_1_, double p_156_2_, double p_156_4_, double p_156_6_, 
            float p_156_8_, float p_156_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_156_2_, (float)p_156_4_, (float)p_156_6_);
        func_151_a("/terrain.png");
        Block block = Block.field_345_n[p_156_1_.field_799_a];
        World world = p_156_1_.func_465_i();
        GL11.glDisable(2896);
        if(block == Block.field_41050_bK)
        {
            field_197_d.field_1772_a = world;
            Tessellator tessellator = Tessellator.field_1512_a;
            tessellator.func_977_b();
            tessellator.func_984_b((float)(-MathHelper.func_1108_b(p_156_1_.field_611_ak)) - 0.5F, (float)(-MathHelper.func_1108_b(p_156_1_.field_610_al)) - 0.5F, (float)(-MathHelper.func_1108_b(p_156_1_.field_609_am)) - 0.5F);
            field_197_d.func_1234_a(block, MathHelper.func_1108_b(p_156_1_.field_611_ak), MathHelper.func_1108_b(p_156_1_.field_610_al), MathHelper.func_1108_b(p_156_1_.field_609_am));
            tessellator.func_984_b(0.0D, 0.0D, 0.0D);
            tessellator.func_982_a();
        } else
        {
            field_197_d.func_1243_a(block, world, MathHelper.func_1108_b(p_156_1_.field_611_ak), MathHelper.func_1108_b(p_156_1_.field_610_al), MathHelper.func_1108_b(p_156_1_.field_609_am));
        }
        GL11.glEnable(2896);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_156_a((EntityFallingSand)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
