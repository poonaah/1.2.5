// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, EntityPlayerSP, RenderHelper, OpenGlHelper, 
//            Container, Slot, InventoryPlayer, RenderItem, 
//            ItemStack, FontRenderer, EnumRarity, RenderEngine, 
//            PlayerController, GameSettings, KeyBinding

public abstract class GuiContainer extends GuiScreen
{

    protected static RenderItem field_972_j = new RenderItem();
    protected int field_971_a;
    protected int field_974_h;
    public Container field_973_i;
    protected int field_40216_e;
    protected int field_40215_f;

    public GuiContainer(Container p_i335_1_)
    {
        field_971_a = 176;
        field_974_h = 166;
        field_973_i = p_i335_1_;
    }

    public void func_6448_a()
    {
        super.func_6448_a();
        field_945_b.field_6322_g.field_20068_h = field_973_i;
        field_40216_e = (field_951_c - field_971_a) / 2;
        field_40215_f = (field_950_d - field_974_h) / 2;
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        int i = field_40216_e;
        int j = field_40215_f;
        func_589_a(p_571_3_, p_571_1_, p_571_2_);
        RenderHelper.func_41089_c();
        GL11.glPushMatrix();
        GL11.glTranslatef(i, j, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(32826);
        Slot slot = null;
        int k = 240;
        int i1 = 240;
        OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)k / 1.0F, (float)i1 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        for(int l = 0; l < field_973_i.field_20122_e.size(); l++)
        {
            Slot slot1 = (Slot)field_973_i.field_20122_e.get(l);
            func_590_a(slot1);
            if(func_20081_a(slot1, p_571_1_, p_571_2_))
            {
                slot = slot1;
                GL11.glDisable(2896);
                GL11.glDisable(2929);
                int j1 = slot1.field_20006_b;
                int k1 = slot1.field_20008_c;
                func_549_a(j1, k1, j1 + 16, k1 + 16, 0x80ffffff, 0x80ffffff);
                GL11.glEnable(2896);
                GL11.glEnable(2929);
            }
        }

        func_587_j();
        InventoryPlayer inventoryplayer = field_945_b.field_6322_g.field_778_b;
        if(inventoryplayer.func_20075_i() != null)
        {
            GL11.glTranslatef(0.0F, 0.0F, 32F);
            field_923_k = 200F;
            field_972_j.field_40268_b = 200F;
            field_972_j.func_161_a(field_6451_g, field_945_b.field_6315_n, inventoryplayer.func_20075_i(), p_571_1_ - i - 8, p_571_2_ - j - 8);
            field_972_j.func_164_b(field_6451_g, field_945_b.field_6315_n, inventoryplayer.func_20075_i(), p_571_1_ - i - 8, p_571_2_ - j - 8);
            field_923_k = 0.0F;
            field_972_j.field_40268_b = 0.0F;
        }
        GL11.glDisable(32826);
        RenderHelper.func_1159_a();
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        if(inventoryplayer.func_20075_i() == null && slot != null && slot.func_20005_c())
        {
            ItemStack itemstack = slot.func_777_b();
            List list = itemstack.func_40712_q();
            if(list.size() > 0)
            {
                int l1 = 0;
                for(int i2 = 0; i2 < list.size(); i2++)
                {
                    int k2 = field_6451_g.func_871_a((String)list.get(i2));
                    if(k2 > l1)
                    {
                        l1 = k2;
                    }
                }

                int j2 = (p_571_1_ - i) + 12;
                int l2 = p_571_2_ - j - 12;
                int i3 = l1;
                int j3 = 8;
                if(list.size() > 1)
                {
                    j3 += 2 + (list.size() - 1) * 10;
                }
                field_923_k = 300F;
                field_972_j.field_40268_b = 300F;
                int k3 = 0xf0100010;
                func_549_a(j2 - 3, l2 - 4, j2 + i3 + 3, l2 - 3, k3, k3);
                func_549_a(j2 - 3, l2 + j3 + 3, j2 + i3 + 3, l2 + j3 + 4, k3, k3);
                func_549_a(j2 - 3, l2 - 3, j2 + i3 + 3, l2 + j3 + 3, k3, k3);
                func_549_a(j2 - 4, l2 - 3, j2 - 3, l2 + j3 + 3, k3, k3);
                func_549_a(j2 + i3 + 3, l2 - 3, j2 + i3 + 4, l2 + j3 + 3, k3, k3);
                int l3 = 0x505000ff;
                int i4 = (l3 & 0xfefefe) >> 1 | l3 & 0xff000000;
                func_549_a(j2 - 3, (l2 - 3) + 1, (j2 - 3) + 1, (l2 + j3 + 3) - 1, l3, i4);
                func_549_a(j2 + i3 + 2, (l2 - 3) + 1, j2 + i3 + 3, (l2 + j3 + 3) - 1, l3, i4);
                func_549_a(j2 - 3, l2 - 3, j2 + i3 + 3, (l2 - 3) + 1, l3, l3);
                func_549_a(j2 - 3, l2 + j3 + 2, j2 + i3 + 3, l2 + j3 + 3, i4, i4);
                for(int j4 = 0; j4 < list.size(); j4++)
                {
                    String s = (String)list.get(j4);
                    if(j4 == 0)
                    {
                        s = (new StringBuilder()).append("\247").append(Integer.toHexString(itemstack.func_40707_s().field_40535_e)).append(s).toString();
                    } else
                    {
                        s = (new StringBuilder()).append("\2477").append(s).toString();
                    }
                    field_6451_g.func_50103_a(s, j2, l2, -1);
                    if(j4 == 0)
                    {
                        l2 += 2;
                    }
                    l2 += 10;
                }

                field_923_k = 0.0F;
                field_972_j.field_40268_b = 0.0F;
            }
        }
        GL11.glPopMatrix();
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
    }

