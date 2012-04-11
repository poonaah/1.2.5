// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBiped, RenderBlocks, RenderManager, RenderEngine, 
//            Block, BlockFire, Entity, Tessellator, 
//            AxisAlignedBB, EntityLiving, EntityAnimal, MathHelper, 
//            World, GameSettings, ModelBase, FontRenderer

public abstract class Render
{

    protected RenderManager field_191_a;
    private ModelBase field_195_d;
    protected RenderBlocks field_203_d;
    protected float field_9246_c;
    protected float field_194_c;

    public Render()
    {
        field_195_d = new ModelBiped();
        field_203_d = new RenderBlocks();
        field_9246_c = 0.0F;
        field_194_c = 1.0F;
    }

    public abstract void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1);

    protected void func_151_a(String p_151_1_)
    {
        RenderEngine renderengine = field_191_a.field_1229_e;
        renderengine.func_1076_b(renderengine.func_1070_a(p_151_1_));
    }

    protected boolean func_140_a(String p_140_1_, String p_140_2_)
    {
        RenderEngine renderengine = field_191_a.field_1229_e;
        int i = renderengine.func_1071_a(p_140_1_, p_140_2_);
        if(i >= 0)
        {
            renderengine.func_1076_b(i);
            return true;
        } else
        {
            return false;
        }
    }

    private void func_148_a(Entity p_148_1_, double p_148_2_, double p_148_4_, double p_148_6_, 
            float p_148_8_)
    {
        GL11.glDisable(2896);
        int i = Block.field_402_as.field_378_bb;
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        float f = (float)j / 256F;
        float f2 = ((float)j + 15.99F) / 256F;
        float f4 = (float)k / 256F;
        float f6 = ((float)k + 15.99F) / 256F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_148_2_, (float)p_148_4_, (float)p_148_6_);
        float f8 = p_148_1_.field_644_aC * 1.4F;
        GL11.glScalef(f8, f8, f8);
        func_151_a("/terrain.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f9 = 0.5F;
        float f10 = 0.0F;
        float f11 = p_148_1_.field_643_aD / f8;
        float f12 = (float)(p_148_1_.field_610_al - p_148_1_.field_601_au.field_1697_b);
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)(int)f11 * 0.02F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f13 = 0.0F;
        int l = 0;
        tessellator.func_977_b();
        while(f11 > 0.0F) 
        {
            float f1;
            float f3;
            float f5;
            float f7;
            if(l % 2 == 0)
            {
                f1 = (float)j / 256F;
                f3 = ((float)j + 15.99F) / 256F;
                f5 = (float)k / 256F;
                f7 = ((float)k + 15.99F) / 256F;
            } else
            {
                f1 = (float)j / 256F;
                f3 = ((float)j + 15.99F) / 256F;
                f5 = (float)(k + 16) / 256F;
                f7 = ((float)(k + 16) + 15.99F) / 256F;
            }
            if((l / 2) % 2 == 0)
            {
                float f14 = f3;
                f3 = f1;
                f1 = f14;
            }
            tessellator.func_983_a(f9 - f10, 0.0F - f12, f13, f3, f7);
            tessellator.func_983_a(-f9 - f10, 0.0F - f12, f13, f1, f7);
            tessellator.func_983_a(-f9 - f10, 1.4F - f12, f13, f1, f5);
            tessellator.func_983_a(f9 - f10, 1.4F - f12, f13, f3, f5);
            f11 -= 0.45F;
            f12 -= 0.45F;
            f9 *= 0.9F;
            f13 += 0.03F;
            l++;
        }
        tessellator.func_982_a();
        GL11.glPopMatrix();
        GL11.glEnable(2896);
    }

    private void func_144_c(Entity p_144_1_, double p_144_2_, double p_144_4_, double p_144_6_, 
            float p_144_8_, float p_144_9_)
    {
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        RenderEngine renderengine = field_191_a.field_1229_e;
        renderengine.func_1076_b(renderengine.func_1070_a("%clamp%/misc/shadow.png"));
        World world = func_149_b();
        GL11.glDepthMask(false);
        float f = field_9246_c;
        if(p_144_1_ instanceof EntityLiving)
        {
            EntityLiving entityliving = (EntityLiving)p_144_1_;
            f *= entityliving.func_35159_aC();
            if(entityliving instanceof EntityAnimal)
            {
                EntityAnimal entityanimal = (EntityAnimal)entityliving;
                if(entityanimal.func_40127_l())
                {
                    f *= 0.5F;
                }
            }
        }
        double d = p_144_1_.field_638_aI + (p_144_1_.field_611_ak - p_144_1_.field_638_aI) * (double)p_144_9_;
        double d1 = p_144_1_.field_637_aJ + (p_144_1_.field_610_al - p_144_1_.field_637_aJ) * (double)p_144_9_ + (double)p_144_1_.func_392_h_();
        double d2 = p_144_1_.field_636_aK + (p_144_1_.field_609_am - p_144_1_.field_636_aK) * (double)p_144_9_;
        int i = MathHelper.func_1108_b(d - (double)f);
        int j = MathHelper.func_1108_b(d + (double)f);
        int k = MathHelper.func_1108_b(d1 - (double)f);
        int l = MathHelper.func_1108_b(d1);
        int i1 = MathHelper.func_1108_b(d2 - (double)f);
        int j1 = MathHelper.func_1108_b(d2 + (double)f);
        double d3 = p_144_2_ - d;
        double d4 = p_144_4_ - d1;
        double d5 = p_144_6_ - d2;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        for(int k1 = i; k1 <= j; k1++)
        {
            for(int l1 = k; l1 <= l; l1++)
            {
                for(int i2 = i1; i2 <= j1; i2++)
                {
                    int j2 = world.func_600_a(k1, l1 - 1, i2);
                    if(j2 > 0 && world.func_618_j(k1, l1, i2) > 3)
                    {
                        func_145_a(Block.field_345_n[j2], p_144_2_, p_144_4_ + (double)p_144_1_.func_392_h_(), p_144_6_, k1, l1, i2, p_144_8_, f, d3, d4 + (double)p_144_1_.func_392_h_(), d5);
                    }
                }

            }

        }

        tessellator.func_982_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
    }

    private World func_149_b()
    {
        return field_191_a.field_1227_g;
    }

    private void func_145_a(Block p_145_1_, double p_145_2_, double p_145_4_, double p_145_6_, 
            int p_145_8_, int p_145_9_, int p_145_10_, float p_145_11_, float p_145_12_, double p_145_13_, 
            double p_145_15_, double p_145_17_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(!p_145_1_.func_242_c())
        {
            return;
        }
        double d = ((double)p_145_11_ - (p_145_4_ - ((double)p_145_9_ + p_145_15_)) / 2D) * 0.5D * (double)func_149_b().func_598_c(p_145_8_, p_145_9_, p_145_10_);
        if(d < 0.0D)
        {
            return;
        }
        if(d > 1.0D)
        {
            d = 1.0D;
        }
        tessellator.func_986_a(1.0F, 1.0F, 1.0F, (float)d);
        double d1 = (double)p_145_8_ + p_145_1_.field_370_bf + p_145_13_;
        double d2 = (double)p_145_8_ + p_145_1_.field_364_bi + p_145_13_;
        double d3 = (double)p_145_9_ + p_145_1_.field_368_bg + p_145_15_ + 0.015625D;
        double d4 = (double)p_145_10_ + p_145_1_.field_366_bh + p_145_17_;
        double d5 = (double)p_145_10_ + p_145_1_.field_360_bk + p_145_17_;
        float f = (float)((p_145_2_ - d1) / 2D / (double)p_145_12_ + 0.5D);
        float f1 = (float)((p_145_2_ - d2) / 2D / (double)p_145_12_ + 0.5D);
        float f2 = (float)((p_145_6_ - d4) / 2D / (double)p_145_12_ + 0.5D);
        float f3 = (float)((p_145_6_ - d5) / 2D / (double)p_145_12_ + 0.5D);
        tessellator.func_983_a(d1, d3, d4, f, f2);
        tessellator.func_983_a(d1, d3, d5, f, f3);
        tessellator.func_983_a(d2, d3, d5, f1, f3);
        tessellator.func_983_a(d2, d3, d4, f1, f2);
    }

    public static void func_146_a(AxisAlignedBB p_146_0_, double p_146_1_, double p_146_3_, double p_146_5_)
    {
        GL11.glDisable(3553);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.func_977_b();
        tessellator.func_984_b(p_146_1_, p_146_3_, p_146_5_);
        tessellator.func_980_b(0.0F, 0.0F, -1F);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_980_b(0.0F, 0.0F, 1.0F);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_980_b(0.0F, -1F, 0.0F);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_980_b(-1F, 0.0F, 0.0F);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1698_a, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_980_b(1.0F, 0.0F, 0.0F);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1704_c);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1702_e, p_146_0_.field_1701_f);
        tessellator.func_991_a(p_146_0_.field_1703_d, p_146_0_.field_1697_b, p_146_0_.field_1701_f);
        tessellator.func_984_b(0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glEnable(3553);
    }

    public static void func_142_a(AxisAlignedBB p_142_0_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1698_a, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1704_c);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1702_e, p_142_0_.field_1701_f);
        tessellator.func_991_a(p_142_0_.field_1703_d, p_142_0_.field_1697_b, p_142_0_.field_1701_f);
        tessellator.func_982_a();
    }

    public void func_4009_a(RenderManager p_4009_1_)
    {
        field_191_a = p_4009_1_;
    }

    public void func_141_b(Entity p_141_1_, double p_141_2_, double p_141_4_, double p_141_6_, 
            float p_141_8_, float p_141_9_)
    {
        if(field_191_a.field_1223_k.field_1576_i && field_9246_c > 0.0F)
        {
            double d = field_191_a.func_851_a(p_141_1_.field_611_ak, p_141_1_.field_610_al, p_141_1_.field_609_am);
            float f = (float)((1.0D - d / 256D) * (double)field_194_c);
            if(f > 0.0F)
            {
                func_144_c(p_141_1_, p_141_2_, p_141_4_, p_141_6_, f, p_141_9_);
            }
        }
        if(p_141_1_.func_21062_U())
        {
            func_148_a(p_141_1_, p_141_2_, p_141_4_, p_141_6_, p_141_9_);
        }
    }

    public FontRenderer func_6329_a()
    {
        return field_191_a.func_6500_a();
    }
}
