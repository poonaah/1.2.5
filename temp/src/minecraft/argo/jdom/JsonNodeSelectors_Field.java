// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.Map;

// Referenced classes of package argo.jdom:
//            LeafFunctor, JsonStringNode, JsonNode

final class JsonNodeSelectors_Field extends LeafFunctor
{

    final JsonStringNode field_27066_a; /* synthetic field */

    JsonNodeSelectors_Field(JsonStringNode p_i95_1_)
    {
        field_27066_a = p_i95_1_;
        super();
    }

    public boolean func_27065_a(Map p_27065_1_)
    {
        return p_27065_1_.containsKey(field_27066_a);
    }

    public String func_27060_a()
    {
        return (new StringBuilder()).append("\"").append(field_27066_a.func_27216_b()).append("\"").toString();
    }

    public JsonNode func_27064_b(Map p_27064_1_)
    {
        return (JsonNode)p_27064_1_.get(field_27066_a);
    }

    public String toString()
    {
        return (new StringBuilder()).append("a field called [\"").append(field_27066_a.func_27216_b()).append("\"]").toString();
    }

    public Object func_27063_c(Object p_27063_1_)
    {
        return func_27064_b((Map)p_27063_1_);
    }

    public boolean func_27058_a(Object p_27058_1_)
    {
        return func_27065_a((Map)p_27058_1_);
    }
}
