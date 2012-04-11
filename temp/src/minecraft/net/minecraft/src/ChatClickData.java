// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package net.minecraft.src:
//            ChatLine, FontRenderer

public class ChatClickData
{

    public static final Pattern field_50097_a = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,3})(/\\S*)?$");
    private final FontRenderer field_50095_b;
    private final ChatLine field_50096_c;
    private final int field_50093_d;
    private final int field_50094_e;
    private final String field_50091_f;
    private final String field_50092_g = func_50090_c();

    public ChatClickData(FontRenderer p_i1203_1_, ChatLine p_i1203_2_, int p_i1203_3_, int p_i1203_4_)
    {
        field_50095_b = p_i1203_1_;
        field_50096_c = p_i1203_2_;
        field_50093_d = p_i1203_3_;
        field_50094_e = p_i1203_4_;
        field_50091_f = p_i1203_1_.func_50107_a(p_i1203_2_.field_1297_a, p_i1203_3_);
    }

    public String func_50088_a()
    {
        return field_50092_g;
    }

    public URI func_50089_b()
    {
        String s = func_50088_a();
        if(s == null)
        {
            return null;
        }
        Matcher matcher = field_50097_a.matcher(s);
        if(matcher.matches())
        {
            try
            {
                String s1 = matcher.group(0);
                if(matcher.group(1) == null)
                {
                    s1 = (new StringBuilder()).append("http://").append(s1).toString();
                }
                return new URI(s1);
            }
            catch(URISyntaxException urisyntaxexception)
            {
                Logger.getLogger("Minecraft").log(Level.SEVERE, "Couldn't create URI from chat", urisyntaxexception);
            }
        }
        return null;
    }

    private String func_50090_c()
    {
        int i = field_50091_f.lastIndexOf(" ", field_50091_f.length()) + 1;
        if(i < 0)
        {
            i = 0;
        }
        int j = field_50096_c.field_1297_a.indexOf(" ", i);
        if(j < 0)
        {
            j = field_50096_c.field_1297_a.length();
        }
        FontRenderer _tmp = field_50095_b;
        return FontRenderer.func_52014_d(field_50096_c.field_1297_a.substring(i, j));
    }

}
