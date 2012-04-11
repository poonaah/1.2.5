// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Gui, ChatAllowedCharacters, GuiScreen, FontRenderer, 
//            Tessellator

public class GuiTextField extends Gui
{

    private final FontRenderer field_22080_c;
    private final int field_22079_d;
    private final int field_22078_e;
    private final int field_22077_f;
    private final int field_22076_g;
    private String field_22075_h;
    private int field_22074_i;
    private int field_22073_k;
    private boolean field_50044_j;
    private boolean field_50045_k;
    private boolean field_22082_a;
    private boolean field_50043_m;
    private int field_50041_n;
    private int field_50042_o;
    private int field_50048_p;
    private int field_50047_q;
    private int field_50046_r;

    public GuiTextField(FontRenderer p_i1201_1_, int p_i1201_2_, int p_i1201_3_, int p_i1201_4_, int p_i1201_5_)
    {
        field_22075_h = "";
        field_22074_i = 32;
        field_50044_j = true;
        field_50045_k = true;
        field_22082_a = false;
        field_50043_m = true;
        field_50041_n = 0;
        field_50042_o = 0;
        field_50048_p = 0;
        field_50047_q = 0xe0e0e0;
        field_50046_r = 0x707070;
        field_22080_c = p_i1201_1_;
        field_22079_d = p_i1201_2_;
        field_22078_e = p_i1201_3_;
        field_22077_f = p_i1201_4_;
        field_22076_g = p_i1201_5_;
    }

    public void func_22070_b()
    {
        field_22073_k++;
    }

    public void func_22068_a(String p_22068_1_)
    {
        if(p_22068_1_.length() > field_22074_i)
        {
            field_22075_h = p_22068_1_.substring(0, field_22074_i);
        } else
        {
            field_22075_h = p_22068_1_;
        }
        func_50038_e();
    }

    public String func_22071_a()
    {
        return field_22075_h;
    }

    public String func_50039_c()
    {
        int i = field_50042_o >= field_50048_p ? field_50048_p : field_50042_o;
        int j = field_50042_o >= field_50048_p ? field_50042_o : field_50048_p;
        return field_22075_h.substring(i, j);
    }

    public void func_50031_b(String p_50031_1_)
    {
        String s = "";
        String s1 = ChatAllowedCharacters.func_52019_a(p_50031_1_);
        int i = field_50042_o >= field_50048_p ? field_50048_p : field_50042_o;
        int j = field_50042_o >= field_50048_p ? field_50042_o : field_50048_p;
        int k = field_22074_i - field_22075_h.length() - (i - field_50048_p);
        int l = 0;
        if(field_22075_h.length() > 0)
        {
            s = (new StringBuilder()).append(s).append(field_22075_h.substring(0, i)).toString();
        }
        if(k < s1.length())
        {
            s = (new StringBuilder()).append(s).append(s1.substring(0, k)).toString();
            l = k;
        } else
        {
            s = (new StringBuilder()).append(s).append(s1).toString();
            l = s1.length();
        }
        if(field_22075_h.length() > 0 && j < field_22075_h.length())
        {
            s = (new StringBuilder()).append(s).append(field_22075_h.substring(j)).toString();
        }
        field_22075_h = s;
        func_50023_d((i - field_50048_p) + l);
    }

    public void func_50021_a(int p_50021_1_)
    {
        if(field_22075_h.length() == 0)
        {
            return;
        }
        if(field_50048_p != field_50042_o)
        {
            func_50031_b("");
            return;
        } else
        {
            func_50020_b(func_50028_c(p_50021_1_) - field_50042_o);
            return;
        }
    }

    public void func_50020_b(int p_50020_1_)
    {
        if(field_22075_h.length() == 0)
        {
            return;
        }
        if(field_50048_p != field_50042_o)
        {
            func_50031_b("");
            return;
        }
        boolean flag = p_50020_1_ < 0;
        int i = flag ? field_50042_o + p_50020_1_ : field_50042_o;
        int j = flag ? field_50042_o : field_50042_o + p_50020_1_;
        String s = "";
        if(i >= 0)
        {
            s = field_22075_h.substring(0, i);
        }
        if(j < field_22075_h.length())
        {
            s = (new StringBuilder()).append(s).append(field_22075_h.substring(j)).toString();
        }
        field_22075_h = s;
        if(flag)
        {
            func_50023_d(p_50020_1_);
        }
    }

    public int func_50028_c(int p_50028_1_)
    {
        return func_50024_a(p_50028_1_, func_50035_h());
    }

    public int func_50024_a(int p_50024_1_, int p_50024_2_)
    {
        int i = p_50024_2_;
        boolean flag = p_50024_1_ < 0;
        int j = Math.abs(p_50024_1_);
        for(int k = 0; k < j; k++)
        {
            if(flag)
            {
                for(; i > 0 && field_22075_h.charAt(i - 1) == ' '; i--) { }
                for(; i > 0 && field_22075_h.charAt(i - 1) != ' '; i--) { }
                continue;
            }
            int l = field_22075_h.length();
            i = field_22075_h.indexOf(' ', i);
            if(i == -1)
            {
                i = l;
                continue;
            }
            for(; i < l && field_22075_h.charAt(i) == ' '; i++) { }
        }

        return i;
    }

