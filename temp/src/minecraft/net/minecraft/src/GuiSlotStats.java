// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;

// Referenced classes of package net.minecraft.src:
//            GuiSlot, GuiStats, SoundManager, StatCrafting, 
//            StatFileWriter, FontRenderer, StringTranslate, Item, 
//            Tessellator

abstract class GuiSlotStats extends GuiSlot
{

    protected int field_27268_b;
    protected List field_27273_c;
    protected Comparator field_27272_d;
    protected int field_27271_e;
    protected int field_27270_f;
    final GuiStats field_27269_g; /* synthetic field */

    protected GuiSlotStats(GuiStats p_i347_1_)
    {
        field_27269_g = p_i347_1_;
        super(GuiStats.func_27143_f(p_i347_1_), p_i347_1_.field_951_c, p_i347_1_.field_950_d, 32, p_i347_1_.field_950_d - 64, 20);
        field_27268_b = -1;
        field_27271_e = -1;
        field_27270_f = 0;
        func_27258_a(false);
        func_27259_a(true, 20);
    }

    protected void func_22247_a(int i, boolean flag)
    {
    }

    protected boolean func_22246_a(int p_22246_1_)
    {
        return false;
    }

    protected void func_22248_c()
    {
        field_27269_g.func_578_i();
    }

    protected void func_27260_a(int p_27260_1_, int p_27260_2_, Tessellator p_27260_3_)
    {
        if(!Mouse.isButtonDown(0))
        {
            field_27268_b = -1;
        }
        if(field_27268_b == 0)
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 115) - 18, p_27260_2_ + 1, 0, 0);
        } else
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 115) - 18, p_27260_2_ + 1, 0, 18);
        }
        if(field_27268_b == 1)
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 165) - 18, p_27260_2_ + 1, 0, 0);
        } else
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 165) - 18, p_27260_2_ + 1, 0, 18);
        }
        if(field_27268_b == 2)
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 215) - 18, p_27260_2_ + 1, 0, 0);
        } else
        {
            GuiStats.func_27128_a(field_27269_g, (p_27260_1_ + 215) - 18, p_27260_2_ + 1, 0, 18);
        }
        if(field_27271_e != -1)
        {
            char c = 'O';
            byte byte0 = 18;
            if(field_27271_e == 1)
            {
                c = '\201';
            } else
            if(field_27271_e == 2)
            {
                c = '\263';
            }
            if(field_27270_f == 1)
            {
                byte0 = 36;
            }
            GuiStats.func_27128_a(field_27269_g, p_27260_1_ + c, p_27260_2_ + 1, byte0, 0);
        }
    }

    protected void func_27255_a(int p_27255_1_, int p_27255_2_)
    {
        field_27268_b = -1;
        if(p_27255_1_ >= 79 && p_27255_1_ < 115)
        {
            field_27268_b = 0;
        } else
        if(p_27255_1_ >= 129 && p_27255_1_ < 165)
        {
            field_27268_b = 1;
        } else
        if(p_27255_1_ >= 179 && p_27255_1_ < 215)
        {
            field_27268_b = 2;
        }
        if(field_27268_b >= 0)
        {
            func_27266_c(field_27268_b);
            GuiStats.func_27149_g(field_27269_g).field_6301_A.func_337_a("random.click", 1.0F, 1.0F);
        }
    }

    protected final int func_22249_a()
    {
        return field_27273_c.size();
    }

    protected final StatCrafting func_27264_b(int p_27264_1_)
    {
        return (StatCrafting)field_27273_c.get(p_27264_1_);
    }

    protected abstract String func_27263_a(int i);

    protected void func_27265_a(StatCrafting p_27265_1_, int p_27265_2_, int p_27265_3_, boolean p_27265_4_)
    {
        if(p_27265_1_ != null)
        {
            String s = p_27265_1_.func_27084_a(GuiStats.func_27142_c(field_27269_g).func_27184_a(p_27265_1_));
            field_27269_g.func_547_b(GuiStats.func_27133_h(field_27269_g), s, p_27265_2_ - GuiStats.func_27137_i(field_27269_g).func_871_a(s), p_27265_3_ + 5, p_27265_4_ ? 0xffffff : 0x909090);
        } else
        {
            String s1 = "-";
            field_27269_g.func_547_b(GuiStats.func_27132_j(field_27269_g), s1, p_27265_2_ - GuiStats.func_27134_k(field_27269_g).func_871_a(s1), p_27265_3_ + 5, p_27265_4_ ? 0xffffff : 0x909090);
        }
    }

    protected void func_27257_b(int p_27257_1_, int p_27257_2_)
    {
        if(p_27257_2_ < field_22261_d || p_27257_2_ > field_22260_e)
        {
            return;
        }
        int i = func_27256_c(p_27257_1_, p_27257_2_);
        int j = field_27269_g.field_951_c / 2 - 92 - 16;
        if(i >= 0)
        {
            if(p_27257_1_ < j + 40 || p_27257_1_ > j + 40 + 20)
            {
                return;
            }
            StatCrafting statcrafting = func_27264_b(i);
            func_27267_a(statcrafting, p_27257_1_, p_27257_2_);
        } else
        {
            String s = "";
            if(p_27257_1_ >= (j + 115) - 18 && p_27257_1_ <= j + 115)
            {
                s = func_27263_a(0);
            } else
            if(p_27257_1_ >= (j + 165) - 18 && p_27257_1_ <= j + 165)
            {
                s = func_27263_a(1);
            } else
            if(p_27257_1_ >= (j + 215) - 18 && p_27257_1_ <= j + 215)
            {
                s = func_27263_a(2);
            } else
            {
                return;
            }
            s = (new StringBuilder()).append("").append(StringTranslate.func_20162_a().func_20163_a(s)).toString().trim();
            if(s.length() > 0)
            {
                int k = p_27257_1_ + 12;
                int l = p_27257_2_ - 12;
                int i1 = GuiStats.func_27139_l(field_27269_g).func_871_a(s);
                GuiStats.func_27129_a(field_27269_g, k - 3, l - 3, k + i1 + 3, l + 8 + 3, 0xc0000000, 0xc0000000);
                GuiStats.func_27144_m(field_27269_g).func_50103_a(s, k, l, -1);
            }
        }
    }

    protected void func_27267_a(StatCrafting p_27267_1_, int p_27267_2_, int p_27267_3_)
    {
        if(p_27267_1_ == null)
        {
            return;
        }
        Item item = Item.field_233_c[p_27267_1_.func_25072_b()];
        String s = (new StringBuilder()).append("").append(StringTranslate.func_20162_a().func_20161_b(item.func_20009_a())).toString().trim();
        if(s.length() > 0)
        {
            int i = p_27267_2_ + 12;
            int j = p_27267_3_ - 12;
            int k = GuiStats.func_27127_n(field_27269_g).func_871_a(s);
            GuiStats.func_27135_b(field_27269_g, i - 3, j - 3, i + k + 3, j + 8 + 3, 0xc0000000, 0xc0000000);
            GuiStats.func_27131_o(field_27269_g).func_50103_a(s, i, j, -1);
        }
    }

    protected void func_27266_c(int p_27266_1_)
    {
        if(p_27266_1_ != field_27271_e)
        {
            field_27271_e = p_27266_1_;
            field_27270_f = -1;
        } else
        if(field_27270_f == -1)
        {
            field_27270_f = 1;
        } else
        {
            field_27271_e = -1;
            field_27270_f = 0;
        }
        Collections.sort(field_27273_c, field_27272_d);
    }
}
