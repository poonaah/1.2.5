// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.*;

// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonNodeFactories, JsonRootNode, JsonNode

public final class JsonArrayNodeBuilder
    implements JsonNodeBuilder
{

    private final List field_27242_a = new LinkedList();

    JsonArrayNodeBuilder()
    {
    }

    public JsonArrayNodeBuilder func_27240_a(JsonNodeBuilder p_27240_1_)
    {
        field_27242_a.add(p_27240_1_);
        return this;
    }

    public JsonRootNode func_27241_a()
    {
        LinkedList linkedlist = new LinkedList();
        JsonNodeBuilder jsonnodebuilder;
        for(Iterator iterator = field_27242_a.iterator(); iterator.hasNext(); linkedlist.add(jsonnodebuilder.func_27234_b()))
        {
            jsonnodebuilder = (JsonNodeBuilder)iterator.next();
        }

        return JsonNodeFactories.func_27309_a(linkedlist);
    }

    public JsonNode func_27234_b()
    {
        return func_27241_a();
    }
}
