// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;
import java.util.Map;

// Referenced classes of package argo.jdom:
//            JsonNode, JsonNodeType

final class JsonConstants extends JsonNode
{

    static final JsonConstants field_27228_a;
    static final JsonConstants field_27227_b;
    static final JsonConstants field_27230_c;
    private final JsonNodeType field_27229_d;

    private JsonConstants(JsonNodeType p_i527_1_)
    {
        field_27229_d = p_i527_1_;
    }

    public JsonNodeType func_27218_a()
    {
        return field_27229_d;
    }

    public String func_27216_b()
    {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    public Map func_27214_c()
    {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    public List func_27215_d()
    {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }

    static 
    {
        field_27228_a = new JsonConstants(JsonNodeType.NULL);
        field_27227_b = new JsonConstants(JsonNodeType.TRUE);
        field_27230_c = new JsonConstants(JsonNodeType.FALSE);
    }
}
