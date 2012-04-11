// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonObjectNodeBuilder_List, JsonNodeFactories, JsonFieldBuilder, 
//            JsonRootNode, JsonNode

public final class JsonObjectNodeBuilder
    implements JsonNodeBuilder
{

    private final List field_27238_a = new LinkedList();

    JsonObjectNodeBuilder()
    {
    }

    public JsonObjectNodeBuilder func_27237_a(JsonFieldBuilder p_27237_1_)
    {
        field_27238_a.add(p_27237_1_);
        return this;
    }

    public JsonRootNode func_27235_a()
    {
        return JsonNodeFactories.func_27312_a(new JsonObjectNodeBuilder_List(this));
    }

    public JsonNode func_27234_b()
    {
        return func_27235_a();
    }

    static List func_27236_a(JsonObjectNodeBuilder p_27236_0_)
    {
        return p_27236_0_.field_27238_a;
    }
}
