// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerEnchantment, StatCollector, FontRenderer, 
//            PlayerController, RenderEngine, ScaledResolution, RenderHelper, 
//            MathHelper, ModelBook, EnchantmentNameParts, EntityPlayerSP, 
//            PlayerCapabilities, Container, Slot, ItemStack, 
//            InventoryPlayer, World

public class GuiEnchantment extends GuiContainer
{

    private static ModelBook field_40220_w = new ModelBook();
    private Random field_40230_x;
    private ContainerEnchantment field_40228_y;
    public int field_40227_h;
    public float field_40229_i;
    public float field_40225_j;
    public float field_40226_k;
    public float field_40223_l;
    public float field_40224_m;
    public float field_40221_n;
    ItemStack field_40222_o;

    public GuiEnchantment(InventoryPlayer p_i594_1_, World p_i594_2_, int p_i594_3_, int p_i594_4_, int p_i594_5_)
    {
        super(new ContainerEnchantment(p_i594_1_, p_i594_2_, p_i594_3_, p_i594_4_, p_i594_5_));
        field_40230_x = new Random();
        field_40228_y = (ContainerEnchantment)field_973_i;
    }

    public void func_6449_h()
    {
        super.func_6449_h();
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.enchant"), 12, 6, 0x404040);
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.inventory"), 8, (field_974_h - 96) + 2, 0x404040);
    }

    public void func_570_g()
    {
        super.func_570_g();
        func_40219_x_();
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        int i = (field_951_c - field_971_a) / 2;
        int j = (field_950_d - field_974_h) / 2;
        for(int k = 0; k < 3; k++)
        {
            int l = p_565_1_ - (i + 60);
            int i1 = p_565_2_ - (j + 14 + 19 * k);
            if(l >= 0 && i1 >= 0 && l < 108 && i1 < 19 && field_40228_y.func_40233_a(field_945_b.field_6322_g, k))
            {
                field_945_b.field_6327_b.func_40593_a(field_40228_y.field_1618_c, k);
            }
        }

    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/enchant.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
        GL11.glPushMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        ScaledResolution scaledresolution = new ScaledResolution(field_945_b.field_6304_y, field_945_b.field_6326_c, field_945_b.field_6325_d);
        GL11.glViewport(((scaledresolution.func_903_a() - 320) / 2) * scaledresolution.field_1368_a, ((scaledresolution.func_902_b() - 240) / 2) * scaledresolution.field_1368_a, 320 * scaledresolution.field_1368_a, 240 * scaledresolution.field_1368_a);
        GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
        GLU.gluPerspective(90F, 1.333333F, 9F, 80F);
        float f = 1.0F;
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        RenderHelper.func_1158_b();
        GL11.glTranslatef(0.0F, 3.3F, -16F);
        GL11.glScalef(f, f, f);
        float f1 = 5F;
        GL11.glScalef(f1, f1, f1);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(field_945_b.field_6315_n.func_1070_a("/item/book.png"));
        GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
        float f2 = field_40221_n + (field_40224_m - field_40221_n) * p_589_1_;
        GL11.glTranslatef((1.0F - f2) * 0.2F, (1.0F - f2) * 0.1F, (1.0F - f2) * 0.25F);
        GL11.glRotatef(-(1.0F - f2) * 90F - 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
        float f3 = field_40225_j + (field_40229_i - field_40225_j) * p_589_1_ + 0.25F;
        float f4 = field_40225_j + (field_40229_i - field_40225_j) * p_589_1_ + 0.75F;
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
        GL11.glEnable(32826);
        field_40220_w.func_864_b(null, 0.0F, f3, f4, f2, 0.0F, 0.0625F);
        GL11.glDisable(32826);
        RenderHelper.func_1159_a();
        GL11.glMatrixMode(5889);
        GL11.glViewport(0, 0, field_945_b.field_6326_c, field_945_b.field_6325_d);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        RenderHelper.func_1159_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        EnchantmentNameParts.field_40253_a.func_40250_a(field_40228_y.field_40234_b);
        for(int l = 0; l < 3; l++)
        {
            String s = EnchantmentNameParts.field_40253_a.func_40249_a();
            field_923_k = 0.0F;
            field_945_b.field_6315_n.func_1076_b(i);
            int i1 = field_40228_y.field_40235_c[l];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(i1 == 0)
            {
                func_550_b(j + 60, k + 14 + 19 * l, 0, 185, 108, 19);
                continue;
            }
            String s1 = (new StringBuilder()).append("").append(i1).toString();
            FontRenderer fontrenderer = field_945_b.field_40007_r;
            int j1 = 0x685e4a;
            if(field_945_b.field_6322_g.field_35210_aY < i1 && !field_945_b.field_6322_g.field_35212_aW.field_35756_d)
            {
                func_550_b(j + 60, k + 14 + 19 * l, 0, 185, 108, 19);
                fontrenderer.func_27278_a(s, j + 62, k + 16 + 19 * l, 104, (j1 & 0xfefefe) >> 1);
                fontrenderer = field_945_b.field_6314_o;
                j1 = 0x407f10;
                fontrenderer.func_50103_a(s1, (j + 62 + 104) - fontrenderer.func_871_a(s1), k + 16 + 19 * l + 7, j1);
                continue;
            }
            int k1 = p_589_2_ - (j + 60);
            int l1 = p_589_3_ - (k + 14 + 19 * l);
            if(k1 >= 0 && l1 >= 0 && k1 < 108 && l1 < 19)
            {
                func_550_b(j + 60, k + 14 + 19 * l, 0, 204, 108, 19);
                j1 = 0xffff80;
            } else
            {
                func_550_b(j + 60, k + 14 + 19 * l, 0, 166, 108, 19);
            }
            fontrenderer.func_27278_a(s, j + 62, k + 16 + 19 * l, 104, j1);
            fontrenderer = field_945_b.field_6314_o;
            j1 = 0x80ff20;
            fontrenderer.func_50103_a(s1, (j + 62 + 104) - fontrenderer.func_871_a(s1), k + 16 + 19 * l + 7, j1);
        }

    }

    public void func_40219_x_()
    {
        ItemStack itemstack = field_973_i.func_20118_a(0).func_777_b();
        if(!ItemStack.func_20107_a(itemstack, field_40222_o))
        {
            field_40222_o = itemstack;
            do
            {
                field_40226_k += field_40230_x.nextInt(4) - field_40230_x.nextInt(4);
            } while(field_40229_i <= field_40226_k + 1.0F && field_40229_i >= field_40226_k - 1.0F);
        }
        field_40227_h++;
        field_40225_j = field_40229_i;
        field_40221_n = field_40224_m;
        boolean flag = false;
        for(int i = 0; i < 3; i++)
        {
            if(field_40228_y.field_40235_c[i] != 0)
            {
                flag = true;
            }
        }

        if(flag)
        {
            field_40224_m += 0.2F;
        } else
        {
            field_40224_m -= 0.2F;
        }
        if(field_40224_m < 0.0F)
        {
            field_40224_m = 0.0F;
        }
        if(field_40224_m > 1.0F)
        {
            field_40224_m = 1.0F;
        }
        float f = (field_40226_k - field_40229_i) * 0.4F;
        float f1 = 0.2F;
        if(f < -f1)
        {
            f = -f1;
        }
        if(f > f1)
        {
            f = f1;
        }
        field_40223_l += (f - field_40223_l) * 0.9F;
        field_40229_i = field_40229_i + field_40223_l;
    }

}
