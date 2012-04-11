// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonNodeFactories, JsonStringNode, JsonNode

public final class JsonStringNodeBuilder
    implements JsonNodeBuilder
{

    private final String field_27244_a;

    JsonStringNodeBuilder(String p_i317_1_)
    {
        field_27244_a = p_i317_1_;
    }

    public JsonStringNode func_27243_a()
    {
        return JsonNodeFactories.func_27316_a(field_27244_a);
    }

    public JsonNode func_27234_b()
    {
        return func_27243_a();
    }
}
