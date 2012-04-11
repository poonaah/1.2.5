// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChatAllowedCharacters
{

    public static final String field_20157_a = func_20156_a();
    public static final char field_22286_b[] = {
        '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', 
        '<', '>', '|', '"', ':'
    };

    public ChatAllowedCharacters()
    {
    }

    private static String func_20156_a()
    {
        String s = "";
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.ChatAllowedCharacters.class).getResourceAsStream("/font.txt"), "UTF-8"));
            String s1 = "";
            do
            {
                String s2;
                if((s2 = bufferedreader.readLine()) == null)
                {
                    break;
                }
                if(!s2.startsWith("#"))
                {
                    s = (new StringBuilder()).append(s).append(s2).toString();
                }
            } while(true);
            bufferedreader.close();
        }
        catch(Exception exception) { }
        return s;
    }

    public static final boolean func_48614_a(char p_48614_0_)
    {
        return p_48614_0_ != '\247' && (field_20157_a.indexOf(p_48614_0_) >= 0 || p_48614_0_ > ' ');
    }

    public static String func_52019_a(String p_52019_0_)
    {
        StringBuilder stringbuilder = new StringBuilder();
        char ac[] = p_52019_0_.toCharArray();
        int i = ac.length;
        for(int j = 0; j < i; j++)
        {
            char c = ac[j];
            if(func_48614_a(c))
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

}
