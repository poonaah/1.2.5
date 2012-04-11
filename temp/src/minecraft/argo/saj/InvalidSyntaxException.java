// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.saj;


// Referenced classes of package argo.saj:
//            ThingWithPosition

public final class InvalidSyntaxException extends Exception
{

    private final int field_27191_a;
    private final int field_27190_b;

    InvalidSyntaxException(String p_i193_1_, ThingWithPosition p_i193_2_)
    {
        super((new StringBuilder()).append("At line ").append(p_i193_2_.func_27330_b()).append(", column ").append(p_i193_2_.func_27331_a()).append(":  ").append(p_i193_1_).toString());
        field_27191_a = p_i193_2_.func_27331_a();
        field_27190_b = p_i193_2_.func_27330_b();
    }

    InvalidSyntaxException(String p_i194_1_, Throwable p_i194_2_, ThingWithPosition p_i194_3_)
    {
        super((new StringBuilder()).append("At line ").append(p_i194_3_.func_27330_b()).append(", column ").append(p_i194_3_.func_27331_a()).append(":  ").append(p_i194_1_).toString(), p_i194_2_);
        field_27191_a = p_i194_3_.func_27331_a();
        field_27190_b = p_i194_3_.func_27330_b();
    }
}
