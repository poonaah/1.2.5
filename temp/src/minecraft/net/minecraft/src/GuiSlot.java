// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiButton, Tessellator, RenderEngine

public abstract class GuiSlot
{

    private final Minecraft field_22264_a;
    private final int field_22263_b;
    private final int field_22262_c;
    protected final int field_22261_d;
    protected final int field_22260_e;
    private final int field_22259_f;
    private final int field_22258_g = 0;
    protected final int field_22257_h;
    private int field_22256_i;
    private int field_22255_j;
    protected int field_35409_k;
    protected int field_35408_l;
    private float field_22254_k;
    private float field_22253_l;
    private float field_22252_m;
    private int field_22251_n;
    private long field_22250_o;
    private boolean field_25123_p;
    private boolean field_27262_q;
    private int field_27261_r;

    public GuiSlot(Minecraft p_i371_1_, int p_i371_2_, int p_i371_3_, int p_i371_4_, int p_i371_5_, int p_i371_6_)
    {
        field_22254_k = -2F;
        field_22251_n = -1;
        field_22250_o = 0L;
        field_25123_p = true;
        field_22264_a = p_i371_1_;
        field_22263_b = p_i371_2_;
        field_22262_c = p_i371_3_;
        field_22261_d = p_i371_4_;
        field_22260_e = p_i371_5_;
        field_22257_h = p_i371_6_;
        field_22259_f = p_i371_2_;
    }

    public void func_27258_a(boolean p_27258_1_)
    {
        field_25123_p = p_27258_1_;
    }

    protected void func_27259_a(boolean p_27259_1_, int p_27259_2_)
    {
        field_27262_q = p_27259_1_;
        field_27261_r = p_27259_2_;
        if(!p_27259_1_)
        {
            field_27261_r = 0;
        }
    }

    protected abstract int func_22249_a();

    protected abstract void func_22247_a(int i, boolean flag);

    protected abstract boolean func_22246_a(int i);

    protected int func_22245_b()
    {
        return func_22249_a() * field_22257_h + field_27261_r;
    }

    protected abstract void func_22248_c();

    protected abstract void func_22242_a(int i, int j, int k, int l, Tessellator tessellator);

    protected void func_27260_a(int i, int j, Tessellator tessellator)
    {
    }

    protected void func_27255_a(int i, int j)
    {
    }

    protected void func_27257_b(int i, int j)
    {
    }

    public int func_27256_c(int p_27256_1_, int p_27256_2_)
    {
        int i = field_22263_b / 2 - 110;
        int j = field_22263_b / 2 + 110;
        int k = ((p_27256_2_ - field_22261_d - field_27261_r) + (int)field_22252_m) - 4;
        int l = k / field_22257_h;
        if(p_27256_1_ >= i && p_27256_1_ <= j && l >= 0 && k >= 0 && l < func_22249_a())
        {
            return l;
        } else
        {
            return -1;
        }
    }

    public void func_22240_a(List p_22240_1_, int p_22240_2_, int p_22240_3_)
    {
        field_22256_i = p_22240_2_;
        field_22255_j = p_22240_3_;
    }

    private void func_22244_d()
    {
        int i = func_22245_b() - (field_22260_e - field_22261_d - 4);
        if(i < 0)
        {
            i /= 2;
        }
        if(field_22252_m < 0.0F)
        {
            field_22252_m = 0.0F;
        }
        if(field_22252_m > (float)i)
        {
            field_22252_m = i;
        }
    }

    public void func_22241_a(GuiButton p_22241_1_)
    {
        if(!p_22241_1_.field_937_g)
        {
            return;
        }
        if(p_22241_1_.field_938_f == field_22256_i)
        {
            field_22252_m -= (field_22257_h * 2) / 3;
            field_22254_k = -2F;
            func_22244_d();
        } else
        if(p_22241_1_.field_938_f == field_22255_j)
        {
            field_22252_m += (field_22257_h * 2) / 3;
            field_22254_k = -2F;
            func_22244_d();
        }
    }

