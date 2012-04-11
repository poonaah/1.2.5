// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ItemRenderer, Reflector, ItemStack, Block, 
//            RenderBlocks, Config, RenderEngine, Tessellator, 
//            EntityLiving

public class ItemRendererHD extends ItemRenderer
{

    private Minecraft minecraft;

    public ItemRendererHD(Minecraft minecraft1)
    {
        super(minecraft1);
        minecraft = null;
        minecraft = minecraft1;
    }

    public void func_4132_a(EntityLiving entityliving, ItemStack itemstack, int i)
    {
        boolean flag = Reflector.hasClass(2);
        if(flag)
        {
            Object obj = Reflector.getFieldValue(60);
            Object obj1 = Reflector.call(20, new Object[] {
                itemstack, obj
            });
            if(obj1 != null)
            {
                super.func_4132_a(entityliving, itemstack, i);
                return;
            }
        }
        if(itemstack.field_1617_c < 256 && RenderBlocks.func_1219_a(Block.field_345_n[itemstack.field_1617_c].func_210_f()))
        {
            super.func_4132_a(entityliving, itemstack, i);
            return;
        }
        int j = Config.getIconWidthTerrain();
        if(j <= 16)
        {
            super.func_4132_a(entityliving, itemstack, i);
            return;
        }
        GL11.glPushMatrix();
        if(itemstack.field_1617_c < 256)
        {
            String s = "/terrain.png";
            if(flag)
            {
                s = Reflector.callString(12, new Object[] {
                    "/terrain.png", itemstack.func_1091_a()
                });
            }
            GL11.glBindTexture(3553, minecraft.field_6315_n.func_1070_a(s));
            j = Config.getIconWidthTerrain();
        } else
        {
            String s1 = "/gui/items.png";
            if(flag)
            {
                s1 = Reflector.callString(12, new Object[] {
                    "/gui/items.png", itemstack.func_1091_a()
                });
            }
            GL11.glBindTexture(3553, minecraft.field_6315_n.func_1070_a(s1));
            j = Config.getIconWidthItems();
        }
        Tessellator tessellator = Tessellator.field_1512_a;
        int k = entityliving.func_28021_c(itemstack, i);
        float f = ((float)((k % 16) * 16) + 0.0F) / 256F;
        float f1 = ((float)((k % 16) * 16) + 15.99F) / 256F;
        float f2 = ((float)((k / 16) * 16) + 0.0F) / 256F;
        float f3 = ((float)((k / 16) * 16) + 15.99F) / 256F;
        float f4 = 0.0F;
        float f5 = 0.3F;
        GL11.glEnable(32826);
        GL11.glTranslatef(-f4, -f5, 0.0F);
        float f6 = 1.5F;
        GL11.glScalef(f6, f6, f6);
        GL11.glRotatef(50F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(335F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
        renderItem3D(tessellator, f1, f2, f, f3, j);
        if(itemstack != null && itemstack.func_40713_r() && i == 0)
        {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            minecraft.field_6315_n.func_1076_b(minecraft.field_6315_n.func_1070_a("%blur%/misc/glint.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            float f7 = 0.76F;
            GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float f8 = 0.125F;
            GL11.glScalef(f8, f8, f8);
            float f9 = ((float)(System.currentTimeMillis() % 3000L) / 3000F) * 8F;
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50F, 0.0F, 0.0F, 1.0F);
            renderItem3D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, j);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            f9 = ((float)(System.currentTimeMillis() % 4873L) / 4873F) * 8F;
            GL11.glTranslatef(-f9, 0.0F, 0.0F);
            GL11.glRotatef(10F, 0.0F, 0.0F, 1.0F);
            renderItem3D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, j);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    private void renderItem3D(Tessellator tessellator, float f, float f1, float f2, float f3, int i)
    {
        float f4 = 1.0F;
        float f5 = 0.0625F;
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 0.0F, 1.0F);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, f, f3);
        tessellator.func_983_a(f4, 0.0D, 0.0D, f2, f3);
        tessellator.func_983_a(f4, 1.0D, 0.0D, f2, f1);
        tessellator.func_983_a(0.0D, 1.0D, 0.0D, f, f1);
        tessellator.func_982_a();
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 0.0F, -1F);
        tessellator.func_983_a(0.0D, 1.0D, 0.0F - f5, f, f1);
        tessellator.func_983_a(f4, 1.0D, 0.0F - f5, f2, f1);
        tessellator.func_983_a(f4, 0.0D, 0.0F - f5, f2, f3);
        tessellator.func_983_a(0.0D, 0.0D, 0.0F - f5, f, f3);
        tessellator.func_982_a();
        float f6 = 1.0F / (float)(32 * i);
        float f7 = 1.0F / (float)i;
        tessellator.func_977_b();
        tessellator.func_980_b(-1F, 0.0F, 0.0F);
        for(int j = 0; j < i; j++)
        {
            float f8 = (float)j / ((float)i * 1.0F);
            float f12 = (f + (f2 - f) * f8) - f6;
            float f16 = f4 * f8;
            tessellator.func_983_a(f16, 0.0D, 0.0F - f5, f12, f3);
            tessellator.func_983_a(f16, 0.0D, 0.0D, f12, f3);
            tessellator.func_983_a(f16, 1.0D, 0.0D, f12, f1);
            tessellator.func_983_a(f16, 1.0D, 0.0F - f5, f12, f1);
        }

        tessellator.func_982_a();
        tessellator.func_977_b();
        tessellator.func_980_b(1.0F, 0.0F, 0.0F);
        for(int k = 0; k < i; k++)
        {
            float f9 = (float)k / ((float)i * 1.0F);
            float f13 = (f + (f2 - f) * f9) - f6;
            float f17 = f4 * f9 + f7;
            tessellator.func_983_a(f17, 1.0D, 0.0F - f5, f13, f1);
            tessellator.func_983_a(f17, 1.0D, 0.0D, f13, f1);
            tessellator.func_983_a(f17, 0.0D, 0.0D, f13, f3);
            tessellator.func_983_a(f17, 0.0D, 0.0F - f5, f13, f3);
        }

        tessellator.func_982_a();
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        for(int l = 0; l < i; l++)
        {
            float f10 = (float)l / ((float)i * 1.0F);
            float f14 = (f3 + (f1 - f3) * f10) - f6;
            float f18 = f4 * f10 + f7;
            tessellator.func_983_a(0.0D, f18, 0.0D, f, f14);
            tessellator.func_983_a(f4, f18, 0.0D, f2, f14);
            tessellator.func_983_a(f4, f18, 0.0F - f5, f2, f14);
            tessellator.func_983_a(0.0D, f18, 0.0F - f5, f, f14);
        }

        tessellator.func_982_a();
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, -1F, 0.0F);
        for(int i1 = 0; i1 < i; i1++)
        {
            float f11 = (float)i1 / ((float)i * 1.0F);
            float f15 = (f3 + (f1 - f3) * f11) - f6;
            float f19 = f4 * f11;
            tessellator.func_983_a(f4, f19, 0.0D, f2, f15);
            tessellator.func_983_a(0.0D, f19, 0.0D, f, f15);
            tessellator.func_983_a(0.0D, f19, 0.0F - f5, f, f15);
            tessellator.func_983_a(f4, f19, 0.0F - f5, f2, f15);
        }

        tessellator.func_982_a();
    }
}
