// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonNodeFactories, JsonNode

final class JsonNumberNodeBuilder
    implements JsonNodeBuilder
{

    private final JsonNode field_27239_a;

    JsonNumberNodeBuilder(String p_i61_1_)
    {
        field_27239_a = JsonNodeFactories.func_27311_b(p_i61_1_);
    }

    public JsonNode func_27234_b()
    {
        return field_27239_a;
    }
}