    public void func_50023_d(int p_50023_1_)
    {
        func_50030_e(field_50048_p + p_50023_1_);
    }

    public void func_50030_e(int p_50030_1_)
    {
        field_50042_o = p_50030_1_;
        int i = field_22075_h.length();
        if(field_50042_o < 0)
        {
            field_50042_o = 0;
        }
        if(field_50042_o > i)
        {
            field_50042_o = i;
        }
        func_50032_g(field_50042_o);
    }

    public void func_50034_d()
    {
        func_50030_e(0);
    }

    public void func_50038_e()
    {
        func_50030_e(field_22075_h.length());
    }

    public boolean func_50037_a(char p_50037_1_, int p_50037_2_)
    {
        if(!field_50043_m || !field_22082_a)
        {
            return false;
        }
        switch(p_50037_1_)
        {
        case 1: // '\001'
            func_50038_e();
            func_50032_g(0);
            return true;

        case 3: // '\003'
            GuiScreen.func_50050_a(func_50039_c());
            return true;

        case 22: // '\026'
            func_50031_b(GuiScreen.func_574_c());
            return true;

        case 24: // '\030'
            GuiScreen.func_50050_a(func_50039_c());
            func_50031_b("");
            return true;
        }
        switch(p_50037_2_)
        {
        case 203: 
            if(GuiScreen.func_50049_m())
            {
                if(GuiScreen.func_50051_l())
                {
                    func_50032_g(func_50024_a(-1, func_50036_k()));
                } else
                {
                    func_50032_g(func_50036_k() - 1);
                }
            } else
            if(GuiScreen.func_50051_l())
            {
                func_50030_e(func_50028_c(-1));
            } else
            {
                func_50023_d(-1);
            }
            return true;

        case 205: 
            if(GuiScreen.func_50049_m())
            {
                if(GuiScreen.func_50051_l())
                {
                    func_50032_g(func_50024_a(1, func_50036_k()));
                } else
                {
                    func_50032_g(func_50036_k() + 1);
                }
            } else
            if(GuiScreen.func_50051_l())
            {
                func_50030_e(func_50028_c(1));
            } else
            {
                func_50023_d(1);
            }
            return true;

        case 14: // '\016'
            if(GuiScreen.func_50051_l())
            {
                func_50021_a(-1);
            } else
            {
                func_50020_b(-1);
            }
            return true;

        case 211: 
            if(GuiScreen.func_50051_l())
            {
                func_50021_a(1);
            } else
            {
                func_50020_b(1);
            }
            return true;

        case 199: 
            if(GuiScreen.func_50049_m())
            {
                func_50032_g(0);
            } else
            {
                func_50034_d();
            }
            return true;

        case 207: 
            if(GuiScreen.func_50049_m())
            {
                func_50032_g(field_22075_h.length());
            } else
            {
                func_50038_e();
            }
            return true;
        }
        if(ChatAllowedCharacters.func_48614_a(p_50037_1_))
        {
            func_50031_b(Character.toString(p_50037_1_));
            return true;
        } else
        {
            return false;
        }
    }

    public void func_22069_a(int p_22069_1_, int p_22069_2_, int p_22069_3_)
    {
        boolean flag = p_22069_1_ >= field_22079_d && p_22069_1_ < field_22079_d + field_22077_f && p_22069_2_ >= field_22078_e && p_22069_2_ < field_22078_e + field_22076_g;
        if(field_50045_k)
        {
            func_50033_b(field_50043_m && flag);
        }
        if(field_22082_a && p_22069_3_ == 0)
        {
            int i = p_22069_1_ - field_22079_d;
            if(field_50044_j)
            {
                i -= 4;
            }
            String s = field_22080_c.func_50107_a(field_22075_h.substring(field_50041_n), func_50019_l());
            func_50030_e(field_22080_c.func_50107_a(s, i).length() + field_50041_n);
        }
    }

