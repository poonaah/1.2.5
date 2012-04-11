// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5String
{

    private String field_27370_a;

    public MD5String(String p_i715_1_)
    {
        field_27370_a = p_i715_1_;
    }

    public String func_27369_a(String p_27369_1_)
    {
        try
        {
            String s = (new StringBuilder()).append(field_27370_a).append(p_27369_1_).toString();
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes(), 0, s.length());
            return (new BigInteger(1, messagedigest.digest())).toString(16);
        }
        catch(NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
    }
}
