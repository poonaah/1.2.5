// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, EntityPlayer, AchievementList, PlayerController, 
//            GuiContainerCreative, EntityPlayerSP, StatCollector, FontRenderer, 
//            RenderEngine, RenderHelper, RenderManager, GuiButton, 
//            GuiAchievements, GuiStats, PotionEffect, Potion

public class GuiInventory extends GuiContainer
{

    private float field_976_l;
    private float field_975_m;

    public GuiInventory(EntityPlayer p_i144_1_)
    {
        super(p_i144_1_.field_20069_g);
        field_948_f = true;
        p_i144_1_.func_25058_a(AchievementList.field_25195_b, 1);
    }

    public void func_570_g()
    {
        if(field_945_b.field_6327_b.func_35640_h())
        {
            field_945_b.func_6272_a(new GuiContainerCreative(field_945_b.field_6322_g));
        }
    }

    public void func_6448_a()
    {
        field_949_e.clear();
        if(field_945_b.field_6327_b.func_35640_h())
        {
            field_945_b.func_6272_a(new GuiContainerCreative(field_945_b.field_6322_g));
        } else
        {
            super.func_6448_a();
            if(!field_945_b.field_6322_g.func_40118_aO().isEmpty())
            {
                field_40216_e = 160 + (field_951_c - field_971_a - 200) / 2;
            }
        }
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.crafting"), 86, 16, 0x404040);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        field_976_l = p_571_1_;
        field_975_m = p_571_2_;
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/inventory.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        int j = field_40216_e;
        int k = field_40215_f;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
        func_40218_g();
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef(j + 51, k + 75, 50F);
        float f = 30F;
        GL11.glScalef(-f, f, f);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        float f1 = field_945_b.field_6322_g.field_735_n;
        float f2 = field_945_b.field_6322_g.field_605_aq;
        float f3 = field_945_b.field_6322_g.field_604_ar;
        float f4 = (float)(j + 51) - field_976_l;
        float f5 = (float)((k + 75) - 50) - field_975_m;
        GL11.glRotatef(135F, 0.0F, 1.0F, 0.0F);
        RenderHelper.func_1158_b();
        GL11.glRotatef(-135F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-(float)Math.atan(f5 / 40F) * 20F, 1.0F, 0.0F, 0.0F);
        field_945_b.field_6322_g.field_735_n = (float)Math.atan(f4 / 40F) * 20F;
        field_945_b.field_6322_g.field_605_aq = (float)Math.atan(f4 / 40F) * 40F;
        field_945_b.field_6322_g.field_604_ar = -(float)Math.atan(f5 / 40F) * 20F;
        field_945_b.field_6322_g.field_46015_bf = field_945_b.field_6322_g.field_605_aq;
        GL11.glTranslatef(0.0F, field_945_b.field_6322_g.field_9292_aO, 0.0F);
        RenderManager.field_1233_a.field_1225_i = 180F;
        RenderManager.field_1233_a.func_853_a(field_945_b.field_6322_g, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        field_945_b.field_6322_g.field_735_n = f1;
        field_945_b.field_6322_g.field_605_aq = f2;
        field_945_b.field_6322_g.field_604_ar = f3;
        GL11.glPopMatrix();
        RenderHelper.func_1159_a();
        GL11.glDisable(32826);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiAchievements(field_945_b.field_25001_G));
        }
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6272_a(new GuiStats(this, field_945_b.field_25001_G));
        }
    }

    private void func_40218_g()
    {
        int i = field_40216_e - 124;
        int j = field_40215_f;
        int k = field_945_b.field_6315_n.func_1070_a("/gui/inventory.png");
        Collection collection = field_945_b.field_6322_g.func_40118_aO();
        if(collection.isEmpty())
        {
            return;
        }
        int l = 33;
        if(collection.size() > 5)
        {
            l = 132 / (collection.size() - 1);
        }
        for(Iterator iterator = field_945_b.field_6322_g.func_40118_aO().iterator(); iterator.hasNext();)
        {
            PotionEffect potioneffect = (PotionEffect)iterator.next();
            Potion potion = Potion.field_35678_a[potioneffect.func_35799_a()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            field_945_b.field_6315_n.func_1076_b(k);
            func_550_b(i, j, 0, field_974_h, 140, 32);
            if(potion.func_40617_d())
            {
                int i1 = potion.func_40611_e();
                func_550_b(i + 6, j + 7, 0 + (i1 % 8) * 18, field_974_h + 32 + (i1 / 8) * 18, 18, 18);
            }
            String s = StatCollector.func_25200_a(potion.func_40623_c());
            if(potioneffect.func_35801_c() == 1)
            {
                s = (new StringBuilder()).append(s).append(" II").toString();
            } else
            if(potioneffect.func_35801_c() == 2)
            {
                s = (new StringBuilder()).append(s).append(" III").toString();
            } else
            if(potioneffect.func_35801_c() == 3)
            {
                s = (new StringBuilder()).append(s).append(" IV").toString();
            }
            field_6451_g.func_50103_a(s, i + 10 + 18, j + 6, 0xffffff);
            String s1 = Potion.func_40620_a(potioneffect);
            field_6451_g.func_50103_a(s1, i + 10 + 18, j + 6 + 10, 0x7f7f7f);
            j += l;
        }

    }
}