    public void func_22067_c()
    {
        if(func_50022_i())
        {
            func_551_a(field_22079_d - 1, field_22078_e - 1, field_22079_d + field_22077_f + 1, field_22078_e + field_22076_g + 1, 0xffa0a0a0);
            func_551_a(field_22079_d, field_22078_e, field_22079_d + field_22077_f, field_22078_e + field_22076_g, 0xff000000);
        }
        int i = field_50043_m ? field_50047_q : field_50046_r;
        int j = field_50042_o - field_50041_n;
        int k = field_50048_p - field_50041_n;
        String s = field_22080_c.func_50107_a(field_22075_h.substring(field_50041_n), func_50019_l());
        boolean flag = j >= 0 && j <= s.length();
        boolean flag1 = field_22082_a && (field_22073_k / 6) % 2 == 0 && flag;
        int l = field_50044_j ? field_22079_d + 4 : field_22079_d;
        int i1 = field_50044_j ? field_22078_e + (field_22076_g - 8) / 2 : field_22078_e;
        int j1 = l;
        if(k > s.length())
        {
            k = s.length();
        }
        if(s.length() > 0)
        {
            String s1 = flag ? s.substring(0, j) : s;
            j1 = field_22080_c.func_50103_a(s1, j1, i1, i);
        }
        boolean flag2 = field_50042_o < field_22075_h.length() || field_22075_h.length() >= func_50040_g();
        int k1 = j1;
        if(!flag)
        {
            k1 = j <= 0 ? l : l + field_22077_f;
        } else
        if(flag2)
        {
            k1--;
            j1--;
        }
        if(s.length() > 0 && flag && j < s.length())
        {
            j1 = field_22080_c.func_50103_a(s.substring(j), j1, i1, i);
        }
        if(flag1)
        {
            if(flag2)
            {
                Gui.func_551_a(k1, i1 - 1, k1 + 1, i1 + 1 + field_22080_c.field_41063_b, 0xffd0d0d0);
            } else
            {
                field_22080_c.func_50103_a("_", k1, i1, i);
            }
        }
        if(k != j)
        {
            int l1 = l + field_22080_c.func_871_a(s.substring(0, k));
            func_50029_c(k1, i1 - 1, l1 - 1, i1 + 1 + field_22080_c.field_41063_b);
        }
    }

    private void func_50029_c(int p_50029_1_, int p_50029_2_, int p_50029_3_, int p_50029_4_)
    {
        if(p_50029_1_ < p_50029_3_)
        {
            int i = p_50029_1_;
            p_50029_1_ = p_50029_3_;
            p_50029_3_ = i;
        }
        if(p_50029_2_ < p_50029_4_)
        {
            int j = p_50029_2_;
            p_50029_2_ = p_50029_4_;
            p_50029_4_ = j;
        }
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glColor4f(0.0F, 0.0F, 255F, 255F);
        GL11.glDisable(3553);
        GL11.glEnable(3058);
        GL11.glLogicOp(5387);
        tessellator.func_977_b();
        tessellator.func_991_a(p_50029_1_, p_50029_4_, 0.0D);
        tessellator.func_991_a(p_50029_3_, p_50029_4_, 0.0D);
        tessellator.func_991_a(p_50029_3_, p_50029_2_, 0.0D);
        tessellator.func_991_a(p_50029_1_, p_50029_2_, 0.0D);
        tessellator.func_982_a();
        GL11.glDisable(3058);
        GL11.glEnable(3553);
    }

    public void func_22066_a(int p_22066_1_)
    {
        field_22074_i = p_22066_1_;
        if(field_22075_h.length() > p_22066_1_)
        {
            field_22075_h = field_22075_h.substring(0, p_22066_1_);
        }
    }

    public int func_50040_g()
    {
        return field_22074_i;
    }

    public int func_50035_h()
    {
        return field_50042_o;
    }

    public boolean func_50022_i()
    {
        return field_50044_j;
    }

    public void func_50027_a(boolean p_50027_1_)
    {
        field_50044_j = p_50027_1_;
    }

    public void func_50033_b(boolean p_50033_1_)
    {
        if(p_50033_1_ && !field_22082_a)
        {
            field_22073_k = 0;
        }
        field_22082_a = p_50033_1_;
    }

    public boolean func_50025_j()
    {
        return field_22082_a;
    }

    public int func_50036_k()
    {
        return field_50048_p;
    }

    public int func_50019_l()
    {
        return func_50022_i() ? field_22077_f - 8 : field_22077_f;
    }

    public void func_50032_g(int p_50032_1_)
    {
        int i = field_22075_h.length();
        if(p_50032_1_ > i)
        {
            p_50032_1_ = i;
        }
        if(p_50032_1_ < 0)
        {
            p_50032_1_ = 0;
        }
        field_50048_p = p_50032_1_;
        if(field_22080_c != null)
        {
            if(field_50041_n > i)
            {
                field_50041_n = i;
            }
            int j = func_50019_l();
            String s = field_22080_c.func_50107_a(field_22075_h.substring(field_50041_n), j);
            int k = s.length() + field_50041_n;
            if(p_50032_1_ == field_50041_n)
            {
                field_50041_n -= field_22080_c.func_50104_a(field_22075_h, j, true).length();
            }
            if(p_50032_1_ > k)
            {
                field_50041_n += p_50032_1_ - k;
            } else
            if(p_50032_1_ <= field_50041_n)
            {
                field_50041_n -= field_50041_n - p_50032_1_;
            }
            if(field_50041_n < 0)
            {
                field_50041_n = 0;
            }
            if(field_50041_n > i)
            {
                field_50041_n = i;
            }
        }
    }

    public void func_50026_c(boolean p_50026_1_)
    {
        field_50045_k = p_50026_1_;
    }
}
