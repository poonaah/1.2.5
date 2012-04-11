// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            LeafFunctor, JsonNodeType, JsonNode

final class JsonNodeSelectors_String extends LeafFunctor
{

    JsonNodeSelectors_String()
    {
    }

    public boolean func_27072_a(JsonNode p_27072_1_)
    {
        return JsonNodeType.STRING == p_27072_1_.func_27218_a();
    }

    public String func_27060_a()
    {
        return "A short form string";
    }

    public String func_27073_b(JsonNode p_27073_1_)
    {
        return p_27073_1_.func_27216_b();
    }

    public String toString()
    {
        return "a value that is a string";
    }

    public Object func_27063_c(Object p_27063_1_)
    {
        return func_27073_b((JsonNode)p_27063_1_);
    }

    public boolean func_27058_a(Object p_27058_1_)
    {
        return func_27072_a((JsonNode)p_27058_1_);
    }
}
