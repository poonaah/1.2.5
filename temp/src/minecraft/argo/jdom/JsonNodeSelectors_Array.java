// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;

// Referenced classes of package argo.jdom:
//            LeafFunctor, JsonNodeType, JsonNode

final class JsonNodeSelectors_Array extends LeafFunctor
{

    JsonNodeSelectors_Array()
    {
    }

    public boolean func_27074_a(JsonNode p_27074_1_)
    {
        return JsonNodeType.ARRAY == p_27074_1_.func_27218_a();
    }

    public String func_27060_a()
    {
        return "A short form array";
    }

    public List func_27075_b(JsonNode p_27075_1_)
    {
        return p_27075_1_.func_27215_d();
    }

    public String toString()
    {
        return "an array";
    }

    public Object func_27063_c(Object p_27063_1_)
    {
        return func_27075_b((JsonNode)p_27063_1_);
    }

    public boolean func_27058_a(Object p_27058_1_)
    {
        return func_27074_a((JsonNode)p_27058_1_);
    }
}
