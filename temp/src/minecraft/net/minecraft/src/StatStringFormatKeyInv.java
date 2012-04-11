// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            IStatStringFormat, GameSettings, KeyBinding

public class StatStringFormatKeyInv
    implements IStatStringFormat
{

    final Minecraft field_27344_a; /* synthetic field */

    public StatStringFormatKeyInv(Minecraft p_i357_1_)
    {
        field_27344_a = p_i357_1_;
        super();
    }

    public String func_27343_a(String p_27343_1_)
    {
        try
        {
            return String.format(p_27343_1_, new Object[] {
                GameSettings.func_41085_c(field_27344_a.field_6304_y.field_1570_o.field_1370_b)
            });
        }
        catch(Exception exception)
        {
            return (new StringBuilder()).append("Error: ").append(exception.getLocalizedMessage()).toString();
        }
    }
}
