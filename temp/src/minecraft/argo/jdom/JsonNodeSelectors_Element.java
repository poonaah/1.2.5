// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;

// Referenced classes of package argo.jdom:
//            LeafFunctor, JsonNode

final class JsonNodeSelectors_Element extends LeafFunctor
{

    final int field_27069_a; /* synthetic field */

    JsonNodeSelectors_Element(int p_i94_1_)
    {
        field_27069_a = p_i94_1_;
        super();
    }

    public boolean func_27067_a(List p_27067_1_)
    {
        return p_27067_1_.size() > field_27069_a;
    }

    public String func_27060_a()
    {
        return Integer.toString(field_27069_a);
    }

    public JsonNode func_27068_b(List p_27068_1_)
    {
        return (JsonNode)p_27068_1_.get(field_27069_a);
    }

    public String toString()
    {
        return (new StringBuilder()).append("an element at index [").append(field_27069_a).append("]").toString();
    }

    public Object func_27063_c(Object p_27063_1_)
    {
        return func_27068_b((List)p_27063_1_);
    }

    public boolean func_27058_a(Object p_27058_1_)
    {
        return func_27067_a((List)p_27058_1_);
    }
}
