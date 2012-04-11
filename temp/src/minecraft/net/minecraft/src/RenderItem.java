// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, RenderBlocks, EntityItem, MathHelper, 
//            ItemStack, Block, Item, Tessellator, 
//            RenderManager, RenderEngine, FontRenderer, Entity

public class RenderItem extends Render
{

    private RenderBlocks field_201_d;
    private Random field_200_e;
    public boolean field_27004_a;
    public float field_40268_b;

    public RenderItem()
    {
        field_201_d = new RenderBlocks();
        field_200_e = new Random();
        field_27004_a = true;
        field_40268_b = 0.0F;
        field_9246_c = 0.15F;
        field_194_c = 0.75F;
    }

    public void func_165_a(EntityItem p_165_1_, double p_165_2_, double p_165_4_, double p_165_6_, 
            float p_165_8_, float p_165_9_)
    {
        field_200_e.setSeed(187L);
        ItemStack itemstack = p_165_1_.field_801_a;
        GL11.glPushMatrix();
        float f = MathHelper.func_1106_a(((float)p_165_1_.field_800_b + p_165_9_) / 10F + p_165_1_.field_804_d) * 0.1F + 0.1F;
        float f1 = (((float)p_165_1_.field_800_b + p_165_9_) / 20F + p_165_1_.field_804_d) * 57.29578F;
        byte byte0 = 1;
        if(p_165_1_.field_801_a.field_1615_a > 1)
        {
            byte0 = 2;
        }
        if(p_165_1_.field_801_a.field_1615_a > 5)
        {
            byte0 = 3;
        }
        if(p_165_1_.field_801_a.field_1615_a > 20)
        {
            byte0 = 4;
        }
        GL11.glTranslatef((float)p_165_2_, (float)p_165_4_ + f, (float)p_165_6_);
        GL11.glEnable(32826);
        if(itemstack.field_1617_c < 256 && RenderBlocks.func_1219_a(Block.field_345_n[itemstack.field_1617_c].func_210_f()))
        {
            GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
            func_151_a("/terrain.png");
            float f2 = 0.25F;
            int k = Block.field_345_n[itemstack.field_1617_c].func_210_f();
            if(k == 1 || k == 19 || k == 12 || k == 2)
            {
                f2 = 0.5F;
            }
            GL11.glScalef(f2, f2, f2);
            for(int j1 = 0; j1 < byte0; j1++)
            {
                GL11.glPushMatrix();
                if(j1 > 0)
                {
                    float f5 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f2;
                    float f8 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f2;
                    float f11 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f2;
                    GL11.glTranslatef(f5, f8, f11);
                }
                float f6 = 1.0F;
                field_201_d.func_1227_a(Block.field_345_n[itemstack.field_1617_c], itemstack.func_21181_i(), f6);
                GL11.glPopMatrix();
            }

        } else
        if(itemstack.func_1091_a().func_46058_c())
        {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            func_151_a("/gui/items.png");
            for(int i = 0; i <= 1; i++)
            {
                int l = itemstack.func_1091_a().func_46057_a(itemstack.func_21181_i(), i);
                float f3 = 1.0F;
                if(field_27004_a)
                {
                    int k1 = Item.field_233_c[itemstack.field_1617_c].func_27010_f(itemstack.func_21181_i(), i);
                    float f9 = (float)(k1 >> 16 & 0xff) / 255F;
                    float f12 = (float)(k1 >> 8 & 0xff) / 255F;
                    float f14 = (float)(k1 & 0xff) / 255F;
                    GL11.glColor4f(f9 * f3, f12 * f3, f14 * f3, 1.0F);
                }
                func_40267_a(l, byte0);
            }

        } else
        {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            int j = itemstack.func_1088_b();
            if(itemstack.field_1617_c < 256)
            {
                func_151_a("/terrain.png");
            } else
            {
                func_151_a("/gui/items.png");
            }
            if(field_27004_a)
            {
                int i1 = Item.field_233_c[itemstack.field_1617_c].func_27010_f(itemstack.func_21181_i(), 0);
                float f4 = (float)(i1 >> 16 & 0xff) / 255F;
                float f7 = (float)(i1 >> 8 & 0xff) / 255F;
                float f10 = (float)(i1 & 0xff) / 255F;
                float f13 = 1.0F;
                GL11.glColor4f(f4 * f13, f7 * f13, f10 * f13, 1.0F);
            }
            func_40267_a(j, byte0);
        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    private void func_40267_a(int p_40267_1_, int p_40267_2_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = (float)((p_40267_1_ % 16) * 16 + 0) / 256F;
        float f1 = (float)((p_40267_1_ % 16) * 16 + 16) / 256F;
        float f2 = (float)((p_40267_1_ / 16) * 16 + 0) / 256F;
        float f3 = (float)((p_40267_1_ / 16) * 16 + 16) / 256F;
        float f4 = 1.0F;
        float f5 = 0.5F;
        float f6 = 0.25F;
        for(int i = 0; i < p_40267_2_; i++)
        {
            GL11.glPushMatrix();
            if(i > 0)
            {
                float f7 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                float f8 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                float f9 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                GL11.glTranslatef(f7, f8, f9);
            }
            GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 1.0F, 0.0F);
            tessellator.func_983_a(0.0F - f5, 0.0F - f6, 0.0D, f, f3);
            tessellator.func_983_a(f4 - f5, 0.0F - f6, 0.0D, f1, f3);
            tessellator.func_983_a(f4 - f5, 1.0F - f6, 0.0D, f1, f2);
            tessellator.func_983_a(0.0F - f5, 1.0F - f6, 0.0D, f, f2);
            tessellator.func_982_a();
            GL11.glPopMatrix();
        }

    }

    public void func_27003_a(FontRenderer p_27003_1_, RenderEngine p_27003_2_, int p_27003_3_, int p_27003_4_, int p_27003_5_, int p_27003_6_, int p_27003_7_)
    {
        if(p_27003_3_ < 256 && RenderBlocks.func_1219_a(Block.field_345_n[p_27003_3_].func_210_f()))
        {
            int i = p_27003_3_;
            p_27003_2_.func_1076_b(p_27003_2_.func_1070_a("/terrain.png"));
            Block block = Block.field_345_n[i];
            GL11.glPushMatrix();
            GL11.glTranslatef(p_27003_6_ - 2, p_27003_7_ + 3, -3F + field_40268_b);
            GL11.glScalef(10F, 10F, 10F);
            GL11.glTranslatef(1.0F, 0.5F, 1.0F);
            GL11.glScalef(1.0F, 1.0F, -1F);
            GL11.glRotatef(210F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            int i1 = Item.field_233_c[p_27003_3_].func_27010_f(p_27003_4_, 0);
            float f2 = (float)(i1 >> 16 & 0xff) / 255F;
            float f5 = (float)(i1 >> 8 & 0xff) / 255F;
            float f7 = (float)(i1 & 0xff) / 255F;
            if(field_27004_a)
            {
                GL11.glColor4f(f2, f5, f7, 1.0F);
            }
            GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
            field_201_d.field_31088_b = field_27004_a;
            field_201_d.func_1227_a(block, p_27003_4_, 1.0F);
            field_201_d.field_31088_b = true;
            GL11.glPopMatrix();
        } else
        if(Item.field_233_c[p_27003_3_].func_46058_c())
        {
            GL11.glDisable(2896);
            p_27003_2_.func_1076_b(p_27003_2_.func_1070_a("/gui/items.png"));
            for(int j = 0; j <= 1; j++)
            {
                int l = Item.field_233_c[p_27003_3_].func_46057_a(p_27003_4_, j);
                int j1 = Item.field_233_c[p_27003_3_].func_27010_f(p_27003_4_, j);
                float f3 = (float)(j1 >> 16 & 0xff) / 255F;
                float f6 = (float)(j1 >> 8 & 0xff) / 255F;
                float f8 = (float)(j1 & 0xff) / 255F;
                if(field_27004_a)
                {
                    GL11.glColor4f(f3, f6, f8, 1.0F);
                }
                func_163_a(p_27003_6_, p_27003_7_, (l % 16) * 16, (l / 16) * 16, 16, 16);
            }

            GL11.glEnable(2896);
        } else
        if(p_27003_5_ >= 0)
        {
            GL11.glDisable(2896);
            if(p_27003_3_ < 256)
            {
                p_27003_2_.func_1076_b(p_27003_2_.func_1070_a("/terrain.png"));
            } else
            {
                p_27003_2_.func_1076_b(p_27003_2_.func_1070_a("/gui/items.png"));
            }
            int k = Item.field_233_c[p_27003_3_].func_27010_f(p_27003_4_, 0);
            float f = (float)(k >> 16 & 0xff) / 255F;
            float f1 = (float)(k >> 8 & 0xff) / 255F;
            float f4 = (float)(k & 0xff) / 255F;
            if(field_27004_a)
            {
                GL11.glColor4f(f, f1, f4, 1.0F);
            }
            func_163_a(p_27003_6_, p_27003_7_, (p_27003_5_ % 16) * 16, (p_27003_5_ / 16) * 16, 16, 16);
            GL11.glEnable(2896);
        }
        GL11.glEnable(2884);
    }

    public void func_161_a(FontRenderer p_161_1_, RenderEngine p_161_2_, ItemStack p_161_3_, int p_161_4_, int p_161_5_)
    {
        if(p_161_3_ == null)
        {
            return;
        }
        func_27003_a(p_161_1_, p_161_2_, p_161_3_.field_1617_c, p_161_3_.func_21181_i(), p_161_3_.func_1088_b(), p_161_4_, p_161_5_);
        if(p_161_3_ != null && p_161_3_.func_40713_r())
        {
            GL11.glDepthFunc(516);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            p_161_2_.func_1076_b(p_161_2_.func_1070_a("%blur%/misc/glint.png"));
            field_40268_b -= 50F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 774);
            GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
            func_40266_a(p_161_4_ * 0x19b4ca14 + p_161_5_ * 0x1eafff1, p_161_4_ - 2, p_161_5_ - 2, 20, 20);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            field_40268_b += 50F;
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
        }
    }

    private void func_40266_a(int p_40266_1_, int p_40266_2_, int p_40266_3_, int p_40266_4_, int p_40266_5_)
    {
        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
            {
                GL11.glBlendFunc(768, 1);
            }
            if(i == 1)
            {
                GL11.glBlendFunc(768, 1);
            }
            float f = 0.00390625F;
            float f1 = 0.00390625F;
            float f2 = ((float)(System.currentTimeMillis() % (long)(3000 + i * 1873)) / (3000F + (float)(i * 1873))) * 256F;
            float f3 = 0.0F;
            Tessellator tessellator = Tessellator.field_1512_a;
            float f4 = 4F;
            if(i == 1)
            {
                f4 = -1F;
            }
            tessellator.func_977_b();
            tessellator.func_983_a(p_40266_2_ + 0, p_40266_3_ + p_40266_5_, field_40268_b, (f2 + (float)p_40266_5_ * f4) * f, (f3 + (float)p_40266_5_) * f1);
            tessellator.func_983_a(p_40266_2_ + p_40266_4_, p_40266_3_ + p_40266_5_, field_40268_b, (f2 + (float)p_40266_4_ + (float)p_40266_5_ * f4) * f, (f3 + (float)p_40266_5_) * f1);
            tessellator.func_983_a(p_40266_2_ + p_40266_4_, p_40266_3_ + 0, field_40268_b, (f2 + (float)p_40266_4_) * f, (f3 + 0.0F) * f1);
            tessellator.func_983_a(p_40266_2_ + 0, p_40266_3_ + 0, field_40268_b, (f2 + 0.0F) * f, (f3 + 0.0F) * f1);
            tessellator.func_982_a();
        }

    }