    public void func_22243_a(int p_22243_1_, int p_22243_2_, float p_22243_3_)
    {
        field_35409_k = p_22243_1_;
        field_35408_l = p_22243_2_;
        func_22248_c();
        int i = func_22249_a();
        int j = field_22263_b / 2 + 124;
        int k = j + 6;
        if(Mouse.isButtonDown(0))
        {
            if(field_22254_k == -1F)
            {
                boolean flag = true;
                if(p_22243_2_ >= field_22261_d && p_22243_2_ <= field_22260_e)
                {
                    int i1 = field_22263_b / 2 - 110;
                    int j1 = field_22263_b / 2 + 110;
                    int l1 = ((p_22243_2_ - field_22261_d - field_27261_r) + (int)field_22252_m) - 4;
                    int j2 = l1 / field_22257_h;
                    if(p_22243_1_ >= i1 && p_22243_1_ <= j1 && j2 >= 0 && l1 >= 0 && j2 < i)
                    {
                        boolean flag1 = j2 == field_22251_n && System.currentTimeMillis() - field_22250_o < 250L;
                        func_22247_a(j2, flag1);
                        field_22251_n = j2;
                        field_22250_o = System.currentTimeMillis();
                    } else
                    if(p_22243_1_ >= i1 && p_22243_1_ <= j1 && l1 < 0)
                    {
                        func_27255_a(p_22243_1_ - i1, ((p_22243_2_ - field_22261_d) + (int)field_22252_m) - 4);
                        flag = false;
                    }
                    if(p_22243_1_ >= j && p_22243_1_ <= k)
                    {
                        field_22253_l = -1F;
                        int l2 = func_22245_b() - (field_22260_e - field_22261_d - 4);
                        if(l2 < 1)
                        {
                            l2 = 1;
                        }
                        int k3 = (int)((float)((field_22260_e - field_22261_d) * (field_22260_e - field_22261_d)) / (float)func_22245_b());
                        if(k3 < 32)
                        {
                            k3 = 32;
                        }
                        if(k3 > field_22260_e - field_22261_d - 8)
                        {
                            k3 = field_22260_e - field_22261_d - 8;
                        }
                        field_22253_l /= (float)(field_22260_e - field_22261_d - k3) / (float)l2;
                    } else
                    {
                        field_22253_l = 1.0F;
                    }
                    if(flag)
                    {
                        field_22254_k = p_22243_2_;
                    } else
                    {
                        field_22254_k = -2F;
                    }
                } else
                {
                    field_22254_k = -2F;
                }
            } else
            if(field_22254_k >= 0.0F)
            {
                field_22252_m -= ((float)p_22243_2_ - field_22254_k) * field_22253_l;
                field_22254_k = p_22243_2_;
            }
        } else
        {
            do
            {
                if(!Mouse.next())
                {
                    break;
                }
                int l = Mouse.getEventDWheel();
                if(l != 0)
                {
                    if(l > 0)
                    {
                        l = -1;
                    } else
                    if(l < 0)
                    {
                        l = 1;
                    }
                    field_22252_m += (l * field_22257_h) / 2;
                }
            } while(true);
            field_22254_k = -1F;
        }
        func_22244_d();
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_22264_a.field_6315_n.func_1070_a("/gui/background.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f = 32F;
        tessellator.func_977_b();
        tessellator.func_990_b(0x202020);
        tessellator.func_983_a(field_22258_g, field_22260_e, 0.0D, (float)field_22258_g / f, (float)(field_22260_e + (int)field_22252_m) / f);
        tessellator.func_983_a(field_22259_f, field_22260_e, 0.0D, (float)field_22259_f / f, (float)(field_22260_e + (int)field_22252_m) / f);
        tessellator.func_983_a(field_22259_f, field_22261_d, 0.0D, (float)field_22259_f / f, (float)(field_22261_d + (int)field_22252_m) / f);
        tessellator.func_983_a(field_22258_g, field_22261_d, 0.0D, (float)field_22258_g / f, (float)(field_22261_d + (int)field_22252_m) / f);
        tessellator.func_982_a();
        int k1 = field_22263_b / 2 - 92 - 16;
        int i2 = (field_22261_d + 4) - (int)field_22252_m;
        if(field_27262_q)
        {
            func_27260_a(k1, i2, tessellator);
        }
        for(int k2 = 0; k2 < i; k2++)
        {
            int i3 = i2 + k2 * field_22257_h + field_27261_r;
            int l3 = field_22257_h - 4;
            if(i3 > field_22260_e || i3 + l3 < field_22261_d)
            {
                continue;
            }
            if(field_25123_p && func_22246_a(k2))
            {
                int j4 = field_22263_b / 2 - 110;
                int l4 = field_22263_b / 2 + 110;
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glDisable(3553);
                tessellator.func_977_b();
                tessellator.func_990_b(0x808080);
                tessellator.func_983_a(j4, i3 + l3 + 2, 0.0D, 0.0D, 1.0D);
                tessellator.func_983_a(l4, i3 + l3 + 2, 0.0D, 1.0D, 1.0D);
                tessellator.func_983_a(l4, i3 - 2, 0.0D, 1.0D, 0.0D);
                tessellator.func_983_a(j4, i3 - 2, 0.0D, 0.0D, 0.0D);
                tessellator.func_990_b(0);
                tessellator.func_983_a(j4 + 1, i3 + l3 + 1, 0.0D, 0.0D, 1.0D);
                tessellator.func_983_a(l4 - 1, i3 + l3 + 1, 0.0D, 1.0D, 1.0D);
                tessellator.func_983_a(l4 - 1, i3 - 1, 0.0D, 1.0D, 0.0D);
                tessellator.func_983_a(j4 + 1, i3 - 1, 0.0D, 0.0D, 0.0D);
                tessellator.func_982_a();
                GL11.glEnable(3553);
            }
            func_22242_a(k2, k1, i3, l3, tessellator);
        }

        GL11.glDisable(2929);
        byte byte0 = 4;
        func_22239_a(0, field_22261_d, 255, 255);
        func_22239_a(field_22260_e, field_22262_c, 255, 255);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glShadeModel(7425);
        GL11.glDisable(3553);
        tessellator.func_977_b();
        tessellator.func_6513_a(0, 0);
        tessellator.func_983_a(field_22258_g, field_22261_d + byte0, 0.0D, 0.0D, 1.0D);
        tessellator.func_983_a(field_22259_f, field_22261_d + byte0, 0.0D, 1.0D, 1.0D);
        tessellator.func_6513_a(0, 255);
        tessellator.func_983_a(field_22259_f, field_22261_d, 0.0D, 1.0D, 0.0D);
        tessellator.func_983_a(field_22258_g, field_22261_d, 0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        tessellator.func_977_b();
        tessellator.func_6513_a(0, 255);
        tessellator.func_983_a(field_22258_g, field_22260_e, 0.0D, 0.0D, 1.0D);
        tessellator.func_983_a(field_22259_f, field_22260_e, 0.0D, 1.0D, 1.0D);
        tessellator.func_6513_a(0, 0);
        tessellator.func_983_a(field_22259_f, field_22260_e - byte0, 0.0D, 1.0D, 0.0D);
        tessellator.func_983_a(field_22258_g, field_22260_e - byte0, 0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        int j3 = func_22245_b() - (field_22260_e - field_22261_d - 4);
        if(j3 > 0)
        {
            int i4 = ((field_22260_e - field_22261_d) * (field_22260_e - field_22261_d)) / func_22245_b();
            if(i4 < 32)
            {
                i4 = 32;
            }
            if(i4 > field_22260_e - field_22261_d - 8)
            {
                i4 = field_22260_e - field_22261_d - 8;
            }
            int k4 = ((int)field_22252_m * (field_22260_e - field_22261_d - i4)) / j3 + field_22261_d;
            if(k4 < field_22261_d)
            {
                k4 = field_22261_d;
            }
            tessellator.func_977_b();
            tessellator.func_6513_a(0, 255);
            tessellator.func_983_a(j, field_22260_e, 0.0D, 0.0D, 1.0D);
            tessellator.func_983_a(k, field_22260_e, 0.0D, 1.0D, 1.0D);
            tessellator.func_983_a(k, field_22261_d, 0.0D, 1.0D, 0.0D);
            tessellator.func_983_a(j, field_22261_d, 0.0D, 0.0D, 0.0D);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_6513_a(0x808080, 255);
            tessellator.func_983_a(j, k4 + i4, 0.0D, 0.0D, 1.0D);
            tessellator.func_983_a(k, k4 + i4, 0.0D, 1.0D, 1.0D);
            tessellator.func_983_a(k, k4, 0.0D, 1.0D, 0.0D);
            tessellator.func_983_a(j, k4, 0.0D, 0.0D, 0.0D);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_6513_a(0xc0c0c0, 255);
            tessellator.func_983_a(j, (k4 + i4) - 1, 0.0D, 0.0D, 1.0D);
            tessellator.func_983_a(k - 1, (k4 + i4) - 1, 0.0D, 1.0D, 1.0D);
            tessellator.func_983_a(k - 1, k4, 0.0D, 1.0D, 0.0D);
            tessellator.func_983_a(j, k4, 0.0D, 0.0D, 0.0D);
            tessellator.func_982_a();
        }
        func_27257_b(p_22243_1_, p_22243_2_);
        GL11.glEnable(3553);
        GL11.glShadeModel(7424);
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    private void func_22239_a(int p_22239_1_, int p_22239_2_, int p_22239_3_, int p_22239_4_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_22264_a.field_6315_n.func_1070_a("/gui/background.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f = 32F;
        tessellator.func_977_b();
        tessellator.func_6513_a(0x404040, p_22239_4_);
        tessellator.func_983_a(0.0D, p_22239_2_, 0.0D, 0.0D, (float)p_22239_2_ / f);
        tessellator.func_983_a(field_22263_b, p_22239_2_, 0.0D, (float)field_22263_b / f, (float)p_22239_2_ / f);
        tessellator.func_6513_a(0x404040, p_22239_3_);
        tessellator.func_983_a(field_22263_b, p_22239_1_, 0.0D, (float)field_22263_b / f, (float)p_22239_1_ / f);
        tessellator.func_983_a(0.0D, p_22239_1_, 0.0D, 0.0D, (float)p_22239_1_ / f);
        tessellator.func_982_a();
    }
}
