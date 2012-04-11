// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonStringNode, JsonNode

final class JsonFieldBuilder
{

    private JsonNodeBuilder field_27306_a;
    private JsonNodeBuilder field_27305_b;

    private JsonFieldBuilder()
    {
    }

    static JsonFieldBuilder func_27301_a()
    {
        return new JsonFieldBuilder();
    }

    JsonFieldBuilder func_27304_a(JsonNodeBuilder p_27304_1_)
    {
        field_27306_a = p_27304_1_;
        return this;
    }

    JsonFieldBuilder func_27300_b(JsonNodeBuilder p_27300_1_)
    {
        field_27305_b = p_27300_1_;
        return this;
    }

    JsonStringNode func_27303_b()
    {
        return (JsonStringNode)field_27306_a.func_27234_b();
    }

    JsonNode func_27302_c()
    {
        return field_27305_b.func_27234_b();
    }
}