    public void func_164_b(FontRenderer p_164_1_, RenderEngine p_164_2_, ItemStack p_164_3_, int p_164_4_, int p_164_5_)
    {
        if(p_164_3_ == null)
        {
            return;
        }
        if(p_164_3_.field_1615_a > 1)
        {
            String s = (new StringBuilder()).append("").append(p_164_3_.field_1615_a).toString();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            p_164_1_.func_50103_a(s, (p_164_4_ + 19) - 2 - p_164_1_.func_871_a(s), p_164_5_ + 6 + 3, 0xffffff);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
        }
        if(p_164_3_.func_21185_g())
        {
            int i = (int)Math.round(13D - ((double)p_164_3_.func_21179_h() * 13D) / (double)p_164_3_.func_1094_d());
            int j = (int)Math.round(255D - ((double)p_164_3_.func_21179_h() * 255D) / (double)p_164_3_.func_1094_d());
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            Tessellator tessellator = Tessellator.field_1512_a;
            int k = 255 - j << 16 | j << 8;
            int l = (255 - j) / 4 << 16 | 0x3f00;
            func_162_a(tessellator, p_164_4_ + 2, p_164_5_ + 13, 13, 2, 0);
            func_162_a(tessellator, p_164_4_ + 2, p_164_5_ + 13, 12, 1, l);
            func_162_a(tessellator, p_164_4_ + 2, p_164_5_ + 13, i, 1, k);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    private void func_162_a(Tessellator p_162_1_, int p_162_2_, int p_162_3_, int p_162_4_, int p_162_5_, int p_162_6_)
    {
        p_162_1_.func_977_b();
        p_162_1_.func_990_b(p_162_6_);
        p_162_1_.func_991_a(p_162_2_ + 0, p_162_3_ + 0, 0.0D);
        p_162_1_.func_991_a(p_162_2_ + 0, p_162_3_ + p_162_5_, 0.0D);
        p_162_1_.func_991_a(p_162_2_ + p_162_4_, p_162_3_ + p_162_5_, 0.0D);
        p_162_1_.func_991_a(p_162_2_ + p_162_4_, p_162_3_ + 0, 0.0D);
        p_162_1_.func_982_a();
    }

    public void func_163_a(int p_163_1_, int p_163_2_, int p_163_3_, int p_163_4_, int p_163_5_, int p_163_6_)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(p_163_1_ + 0, p_163_2_ + p_163_6_, field_40268_b, (float)(p_163_3_ + 0) * f, (float)(p_163_4_ + p_163_6_) * f1);
        tessellator.func_983_a(p_163_1_ + p_163_5_, p_163_2_ + p_163_6_, field_40268_b, (float)(p_163_3_ + p_163_5_) * f, (float)(p_163_4_ + p_163_6_) * f1);
        tessellator.func_983_a(p_163_1_ + p_163_5_, p_163_2_ + 0, field_40268_b, (float)(p_163_3_ + p_163_5_) * f, (float)(p_163_4_ + 0) * f1);
        tessellator.func_983_a(p_163_1_ + 0, p_163_2_ + 0, field_40268_b, (float)(p_163_3_ + 0) * f, (float)(p_163_4_ + 0) * f1);
        tessellator.func_982_a();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_165_a((EntityItem)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
