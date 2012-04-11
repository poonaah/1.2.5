// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            MovementInput, GameSettings, KeyBinding

public class MovementInputFromOptions extends MovementInput
{

    private GameSettings field_1178_g;

    public MovementInputFromOptions(GameSettings p_i372_1_)
    {
        field_1178_g = p_i372_1_;
    }

    public void func_52013_a()
    {
        field_1174_a = 0.0F;
        field_1173_b = 0.0F;
        if(field_1178_g.field_1575_j.field_35965_e)
        {
            field_1173_b++;
        }
        if(field_1178_g.field_1573_l.field_35965_e)
        {
            field_1173_b--;
        }
        if(field_1178_g.field_1574_k.field_35965_e)
        {
            field_1174_a++;
        }
        if(field_1178_g.field_1572_m.field_35965_e)
        {
            field_1174_a--;
        }
        field_1176_d = field_1178_g.field_1571_n.field_35965_e;
        field_1175_e = field_1178_g.field_1565_s.field_35965_e;
        if(field_1175_e)
        {
            field_1174_a *= 0.29999999999999999D;
            field_1173_b *= 0.29999999999999999D;
        }
    }
}
