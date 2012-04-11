// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonNodeBuilders_Null, JsonNodeBuilders_True, JsonNodeBuilders_False, JsonNumberNodeBuilder, 
//            JsonStringNodeBuilder, JsonObjectNodeBuilder, JsonArrayNodeBuilder, JsonNodeBuilder

public final class JsonNodeBuilders
{

    private JsonNodeBuilders()
    {
    }

    public static JsonNodeBuilder func_27248_a()
    {
        return new JsonNodeBuilders_Null();
    }

    public static JsonNodeBuilder func_27251_b()
    {
        return new JsonNodeBuilders_True();
    }

    public static JsonNodeBuilder func_27252_c()
    {
        return new JsonNodeBuilders_False();
    }

    public static JsonNodeBuilder func_27250_a(String p_27250_0_)
    {
        return new JsonNumberNodeBuilder(p_27250_0_);
    }

    public static JsonStringNodeBuilder func_27254_b(String p_27254_0_)
    {
        return new JsonStringNodeBuilder(p_27254_0_);
    }

    public static JsonObjectNodeBuilder func_27253_d()
    {
        return new JsonObjectNodeBuilder();
    }

    public static JsonArrayNodeBuilder func_27249_e()
    {
        return new JsonArrayNodeBuilder();
    }
}