    protected void func_587_j()
    {
    }

    protected abstract void func_589_a(float f, int i, int j);

    private void func_590_a(Slot p_590_1_)
    {
        int i = p_590_1_.field_20006_b;
        int j = p_590_1_.field_20008_c;
        ItemStack itemstack = p_590_1_.func_777_b();
        boolean flag = false;
        int k = i;
        int l = j;
        field_923_k = 100F;
        field_972_j.field_40268_b = 100F;
        if(itemstack == null)
        {
            int i1 = p_590_1_.func_775_c();
            if(i1 >= 0)
            {
                GL11.glDisable(2896);
                field_945_b.field_6315_n.func_1076_b(field_945_b.field_6315_n.func_1070_a("/gui/items.png"));
                func_550_b(k, l, (i1 % 16) * 16, (i1 / 16) * 16, 16, 16);
                GL11.glEnable(2896);
                flag = true;
            }
        }
        if(!flag)
        {
            field_972_j.func_161_a(field_6451_g, field_945_b.field_6315_n, itemstack, k, l);
            field_972_j.func_164_b(field_6451_g, field_945_b.field_6315_n, itemstack, k, l);
        }
        field_972_j.field_40268_b = 0.0F;
        field_923_k = 0.0F;
    }

    private Slot func_588_a(int p_588_1_, int p_588_2_)
    {
        for(int i = 0; i < field_973_i.field_20122_e.size(); i++)
        {
            Slot slot = (Slot)field_973_i.field_20122_e.get(i);
            if(func_20081_a(slot, p_588_1_, p_588_2_))
            {
                return slot;
            }
        }

        return null;
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        if(p_565_3_ == 0 || p_565_3_ == 1)
        {
            Slot slot = func_588_a(p_565_1_, p_565_2_);
            int i = field_40216_e;
            int j = field_40215_f;
            boolean flag = p_565_1_ < i || p_565_2_ < j || p_565_1_ >= i + field_971_a || p_565_2_ >= j + field_974_h;
            int k = -1;
            if(slot != null)
            {
                k = slot.field_20007_a;
            }
            if(flag)
            {
                k = -999;
            }
            if(k != -1)
            {
                boolean flag1 = k != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                func_35309_a(slot, k, p_565_3_, flag1);
            }
        }
    }

    private boolean func_20081_a(Slot p_20081_1_, int p_20081_2_, int p_20081_3_)
    {
        int i = field_40216_e;
        int j = field_40215_f;
        p_20081_2_ -= i;
        p_20081_3_ -= j;
        return p_20081_2_ >= p_20081_1_.field_20006_b - 1 && p_20081_2_ < p_20081_1_.field_20006_b + 16 + 1 && p_20081_3_ >= p_20081_1_.field_20008_c - 1 && p_20081_3_ < p_20081_1_.field_20008_c + 16 + 1;
    }

    protected void func_35309_a(Slot p_35309_1_, int p_35309_2_, int p_35309_3_, boolean p_35309_4_)
    {
        if(p_35309_1_ != null)
        {
            p_35309_2_ = p_35309_1_.field_20007_a;
        }
        field_945_b.field_6327_b.func_27174_a(field_973_i.field_1618_c, p_35309_2_, p_35309_3_, p_35309_4_, field_945_b.field_6322_g);
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_2_ == 1 || p_580_2_ == field_945_b.field_6304_y.field_1570_o.field_1370_b)
        {
            field_945_b.field_6322_g.func_20059_m();
        }
    }

    public void func_6449_h()
    {
        if(field_945_b.field_6322_g == null)
        {
            return;
        } else
        {
            field_973_i.func_1104_a(field_945_b.field_6322_g);
            field_945_b.field_6327_b.func_20086_a(field_973_i.field_1618_c, field_945_b.field_6322_g);
            return;
        }
    }

    public boolean func_6450_b()
    {
        return false;
    }

    public void func_570_g()
    {
        super.func_570_g();
        if(!field_945_b.field_6322_g.func_354_B() || field_945_b.field_6322_g.field_646_aA)
        {
            field_945_b.field_6322_g.func_20059_m();
        }
    }

}
